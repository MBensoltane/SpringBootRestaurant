package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Articles {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idArticle;
private String nomArticle;
private String typeArticle;
private double prixArticle;
public long getIdArticle() {
	return idArticle;
}
public void setIdArticle(long idArticle) {
	this.idArticle = idArticle;
}
public String getNomArticle() {
	return nomArticle;
}
public void setNomArticle(String nomArticle) {
	this.nomArticle = nomArticle;
}
public String getTypeArticle() {
	return typeArticle;
}
public void setTypeArticle(String typeArticle) {
	this.typeArticle = typeArticle;
}
public double getPrixArticle() {
	return prixArticle;
}
public void setPrixArticle(double prixArticle) {
	this.prixArticle = prixArticle;
}
public Articles(String nomArticle, String typeArticle, double prixArticle) {
	super();
	this.nomArticle = nomArticle;
	this.typeArticle = typeArticle;
	this.prixArticle = prixArticle;
}
public Articles() {
	super();
	// TODO Auto-generated constructor stub
}
 

}
