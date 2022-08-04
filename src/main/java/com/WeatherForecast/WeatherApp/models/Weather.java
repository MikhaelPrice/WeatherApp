package com.WeatherForecast.WeatherApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Weather {
    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long id;

    @Column(name = "Time", nullable = false)
    private LocalDateTime localDateTime;

    @Column(name = "City", nullable = false)
    private String city;

    @Column(name = "Temperature", nullable = false)
    private String temperature;

    public Weather() {
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Weather(LocalDateTime localDateTime, String city, String temperature) {
        this.localDateTime = localDateTime;
        this.city = city;
        this.temperature = temperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
