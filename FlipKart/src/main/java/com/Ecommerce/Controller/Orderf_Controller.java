package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Ecommerce.DTO.Order2;
import com.Ecommerce.Entities.Orderf;
import com.Ecommerce.Services.Order_Service;

@RestController
@CrossOrigin(origins="*")
public class Orderf_Controller {

    @Autowired
    private Order_Service service;

    @PostMapping("/add-order")
    public Orderf add(@RequestBody Orderf orderf) {
        return service.addOrder(orderf);
    }

    @GetMapping("/get-all")
    public List<Order2> getusers() {
        return service.getAllOrders();
    }
}
