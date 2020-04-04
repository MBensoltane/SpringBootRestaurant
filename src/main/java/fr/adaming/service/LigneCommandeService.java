package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Commande;
import fr.adaming.model.LigneCommande;
import fr.adaming.repository.ILigneCommandeRepository;
@Service
public class LigneCommandeService implements ILigneComandeService {
@Autowired
ILigneCommandeRepository lCRepository;
	@Override
	public List<LigneCommande> getLigneCommandes() {
		// TODO Auto-generated method stub
		return lCRepository.findAll();
	}

	@Override
	public void deleteLC(long idLC) {
		// TODO Auto-generated method stub
		lCRepository.deleteById(idLC);
	}

	@Override
	public LigneCommande update(LigneCommande lC) {
		// TODO Auto-generated method stub
		return lCRepository.save(lC);
	}

	@Override
	public LigneCommande findLC(long idLC) {
		// TODO Auto-generated method stub
		Optional<LigneCommande> oLC = lCRepository.findById(idLC);
		LigneCommande lc = new LigneCommande();
		if(oLC.isPresent()) {
			lc= oLC.get();
		}
		return lc;
	}

	@Override
	public LigneCommande createLC(LigneCommande lC) {
		// TODO Auto-generated method stub
		return lCRepository.save(lC);
	}



	@Override
	public List<LigneCommande> findByCommande(Commande commande) {
		// TODO Auto-generated method stub
		return lCRepository.findByCommande(commande);
	}

}
