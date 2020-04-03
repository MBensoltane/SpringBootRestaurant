package fr.adaming.service;

//import java.util.Date;
import java.util.List;

import fr.adaming.model.Reservation;

public interface IReservationService {
	
	public List<Reservation> getReservations ();
	public Reservation createReservation (Reservation reservation);
	public void deleteReservation (long idR);
	public Reservation updateReservation (Reservation reservation);
	public Reservation findReservation (long idR);
	//public List<Reservation>getReservationByDate(Date dateR);
}
