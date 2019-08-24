/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jai
 */
public class MyConnect {
    
        public static Connection connectDatabase(){
            try{
            Connection conn=null;
            //Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","jai","jai123");
            JOptionPane.showMessageDialog(null, "Connection Sucessfull!!!");
            return conn;
            }
            catch(Exception e){
               System.out.println(e.getMessage());
            }   
            return null;
        }
        public static void main(String args[]){
            MyConnect.connectDatabase();
            
        }
}
