package com.nada.employes.entities;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class grade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idG;
	
	private String nomG;

	
	
	@OneToMany(mappedBy = "grade")
	@JsonIgnore
	private List<employe> employes;
	
	
}
