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

import fr.adaming.model.LigneCommande;
import fr.adaming.service.ILigneComandeService;
@RestController
@RequestMapping("/Lc")
@CrossOrigin("http://localhost:4200")
public class LCController {
	@Autowired
	ILigneComandeService lCService;

	@GetMapping("/getLC")
	public List<LigneCommande> getLC(){
		return lCService.getLigneCommandes();
	}
	@PostMapping("/addLC")
	public LigneCommande addLC (@RequestBody LigneCommande lC) {
		return lCService.createLC(lC);
	}
	@DeleteMapping("/deleteLC/{idLC}")
	public void removeLC (@PathVariable long idLC) {
		lCService.deleteLC(idLC);
	}
	@GetMapping("/findLC/{idLC}")
	public LigneCommande findArticle (@PathVariable long idLC) {
		return lCService.findLC(idLC);
	}
	@PutMapping("/updateLC/{idLC}")
	public LigneCommande updateLC (@PathVariable long idLC ,@RequestBody LigneCommande lC) {
		LigneCommande lCAModifier = lCService.findLC(idLC);
		lCAModifier.setArticle(lC.getArticle());
		lCAModifier.setCommande(lC.getCommande());
		lCAModifier.setQuantite(lC.getQuantite());
		return lCService.update(lCAModifier);
			
	}
}
