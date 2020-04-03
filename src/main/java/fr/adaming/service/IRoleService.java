package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Role;

public interface IRoleService {
	
	public List<Role>getRoles ();
	public Role createRole (Role r);
	public void deleteRole (long idRole);
	public Role updateRole (Role r);
	public Role findRole (long idRole);
}
