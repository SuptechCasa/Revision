package ecole.suptech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecole.suptech.entites.Employe;
@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{
	public List<Employe> findByDepartementDepname(String depName);
}
