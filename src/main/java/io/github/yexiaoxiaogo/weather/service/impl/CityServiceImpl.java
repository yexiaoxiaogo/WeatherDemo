package io.github.yexiaoxiaogo.weather.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import io.github.yexiaoxiaogo.weather.dao.CityDao;
import io.github.yexiaoxiaogo.weather.domain.City;
import io.github.yexiaoxiaogo.weather.service.CityService;

@com.alibaba.dubbo.config.annotation.Service
@org.springframework.stereotype.Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityDao cityDao;
	public City findCityNameByCityId(String cityid){
		return cityDao.findCityNameById(cityid);
	}

}
