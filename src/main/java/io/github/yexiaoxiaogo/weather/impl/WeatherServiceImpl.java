package io.github.yexiaoxiaogo.weather.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.yexiaoxiaogo.weather.dao.WeatherDao;
import io.github.yexiaoxiaogo.weather.domain.Weather;
import io.github.yexiaoxiaogo.weather.service.WeatherService;

/*
 * 业务逻辑实现
 */
@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private WeatherDao weatherDao;
	
	public Weather findWeatherByName(String city) {
		return weatherDao.findByName(city);
		
	}

	@Override
	public List<Weather> findWeatherListByName(String city) {
		// TODO Auto-generated method stub
		return weatherDao.findListByName(city);
	}

	@Override
	public Long insertWeather(Weather weather) {
		// TODO Auto-generated method stub
		return weatherDao.insertWeather(weather);
	}
}
