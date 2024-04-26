package ecole.suptech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecole.suptech.entites.Departement;
import ecole.suptech.entites.Employe;
@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long>{
	public Departement findByDepname(String depName);
}
