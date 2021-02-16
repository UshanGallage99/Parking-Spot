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
public class PaymentD {
    private int PaymentID;
    private String vNum;
    private String vehicleType;
    private String pdate;
    private String arrivalTime;
    private String departureTime;
     private int price;
    private int CashierID;

    public PaymentD() {
    }
    public PaymentD(String pdate,String  arrivalTime) {
        this.pdate=pdate;
        this. arrivalTime = arrivalTime;
         
    }
    public PaymentD(int PaymentID,int  CashierID) {
       this.PaymentID=PaymentID;
        this. CashierID = CashierID;
         
    }
    public PaymentD(int PaymentID) {
       this.PaymentID=PaymentID;
         
    }
     public PaymentD(int PaymentID,String vNum,String vehicleType,String pdate, String  arrivalTime, String departureTime) {
        this.PaymentID =PaymentID;
         this.vNum=vNum;
         this.vehicleType=vehicleType;
        this.pdate=pdate;
        this.arrivalTime = arrivalTime;
        this.departureTime= departureTime ;
         
    }
    public PaymentD(int PaymentID,String vNum,String vehicleType,String pdate, String  arrivalTime,String departureTime,int price) {
        this.PaymentID =PaymentID;
        this.vNum= vNum;
        this.vehicleType=vehicleType;
        this.pdate=pdate;
        this. arrivalTime = arrivalTime;
        this.departureTime =departureTime;
        this.price=price;
    }

    PaymentD(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PaymentD(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return 
     */
    public int getPaymentID() {
        return PaymentID;
    }

    /**
     * 
     * @param PaymentID
     */
    public void setPaymentID(int PaymentID) {
        this.PaymentID=PaymentID;
    }

    /**
     * 
     * @return 
     */
    public String getvNum() {
        return vNum;
    }

    /**
     * 
     * @param vNum
     */
    public void setvNum(String vNum) {
        this.vNum= vNum;
    }
    
    public String getvehicleType() {
        return vehicleType;
    }

    /**
     * 
     */
    public void setvehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDate() {
        return pdate;
    }

    /**
     * 
     * @param pdate
     */
    public void setDate(String pdate) {
        this.pdate= pdate;
    }
    /**
     * 
     * @return 
     */
    public String getarrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     */
    public void setarrivalTimee(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 
     * @return 
     */
    public String getdepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     */
    public void setdepartureTime(String departureTime) {
        this.departureTime= departureTime;
    }
    
    public int getPrice() {
        return price;
    }

    /**
     *      
     */
    public void setPrice(int price) {
        this.price=price;
    }
    public int getCashierID() {
        return CashierID;
    }

    /**
     * 
     * @param CashierID
     */
    public void setCashierID(int CashierID) {
        this.CashierID=CashierID;
    }
    
}
