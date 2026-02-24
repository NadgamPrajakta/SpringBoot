package com.Ecommerce.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.DTO.Order2;
import com.Ecommerce.Entities.Orderf;
import com.Ecommerce.Repository.Orderf_Repo;

@Service
public class Order_Service {

    @Autowired
    private Orderf_Repo repo;

    public Orderf addOrder(Orderf order) {
        return repo.save(order);
    }

    public List<Order2> getAllOrders() {

        return repo.findAll().stream()
            .map(order -> {
                Order2 dto = new Order2();
                dto.setContent(order.getContent());
                dto.setPrice(order.getPrice());
                return dto;
            }).collect(Collectors.toList());
    }
}
