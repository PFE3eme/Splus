package controler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.Test;

import com.mysql.jdbc.Statement;

import Connecter.Connecter;
import Model.Sheet;
public class Sheet_Controler {

public List<Sheet> sheet_listt() throws Exception{
	List<Sheet> retValue = new ArrayList<Sheet>();
	Connecter conn=new Connecter();
	  Statement stmt = (Statement) conn.ObtenirConnextion().createStatement();
	  ResultSet rs;
	  rs = stmt.executeQuery("SELECT * FROM sheet1");
	  
	
	  while(rs.next()){
		  Sheet inst_sheet= new Sheet();
		  inst_sheet.setIdClassroom(rs.getInt("IdClassroom"));
		  inst_sheet.setIdDay(rs.getInt("IdDay"));
		  inst_sheet.setIdLectureObejct(rs.getInt("idLectureObject"));
		  inst_sheet.setIdLecturer(rs.getInt("idLecturer"));
		  inst_sheet.setIdTimeSlot(rs.getInt("idTimeSlot"));
		
		  retValue.add(inst_sheet);
		
	  }
	
	return retValue;
	
}
public List<Sheet> sheet_listt_time_slot(int idTimeSlot, int idDay) throws Exception{
	List<Sheet> retValue = new ArrayList<Sheet>();
	Connecter conn=new Connecter();
	  Statement stmt = (Statement) conn.ObtenirConnextion().createStatement();
	  ResultSet rs;
	  rs = stmt.executeQuery("SELECT * FROM sheet1 where idTimeSlot="+idTimeSlot+" and idDay = "+idDay);
	  
	
	  while(rs.next()){
		  Sheet inst_sheet= new Sheet();
		  inst_sheet.setIdClassroom(rs.getInt("IdClassroom"));
		  inst_sheet.setIdDay(rs.getInt("IdDay"));
		  inst_sheet.setIdLectureObejct(rs.getInt("idLectureObject"));
		  inst_sheet.setIdLecturer(rs.getInt("idLecturer"));
		  inst_sheet.setIdTimeSlot(rs.getInt("idTimeSlot"));
		
		  retValue.add(inst_sheet);
		
	  }
	  conn.ObtenirConnextion().close();
	return retValue;
	
}
public Sheet object_lecture(int idlectureobject) throws Exception{
	Sheet retValue = new Sheet();
	Connecter conn=new Connecter();
	  Statement stmt = (Statement) conn.ObtenirConnextion().createStatement();
	  ResultSet rs;
	  rs = stmt.executeQuery("SELECT * FROM sheet1 where idLectureObject="+idlectureobject);
	  while(rs.next()){
		 
		  retValue.setIdClassroom(rs.getInt("IdClassroom"));
		  retValue.setIdDay(rs.getInt("IdDay"));
		  retValue.setIdLectureObejct(rs.getInt("idLectureObject"));
		  retValue.setIdLecturer(rs.getInt("idLecturer"));
		  retValue.setIdTimeSlot(rs.getInt("idTimeSlot"));
	  }
	  conn.ObtenirConnextion().close();
	return retValue;
}

}
