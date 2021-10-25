package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.FilmModel;
import com.bioskop.main.model.RoomModel;
import com.bioskop.main.util.DatabaseConnection;

public class RoomDaoImplementation implements DaoInterfaces<RoomModel> {

	static Connection con = DatabaseConnection.getConnection();
	
	@Override
	public int save(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into room(room_seat) values (?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getMaxOff());
		
		int result = ps.executeUpdate();
		
		return result;
	}

	@Override
	public void delete(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(0, model.getRoomId());
	
		ps.executeUpdate();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(0,id);
		ps.executeUpdate();
		
	}

	@Override
	public void update(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update room set maxof_seat= ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getMaxOff());
		
		ps.executeUpdate();
		
	}

	@Override
	public RoomModel getById(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = " select * from room where room_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(0, model.getRoomId());
		ResultSet rs = ps.executeQuery();
		
		RoomModel roomModel = new RoomModel();
		
		while(rs.next()) {
			roomModel.setRoomId(rs.getInt("room_id"));
			roomModel.setMaxOff(rs.getInt("maxof_seat"));
			
			
		}
		
		
		return roomModel;
	}

	@Override
	public RoomModel getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		
		String query = " select * from room where room_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(0, id);
		ResultSet rs = ps.executeQuery();
		
		RoomModel roomModel = new RoomModel();
		
		while(rs.next()) {
			roomModel.setRoomId(rs.getInt("room_id"));
			roomModel.setMaxOff(rs.getInt("maxof_seat"));	
			
		}
		
		
		return roomModel;
		
	}

	@Override
	public List<RoomModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from room";
		PreparedStatement ps = con.prepareStatement(query);
		
		
		ResultSet rs = ps.executeQuery();
		
		List<RoomModel> lstFilm = new ArrayList<RoomModel>();
		
		while(rs.next()) {
			RoomModel roomModel = new RoomModel();
			roomModel.setRoomId(rs.getInt("room_id"));
			roomModel.setMaxOff(rs.getInt("maxof_seat"));
			lstFilm.add(roomModel);
			
		}
		
		return (lstFilm);
	}

}
