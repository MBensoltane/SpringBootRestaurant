package fr.adaming.model;

import java.time.LocalDate;
import java.time.LocalTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long idR;
private LocalDate dateR;

private LocalTime heureR;
private int nbrePersonne;

@ManyToOne
private Utilisateur client;
@ManyToOne
private Utilisateur Serveur;
@ManyToOne
private Utilisateur utilisateurManager;
public long getIdR() {
	return idR;
}
public void setIdR(long idR) {
	this.idR = idR;
}

public LocalDate getDateR() {
	return dateR;
}
public void setDateR(LocalDate dateR) {
	this.dateR = dateR;
}
public LocalTime getHeureR() {
	return heureR;
}
public void setHeureR(LocalTime heureR) {
	this.heureR = heureR;
}
public int getNbrePersonne() {
	return nbrePersonne;
}
public void setNbrePersonne(int nbrePersonne) {
	this.nbrePersonne = nbrePersonne;
}
public Utilisateur getClient() {
	return client;
}
public void setClient(Utilisateur client) {
	this.client = client;
}
public Utilisateur getServeur() {
	return Serveur;
}
public void setServeur(Utilisateur serveur) {
	Serveur = serveur;
}
public Utilisateur getUtilisateurManager() {
	return utilisateurManager;
}
public void setUtilisateurManager(Utilisateur utilisateurManager) {
	this.utilisateurManager = utilisateurManager;
}

public Reservation(LocalDate dateR, LocalTime heureR, int nbrePersonne, Utilisateur client, Utilisateur serveur,
		Utilisateur utilisateurManager) {
	super();
	this.dateR = dateR;
	this.heureR = heureR;
	this.nbrePersonne = nbrePersonne;
	this.client = client;
	Serveur = serveur;
	this.utilisateurManager = utilisateurManager;
}
public Reservation() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Reservation [idR=" + idR + ", dateR=" + dateR + ", heureR=" + heureR + ", nbrePersonne=" + nbrePersonne
			+ ", client=" + client + ", Serveur=" + Serveur + ", utilisateurManager=" + utilisateurManager + "]";
}

}