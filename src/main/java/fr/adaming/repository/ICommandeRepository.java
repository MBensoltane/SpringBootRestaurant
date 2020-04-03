package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Long>{

}
