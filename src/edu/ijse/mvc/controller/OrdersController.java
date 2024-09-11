/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;


import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrdersModel;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author dineth
 */
public class OrdersController {
  

    private final OrdersModel Orders_MODEL;

    public OrdersController() {
        this.Orders_MODEL = new OrdersModel();
    }

    public ArrayList<OrderDto> getAllOrders() throws SQLException, ClassNotFoundException{
        ArrayList<OrderDto> orderDtos = Orders_MODEL.getAll();
        return orderDtos;
    }
    public String saveOrders(OrderDto orderDto)throws SQLException, ClassNotFoundException{
        String resp = Orders_MODEL.save(orderDto);
        return resp;
    }
    public String updateOrders(OrderDto orderDto)throws SQLException, ClassNotFoundException{
        String resp = Orders_MODEL.update(orderDto);
        return resp;
    }
    public String deleteOrders(OrderDto orderDto)throws SQLException, ClassNotFoundException{
        String resp = Orders_MODEL.update(orderDto);
        return resp;
    }
}
