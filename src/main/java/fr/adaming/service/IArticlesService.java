package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Articles;

public interface IArticlesService {

	public List<Articles> getArticles ();
	public Articles createAticle (Articles article);
	public void deleteArticle ( long idArticle);
	public Articles updateArticle (Articles article);
	public Articles findArticle (long idArticle);
}
