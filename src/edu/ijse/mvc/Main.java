/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;


import edu.ijse.mvc.db.DBConnection;
//import edu.ijse.mvc.view.ItemView;
import edu.ijse.mvc.view.CustomerView;
import java.sql.SQLException;

/**
 *
 * @author dineth
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
       /*ItemView itemview = new ItemView();
       itemview.setLocationRelativeTo(null);
       itemview.setVisible(true);
       
       /*CustomerView customerview = new CustomerView();
       customerview.setLocationRelativeTo(null);
       customerview.setVisible(true);*/
       
       
       
       DBConnection.getInstance().getConnection();
       new CustomerView().setVisible(true);
    }

   
    
}
