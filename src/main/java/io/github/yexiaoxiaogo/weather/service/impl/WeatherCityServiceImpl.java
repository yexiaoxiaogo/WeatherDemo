package io.github.yexiaoxiaogo.weather.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.yexiaoxiaogo.weather.dao.WeatherCityDao;
import io.github.yexiaoxiaogo.weather.domain.WeatherCity;
import io.github.yexiaoxiaogo.weather.service.WeatherCityService;

@Service
public class WeatherCityServiceImpl implements WeatherCityService {
	
	@Autowired
	WeatherCityDao weatherCityDao;
	
	public List<WeatherCity> selectAll(){
		return weatherCityDao.selectAll();
	}

}
