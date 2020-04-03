package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Commande;
import fr.adaming.repository.ICommandeRepository;
@Service
public class CommandeService implements ICommandeService{
@Autowired
ICommandeRepository commandeRepository;
	@Override
	public List<Commande> getCommandes() {
		// TODO Auto-generated method stub
		return commandeRepository.findAll();
	}

	@Override
	public Commande createCommande(Commande c) {
		// TODO Auto-generated method stub
		return commandeRepository.save(c);
	}

	@Override
	public void deleteCommande(long idCommande) {
		// TODO Auto-generated method stub
		commandeRepository.deleteById(idCommande);
	}

	@Override
	public Commande updateCommande(Commande c) {
		// TODO Auto-generated method stub
		return commandeRepository.save(c);
	}

	@Override
	public Commande findCommande(long idCommande) {
		// TODO Auto-generated method stub
		Optional<Commande> oCommande = commandeRepository.findById(idCommande);
		Commande commande = new Commande();
		if (oCommande.isPresent()) {
			commande= oCommande.get();
		}
		return commande;
	}

}
