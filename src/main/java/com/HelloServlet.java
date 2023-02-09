package com;

import com.model.Customer;
import com.service.CustomerService;
import com.service.CustomerServiceImpl;

public class HelloServlet  {
    public static void main(String[] args) {
        CustomerService customers = new CustomerServiceImpl();
        for(Customer customer: customers.findAll()){
            System.out.println(customer);
        }
    }
}