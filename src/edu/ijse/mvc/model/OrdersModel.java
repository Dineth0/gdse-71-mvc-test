/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author dineth
 */
public class OrdersModel {
    public ArrayList<OrderDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Orders";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery(); 
        ArrayList<OrderDto> orderDtos = new ArrayList<>();
        
        while(rst.next()){
            OrderDto orderDto = new OrderDto();
            orderDto.setOrderID(rst.getString("OrderID"));
            orderDto.setOrderDate(rst.getString("OrderDate"));
            orderDto.setCustID(rst.getString("CustID"));
            
            orderDtos.add(orderDto);
        }
        return orderDtos;
    }
    public String save(OrderDto dto)throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getOrderID());
        statement.setString(2, dto.getOrderDate());
        statement.setString(3, dto.getCustID());
        
        int resp = statement.executeUpdate();
        return resp > 0? "Success" : "Fail";
    }
    public String update(OrderDto dto)throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Orders SET OrderDate = ?, CustID = ? WHERE OrderID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, dto.getOrderID());
        statement.setString(2, dto.getOrderDate());
        statement.setString(3, dto.getCustID());
        
        int resp = statement.executeUpdate();
        return resp > 0? "Success" : "Fail";
    }
    public String delete(OrderDto orderdto)throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql =  "DELETE FROM Orders WHERE OrderId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, dto.getOrderID());
        
        int resp = statement.executeUpdate();
        return resp > 0? "Success" : "Fail";
    }
}
