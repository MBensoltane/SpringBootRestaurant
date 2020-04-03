package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Utilisateur {
@Id
@GeneratedValue
private long idU;
private String nomU;
private String prenomU;
private long telephoneU;
private String adresseU;

@ManyToOne
private Role role;

public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public long getIdU() {
	return idU;
}
public void setIdU(long idU) {
	this.idU = idU;
}
public String getNomU() {
	return nomU;
}
public void setNomU(String nomU) {
	this.nomU = nomU;
}
public String getPrenomU() {
	return prenomU;
}
public void setPrenomU(String prenomU) {
	this.prenomU = prenomU;
}
public long getTelephoneU() {
	return telephoneU;
}
public void setTelephoneU(long telephoneU) {
	this.telephoneU = telephoneU;
}
public String getAdresseU() {
	return adresseU;
}
public void setAdresseU(String adresseU) {
	this.adresseU = adresseU;
}

public Utilisateur(String nomU, String prenomU, long telephoneU, String adresseU, Role role) {
	super();
	this.nomU = nomU;
	this.prenomU = prenomU;
	this.telephoneU = telephoneU;
	this.adresseU = adresseU;
	this.role = role;
}
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Utilisateur [idU=" + idU + ", nomU=" + nomU + ", prenomU=" + prenomU + ", telephoneU=" + telephoneU
			+ ", adresseU=" + adresseU + ", role=" + role + "]";
}
}
