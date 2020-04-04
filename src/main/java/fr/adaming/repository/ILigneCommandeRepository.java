package fr.adaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Commande;
import fr.adaming.model.LigneCommande;

public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long>{
	
	public List<LigneCommande> findByCommande(Commande commande);

}
