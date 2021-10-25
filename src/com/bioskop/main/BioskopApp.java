package com.bioskop.main;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;

import com.bioskop.main.dao.FilmDaoImplementation;
import com.bioskop.main.dao.RoomDaoImplementation;
import com.bioskop.main.model.FilmModel;
import com.bioskop.main.model.RoomModel;
import com.bioskop.main.util.DatabaseConnection;


public class BioskopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
//		     FilmModel film = new FilmModel();
//		     film.setFilmName("Beranak dalam Kardus");
//		     film.setCategory("Horror");
//		     film.setSubTitle("Sunda");
//		     
//		     FilmDaoImplementation filmDao = new FilmDaoImplementation();
//		     filmDao.save(film);
//		     
//		     
//		     List <FilmModel> lstFilm = filmDao.getAll();
//		     
//		     
//		     for (FilmModel filmModel : lstFilm) {
//				System.out.print(filmModel.getFilmId() +" | " +  filmModel.getFilmName()+" | " +  filmModel.getCategory()+" | " +  filmModel.getSubTitle());
//				System.out.println();
//			}
//		     
//		    FilmModel updateFilm = new FilmModel();
//		    updateFilm.setFilmId(4);
//		    updateFilm.setFilmName("Suzanna");
//		    updateFilm.setCategory("Horror");
//		    updateFilm.setSubTitle("Indonesia");
//		    filmDao.update(updateFilm); 
//		    
//		    
			RoomModel room = new RoomModel();
			room.setMaxOff(75);
			
			RoomDaoImplementation roomDao =new RoomDaoImplementation();
			roomDao.save(room);
			
			List <RoomModel> lstRoom = roomDao.getAll();
			
			for (RoomModel roomModel : lstRoom) {
				System.out.println(roomModel.getRoomId()+" | " + roomModel.getMaxOff());
				System.out.println();
			}
			
			RoomModel updateRoom= new RoomModel();
			updateRoom.setRoomId(2);
			updateRoom.setMaxOff(100);
			roomDao.update(updateRoom);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//st.execute("drop database dewa" );
		}
//			
			
			
		
	}

}
