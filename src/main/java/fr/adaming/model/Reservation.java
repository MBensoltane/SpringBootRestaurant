package fr.adaming.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Reservation {
@Id
@GeneratedValue
private long idR;
@Temporal (TemporalType.DATE)
private Date dateR;
@Temporal(TemporalType.TIME)
private Date heureR;
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
public Date getDateR() {
	return dateR;
}
public void setDateR(Date dateR) {
	this.dateR = dateR;
}
public Date getHeureR() {
	return heureR;
}
public void setHeureR(Date heureR) {
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
public Reservation(Date dateR, Date heureR, int nbrePersonne, Utilisateur client, Utilisateur serveur,
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