package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Articles;
import fr.adaming.service.IArticlesService;
@RestController
@RequestMapping("/Articles")
@CrossOrigin("http://localhost:4200")

public class ArticlesController {
	@Autowired
	IArticlesService articleService;

	@GetMapping("/getArticles")
	public List<Articles> getArticles(){
		return articleService.getArticles();
	}
	@PostMapping("/addArticle")
	public Articles addArticle (@RequestBody Articles article) {
		return articleService.createAticle(article);
	}
	@DeleteMapping("/deleteArticle/{idArticle}")
	public void removeArticle (@PathVariable long idArticle) {
		articleService.deleteArticle(idArticle);
	}
	@GetMapping("/findArticle/{idArticle}")
	public Articles findArticle (@PathVariable long idArticle) {
		return articleService.findArticle(idArticle);
	}
	@PutMapping("/updateArticle/{idArticle}")
	public Articles updateArticle (@PathVariable long idArticle ,@RequestBody Articles article) {
		Articles articleAModifier = articleService.findArticle(idArticle);
		articleAModifier.setNomArticle(article.getNomArticle());
		articleAModifier.setPrixArticle(article.getPrixArticle());
		articleAModifier.setTypeArticle(article.getTypeArticle());
		
		return articleService.updateArticle(articleAModifier);
			
	}
}
