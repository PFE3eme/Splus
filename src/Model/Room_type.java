package Model;

public class Room_type {

private int id_room_type;
private String description;
public int getId_room_type() {
	return id_room_type;
}
public void setId_room_type(int id_room_type) {
	this.id_room_type = id_room_type;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Room_type(int id_room_type, String description) {
	super();
	this.id_room_type = id_room_type;
	this.description = description;
}
public Room_type() {
	super();
	// TODO Auto-generated constructor stub
}


}
