package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Facture;

public interface IFactureRepository extends JpaRepository<Facture, Long> {

}
