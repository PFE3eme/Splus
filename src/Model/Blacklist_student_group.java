package Model;

public class Blacklist_student_group {

private int id_semester;
private int id_student_group;
private int  id_day;
private int id_time_slot;
public int getId_semester() {
	return id_semester;
}
public void setId_semester(int id_semester) {
	this.id_semester = id_semester;
}
public int getId_student_group() {
	return id_student_group;
}
public void setId_student_group(int id_student_group) {
	this.id_student_group = id_student_group;
}
public int getId_day() {
	return id_day;
}
public void setId_day(int id_day) {
	this.id_day = id_day;
}
public int getId_time_slot() {
	return id_time_slot;
}
public void setId_time_slot(int id_time_slot) {
	this.id_time_slot = id_time_slot;
}
public Blacklist_student_group(int id_semester, int id_student_group,
		int id_day, int id_time_slot) {
	super();
	this.id_semester = id_semester;
	this.id_student_group = id_student_group;
	this.id_day = id_day;
	this.id_time_slot = id_time_slot;
}
public Blacklist_student_group() {
	super();
	// TODO Auto-generated constructor stub
}


}
