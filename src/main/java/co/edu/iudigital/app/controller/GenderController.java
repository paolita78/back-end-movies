package co.edu.iudigital.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import co.edu.iudigital.app.model.entity.Gender;
import co.edu.iudigital.app.service.iface.GenderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin("*")
@RestController
@RequestMapping("/gender")
// probando cambios en git
public class GenderController {
	//inyeccion de las  dependencias desde el service
	@Autowired
	private GenderService genderService;
	@GetMapping
	public List<Gender> getAll(){
		
		return genderService.getAll();
	
	}

}