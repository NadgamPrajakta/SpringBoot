package com.Ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.DTO.Address_DTO;
import com.Ecommerce.DTO.Order_DTO;
import com.Ecommerce.DTO.User_DTO;
import com.Ecommerce.Entities.Address;
import com.Ecommerce.Repository.Address_Repo;

@Service
public class Address_Service {

    @Autowired
    private Address_Repo repo;

    public Address addAddress(Address address) {
        return repo.save(address);
    }

    public List<Address_DTO> getAllAddresses() {

        return repo.findAll().stream().map(address -> {

            Address_DTO dto = new Address_DTO();

            dto.setAddid(address.getAddid());
            dto.setCity(address.getCity());
            dto.setPincode(address.getPincode());
            dto.setState(address.getState());
            dto.setLocality(address.getLocality());
            dto.setLandmark(address.getLandmark());

         
            if (address.getUser() != null) {
                User_DTO u = new User_DTO();
                u.setUserid(address.getUser().getUserid());
                u.setName(address.getUser().getName());
                u.setEmail(address.getUser().getEmail());
                dto.setUser(u);
            }

            List<Order_DTO> orderDtos = address.getOrders().stream().map(o -> {
                Order_DTO od = new Order_DTO();
                od.setOrderid(o.getOrderid());
                od.setContent(o.getContent());
                od.setPrice(o.getPrice());
                return od;
            }).toList();

            dto.setOrders(orderDtos);

            return dto;

        }).toList();
    }
}

