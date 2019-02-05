/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.sql.*;

/**
 *
 * @author HP
 */
public class userDAO {
    
    public boolean check(user u){
        boolean flag=false;
        
        try{
        
            String url="jdbc:mysql://localhost:3306/new";
            String name="root";
            String pwd="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,name,pwd);
            
            Statement stmt = con.createStatement();
            
            String qr="select * from log where username='"+u.getUname()+"'"+"and password='"+u.getPwd()+"'";
            
            ResultSet rs=stmt.executeQuery(qr);
            rs.next();
//            System.out.println(u.getUname());
//            System.out.println(u.getPwd());
           flag =rs.last();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
        
        
    }
}
