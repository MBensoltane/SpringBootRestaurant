package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Role;
import fr.adaming.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService{
@Autowired
IRoleRepository roleRepository;
	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role createRole(Role r) {
		// TODO Auto-generated method stub
		return roleRepository.save(r);
	}

	@Override
	public void deleteRole(long idRole) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(idRole);
	}

	@Override
	public Role updateRole(Role r) {
		// TODO Auto-generated method stub
		return roleRepository.save(r);
	}

	@Override
	public Role findRole(long idRole) {
		// TODO Auto-generated method stub

		Optional<Role> oRole = roleRepository.findById(idRole);
		Role role = new Role();
		if(oRole.isPresent()) {
			role=oRole.get();
		}
		return  role;
	}

}
