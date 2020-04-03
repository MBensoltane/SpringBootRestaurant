package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Utilisateur;
import fr.adaming.repository.IUtilisateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService {
@Autowired
IUtilisateurRepository utilisateurRepository;
	@Override
	public List<Utilisateur> getUtilisateurs() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur createUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(u);
	}

	@Override
	public void deleteUtilisateur(long idU) {
		// TODO Auto-generated method stub
		 utilisateurRepository.deleteById(idU);
		
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(u);
	}

	@Override
	public Utilisateur findUtilisateur(long idU) {
		// TODO Auto-generated method stub

		Optional<Utilisateur> oUtilisateur = utilisateurRepository.findById(idU);
		Utilisateur u = new Utilisateur();
		if(oUtilisateur.isPresent()) {
			u = oUtilisateur.get();
		}
		return u;
	}

}
