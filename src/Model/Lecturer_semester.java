package Model;

public class Lecturer_semester {
private int id_lecturer; 
private int id_semester;
private int num_days_of_work;
private int id_day_of_work_priority_scheme ;
private int max_time_slots_per_day;
private int min_distance_between_lecture_object_within_a_day;
private int weight_of_days_of_work;
private int weight_of_daily_makespan;
private int weight_of_constraint_violation;
public int getId_lecturer() {
	return id_lecturer;
}
public void setId_lecturer(int id_lecturer) {
	this.id_lecturer = id_lecturer;
}
public int getId_semester() {
	return id_semester;
}
public void setId_semester(int id_semester) {
	this.id_semester = id_semester;
}
public int getNum_days_of_work() {
	return num_days_of_work;
}
public void setNum_days_of_work(int num_days_of_work) {
	this.num_days_of_work = num_days_of_work;
}
public int getId_day_of_work_priority_scheme() {
	return id_day_of_work_priority_scheme;
}
public void setId_day_of_work_priority_scheme(int id_day_of_work_priority_scheme) {
	this.id_day_of_work_priority_scheme = id_day_of_work_priority_scheme;
}
public int getMax_time_slots_per_day() {
	return max_time_slots_per_day;
}
public void setMax_time_slots_per_day(int max_time_slots_per_day) {
	this.max_time_slots_per_day = max_time_slots_per_day;
}
public int getMin_distance_between_lecture_object_within_a_day() {
	return min_distance_between_lecture_object_within_a_day;
}
public void setMin_distance_between_lecture_object_within_a_day(
		int min_distance_between_lecture_object_within_a_day) {
	this.min_distance_between_lecture_object_within_a_day = min_distance_between_lecture_object_within_a_day;
}
public int getWeight_of_days_of_work() {
	return weight_of_days_of_work;
}
public void setWeight_of_days_of_work(int weight_of_days_of_work) {
	this.weight_of_days_of_work = weight_of_days_of_work;
}
public int getWeight_of_daily_makespan() {
	return weight_of_daily_makespan;
}
public void setWeight_of_daily_makespan(int weight_of_daily_makespan) {
	this.weight_of_daily_makespan = weight_of_daily_makespan;
}
public int getWeight_of_constraint_violation() {
	return weight_of_constraint_violation;
}
public void setWeight_of_constraint_violation(int weight_of_constraint_violation) {
	this.weight_of_constraint_violation = weight_of_constraint_violation;
}
public Lecturer_semester(int id_lecturer, int id_semester,
		int num_days_of_work, int id_day_of_work_priority_scheme,
		int max_time_slots_per_day,
		int min_distance_between_lecture_object_within_a_day,
		int weight_of_days_of_work, int weight_of_daily_makespan,
		int weight_of_constraint_violation) {
	super();
	this.id_lecturer = id_lecturer;
	this.id_semester = id_semester;
	this.num_days_of_work = num_days_of_work;
	this.id_day_of_work_priority_scheme = id_day_of_work_priority_scheme;
	this.max_time_slots_per_day = max_time_slots_per_day;
	this.min_distance_between_lecture_object_within_a_day = min_distance_between_lecture_object_within_a_day;
	this.weight_of_days_of_work = weight_of_days_of_work;
	this.weight_of_daily_makespan = weight_of_daily_makespan;
	this.weight_of_constraint_violation = weight_of_constraint_violation;
}
public Lecturer_semester() {
	super();
	// TODO Auto-generated constructor stub
}

}
