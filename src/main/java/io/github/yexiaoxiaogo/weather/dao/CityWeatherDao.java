package io.github.yexiaoxiaogo.weather.dao;

import java.util.List;

import io.github.yexiaoxiaogo.weather.domain.CityWeather;

public interface CityWeatherDao {

	List<CityWeather> findAllByName();
}
