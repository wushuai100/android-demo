package com.demo.furion.talaris;

/**
 * Created by sony on 2016/4/17.
 */
public class Sms {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String address;
    private String body;
    private String date;

}
