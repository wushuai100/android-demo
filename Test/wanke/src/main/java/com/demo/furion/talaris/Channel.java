package com.demo.furion.talaris;

/**
 * Created by sony on 2016/4/24.
 */
public class Channel {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public void setPm250(String pm250) {
        this.pm250 = pm250;
    }

    private String city;
    private String temp;
    private String wind;
    private String pm250;

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getTemp() {
        return temp;
    }

    public String getWind() {
        return wind;
    }

    public String getPm250() {
        return pm250;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", temp='" + temp + '\'' +
                ", wind='" + wind + '\'' +
                ", pm250='" + pm250 + '\'' +
                '}';
    }
}
