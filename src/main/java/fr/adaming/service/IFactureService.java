package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Commande;
import fr.adaming.model.Facture;

public interface IFactureService {

	public List<Facture> getFactures ();
	public Facture createFacture (Facture f);
	public Facture findFacture(long idFacture);
	public void calculCommande(Commande commandeF);
}
