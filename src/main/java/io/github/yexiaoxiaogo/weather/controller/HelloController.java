package io.github.yexiaoxiaogo.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.kevinsawicki.http.HttpRequest;

import io.github.yexiaoxiaogo.weather.dao.WeatherDao;
import io.github.yexiaoxiaogo.weather.domain.Weather;
import io.github.yexiaoxiaogo.weather.impl.WeatherServiceImpl;
import io.github.yexiaoxiaogo.weather.service.WeatherService;

import com.alibaba.fastjson.JSON;
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
		
		// 构建一个weather 对象
		Weather weather = new Weather();
		weather.setCity((String) basic.get("city"));
		weather.setCode_d("test");
		weather.setCode_n("test");
		weather.setMax("100");
		
		// 通过 service 插入数据
		weatherService.insertWeather(weather);
		
		// 返回接口结果
		return "插入成功，再次调用的话，需要再数据库中删除id 是100 的数据";
	}
}
