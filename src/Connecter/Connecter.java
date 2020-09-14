package Connecter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {
    Connection con;
public Connecter(){
    try {
Class.forName("com.mysql.jdbc.Driver");

} 
catch(ClassNotFoundException e) {
System.out.println(e);}

try {
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/splus","root","");}
catch(SQLException e){System.out.println(e);}

}

public Connection ObtenirConnextion(){
	
	return con;
	}

    
}
