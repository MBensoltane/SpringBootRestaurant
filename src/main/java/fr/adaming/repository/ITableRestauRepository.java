package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.TableRestau;

public interface ITableRestauRepository extends JpaRepository<TableRestau, Long>{

}
