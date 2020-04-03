package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Articles;

public interface IArticlesRepository extends JpaRepository<Articles, Long>{

}
