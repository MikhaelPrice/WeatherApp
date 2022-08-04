package com.WeatherForecast.WeatherApp;

import com.WeatherForecast.WeatherApp.Service.GetParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
		System.out.println(GetParameters.parseTemperature("Мозырь"));
	}

}
