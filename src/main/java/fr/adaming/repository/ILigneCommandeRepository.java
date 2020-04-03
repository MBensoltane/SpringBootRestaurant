package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.LigneCommande;

public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long>{

}
