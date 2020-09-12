package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Test;
import Model.Blacklist_lecturer;
import Model.Blacklist_room;

import com.mysql.jdbc.Statement;

public class Blacklist_room_Controller {

	public List<Blacklist_room> Blacklist_lectuter_listt() throws Exception{
		List<Blacklist_room> retValue = new ArrayList<Blacklist_room>();
		Test t= new Test();
	    Connection conn= t.getConnection();
		  Statement stmt =(Statement) conn.createStatement();
		  ResultSet rs;
		  rs = stmt.executeQuery("SELECT * FROM blacklist_room");
		  
		  Blacklist_room inst_blacklist_room= new Blacklist_room();
		  while(rs.next()){
			  inst_blacklist_room.setId_semester(rs.getInt("id_semester"));
			  inst_blacklist_room.setId_room(rs.getInt("id_room"));
			  inst_blacklist_room.setId_day(rs.getInt("id_day"));
			  inst_blacklist_room.setId_time_slote(rs.getInt("id_time_slot"));

			  retValue.add(inst_blacklist_room);
		  }
		  conn.close();
		return retValue;
		
	}
	public boolean black_List_room(int id_room, int idDay, int idTimeSlot) throws Exception{
		boolean retValue= false;
		Test t= new Test();
	    Connection conn= t.getConnection();
		  Statement stmt =(Statement) conn.createStatement();
		  ResultSet rs;
		  rs = stmt.executeQuery("SELECT * FROM blacklist_room where id_room ="+ id_room +" and id_day ="+ idDay + " and  id_time_slot ="+ idTimeSlot);
		while(rs.next()){
			retValue= true;
			break;
		}
		  return retValue;
	}

}
