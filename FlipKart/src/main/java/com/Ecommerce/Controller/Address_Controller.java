package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Ecommerce.DTO.Address_DTO;
import com.Ecommerce.Entities.Address;
import com.Ecommerce.Services.Address_Service;
@RestController
@CrossOrigin(origins="*")
public class Address_Controller {

    @Autowired
    private Address_Service service;

    @PostMapping("/add-add")
    public Address add(@RequestBody Address address) {
        return service.addAddress(address);
    }

    @GetMapping("/get-add")
    public List<Address_DTO> getall() {
        return service.getAllAddresses();
    }
}
