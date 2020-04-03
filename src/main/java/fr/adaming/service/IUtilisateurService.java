package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Utilisateur;

public interface IUtilisateurService {
	
	public List<Utilisateur> getUtilisateurs();
	public Utilisateur createUtilisateur(Utilisateur u);
	public void deleteUtilisateur (long idU);
	public Utilisateur updateUtilisateur (Utilisateur u);
	public Utilisateur findUtilisateur (long idU);
	
	
}
