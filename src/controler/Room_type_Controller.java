package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Test;
import Connecter.Connecter;
import Model.Room;
import Model.Room_type;

import com.mysql.jdbc.Statement;

public class Room_type_Controller {

	public List<Room_type> Blacklist_lectuter_listt() throws Exception{
		List<Room_type> retValue = new ArrayList<Room_type>();
		Connecter conn=new Connecter();
		  Statement stmt = (Statement) conn.ObtenirConnextion().createStatement();
		  ResultSet rs;
		  rs = stmt.executeQuery("SELECT * FROM room_type");
		  
		  Room_type inst_room_type= new Room_type();
		  while(rs.next()){
			  inst_room_type.setId_room_type(rs.getInt("id_room_type"));
			  inst_room_type.setDescription(rs.getString("description"));
			;
			  retValue.add(inst_room_type);
		  }
		  conn.ObtenirConnextion().close();
		return retValue;
		
	}

}
