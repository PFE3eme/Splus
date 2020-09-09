package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Test;
import Model.Blacklist_semester;
import Model.Blacklist_student_group;

import com.mysql.jdbc.Statement;

public class Blacklist_student_group_Controller {

	public List<Blacklist_student_group> Blacklist_lectuter_listt() throws Exception{
		List<Blacklist_student_group> retValue = new ArrayList<Blacklist_student_group>();
		Test t= new Test();
	    Connection conn= t.getConnection();
		  Statement stmt =(Statement) conn.createStatement();
		  ResultSet rs;
		  rs = stmt.executeQuery("SELECT * FROM blacklist_student_group");
		  
		  Blacklist_student_group inst_blacklist_student_group= new Blacklist_student_group();
		  while(rs.next()){
			  inst_blacklist_student_group.setId_semester(rs.getInt("id_semester"));
			  inst_blacklist_student_group.setId_student_group(rs.getInt("id_student_group"));
			  inst_blacklist_student_group.setId_day(rs.getInt("id_day"));
			  inst_blacklist_student_group.setId_time_slot(rs.getInt("id_time_slot"));
			  retValue.add(inst_blacklist_student_group);
		  }
		return retValue;
		
	}

}
