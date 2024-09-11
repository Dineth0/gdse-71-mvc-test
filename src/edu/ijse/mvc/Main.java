/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;


import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.view.ItemView;
import edu.ijse.mvc.view.CustomerView;
import edu.ijse.mvc.view.OrdersView;
import edu.ijse.mvc.view.OrderDetailView;
/**
 *
 * @author dineth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ItemView itemview = new ItemView();
       itemview.setLocationRelativeTo(null);
       itemview.setVisible(true);
       
       CustomerView customerview = new CustomerView();
       customerview.setLocationRelativeTo(null);
       customerview.setVisible(true);
       
       OrdersView orderview = new OrdersView();
       orderview.setLocationRelativeTo(null);
       orderview.setVisible(true);
       
       OrderDetailView orderdetailview = new OrderDetailView();
       orderdetailview.setLocationRelativeTo(null);
       orderdetailview.setVisible(true);
    }

   
    
}
