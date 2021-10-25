package com.bioskop.main.model;

public class RoomModel extends Model {

	private int roomId;
	private int maxOff;
	
	public RoomModel(){
		
	}
	
	public RoomModel(int roomId, int maxOff) {
		super();
		this.roomId = roomId;
		this.maxOff = maxOff;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getMaxOff() {
		return maxOff;
	}
	public void setMaxOff(int maxOff) {
		this.maxOff = maxOff;
	}
	
	
	
}
