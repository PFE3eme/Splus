package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Test;
import Model.Blacklist_student_group;
import Model.Room;

import com.mysql.jdbc.Statement;

public class Room_Controller {

	public List<Room> Blacklist_lectuter_listt() throws Exception{
		List<Room> retValue = new ArrayList<Room>();
		Test t= new Test();
	    Connection conn= t.getConnection();
		  Statement stmt =(Statement) conn.createStatement();
		  ResultSet rs;
		  rs = stmt.executeQuery("SELECT * FROM room");
		  
		  Room inst_room= new Room();
		  while(rs.next()){
			  inst_room.setId_room(rs.getInt("id_room"));
			  inst_room.setDescriptmion(rs.getString("description"));
			  inst_room.setCapacity(rs.getInt("capacity"));
			  inst_room.setId_room_type(rs.getInt("id_time_slot"));
			  retValue.add(inst_room);
		  }
		  conn.close();
		return retValue;
		
	}

}
