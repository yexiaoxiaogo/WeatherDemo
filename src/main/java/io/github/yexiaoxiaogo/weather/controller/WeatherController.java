/**
 * 
 */
/**
 * @author 84107
 *
 */
package io.github.yexiaoxiaogo.weather.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.yexiaoxiaogo.weather.domain.Weather;
import io.github.yexiaoxiaogo.weather.service.WeatherService;

@RestController
public class WeatherController{
	
	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping(value = "/weather/city",method = RequestMethod.GET)
	public Weather findOneWeather(@RequestParam(value="city",required = true)String city){
		return weatherService.findWeatherByName(city);
	}
	
	@RequestMapping("/weather/list/city")
	public List<Weather> findListWeather(@RequestParam(value="city",required = true)String city){
		return weatherService.findWeatherListByName(city);
	}
	
	@RequestMapping(value ="/weather/insert",method=RequestMethod.POST)
	public void insertWeather(@RequestBody Weather weather){
		weatherService.insertWeather(weather);
	}
}
