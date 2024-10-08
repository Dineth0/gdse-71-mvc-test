/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;

import java.util.List;

/**
 *
 * @author dineth
 */
public class CustomerController {

    /*public static List<CustomerDto> getAllCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
        private CustomerModel CUSTOMER_MODEL = new CustomerModel();

    

    /*public ArrayList<CustomerDto> getAllCustomers() throws SQLException, ClassNotFoundException{
        ArrayList<CustomerDto> customerDtos = CUSTOMER_MODEL.getAll();
        return customerDtos;
    }*/
     public String saveCustomer(CustomerDto customerDto) throws SQLException, ClassNotFoundException{
        String resp = CUSTOMER_MODEL.save(customerDto);
        return resp;
    }
     public CustomerDto searchCustomer(String CustID){
         CustomerDto dto = CUSTOMER_MODEL.getCustomer(CustID);
         return dto;
     }
     public CustomerDto updateCustomer(String CustID){
         CustomerDto dto = CUSTOMER_MODEL.getCustomer(CustID);
         return dto;
     }
     public CustomerDto deleteCustomer(String CustID){
         CustomerDto dto = CUSTOMER_MODEL.getCustomer(CustID);
         return dto;
     }
      public List<CustomerDto> getAllCustomer() throws  Exception {
        List<CustomerDto> dtos = CUSTOMER_MODEL.getAllCustomer();
        return dtos;
    }
    }
      
      
      
      
      
      
      
      
      
      

 