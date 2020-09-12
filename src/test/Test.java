package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import controler.Blacklist_lecturer_Controller;
import controler.Blacklist_room_Controller;
import controler.Blacklist_student_group_Controller;
import controler.Sheet_Controler;
import controler.lecture_object_has_student_controlle;
import Model.Lecture_object_has_student;
import Model.Sheet;
public class Test {



	public static void main(String[] args) throws Exception {
		Sheet_Controler sh= new Sheet_Controler();
	    List<Sheet> list_sheet= new ArrayList<Sheet>();
	    Blacklist_lecturer_Controller black_Lec= new Blacklist_lecturer_Controller(); 
	    Blacklist_room_Controller black_room = new Blacklist_room_Controller();
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
    	   test_group_lecturer= Test_groug(list_neig,list_sheet.get(i).getIdDay(),list_sheet.get(i).getIdTimeSlot(),list_sheet.get(i));
    	   
    	   for(Sheet neig: list_neig){
    		   boolean test_blacklist_lecture=false;
    		   boolean test_blacklist_room= false;
    		   test_blacklist_lecture= black_Lec.black_list_lecture_test(neig,list_sheet.get(i).getIdDay(), list_sheet.get(i).getIdTimeSlot());
    		   test_blacklist_lecture = black_Lec.black_list_lecture_test(list_sheet.get(i), neig.getIdDay(),neig.getIdTimeSlot());
    		   test_blacklist_room= black_room.black_List_room(neig.getIdClassroom(), list_sheet.get(i).getIdDay(), list_sheet.get(i).getIdTimeSlot());
    		   test_blacklist_room= black_room.black_List_room(list_sheet.get(i).getIdClassroom(),neig.getIdDay(),neig.getIdTimeSlot());
    		   
    	   }
    	   if(test_group_lecturer){
    		   // list tabu 
    	   }
    	   System.out.println(list_sheet.get(i).getIdLectureObejct());
    	   
       }
		
	}
	
	public static boolean Test_groug( List<Sheet> list_Lecture, int idDay, int idTimeSlot, Sheet sheet) throws Exception{
		lecture_object_has_student_controlle losc= new lecture_object_has_student_controlle();
		Blacklist_student_group_Controller  black_student_group= new Blacklist_student_group_Controller();
		for(Sheet le:list_Lecture){
		   boolean test_Group= false;
		   
			   List<Lecture_object_has_student> list_stud_object = new ArrayList<Lecture_object_has_student>(); 
			   list_stud_object=losc.list_student(le.getIdLectureObejct());
			   for(Lecture_object_has_student lohs:list_stud_object){
				   test_Group=false;
				   test_Group = black_student_group.black_list_group(lohs.getId_student_group(),le.getIdDay(),le.getIdTimeSlot());
			   }
			   list_stud_object.clear();
			   list_stud_object= losc.list_student(sheet.getIdLectureObejct());
			   for(Lecture_object_has_student lohs:list_stud_object){
				   test_Group=false;
				   test_Group=black_student_group.black_list_group(lohs.getId_student_group(), le.getIdDay(), le.getIdTimeSlot());
			   }
			   
			   
		   
		   for(Lecture_object_has_student lectobj:list_stud_object){

			 
			   list_stud_object=losc.list_Object(lectobj.getId_student_group());
			   
			   for(Lecture_object_has_student l:list_stud_object){
				
				   Sheet_Controler shee= new Sheet_Controler();
				   Sheet she= shee.object_lecture(l.getId_lecture_object());
				   if(idDay == she.getIdDay() && idTimeSlot== she.getIdTimeSlot()){
					   return false;
				   }
			   }
			   list_stud_object.clear();
			   list_stud_object=losc.list_Object(sheet.getIdLecturer());
			   for(Lecture_object_has_student l:list_stud_object){
					
				   Sheet_Controler shee= new Sheet_Controler();
				   Sheet she= shee.object_lecture(l.getId_lecture_object());
				   if(idDay == she.getIdDay() && idTimeSlot== she.getIdTimeSlot()){
					   return false;
				   }
			   }
		   }
		}
		return true ;
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
