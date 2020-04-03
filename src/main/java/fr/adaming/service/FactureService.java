package fr.adaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Commande;
import fr.adaming.model.Facture;
import fr.adaming.model.LigneCommande;
import fr.adaming.repository.IFactureRepository;
@Service
public class FactureService implements IFactureService{
@Autowired
IFactureRepository factureRepository;
	@Override
	public List<Facture> getFactures() {
		// TODO Auto-generated method stub
		return factureRepository.findAll();
	}

	@Override
	public Facture createFacture(Facture f) {
		// TODO Auto-generated method stub
		return factureRepository.save(f);
	}

	@Override
	public Facture findFacture(long idFacture) {
		// TODO Auto-generated method stub
		Optional<Facture> oFacture = factureRepository.findById(idFacture);
		Facture facture = new Facture();
		if(oFacture.isPresent()) {
			facture= oFacture.get();
		}
		return facture;
	}

	@Override
	public void calculCommande(Commande commandeF) {
		// TODO Auto-generated method stub
		double somme=0;
		ArrayList<LigneCommande> listeC = new ArrayList<LigneCommande>();
//		for (int i = 0; i < listeC.size(); i++) {
//			if (commandeF== commande) {
//				somme=somme+(prixArticle*quantite);
//			}
			
//		}
	}

}
