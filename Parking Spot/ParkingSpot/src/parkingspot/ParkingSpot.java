
package parkingspot;
import java.sql.*;
public class ParkingSpot {
    public static void main(String args[]){
		String SQL="Select * From CustomerD";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ParkingSpot","root","ijse");
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery(SQL);
			while(rst.next()){ //move first row
				String vehicleNum=rst.getString("vehicleNum");
				String vehicleType=rst.getString("vehicleType");
				String OwnerName=rst.getString("OwnerName");
				int Contact=rst.getInt("Contact");
                                System.out.println(vehicleNum+"\t"+vehicleType+"\t"+OwnerName+"\t"+ Contact);
			}
			
		}catch(ClassNotFoundException ex){
			System.out.println("Driver not found...");
			System.out.println(ex.getMessage());
			return;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
                String SQL1="Select * From PaymentD";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ParkingSpot","root","ijse");
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery(SQL1);
			while(rst.next()){ //move first row
				int PaymentID=rst.getInt("PaymentID");
                                String vNum=rst.getString("vNum");
				String arrivalTime=rst.getString("arrivalTime");
				String departureTime=rst.getString("departureTime");
                                int CashierID=rst.getInt("CashierID");
				System.out.println(PaymentID+"\t"+vNum+"\t"+arrivalTime+"\t"+departureTime+"\t"+CashierID);
			}
			
		}catch(ClassNotFoundException ex){
			System.out.println("Driver not found...");
			System.out.println(ex.getMessage());
			return;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
    }
    
}
