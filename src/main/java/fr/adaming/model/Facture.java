package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facture {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idF;
private double prixTotF;

@OneToOne
private Commande commandeF;
public long getIdF() {
	return idF;
}
public void setIdF(long idF) {
	this.idF = idF;
}
public double getPrixTotF() {
	return prixTotF;
}
public void setPrixTotF(double prixTotF) {
	this.prixTotF = prixTotF;
}
public Commande getCommandeF() {
	return commandeF;
}
public void setCommandeF(Commande commandeF) {
	this.commandeF = commandeF;
}
public Facture(double prixTotF, Commande commandeF) {
	super();
	this.prixTotF = prixTotF;
	this.commandeF = commandeF;
}
public Facture() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Facture [idF=" + idF + ", prixTotF=" + prixTotF + ", commandeF=" + commandeF + "]";
}

}
