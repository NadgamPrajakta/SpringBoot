package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Ecommerce.DTO.User_DTO;
import com.Ecommerce.Entities.User;
import com.Ecommerce.Services.MailSenderService;
import com.Ecommerce.Services.User_Service;

import jakarta.mail.MessagingException;

@RestController
@CrossOrigin(origins="*")
public class User_Controller {

    @Autowired
    private User_Service service;
    
    @Autowired
    private MailSenderService Mservice;

    @PostMapping("/add-user")
	public User add(@RequestBody User user) throws MessagingException
	{
		   service.sendMessage(user);
		return service.save(user);
	}

    @GetMapping("/get-all-u")
    public List<User_DTO> getusers() {
        return service.getAllUsers();
    

    
//    @PostMapping("/get-user/{id}")
//	@Cacheable(value="users" ,key="#id")
//	public User getId(@PathVariable("id") int id) throws InterruptedException
//	{
//		System.out.println("DB");
//		Thread.sleep(4000);
//		return repo.findById(id).get();
//	}
//	
//	
//	@PostMapping("/clear-cache")
//	@CacheEvict(value="users", allEntries=true)
//	public String cachecleared()
//	{
//		return "cache-cleared";
	}
}
