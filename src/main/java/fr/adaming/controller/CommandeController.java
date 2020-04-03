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

import fr.adaming.model.Commande;
import fr.adaming.service.ICommandeService;
@RestController
@RequestMapping("/Commande")
@CrossOrigin("http://localhost:4200")

public class CommandeController {
	@Autowired
	ICommandeService commandeService;

	@GetMapping("/getCommandes")
	public List<Commande> getAllCommandes(){
		return commandeService.getCommandes();
	}
	@PostMapping("/addCommande")
	public Commande addReservation (@RequestBody Commande commande) {
		return commandeService.createCommande(commande);
	}
	@DeleteMapping("/deleteCommande/{idCommande}")
	public void removeCommande (@PathVariable long idCommande) {
		commandeService.deleteCommande(idCommande);
	}
	@GetMapping("/findCommande/{idCommande}")
	public Commande findCommande (@PathVariable long idCommande) {
		return commandeService.findCommande(idCommande);
	}
	@PutMapping("/updateCommande/{idCommande}")
	public Commande updateCommande (@PathVariable long idCommande ,@RequestBody Commande commande) {
		Commande commandeAModifie = commandeService.findCommande(idCommande);
		commandeAModifie.setReservation(commande.getReservation());
		return commandeService.updateCommande(commandeAModifie);
			
	}
}
