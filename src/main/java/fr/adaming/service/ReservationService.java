package fr.adaming.service;

//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Reservation;
import fr.adaming.repository.IReservationRepository;
@Service
public class ReservationService implements IReservationService{
@Autowired
IReservationRepository reservationRepository;
	@Override
	public List<Reservation> getReservations() {
		// TODO Auto-generated method stub
		return reservationRepository.findAll();
	}

	@Override
	public Reservation createReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return reservationRepository.save(reservation);
	}

	@Override
	public void deleteReservation(long idR) {
		// TODO Auto-generated method stub
		reservationRepository.deleteById(idR);
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation findReservation(long idR) {
		// TODO Auto-generated method stub
		Optional<Reservation> oReservOptional= reservationRepository.findById(idR);
		Reservation reservation= new Reservation();
		if (oReservOptional.isPresent()) {
			reservation= oReservOptional.get();
		}
		return reservation;
	}

//	@Override
//	public List<Reservation> getReservationByDate(Date dateR) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<Reservation> getReservationByDate(Date dateR) {
//		// TODO Auto-generated method stub
//		return reservationRepository.findByDateR(dateR);
//	}

}
