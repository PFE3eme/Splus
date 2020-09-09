package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Test;
import Model.Blacklist_semester;
import Model.Blacklist_room;

import com.mysql.jdbc.Statement;

public class Blacklist_semester_Controler {

	public List<Blacklist_semester> Blacklist_lectuter_listt() throws Exception{
		List<Blacklist_semester> retValue = new ArrayList<Blacklist_semester>();
		Test t= new Test();
	    Connection conn= t.getConnection();
		  Statement stmt =(Statement) conn.createStatement();
		  ResultSet rs;
		  rs = stmt.executeQuery("SELECT * FROM blacklist_semester");
		  
		  Blacklist_semester inst_blacklist_semester= new Blacklist_semester();
		  while(rs.next()){
			  inst_blacklist_semester.setId_semester(rs.getInt("id_semester"));
			  
			  inst_blacklist_semester.setId_day(rs.getInt("id_day"));
			  inst_blacklist_semester.setId_time_slot(rs.getInt("id_time_slot"));
			  retValue.add(inst_blacklist_semester);
		  }
		return retValue;
		
	}

}
