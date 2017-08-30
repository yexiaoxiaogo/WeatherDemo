package io.github.yexiaoxiaogo.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.kevinsawicki.http.HttpRequest;

import io.github.yexiaoxiaogo.weather.domain.Weather;
import io.github.yexiaoxiaogo.weather.service.WeatherService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@RestController
public class HelloController {
	
	private static String api = "https://free-api.heweather.com/v5/weather?city=%E6%9D%AD%E5%B7%9E&key=ea0ab8e0892a445280d83bd207286977";
	
	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping("/hello")
	public String hello() {
		
//		if (weatherService.equals(null)) {
//			weatherService = new WeatherServiceImpl();
//		}
		
		// 从网络获取数据
		String response = HttpRequest.get(api).body();
		
		// 解析成 JSON 对象，方便获取数据
		JSONObject data = JSON.parseObject(response);
		JSONObject basic = data.getJSONArray("HeWeather5").getJSONObject(0).getJSONObject("basic");
		JSONArray daily_forecast = data.getJSONArray("HeWeather5").getJSONObject(0).getJSONArray("daily_forecast"); 
		// daily_forecast 是一个array对象，不是object		
		JSONObject cond = daily_forecast.getJSONObject(0).getJSONObject("cond");
		JSONObject tmp = daily_forecast.getJSONObject(0).getJSONObject("tmp");
	//	JSONObject A = daily_forecast.getJSONObject(0);
		
		// 构建一个weather 对象
		Weather weather = new Weather();
		weather.setCitycode((String) basic.get("id"));
		weather.setCode_d((String)cond.get("code_d"));
		weather.setCode_n((String)cond.get("code_n"));
		weather.setTxt_d((String)cond.get("txt_d"));
		weather.setTxt_n((String)cond.get("txt_n"));
		weather.setMax((String)tmp.get("max"));
		weather.setMin((String)tmp.get("min"));
		weather.setDate((String)daily_forecast.getJSONObject(0).get("date"));
		
		
		// 通过 service 插入数据
		weatherService.insertWeather(weather);
		
		// 返回接口结果
		return "查询杭州天气，并插入数据库成功.可以访问“http://localhost:8080”查看历史记录";
	}
}
