package com.WeatherForecast.WeatherApp.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GetParameters {

    public static String parseTemperature(String city) {
        String temperature = "";
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=cc52ec2b496f7c2a270e0f75ca452f4c");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openConnection().getInputStream(), StandardCharsets.UTF_8));
            String inputLine;
            StringBuilder information = new StringBuilder();
            while ((inputLine = reader.readLine()) != null) {
                inputLine = inputLine.replaceAll("\"", "");
                information.append(inputLine).append("\n");
            }
            information = new StringBuilder(information.toString().replaceAll("[]{}]", ""));
            String[] infValues = information.toString().split(",");
            for (String infValue : infValues) {
                if (infValue.contains("temp:")) {
                    infValue = infValue.replaceAll("[:a-zA-Z]+", "");
                    temperature = String.format("%.3f", Double.parseDouble(infValue) - 273.15);
                }
            }
        } catch (IOException e) {
            System.out.println("Город не найден");
        }
        return temperature;
    }

}

