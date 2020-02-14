package com.elkhelj.map.models;

import java.io.Serializable;

public class Catogries_Model implements Serializable {
    private String name;
    private String size;
    private String neighborhoods;
    private String people2010;
    private String people2019;
private double lat;
private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(String neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    public String getPeople2010() {
        return people2010;
    }

    public void setPeople2010(String people2010) {
        this.people2010 = people2010;
    }

    public String getPeople2019() {
        return people2019;
    }

    public void setPeople2019(String people2019) {
        this.people2019 = people2019;
    }
}
