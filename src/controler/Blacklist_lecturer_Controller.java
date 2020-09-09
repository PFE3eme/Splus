package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Test;
import Model.Blacklist_lecturer;

import com.mysql.jdbc.Statement;

public class Blacklist_lecturer_Controller {

	public List<Blacklist_lecturer> Blacklist_lectuter_listt() throws Exception{
		List<Blacklist_lecturer> retValue = new ArrayList<Blacklist_lecturer>();
		Test t= new Test();
	    Connection conn= t.getConnection();
		  Statement stmt =(Statement) conn.createStatement();
		  ResultSet rs;
		  rs = stmt.executeQuery("SELECT * FROM blacklist_lecturer");
		  
		  Blacklist_lecturer inst_blacklist_lecturer= new Blacklist_lecturer();
		  while(rs.next()){
			  inst_blacklist_lecturer.setId_semester(rs.getInt("id_semester"));
			  inst_blacklist_lecturer.setId_lecturer(rs.getInt("id_lecturer"));
			  inst_blacklist_lecturer.setId_day(rs.getInt("id_day"));
			  inst_blacklist_lecturer.setId_time_slot(rs.getInt("id_time_slot"));

			  retValue.add(inst_blacklist_lecturer);
		  }
		return retValue;
		
	}

}
