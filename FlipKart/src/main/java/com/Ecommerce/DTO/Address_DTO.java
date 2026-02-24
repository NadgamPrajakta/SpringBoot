package com.Ecommerce.DTO;

import java.util.List;

import java.util.List;

public class Address_DTO {

    private int addid;
    private String city;
    private String pincode;
    private String state;
    private String locality;
    private String landmark;
    private User_DTO user;
    
    private List<Order_DTO> orders;

    public int getAddid() {
        return addid;
    }

    public void setAddid(int addid) {
        this.addid = addid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public User_DTO getUser() {
        return user;
    }

    public void setUser(User_DTO user) {
        this.user = user;
    }

    public List<Order_DTO> getOrders() {
        return orders;
    }

    public void setOrders(List<Order_DTO> orders) {
        this.orders = orders;
    }
}

