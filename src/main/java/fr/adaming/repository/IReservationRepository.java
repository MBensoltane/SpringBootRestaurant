package fr.adaming.repository;

//import java.util.Date;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {
//public List<Reservation> findByDateR (Date dateR);
}
