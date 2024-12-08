package com.mrk.app.controller;

import com.mrk.app.model.CustomerDTO;
import com.mrk.app.service.CustomerService;

//import lombok.AllArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.beans.factory.annotation.Autowired;

//@AllArgsConstructor
@RestController
public class CustomerController {
	
	@Autowired
    private CustomerService customerService;

    @RequestMapping("/health")  
    public String health()   
    {  
    	return "Customer project health status active";  

    }  
    
    @PostMapping (value = "/addCustomers")
    public void addCustomer(@RequestParam int id,@RequestParam String name){
        customerService.addCustomer(id,name);
    }
    @GetMapping (value = "/getCustomer")
    public CustomerDTO getCustomer(@RequestParam int id){
        return customerService.getCustomer(id);
    }
}
