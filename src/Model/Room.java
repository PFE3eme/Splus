package Model;

public class Room {

private int id_room; 
private String descriptmion;
private int capacity;
private int id_room_type;
public int getId_room() {
	return id_room;
}
public void setId_room(int id_room) {
	this.id_room = id_room;
}
public String getDescriptmion() {
	return descriptmion;
}
public void setDescriptmion(String descriptmion) {
	this.descriptmion = descriptmion;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public int getId_room_type() {
	return id_room_type;
}
public void setId_room_type(int id_room_type) {
	this.id_room_type = id_room_type;
}
public Room(int id_room, String descriptmion, int capacity, int id_room_type) {
	super();
	this.id_room = id_room;
	this.descriptmion = descriptmion;
	this.capacity = capacity;
	this.id_room_type = id_room_type;
}
public Room() {
	super();
	// TODO Auto-generated constructor stub
}


}
