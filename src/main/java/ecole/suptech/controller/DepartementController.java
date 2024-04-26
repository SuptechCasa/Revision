package ecole.suptech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecole.suptech.entites.Departement;
import ecole.suptech.entites.Employe;
import ecole.suptech.service.DepartementService;
import ecole.suptech.service.EmployeService;

@RestController
@RequestMapping("rh")
public class DepartementController {
	@Autowired DepartementService departementService;
	@Autowired EmployeService employeService;
	@GetMapping("departements")
	public List<Departement> getAllDepartements(){
		return departementService.getAllDepartements();
	}
	@PostMapping("departements")
	public Departement addDepartement(@RequestBody Departement departement) {
		return departementService.addDepartement(departement);
	}
	
	@DeleteMapping("departements/{id}")
	public void deleteDepartement(@PathVariable Long id) {
		departementService.deleteDepartement(id);
	}
	@PutMapping("departements")
	public Departement updateDepartement(@RequestBody Departement departement) {
		return departementService.updateDepartement(departement);
	}
	@GetMapping("departements/{depName}/employes")
	public List<Employe> getAllEmployes(@PathVariable String depName){
		return employeService.getAllEmployesByDepartement(depName);
	}
	@PostMapping("departements/{depName}/employes")
	public Employe addEmployeToDepartement(@PathVariable String depName,@RequestBody Employe employe){
		Departement departement=departementService.getDepartementByDepname(depName);
		employe.setDepartement(departement);
		return employeService.addEmploye(employe);
	}
}
