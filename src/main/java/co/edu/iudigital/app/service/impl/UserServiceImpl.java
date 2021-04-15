package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService{
//inyeccion de dependencias
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {
		//TODO: implementar	el registro	
	}

	@Override
	public User login(User user) throws Exception {
		User existsUser = userRepository
				.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(existsUser == null) {
			throw new Exception("Usuario y/o contraseña invalido o no existen en la base de datos!");
		}
		return existsUser;
	}

}