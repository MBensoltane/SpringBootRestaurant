package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Facture;

import fr.adaming.service.IFactureService;
@RestController
@RequestMapping("/Facture")
@CrossOrigin("http://localhost:4200")

public class FactureController {
	@Autowired
	IFactureService factureService;

	@GetMapping("/getFactures")
	public List<Facture> getFactures(){
		return factureService.getFactures();
	}
	@PostMapping("/addFacture")
	public Facture addFacture (@RequestBody Facture f) {
		return factureService.createFacture(f);
	}
	
	@GetMapping("/findFacture/{idFacture}")
	public Facture findFacture (@PathVariable long idFacture) {
		return factureService.findFacture(idFacture);
	}
	
}
