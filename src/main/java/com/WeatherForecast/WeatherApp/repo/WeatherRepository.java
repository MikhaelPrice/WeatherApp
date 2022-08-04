package com.WeatherForecast.WeatherApp.repo;

import com.WeatherForecast.WeatherApp.models.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather, Long> {
}
