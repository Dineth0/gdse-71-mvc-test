/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dineth
 */
public class CustomerController {
        private final CustomerModel CUSTOMER_MODEL;

    public CustomerController() {
        this.CUSTOMER_MODEL = new CustomerModel();
    }

    public ArrayList<CustomerDto> getAllCustomers() throws SQLException, ClassNotFoundException{
        ArrayList<CustomerDto> customerDtos = CUSTOMER_MODEL.getAll();
        return customerDtos;
    }
     public String saveCustomer(CustomerDto customerDto) throws SQLException, ClassNotFoundException{
        String resp = CUSTOMER_MODEL.save(customerDto);
        return resp;
    }
     public CustomerDto searchCustomer(String CustID){
         CustomerDto dto = CUSTOMER_MODEL.getCustomer(CustID);
         return dto;
     }
}
