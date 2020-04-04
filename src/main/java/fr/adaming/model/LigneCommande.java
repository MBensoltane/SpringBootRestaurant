package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LigneCommande {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idLC;
@OneToOne
private Articles article;
private int quantite;
@ManyToOne
private Commande commande;

public Commande getCommande() {
	return commande;
}
public void setCommande(Commande commande) {
	this.commande = commande;
}
public long getIdLC() {
	return idLC;
}
public void setIdLC(long idLC) {
	this.idLC = idLC;
}
public Articles getArticle() {
	return article;
}
public void setArticle(Articles article) {
	this.article = article;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}

@Override
public String toString() {
	return "LigneCommande [idLC=" + idLC + ", article=" + article + ", quantite=" + quantite + ", commande=" + commande
			+ "]";
}
public LigneCommande(Articles article, int quantite, Commande commande) {
	super();
	this.article = article;
	this.quantite = quantite;
	this.commande = commande;
}

public LigneCommande() {
	super();
	// TODO Auto-generated constructor stub
}

}
