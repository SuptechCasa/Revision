package ecole.suptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecole.suptech.entites.Departement;
import ecole.suptech.repositories.DepartementRepository;

@Service
public class DepartementService {
	@Autowired DepartementRepository departementRepository;
	//Pour renvoyer la liste des employés
	public List<Departement> getAllDepartements(){
		return departementRepository.findAll();
	}
	//Pour ajouter un employé
	public Departement addDepartement(Departement departement) {
		return departementRepository.save(departement);
	}
	//Pour supprimer un employé
	public void deleteDepartement(Long id) {
		departementRepository.deleteById(id);
	}
	//Pour modifier un employé
	public Departement updateDepartement(Departement departement) {
		return departementRepository.save(departement);
	}
	//Pour renvoyer un département par son nom
	public Departement getDepartementByDepname(String depName) {
		return departementRepository.findByDepname(depName);
	}
}
