package io.github.yexiaoxiaogo.weather.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.github.yexiaoxiaogo.weather.domain.Weather;
/*
 * 天气DAO接口类，调用数据库
 */
public interface WeatherDao {
	//根据city查询一个天气信息
	Weather findByName(@Param("city")String city);
	//根据city查询返回天气列表
	List<Weather> findListByName(@Param("city")String city);
	//插入一条天气信息
	Long insertWeather(Weather weather);
}
