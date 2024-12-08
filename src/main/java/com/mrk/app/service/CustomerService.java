package com.mrk.app.service;

import com.mrk.app.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);

    CustomerDTO getCustomer(int id);
    
    void initCustomer();
}
