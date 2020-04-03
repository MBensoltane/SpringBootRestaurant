package fr.adaming.controller;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Reservation;
import fr.adaming.service.IReservationService;

@RestController
@RequestMapping("/Reservation")
@CrossOrigin("http://localhost:4200")
public class ReservationController {
	@Autowired
	IReservationService reservationService;

	@GetMapping("/getReservation")
	public List<Reservation> getAllReservations(){
		return reservationService.getReservations();
	}
	@PostMapping("/addReservation")
	public Reservation addReservation (@RequestBody Reservation reservation) {
		return reservationService.createReservation(reservation);
	}
	@DeleteMapping("/deleteReservation/{idR}")
	public void removeReservation (@PathVariable long idR) {
		reservationService.deleteReservation(idR);
	}
	@GetMapping("/findReservation/{idR}")
	public Reservation findReservation (@PathVariable long idR) {
		return reservationService.findReservation(idR);
	}
	@PutMapping("/updateReservation/{idR}")
	public Reservation updateReservation (@PathVariable long idR ,@RequestBody Reservation reservation) {
		Reservation reservationAModifier = reservationService.findReservation(idR);
		reservationAModifier.setDateR(reservation.getDateR());
		reservationAModifier.setHeureR(reservation.getHeureR());
		reservationAModifier.setNbrePersonne(reservation.getNbrePersonne());
		reservationAModifier.setClient(reservation.getClient());
		reservationAModifier.setServeur(reservation.getServeur());
		reservationAModifier.setUtilisateurManager(reservation.getUtilisateurManager());
		
		return reservationService.updateReservation(reservationAModifier);
			
	}
	@GetMapping("/getByDateHour/{date}")
	public List<Reservation>listeReservationDate(@PathVariable String date){
//		Date dateR;
//		try {
//			dateR = new SimpleDateFormat("yyyy-MM-dd").parse(date);
//			
//		} catch (ParseException e) {
//			// TODO: handle exception
//			System.out.println("parse to date failed");
//			e.printStackTrace();
//			
//		}
		return null;	
}
}