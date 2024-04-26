package ecole.suptech.entites;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Employe {
	@Id
Long id;
String name;
float salary;
@ManyToOne
Departement departement;
}
