/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;


/**
 *
 * @author dineth
 */
public class CustomerDto {
    private String CustID;
    private String CustTitle;
    private String CustName;
    private String DOB;
    private double Salary;
    private String CustAddress;
    private String City;
    private String Province;
    private int PostalCode;

    public CustomerDto() {
    }
    public CustomerDto(String CustID, String CustTitle, String CustName, String DOB, double Salary, String CustAddress, String City, String Province, int PostalCode) {
        this.CustID = CustID;
        this.CustTitle = CustTitle;
        this.CustName = CustName;
        this.DOB = DOB;
        this.Salary = Salary;
        this.CustAddress = CustAddress;
        this.City = City;
        this.Province = Province; // Corrected the Province assignment
        this.PostalCode = PostalCode;
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

    /**
     * @return the CustTitle
     */
    public String getCustTitle() {
        return CustTitle;
    }

    /**
     * @param CustTitle the CustTitle to set
     */
    public void setCustTitle(String CustTitle) {
        this.CustTitle = CustTitle;
    }

    /**
     * @return the CustName
     */
    public String getCustName() {
        return CustName;
    }

    /**
     * @param CustName the CustName to set
     */
    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.Salary = salary;
    }

    /**
     * @return the CustAddress
     */
    public String getCustAddress() {
        return CustAddress;
    }

    /**
     * @param CustAddress the CustAddress to set
     */
    public void setCustAddress(String CustAddress) {
        this.CustAddress = CustAddress;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return City;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.City = city;
    }

    /**
     * @return the Province
     */
    public String getProvince() {
        return Province;
    }

    /**
     * @param Province the Province to set
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * @return the PostalCode
     */
    public int getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the PostalCode to set
     */
    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }
    
        @Override
    public String toString() {
        return "CustomerDto{" + "CustID=" + CustID + ", CustTitle=" + CustTitle + ", CustName=" +CustName  + ", DOB=" + DOB + ", salary=" + Salary+", CustAddress=" + CustAddress + ", City=" +City  + ", Province=" + Province + ", PostalCode=" + PostalCode+ '}';
    }
    
}
