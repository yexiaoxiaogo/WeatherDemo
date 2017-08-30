package io.github.yexiaoxiaogo.weather.dao;

import org.apache.ibatis.annotations.Param;

import io.github.yexiaoxiaogo.weather.domain.City;

public interface CityDao {
//通过city的id查询city的name
	public City findCityNameById(@Param("cityid")String cityid);
}
