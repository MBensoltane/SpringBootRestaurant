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
import fr.adaming.model.Role;
import fr.adaming.service.IRoleService;

@RestController
@RequestMapping("/Role")
@CrossOrigin("http://localhost:4200")
public class RoleController {
@Autowired
IRoleService roleService;

@GetMapping("/getRoles")
public List<Role> getAllRoles(){
	return roleService.getRoles();
}
@PostMapping("/addRole")
public Role addRole (@RequestBody Role r) {
	return roleService.createRole(r);
}
@DeleteMapping("/deleteRole/{idRole}")
public void removeRole (@PathVariable long idRole) {
	roleService.deleteRole(idRole);
}
@GetMapping("/findRole/{idRole}")
public Role findR (@PathVariable long idRole) {
	return roleService.findRole(idRole);
}
@PutMapping("/updateRo/{idRole}")
public Role updateRo (@PathVariable long idRole ,@RequestBody Role role) {
	Role roleAModifier = roleService.findRole(idRole);
	roleAModifier.setNomRole(role.getNomRole());
	return roleService.updateRole(roleAModifier);
		
}
}
