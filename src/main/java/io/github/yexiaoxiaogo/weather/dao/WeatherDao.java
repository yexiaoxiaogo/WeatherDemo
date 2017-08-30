package io.github.yexiaoxiaogo.weather.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.github.yexiaoxiaogo.weather.domain.Weather;
/*
 * 天气DAO接口类，调用数据库
 */
public interface WeatherDao {
	//根据citycode查询一个天气信息
	Weather findByName(@Param("citycode")String citycode);
	//根据citycode查询返回天气列表
	List<Weather> findListByName(@Param("citycode")String citycode);
	//插入一条天气信息
	Long insertWeather(Weather weather);
}
