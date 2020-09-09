package Model;

public class Lecture_object_has_student {

private int  id_lecture_object;
private int  id_student_group;
private int  num_participants;
private int  is_mandatory;
private int  priority_assignment;
public int getId_lecture_object() {
	return id_lecture_object;
}
public void setId_lecture_object(int id_lecture_object) {
	this.id_lecture_object = id_lecture_object;
}
public int getId_student_group() {
	return id_student_group;
}
public void setId_student_group(int id_student_group) {
	this.id_student_group = id_student_group;
}
public int getNum_participants() {
	return num_participants;
}
public void setNum_participants(int num_participants) {
	this.num_participants = num_participants;
}
public int getIs_mandatory() {
	return is_mandatory;
}
public void setIs_mandatory(int is_mandatory) {
	this.is_mandatory = is_mandatory;
}
public int getPriority_assignment() {
	return priority_assignment;
}
public void setPriority_assignment(int priority_assignment) {
	this.priority_assignment = priority_assignment;
}
public Lecture_object_has_student() {
	super();
	// TODO Auto-generated constructor stub
}
public Lecture_object_has_student(int id_lecture_object, int id_student_group,
		int num_participants, int is_mandatory, int priority_assignment) {
	super();
	this.id_lecture_object = id_lecture_object;
	this.id_student_group = id_student_group;
	this.num_participants = num_participants;
	this.is_mandatory = is_mandatory;
	this.priority_assignment = priority_assignment;
}


}
