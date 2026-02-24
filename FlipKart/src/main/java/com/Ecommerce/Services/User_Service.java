package com.Ecommerce.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.DTO.Order2;
import com.Ecommerce.DTO.User_DTO;
import com.Ecommerce.Entities.Address;
import com.Ecommerce.Entities.User;
import com.Ecommerce.Repository.User_Repo;

@Service
public class User_Service {

    @Autowired
    private User_Repo repo;

    public User addUser(User user) {
        return repo.save(user);
    }

    public List<User_DTO> getAllUsers() {

        return repo.findAll().stream().map(user -> {

            User_DTO dto = new User_DTO();
            dto.setName(user.getName());
            dto.setEmail(user.getEmail());

            List<Order2> orders = user.getOrders().stream()
                .map(order -> {
                    Order2 o2 = new Order2();
                    o2.setContent(order.getContent());
                    o2.setPrice(order.getPrice());
                    return o2;
                }).collect(Collectors.toList());

            List<Address> addresses = user.getAddress().stream()
                .map(address -> {
                    Address a = new Address();
                    a.setCity(address.getCity());
                    a.setLandmark(address.getLandmark());
                    a.setLocality(address.getLocality());
                    a.setPincode(address.getPincode());
                    a.setState(address.getState());
                    return a;
                }).collect(Collectors.toList());

            dto.setOrders(orders);
            dto.setAddresses(addresses);

            return dto;

        }).collect(Collectors.toList());
    }

	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sendMessage(User user) {
		// TODO Auto-generated method stub
		
	}

	
}
