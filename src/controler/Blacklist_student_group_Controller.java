package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Test;
import Connecter.Connecter;
import Model.Blacklist_semester;
import Model.Blacklist_student_group;

import com.mysql.jdbc.Statement;

public class Blacklist_student_group_Controller {

	public List<Blacklist_student_group> Blacklist_lectuter_listt() throws Exception{
		List<Blacklist_student_group> retValue = new ArrayList<Blacklist_student_group>();
		Connecter conn=new Connecter();
		  Statement stmt = (Statement) conn.ObtenirConnextion().createStatement();
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
		  conn.ObtenirConnextion().close();
		return retValue;
		
	}
public boolean black_list_group(int id_student_group, int id_day, int id_time_Slot) throws Exception{
	boolean retValue=false;
	Connecter conn=new Connecter();
	  Statement stmt = (Statement) conn.ObtenirConnextion().createStatement();
	  ResultSet rs;
	  rs = stmt.executeQuery("SELECT * FROM blacklist_student_group where id_Student_group ="+ id_student_group +" and id_day ="+ id_day +" and id_time_slot ="+ id_time_Slot);
	  while( rs.next()){
		  retValue=true;
		  break;
	  }
	  conn.ObtenirConnextion().close(); 
	return retValue;
}
}
