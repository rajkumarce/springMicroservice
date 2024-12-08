package com.mrk.app.service.impl;

import com.mrk.app.model.CustomerDTO;
import com.mrk.app.service.CustomerService;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

@Service
public class CustomerServiceMemoryImpl implements CustomerService {
    private Map<Integer, CustomerDTO> persist = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDTO(id,name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return persist.get(id);
    }
    
    @PostConstruct
    public void initCustomer() {
    	persist.put(1, new CustomerDTO(1, "Raj"));
    	persist.put(2, new CustomerDTO(2, "Kumar"));
    }
}
