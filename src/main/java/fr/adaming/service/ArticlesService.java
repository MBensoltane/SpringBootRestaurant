package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Articles;
import fr.adaming.repository.IArticlesRepository;
@Service
public class ArticlesService implements IArticlesService{
@Autowired
IArticlesRepository articleRepository;
	@Override
	public List<Articles> getArticles() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	@Override
	public Articles createAticle(Articles article) {
		// TODO Auto-generated method stub
		return articleRepository.save(article);
	}

	@Override
	public void deleteArticle(long idArticle) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(idArticle);
	}

	@Override
	public Articles updateArticle(Articles article) {
		// TODO Auto-generated method stub
		return articleRepository.save(article);
	}

	@Override
	public Articles findArticle(long idArticle) {
		// TODO Auto-generated method stub
		Optional<Articles> oArticle = articleRepository.findById(idArticle);
		Articles article = new Articles();
		if(oArticle.isPresent()) {
			article= oArticle.get();
		}
		return article;
	}

}
