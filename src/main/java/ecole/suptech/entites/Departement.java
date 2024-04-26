package ecole.suptech.entites;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Departement {
	@Id
Long id;
String depname;
@OneToMany(mappedBy = "departement")
@JsonIgnore
List<Employe> employes;
}
