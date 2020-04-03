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

import fr.adaming.model.Utilisateur;
import fr.adaming.service.IUtilisateurService;


@RestController
@RequestMapping("/utilisateur")
@CrossOrigin("http://localhost:4200")
public class UtilisateurController {
@Autowired
IUtilisateurService utilisateurService;

@GetMapping("/allUtilisateurs")
public List<Utilisateur> getAllU(){
	return utilisateurService.getUtilisateurs();
}
@PostMapping("/addU")
public Utilisateur addUtilisateur (@RequestBody Utilisateur u) {
	return utilisateurService.createUtilisateur(u);
}
@DeleteMapping("/deleteU/{idU}")
public void removeUtilisateur (@PathVariable long idU) {
	utilisateurService.deleteUtilisateur(idU);
}
@GetMapping("/findU/{idU}")
public Utilisateur findU (@PathVariable long idU) {
	return utilisateurService.findUtilisateur(idU);
}
@PutMapping("/updateU/{idU}")
public Utilisateur updateU (@PathVariable long idU,@RequestBody Utilisateur u) {
	Utilisateur uAModifier = utilisateurService.findUtilisateur(idU);
	uAModifier.setNomU(u.getNomU());
	uAModifier.setPrenomU(u.getPrenomU());	
	uAModifier.setTelephoneU(u.getTelephoneU());
	uAModifier.setAdresseU(u.getAdresseU());
	uAModifier.setRole(u.getRole());
	return utilisateurService.updateUtilisateur(uAModifier);
	
}
}
