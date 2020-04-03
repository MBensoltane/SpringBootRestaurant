package fr.adaming.service;

import java.util.List;

import fr.adaming.model.LigneCommande;
public interface ILigneComandeService {
	public List <LigneCommande> getLigneCommandes();
	public LigneCommande createLC(LigneCommande lC);
	public void deleteLC (long idLC);
	public LigneCommande update (LigneCommande lC);
	public LigneCommande findLC (long idLC);
	
}
