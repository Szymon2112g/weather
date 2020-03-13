package com.learn.api.weather.model.Forecast;

import java.util.List;

public class ForecastAPI {
    private String cod;
    private int message;
    private int cnt;
    private List<ForecastWeather> list;
    private City city;

    public ForecastAPI() {
    }

    public ForecastAPI(String cod, int message, int cnt, List<ForecastWeather> list, City city) {
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<ForecastWeather> getList() {
        return list;
    }

    public void setList(List<ForecastWeather> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
