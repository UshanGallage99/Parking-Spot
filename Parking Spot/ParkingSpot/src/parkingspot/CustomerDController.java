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
 * @author Niroth Samarawickram
 */
public class CustomerDController {
    public static CustomerD searchCustomerD(String vehicleNum) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Select * From CustomerD where vehicleNum=?");
        stm.setObject(1, vehicleNum);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            CustomerD customerD=new CustomerD(rst.getString("vehicleNum"), rst.getString("OwnerName"), rst.getInt("Contact"));
            return customerD;
        }
        return null;
    }
       public static boolean addCustomerD(CustomerD customerD) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into CustomerD Values(?,?,?)");
        stm.setObject(1, customerD.getvehicleNum());
        stm.setObject(2, customerD.getOwnerName());
        stm.setObject(3, customerD.getContact());
        //PreparedStatement stm1 = connection.prepareStatement("Insert into PaymentD Values(?,?,?,?)");
        int res = stm.executeUpdate();
        return res>0;
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
