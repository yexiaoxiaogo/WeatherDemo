package io.github.yexiaoxiaogo.weather.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import io.github.yexiaoxiaogo.weather.domain.City;
import io.github.yexiaoxiaogo.weather.domain.WeatherCity;

public interface WeatherCityDao {

//	@Select("select * from city")
//	List<City> selectAllCity();
	
	List<WeatherCity> selectAll();
}
