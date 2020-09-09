package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import controler.Sheet_Controler;
import controler.lecture_object_has_student_controlle;
import Model.Lecture_object_has_student;
import Model.Sheet;
public class Test {



	public static void main(String[] args) throws Exception {
		Sheet_Controler sh= new Sheet_Controler();
	    List<Sheet> list_sheet= new ArrayList<Sheet>();
        list_sheet=sh.sheet_listt();
        int j=0;
        int k=4;
        boolean test_group_lecturer= false;
        for(int i=0;i< list_sheet.size();i++){
    	   List<Sheet> list_neig= new ArrayList<Sheet>();
           
    	 
    	  j=0;
    	   while(j<k){   
    	    List<Sheet> list_time_slot = new ArrayList<Sheet>();
    	    if(list_sheet.get(i).getIdTimeSlot()+j>= 6){
    	    	if(list_sheet.get(i).getIdDay() == 5){   	    		
  	        	  list_time_slot= sh.sheet_listt_time_slot(k-j+1,1);
  	        	  
  	        }
    	    	else{
    	    	    list_time_slot= sh.sheet_listt_time_slot(j+1,list_sheet.get(i).getIdDay()+1);		
    	    	}    	        
    	    }
    	    else{
    	    	list_time_slot= sh.sheet_listt_time_slot(list_sheet.get(i).getIdTimeSlot()+j+1,list_sheet.get(i).getIdDay());    	    	
    	    } 
    	    
    	    if(list_time_slot.size() > 0){
    	    	  for(Sheet s:list_time_slot){
    	    		   list_neig.add(s);
    	    	   }
    	    }
    	 
    	    j++;
    	  }
    	   test_group_lecturer= Test_groug(list_neig,list_sheet.get(i).getIdDay(),list_sheet.get(i).getIdTimeSlot() );
    	   
    	   System.out.println(list_sheet.get(i).getIdLectureObejct());
    	   
       }
		
	}
	public static boolean Test_groug( List<Sheet> list_Lecture, int idDay, int idTimeSlot) throws Exception{
		lecture_object_has_student_controlle losc= new lecture_object_has_student_controlle();
		for(Sheet le:list_Lecture){
		   List<Lecture_object_has_student> list_obj_stud = new ArrayList<Lecture_object_has_student>();
		   list_obj_stud=losc.list_object_has_student(le.getIdLectureObejct());
		   for(Lecture_object_has_student lectobj:list_obj_stud){
			   
		   }
		}
		return false;
	}

	 public static Connection getConnection() throws Exception {
		  try{
			  String driver ="com.mysql.jdbc.Driver";
			  String url ="jdbc:mysql://localhost:3306/splus+";
			  String username="root";
			  String password="";
			  Connection conn= DriverManager.getConnection(url,username,password);
			  System.out.println("connected");
			  return conn;
		  }
		  catch(Exception e ){
			  System.out.println(e);
		  }
		 return null;
	 }
}
