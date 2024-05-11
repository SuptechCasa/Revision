package ecole.suptech.controller;

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

import ecole.suptech.entites.Employe;
import ecole.suptech.service.EmployeService;

@RestController
@RequestMapping("rh")
@CrossOrigin(origins = "*")
public class EmployeController {
	@Autowired EmployeService employeService;
	@GetMapping("employes")
	public List<Employe> getAllEmployes(){
		return employeService.getAllEmployes();
	}
	@PostMapping("employes")
	public Employe addEmploye(@RequestBody Employe employe) {
		return employeService.addEmploye(employe);
	}
	
	@DeleteMapping("employes/{id}")
	public boolean deleteEmploye(@PathVariable Long id) {
		 return employeService.deleteEmploye(id);
	}
	@PutMapping("employes")
	public Employe updateEmploye(@RequestBody Employe employe) {
		return employeService.updateEmploye(employe);
	}
}
