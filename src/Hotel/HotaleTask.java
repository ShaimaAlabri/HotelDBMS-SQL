package Hotel;
import java.sql.*;
import java.util.Scanner;


    
public class HotaleTask {
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;" +
				 "databaseName=HotelDBMS;" +
				 "encrypt=true;" +
				 "trustServerCertificate=true";
				 String user = "sa";
				 String pass = "root";
				
				 Connection con = null;
				 try {
					Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					DriverManager.registerDriver(driver);
				 con = DriverManager.getConnection(url, user, pass);
				 Statement st = con.createStatement();
				 String sql1 =
				 "CREATE TABLE Hotels (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " hotel_name TEXT NOT NULL,\r\n"
				 + " hotel_location TEXT,\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "CREATE TABLE Room_Type (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " room_type_name TEXT NOT NULL,\r\n"
				 + " created_date DATE,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "CREATE TABLE Rooms (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " room_type_id INTEGER REFERENCES Room_Type(id),\r\n"
				 + " hotel_id INTEGER REFERENCES Hotels(id),\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "CREATE TABLE Guests (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " guest_name TEXT NOT NULL,\r\n"
				 + " guest_phone TEXT NOT NULL,\r\n"
				 + " guest_accompanying_members INTEGER NOT NULL,\r\n"
				 + " guest_payment_amount INTEGER NOT NULL,\r\n"
				 + " room_id INTEGER REFERENCES Rooms(id),\r\n"
				 + " hotel_id INTEGER REFERENCES Hotels(id),\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "CREATE TABLE Employee_Type (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " employee_type_name TEXT NOT NULL,\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "CREATE TABLE Employees (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " employee_name TEXT NOT NULL,\r\n"
				 + " employee_phone TEXT NOT NULL,\r\n"
				 + " employee_type_id INTEGER REFERENCES Employee_Type(id),\r\n"
				 + " room_id INTEGER REFERENCES Rooms(id),\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");"+
				 "CREATE TABLE Rooms (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " room_type_id INTEGER REFERENCES Room_Type(id),\r\n"
				 + " hotel_id INTEGER REFERENCES hotel(id),\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "\r\n"
				 + " CREATE TABLE Guests (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " guest_name TEXT NOT NULL,\r\n"
				 + " guest_phone TEXT NOT NULL,\r\n"
				 + " guest_accompanying_members INTEGER NOT NULL,\r\n"
				 + " guest_payment_amount INTEGER NOT NULL,\r\n"
				 + " room_id INTEGER REFERENCES Rooms(id),\r\n"
				 + " hotel_id INTEGER REFERENCES hotel(id),\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "\r\n"
				 + " CREATE TABLE Employee_Type (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " employee_type_name TEXT NOT NULL,\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");\r\n"
				 + "\r\n"
				 + " CREATE TABLE Employees (\r\n"
				 + " id INTEGER PRIMARY KEY,\r\n"
				 + " employee_name TEXT NOT NULL,\r\n"
				 + " employee_phone TEXT NOT NULL,\r\n"
				 + " employee_type_id INTEGER REFERENCES Employee_Type(id),\r\n"
				 + " room_id INTEGER REFERENCES Rooms(id),\r\n"
				 + " created_date DATE NOT NULL,\r\n"
				 + " updated_date DATE,\r\n"
				 + " is_active BIT NOT NULL\r\n"
				 + ");";
				// String sql2 = "create table Hotels";
				//
				
//					}
//					ResultSet resultSet = st.executeQuery(sql1);

//				 con.close();
//					} catch (Exception ex) {
//					System.err.println(ex);
//					}

			
			Scanner scanner=new Scanner (System.in);
			System.out.println("the first table");
			System.out.println("Enter id");
			int id=scanner.nextInt();
			System.out.println("Enter Hotel Name");
			String hotel_name=scanner.next();
			System.out.println("Enter hotel location");
			String hotel_location =scanner.next();
			System.out.println("Enter created date");
			String hotel_created_date  =scanner.next();
			System.out.println("Enter update date");
			String hotel_updated_date   =scanner.next();
			System.out.println("Enter is_Active ");
			String hotel_is_Activee   =scanner.next();
			/////////////////////////////
//			System.out.println("the second table");
//			System.out.println("Enter id");
//			int id=scanner.nextInt();
//			System.out.println("Enter room_type");
//			String room_type =scanner.next();
//			System.out.println("Enter created_date");
//			String room_type_created_date =scanner.next();
//			System.out.println("Enter updated_date ");
//			String room_type_updated_date =scanner.next();
//			System.out.println("Enter is_Active");
//			String room_type_is_Active =scanner.next();
			//////////
//			System.out.println("the third table");
//			System.out.println("Enter guest id");
//			int guest_id =scanner.nextInt();
//			System.out.println("Enter guest name");
//			String guest_name =scanner.next();
//			System.out.println("Enter guest_phone ");
//     		String guest_phone  =scanner.next();
//			System.out.println("Enter guest_accompanying_members ");
//			int guest_accompanying_members =scanner.nextInt();
//			System.out.println("Enter updated_date ");
//			String Rooms_update_date =scanner.next();
//			System.out.println("Enter is_Active");
//			String Rooms_Active =scanner.next();
//			////////
//			System.out.println("the 4 table");
//			System.out.println("Enter guest_id");
//			int guest_id=scanner.nextInt();
//			System.out.println("Enter guest_name");
//			String guest_name =scanner.next();
//			System.out.println("Enter guest_phone ");
//			String guest_phone  =scanner.next();
//			System.out.println("Enter guest_accompanying_members ");
//			int guest_accompanying_members =scanner.nextInt();
//			System.out.println("Enter guest_payment_amount  ");
//			int guest_payment_amount  =scanner.nextInt();
//			System.out.println("Enter Rooms id");
//			int Rooms_id=scanner.nextInt();
//			System.out.println("Enter hotel_id ");
//			int hotel_id  =scanner.nextInt();
//			System.out.println("Enter created_date");
//			String guest_date =scanner.next();
//			System.out.println("Enter updated_date ");
//			String guest_update_date =scanner.next();
//			System.out.println("Enter is_Active");
//     		String guest_Active =scanner.next();
//			/////////
//			System.out.println("the 5 table");
//			System.out.println("Enter Employee_Typ id");
//			int Employee_Type_id=scanner.nextInt();
//			System.out.println("Enter employee_type_name ");
//			String employee_type_name  =scanner.next();
//			
//			System.out.println("Enter created_date");
//			String Employee_Typ_date =scanner.next();
//			System.out.println("Enter updated_date ");
//			String Employee_Typ_update_date =scanner.next();
//			System.out.println("Enter is_Active");
//			String Employee_Typ_Active =scanner.next();
//			/////////
//			System.out.println("the 6 table");
//			System.out.println("Enter Employees id");
//			int Employees_id=scanner.nextInt();
//			
//			System.out.println("Enter created_date");
//			String Employees_date =scanner.next();
//			System.out.println("Enter updated_date ");
//			String Employees_update_date =scanner.next();
//			System.out.println("Enter is_Active");
//			String Employees_Active =scanner.next();
			/////////
     		

			// String sql = "insert into Table_1 values('" + name+ "'," + roll + ",'" + cls+ "')";
	           //String sql = "INSERT INTO Hotels ('" + id + "'," + hotel_name + "'," + hotel_location + "'," + created_date
	           //+ updated_date + "'," + is_Active + "')";
	            String sql = "INSERT INTO Hotels (id,hotel_name,hotel_location,created_date,updated_date,is_Active)"+
	                    "VALUES ("+"'"+id+"','"+hotel_name+"','"+hotel_location+"','"+hotel_created_date+"','"+hotel_updated_date+ "',"+hotel_is_Activee+")";
	                    
//	            +"INSERT INTO Employee_Type (id ,  room_type, hotel_id , created_date , updated_date,is_Active  ) " +
//	            "VALUES ("+"'" + id + "','" + room_type + "','" + room_type_created_date +"','" + room_type_updated_date + "','" + room_type_is_Active + "');"
//	                    
//	                +"INSERT INTO guest  (guest id,guest name, guest_phone, guest_accompanying_members, guest_payment_amount, is_active,Rooms id,hotel_id,created_date,updated_date , is_Active) " +
//	            "VALUES ("+"'" + guest_id + "','" + guest_name + "','" + guest_phone +"','" + guest_accompanying_members + "','" + guest_payment_amount +"','"+Rooms_id+"','"+hotel_id+"','"+guest_date+"','"+guest_update_date+"','"+guest_Active+"')";
                    
//	            +"INSERT INTO Guests (id, guest_name, guest_phone, guest_accompanying_members, guest_payment_amount,room_id,"
//	            + "hotel_id,created_date,updated_date,is_active) " +
//	            "VALUES (" + guest_id + ",'" + guest_name + "','" + guest_phone +"'," + guest_accompanying_members + ",'"
//	            + guest_payment_amount +"',"+ room_id +"," +hotel_IID+",'"+guest_created_date+ "','"+guets_updated_date+ "',"+guest_is_active+ ")";
	            System.out.println(sql);
	            Integer m = st.executeUpdate(sql);
	            if (m >= 1) {
	                System.out.println("inserted successfully : " + sql);
	            } else {
	                System.out.println("insertion failed");
	            }
	            String sql2 = "Select * from Employee_Type";
	            ResultSet resultSet = st.executeQuery(sql2);
	            while (resultSet.next()) {
//	              System.out.println(resultSet.getString(id));
//	              System.out.println(resultSet.getString(room_type));;
//	              System.out.println(resultSet.getString(created_date));
//	              System.out.println(resultSet.getString(updated_date));
//	              System.out.println(resultSet.getString(is_active));
	            }
	        
	            con.close();
	        } catch (Exception ex) {
	            System.err.println(ex);
	        }
	}
}

	    
	




			

		

			
			




			


















	


