package io.github.yexiaoxiaogo.weather.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import io.github.yexiaoxiaogo.weather.dao.WeatherCityDao;
import io.github.yexiaoxiaogo.weather.domain.WeatherCity;
import io.github.yexiaoxiaogo.weather.service.WeatherCityService;

@com.alibaba.dubbo.config.annotation.Service
@org.springframework.stereotype.Service
public class WeatherCityServiceImpl implements WeatherCityService {
	
	@Autowired
	WeatherCityDao weatherCityDao;
	
	public List<WeatherCity> selectAll(){
		return weatherCityDao.selectAll();
	}

	@Override
	public String test(String name) {
		// TODO Auto-generated method stub
		return "weathr";
	}

}
