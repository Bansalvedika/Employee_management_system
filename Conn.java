package Employee_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    Conn(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // Step 1. for sql = Register the driver class
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","vedikabansal@123"); // Step 2. foe sql = Creating a Connecting String
            s = c.createStatement();  // Step 3. for sql = creating the Statement

            //Step 4. for sql = sql execute MYsql query
            //Step 5. for sql = closing the connection
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
