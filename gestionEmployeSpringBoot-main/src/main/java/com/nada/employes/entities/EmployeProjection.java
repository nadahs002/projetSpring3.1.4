package com.nada.employes.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEmploye", types = { employe.class })

public interface EmployeProjection {
	
	public String getNomEmploye();


}
