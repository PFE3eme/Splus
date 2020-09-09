package Model;

public class Blacklist_lecturer {

private int id_semester;
private int id_lecturer;
private int id_day;
private int id_time_slot;
public int getId_semester() {
	return id_semester;
}
public void setId_semester(int id_semester) {
	this.id_semester = id_semester;
}
public int getId_lecturer() {
	return id_lecturer;
}
public void setId_lecturer(int id_lecturer) {
	this.id_lecturer = id_lecturer;
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
public Blacklist_lecturer(int id_semester, int id_lecturer, int id_day,
		int id_time_slot) {
	super();
	this.id_semester = id_semester;
	this.id_lecturer = id_lecturer;
	this.id_day = id_day;
	this.id_time_slot = id_time_slot;
}
public Blacklist_lecturer() {
	super();
	// TODO Auto-generated constructor stub
}


}
