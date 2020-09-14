package controler;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import Connecter.Connecter;
import Model.Day_of_work_priority_she;
import Model.Lecturer_semester;
import Model.Sheet;

public class Lecturer_semester_Controller {

public int score_sc1(Sheet solution) throws SQLException{
	int retValue=0;
	Connecter conn=new Connecter();
	  Statement stmt = (Statement) conn.ObtenirConnextion().createStatement();
	  ResultSet rs;
	  rs = stmt.executeQuery("SELECT * FROM day_of_work_priority_sche  where id_day_of_work_priority_scheme IN(select id_day_of_work_priority_scheme from lecturer_semester  where id_lecturer = " +solution.getIdLecturer()+")");
	 
	  while(rs.next()){
		  Day_of_work_priority_she dowps= new Day_of_work_priority_she();
		  dowps.setId_day_of_work_priority_sheme(rs.getInt("id_day_of_work_priority_scheme"));
		  dowps.setPriority_monday(rs.getInt("priority_monday"));
		  dowps.setPriority_thursday(rs.getInt("priority_tuesday"));
		  dowps.setPriority_wednesday(rs.getInt("priority_wednesday"));
		  dowps.setPriority_thursday(rs.getInt("priority_thursday"));
		  dowps.setPriority_friday(rs.getInt("priority_friday"));
		  switch(solution.getIdDay()){
		  case 1 :
			  retValue= dowps.getPriority_monday();
			  break;
		  case 2 :
			  retValue= dowps.getPriority_tuesday();
			  break;
		  case 3 :
			  retValue= dowps.getPriority_wednesday();
			  break;
		  case 4 :
			  retValue= dowps.getPriority_thursday();
			  break;
		  case 5 :
			  retValue= dowps.getPriority_friday();
			  break;
		  }
	  }
	  

	  
	  
	  
	
	
	return retValue;
}

}
