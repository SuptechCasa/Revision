package ecole.suptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecole.suptech.entites.Employe;
import ecole.suptech.repositories.EmployeRepository;

@Service
public class EmployeService {
	@Autowired EmployeRepository employeRepository;
	//Pour renvoyer la liste des employés
	public List<Employe> getAllEmployes(){
		return employeRepository.findAll();
	}
	//Pour ajouter un employé
	public Employe addEmploye(Employe employe) {
		return employeRepository.save(employe);
	}
	//Pour supprimer un employé
	public boolean deleteEmploye(Long id) {
		employeRepository.deleteById(id);
		return !employeRepository.existsById(id);
	}
	//Pour modifier un employé
	public Employe updateEmploye(Employe employe) {
		return employeRepository.save(employe);
	}
	public List<Employe> getAllEmployesByDepartement(String depName) {
		return employeRepository.findByDepartementDepname(depName);
	}
}
