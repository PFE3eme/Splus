package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.Test;

import com.mysql.jdbc.Statement;

import Model.Lecture_object_has_student;
import Model.Sheet;

public class lecture_object_has_student_controlle {

public List<Lecture_object_has_student> list_object_has_student(int id_lecture_object) throws Exception{
List<Lecture_object_has_student> retValue = new ArrayList<Lecture_object_has_student>();
Test t= new Test();
Connection conn= t.getConnection();
  Statement stmt =(Statement) conn.createStatement();
  ResultSet rs;
  rs = stmt.executeQuery("SELECT * FROM lecture_object_has_studen where id_lecture_object="+id_lecture_object);
  

  while(rs.next()){
	  Lecture_object_has_student ins_obj_stud= new Lecture_object_has_student();
	  ins_obj_stud.setId_lecture_object(rs.getInt("id_lecture_object"));
	  ins_obj_stud.setId_student_group(rs.getInt("id_student_group"));
	  ins_obj_stud.setNum_participants(rs.getInt("num_participants"));
	  ins_obj_stud.setIs_mandatory(rs.getInt("is_mandatory"));
	  ins_obj_stud.setPriority_assignment(rs.getInt("priority_assignment"));
	retValue.add(ins_obj_stud);
	 
	
  }
return retValue;
}
public List<Lecture_object_has_student> list_Object(int id_student_group) throws Exception{
List<Lecture_object_has_student> retValue = new ArrayList<Lecture_object_has_student>();
Test t= new Test();
Connection conn= t.getConnection();
  Statement stmt =(Statement) conn.createStatement();
  ResultSet rs;
  rs = stmt.executeQuery("SELECT * FROM lecture_object_has_studen where id_student_group="+id_student_group);
  

  while(rs.next()){
	  Lecture_object_has_student ins_obj_stud= new Lecture_object_has_student();
	  ins_obj_stud.setId_lecture_object(rs.getInt("id_lecture_object"));
	  ins_obj_stud.setId_student_group(rs.getInt("id_student_group"));
	  ins_obj_stud.setNum_participants(rs.getInt("num_participants"));
	  ins_obj_stud.setIs_mandatory(rs.getInt("is_mandatory"));
	  ins_obj_stud.setPriority_assignment(rs.getInt("priority_assignment"));
	retValue.add(ins_obj_stud);
	 
	
  }
return retValue;
}
}
