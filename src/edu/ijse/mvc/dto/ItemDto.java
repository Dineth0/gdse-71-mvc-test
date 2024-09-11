 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;
import java.sql.Date;

/**
 *
 * @author dineth
 */
public class ItemDto {
    private String itemCode;
    private String description;
    private String packSize;
    private double unitPrice;
    private int qoh;
    
    public ItemDto(){
    }
    
    public ItemDto(String itemCode, String description, String packSize, double unitPrise, int qoh){
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }
    public String getItemCode(){
        return itemCode;
    }
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }
    public String Description(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getPackSize(){
        return packSize;
    }
    public void setpackSize(String packSize){
        this.packSize = packSize;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public int getQoh(){
        return qoh;
    }
    public void setQoh(int qoh){
        this.qoh = qoh;
    }
    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + itemCode + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
}
