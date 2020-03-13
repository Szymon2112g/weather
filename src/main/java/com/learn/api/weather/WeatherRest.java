package com.learn.api.weather;

import com.learn.api.weather.model.Forecast.ForecastAPI;
import com.learn.api.weather.model.Weather.WeatherAPI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WeatherRest {

    static final String apiKey = "getKeyFrom openweathermap.org";

    @GetMapping("/get-current-weather/{cityName}")
    public WeatherAPI convertCurrency(@PathVariable String cityName){

        ResponseEntity<WeatherAPI> responseEntity = new RestTemplate().getForEntity(
                "http://api.openweathermap.org/data/2.5/weather?q={city}&APPID={appid}",
                WeatherAPI.class,cityName, apiKey);

        WeatherAPI response = responseEntity.getBody();

        return response;
    }

    @GetMapping("/get-forecast/{cityName}")
    public ForecastAPI getForecast(@PathVariable String cityName) {

        ResponseEntity<ForecastAPI> responseEntity = new RestTemplate().getForEntity(
                "http://api.openweathermap.org/data/2.5/forecast?q={city}&appid={appid}",
                ForecastAPI.class, cityName, apiKey);

        ForecastAPI response = responseEntity.getBody();

        return response;
    }
}
