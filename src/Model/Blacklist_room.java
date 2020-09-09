package Model;

public class Blacklist_room {
	private int id_semester;
	private int  id_room;
	private int id_day;
	private int id_time_slot;
	public int getId_semester() {
		return id_semester;
	}
	public void setId_semester(int id_semester) {
		this.id_semester = id_semester;
	}
	public int getId_room() {
		return id_room;
	}
	public void setId_room(int id_room) {
		this.id_room = id_room;
	}
	public int getId_day() {
		return id_day;
	}
	public void setId_day(int id_day) {
		this.id_day = id_day;
	}
	public int getId_time_slote() {
		return id_time_slot;
	}
	public void setId_time_slote(int id_time_slote) {
		this.id_time_slot = id_time_slote;
	}
	public Blacklist_room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Blacklist_room(int id_semester, int id_room, int id_day,
			int id_time_slote) {
		super();
		this.id_semester = id_semester;
		this.id_room = id_room;
		this.id_day = id_day;
		this.id_time_slot = id_time_slote;
	}

}
