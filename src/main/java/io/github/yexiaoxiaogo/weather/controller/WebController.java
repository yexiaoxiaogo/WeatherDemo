package io.github.yexiaoxiaogo.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.yexiaoxiaogo.weather.service.CityService;
import io.github.yexiaoxiaogo.weather.service.WeatherService;

@Controller
public class WebController {

    
	@Autowired
	private WeatherService weatherService;
	private CityService cityService;
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("weatherlist",weatherService.findWeatherListByName("杭州"));
		map.addAttribute("city",cityService.findCityNameByCityId("CN101210101"));
		return "index";
	}
}
