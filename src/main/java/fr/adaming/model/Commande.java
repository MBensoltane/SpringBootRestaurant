package fr.adaming.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Commande {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idCommande;
@OneToOne
private Reservation reservation;
public long getIdCommande() {
	return idCommande;
}
public void setIdCommande(long idCommande) {
	this.idCommande = idCommande;
}
public Reservation getReservation() {
	return reservation;
}
public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}
public Commande(Reservation reservation) {
	super();
	this.reservation = reservation;
}
public Commande() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Commande [idCommande=" + idCommande + ", reservation=" + reservation + "]";
}



}