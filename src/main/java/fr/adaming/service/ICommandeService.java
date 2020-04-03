package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Commande;

public interface ICommandeService {

	public List<Commande>getCommandes();
	public Commande createCommande (Commande c);
	public void deleteCommande (long idCommande);
	public Commande updateCommande (Commande c);
	public Commande findCommande(long idCommande);
}
