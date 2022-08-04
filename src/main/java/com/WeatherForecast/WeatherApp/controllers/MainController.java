package com.WeatherForecast.WeatherApp.controllers;

import com.WeatherForecast.WeatherApp.Service.GetParameters;
import com.WeatherForecast.WeatherApp.models.Weather;
import com.WeatherForecast.WeatherApp.repo.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class MainController {

    @Autowired
    private WeatherRepository weatherRepository;

    @PostMapping("/")
    public Weather postInfoToDatabase(@RequestParam("city") String city){
        Weather weather = new Weather(LocalDateTime.now(), city, GetParameters.parseTemperature(city));
        return weatherRepository.save(weather);
    }

}
