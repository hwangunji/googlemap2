package com.example.weather;

public class WeatherData {
    private String hour;
    private String day;
    private String temp;
    private String tmx;
    private String tmn;
    private String sky;
    private String pty;
    private String wfKor;
    private String pop;
    private String r12;
    private String s12;
    private String ws;
    private String reh;
    private String r06;
    private String s06;

    public WeatherData() {
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTmx() {
        return tmx;
    }

    public void setTmx(String tmx) {
        this.tmx = tmx;
    }

    public String getTmn() {
        return tmn;
    }

    public void setTmn(String tmn) {
        this.tmn = tmn;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public String getPty() {
        return pty;
    }

    public void setPty(String pty) {
        this.pty = pty;
    }

    public String getWfKor() {
        return wfKor;
    }

    public void setWfKor(String wfKor) {
        this.wfKor = wfKor;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getR12() {
        return r12;
    }

    public void setR12(String r12) {
        this.r12 = r12;
    }

    public String getS12() {
        return s12;
    }

    public void setS12(String s12) {
        this.s12 = s12;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public String getReh() {
        return reh;
    }

    public void setReh(String reh) {
        this.reh = reh;
    }

    public String getR06() {
        return r06;
    }

    public void setR06(String r06) {
        this.r06 = r06;
    }

    public String getS06() {
        return s06;
    }

    public void setS06(String s06) {
        this.s06 = s06;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "hour='" + hour + '\'' +
                ", day='" + day + '\'' +
                ", temp='" + temp + '\'' +
                ", tmx='" + tmx + '\'' +
                ", tmn='" + tmn + '\'' +
                ", sky='" + sky + '\'' +
                ", pty='" + pty + '\'' +
                ", wfKor='" + wfKor + '\'' +
                ", pop='" + pop + '\'' +
                ", r12='" + r12 + '\'' +
                ", s12='" + s12 + '\'' +
                ", ws='" + ws + '\'' +
                ", reh='" + reh + '\'' +
                ", r06='" + r06 + '\'' +
                ", s06='" + s06 + '\'' +
                '}';
    }
}

