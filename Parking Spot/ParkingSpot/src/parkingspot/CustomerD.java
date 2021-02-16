/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingspot;

/**
 *
 * 
 */
public class CustomerD {
    private String vehicleNum;
    private String OwnerName;
    private int Contact;

    public CustomerD() {
    }

    public CustomerD(String vehicleNum,String OwnerName,int Contact) {
        this.vehicleNum =vehicleNum;
        this.OwnerName = OwnerName;
        this.Contact = Contact;
    }

    /**
     * 
     */
    public String getvehicleNum() {
        return vehicleNum;
    }

    /**
     * 
     */
    public void setvehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }
    /**
     * 
     */
    public String getOwnerName() {
        return OwnerName;
    }

    /**
     * 
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * 
     */
    public int getContact() {
        return Contact;
    }

    /**
     * 
     */
    public void setContact(int Contact) {
        this.Contact = Contact;
    }

    
}
