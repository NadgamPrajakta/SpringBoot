package com.Ecommerce.DTO;

import java.util.List;

import com.Ecommerce.Entities.Address;

public class User_DTO {
	
	private int userid;
    private String name;
    private String email;

    private List<Order2> orders;
    private List<Address> addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public List<Order2> getOrders() {
        return orders;
    }

    public void setOrders(List<Order2> orders) {
        this.orders = orders;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
