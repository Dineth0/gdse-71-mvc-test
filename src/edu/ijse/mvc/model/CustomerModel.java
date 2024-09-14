/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;



/**
 *
 * @author dineth
 */
public class CustomerModel {
   /* public ArrayList<CustomerDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rst = statement.executeQuery();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();

        while(rst.next()){
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustID(rst.getString("CustID"));
            customerDto.setCustTitle(rst.getString("CustTitle"));
            customerDto.setCustName(rst.getString("CustName"));
            customerDto.setDOB(rst.getString("DOB"));
            customerDto.setSalary(rst.getDouble("salary"));
            customerDto.setCustAddress(rst.getString("CustAddress"));
            customerDto.setCity(rst.getString("City"));
            customerDto.setProvince(rst.getString("Province"));
            customerDto.setPostalCode(rst.getInt("PostalCode"));
            

            customerDtos.add(customerDto);
        }
        return customerDtos;
    }*/
    public String save(CustomerDto customerDto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerDto.getCustID());
        statement.setString(2, customerDto.getCustTitle());
        statement.setString(3, customerDto.getCustName());
        statement.setString(4, customerDto.getDOB());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getCustAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setInt(9, customerDto.getPostalCode());
        

        int resp = statement.executeUpdate();
        return resp > 0 ? "Success" : "Fail";

    }
    public CustomerDto getCustomer(String CustID){
        return null;
    }
    public String update(CustomerDto customerDto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customer SET CustTitle = ?, CustName = ?,DOM = ?, Salary = ?, CustAddress = ?, City = ?, PostalCodel =? WHERE CustID = ? " ;
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, customerDto.getCustTitle());
        statement.setString(2, customerDto.getCustName());
        statement.setString(3, customerDto.getDOB());
        statement.setDouble(4, customerDto.getSalary());
        statement.setString(5, customerDto.getCustAddress());
        statement.setString(6, customerDto.getCity());
        statement.setString(7, customerDto.getProvince());
        statement.setInt(8, customerDto.getPostalCode());
        statement.setString(9, customerDto.getCustID());
        

        int resp = statement.executeUpdate();
        return resp > 0 ? "Success" : "Fail";

    }
     public String deleteCustomer(String CustID) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, CustID);

        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Deleted" : "Fail";
    }
     public CustomerDto searchCustomer(String CustID) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, CustID);

        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString(1),
                    rst.getString(2), rst.getString(3),
                    rst.getString(4), rst.getDouble(5),
                    rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getInt(9));

            return  dto;
        }

        return null;
    }
        public List<CustomerDto> getAllCustomer() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);

        List<CustomerDto> customerDtos = new ArrayList<>();

        ResultSet rst = statement.executeQuery();
        while(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString(1),
                    rst.getString(2), rst.getString(3),
                    rst.getString(4), rst.getDouble(5),
                    rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getInt(9));
            customerDtos.add(dto);
        }

        return customerDtos;
    }

    /*public List<CustomerDto> getAllCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
}
