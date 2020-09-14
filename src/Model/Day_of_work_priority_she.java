package Model;

public class Day_of_work_priority_she {

private int id_day_of_work_priority_sheme ;
private int priority_monday;
private int priority_tuesday;
private int priority_wednesday;
private int priority_thursday;
private int priority_friday;
public int getId_day_of_work_priority_sheme() {
	return id_day_of_work_priority_sheme;
}
public void setId_day_of_work_priority_sheme(int id_day_of_work_priority_sheme) {
	this.id_day_of_work_priority_sheme = id_day_of_work_priority_sheme;
}
public int getPriority_monday() {
	return priority_monday;
}
public void setPriority_monday(int priority_monday) {
	this.priority_monday = priority_monday;
}
public int getPriority_tuesday() {
	return priority_tuesday;
}
public void setPriority_tuesday(int priority_tuesday) {
	this.priority_tuesday = priority_tuesday;
}
public int getPriority_wednesday() {
	return priority_wednesday;
}
public void setPriority_wednesday(int priority_wednesday) {
	this.priority_wednesday = priority_wednesday;
}
public int getPriority_thursday() {
	return priority_thursday;
}
public void setPriority_thursday(int priority_thursday) {
	this.priority_thursday = priority_thursday;
}
public int getPriority_friday() {
	return priority_friday;
}
public void setPriority_friday(int priority_friday) {
	this.priority_friday = priority_friday;
}
public Day_of_work_priority_she(int id_day_of_work_priority_sheme,
		int priority_monday, int priority_tuesday, int priority_wednesday,
		int priority_thursday, int priority_friday) {
	super();
	this.id_day_of_work_priority_sheme = id_day_of_work_priority_sheme;
	this.priority_monday = priority_monday;
	this.priority_tuesday = priority_tuesday;
	this.priority_wednesday = priority_wednesday;
	this.priority_thursday = priority_thursday;
	this.priority_friday = priority_friday;
}
public Day_of_work_priority_she() {
	super();
	// TODO Auto-generated constructor stub
}


}
