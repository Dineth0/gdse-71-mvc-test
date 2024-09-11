/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author dineth
 */
public class OrderDto {
    private String OrderID;
    private String OrderDate;
    private String CustID;
    
    public OrderDto(){
        
    }
    
    public OrderDto(String OrderID, String OrderDate, String CustID){
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.CustID = CustID;
    }

    public OrderDto(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the OrderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the OrderDate
     */
    public String getOrderDate() {
        return OrderDate;
    }

    /**
     * @param OrderDate the OrderDate to set
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }
    @Override
    public String toString(){
        return "OrderDto{" + "OrderID=" + OrderID + ", OrderDate=" + OrderDate + ", CustID=" + CustID + '}';

        
    }
    
    
}
