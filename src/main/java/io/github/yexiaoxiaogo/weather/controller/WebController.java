package io.github.yexiaoxiaogo.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import io.github.yexiaoxiaogo.weather.dao.WeatherCityDao;
import io.github.yexiaoxiaogo.weather.domain.WeatherCity;
import io.github.yexiaoxiaogo.weather.service.WeatherCityService;
import io.github.yexiaoxiaogo.weather.service.WeatherService;

@Controller
public class WebController {

    
	@Autowired
	private WeatherService weatherService;
	@Autowired
	private WeatherCityService weatherCityService;
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("weatherlist",weatherService.findWeatherListByName("CN101210101"));
		return "index";
	}
	
	@RequestMapping("/test")
	public String test(ModelMap map) {
		List<WeatherCity> citys = weatherCityService.selectAll();
		map.addAttribute("weatherlist", citys);
		return "test";
	}
}
