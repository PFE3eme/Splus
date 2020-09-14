package Model;

public class LectureSemester {

	private int id_lecture_semester; 
	private int id_semester;
	private int id_lecture;
	private int num_lecture_objects;
    private int lecture_objects_as_block;
    private int min_days_between_lecture_objects;
    private int is_mandatory;
    private int is_from_planned_semester;
    
    public int getIdLectureSemester(){
    	return id_lecture_semester;
    }
	
	public void setIdLectureSemester(int id_lecture_semester) {
		this.id_lecture_semester = id_lecture_semester;
	}
	
    public int getIdSemester(){
    	return id_semester;
    }
	
	public void setIdSemester(int id_semester) {
		this.id_semester = id_semester;
	}
	
	public int getIdLecture(){
    	return id_lecture;
    }
	
	public void setIdLecture(int id_lecture) {
		this.id_lecture = id_lecture;
	}
	
	public int getNumLectureObjects(){
    	return num_lecture_objects;
    }
	
	public void setNumLectureObjects(int num_lecture_objects) {
		this.num_lecture_objects = num_lecture_objects;
	}
	
	public int getLectureObjectsAsBlock(){
    	return lecture_objects_as_block;
    }
	
	public void setLectureObjectsAsBlock(int lecture_objects_as_block) {
		this.lecture_objects_as_block = lecture_objects_as_block;
	}
	
	public int getMinDaysBetweenObjects(){
    	return min_days_between_lecture_objects;
    }
	
	public void setMinDaysBetweenLectureObjects(int min_days_between_lecture_objects) {
		this.min_days_between_lecture_objects = min_days_between_lecture_objects;
	}
	
	public int getIsMandatory(){
    	return is_mandatory;
    }
	
	public void setIsMandatory(int is_mandatory) {
		this.is_mandatory = is_mandatory;
	}
	
	public int getIsFromPlannedSemester(){
    	return is_from_planned_semester;
    }
	
	public void setIsFromPlannedSemester(int is_from_planned_semester) {
		this.is_from_planned_semester = is_from_planned_semester;
	}

	public LectureSemester() {
		super();
		// TODO Auto-generated constructor stub
	}

}