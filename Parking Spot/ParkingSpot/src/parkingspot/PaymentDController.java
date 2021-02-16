/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingspot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * 
 */
public class PaymentDController {
 
       public static boolean addPaymentD(PaymentD paymentD) throws ClassNotFoundException, SQLException{
            
           Connection connection = DBConnection.getInstance().getConnection();
           
        PreparedStatement stm = connection.prepareStatement("Insert into PaymentD(PaymentID,vNum,vehicleType,pdate,arrivalTime,departureTime) Values(?,?,?,?,?,?)");
        stm.setObject(1, paymentD.getPaymentID());
        stm.setObject(2, paymentD.getvNum());
        stm.setObject(3, paymentD.getvehicleType());
        stm.setObject(4, paymentD.getDate());
        stm.setObject(5, paymentD.getarrivalTime());
        stm.setObject(6, paymentD.getdepartureTime()); 
        int res = stm.executeUpdate();
        return res>0;
           
           
           
       }
       public static PaymentD searchPaymentD(String pID) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select PaymentID,vNum,vehicleType,pdate,arrivalTime,departureTime,((departureTime-arrivalTime) *CASE WHEN vehicleType='Car' THEN \"50\" WHEN vehicleType='Van' THEN \"75\" WHEN vehicleType='Bus' THEN \"100\" ELSE \"150\" END) as Price from PaymentD where PaymentID=?" ); 
        stm.setObject(1, pID);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
                PaymentD paymentD=new PaymentD(rst.getInt("PaymentID"),rst.getString("vNum"),rst.getString("vehicleType"),rst.getString("pdate"),rst.getString("arrivalTime"),rst.getString("departureTime"),rst.getInt("Price"));
            return paymentD;
        }
        return null;
       }
       public static boolean updatePaymentD(PaymentD paymentD) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update PaymentD set CashierID=? where PaymentID=?");
        stm.setObject(1, paymentD.getCashierID());
        stm.setObject(2, paymentD.getPaymentID());
        return stm.executeUpdate()>0;
    }
        public static boolean updatePaymentDcash(PaymentD paymentD) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update PaymentD set Cash='Paid' where PaymentID=?");
        stm.setObject(1, paymentD.getPaymentID());
        ///stm.setObject(2, paymentD.getPaymentID());
        return stm.executeUpdate()>0;
    }
        public static boolean updatePaymentDcard(PaymentD paymentD) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update PaymentD set Card='Paid' where PaymentID=?");
        stm.setObject(1, paymentD.getPaymentID());
        ///stm.setObject(2, paymentD.getPaymentID());
        return stm.executeUpdate()>0;
    }
      
    /*public static ArrayList<Customer>getAllCustomers() throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("Select * From Customer");
        ArrayList <Customer>customerList=new ArrayList<>();
        while(rst.next()){
            Customer customer=new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary"));
            customerList.add(customer);
        }
        return customerList;*/
    
}
 