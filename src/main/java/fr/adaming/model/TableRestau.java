package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TableRestau {
@Id
@GeneratedValue
private long idT;
private int nbreT;
private int nbreP;
@ManyToOne
 private Reservation reservation;
public long getIdT() {
	return idT;
}
public void setIdT(long idT) {
	this.idT = idT;
}
public int getNbreT() {
	return nbreT;
}
public void setNbreT(int nbreT) {
	this.nbreT = nbreT;
}
public int getNbreP() {
	return nbreP;
}
public void setNbreP(int nbreP) {
	this.nbreP = nbreP;
}
public Reservation getReservation() {
	return reservation;
}
public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}
public TableRestau(int nbreT, int nbreP, Reservation reservation) {
	super();
	this.nbreT = nbreT;
	this.nbreP = nbreP;
	this.reservation = reservation;
}
public TableRestau() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Table [idT=" + idT + ", nbreT=" + nbreT + ", nbreP=" + nbreP + ", reservation=" + reservation + "]";
}
 
}
