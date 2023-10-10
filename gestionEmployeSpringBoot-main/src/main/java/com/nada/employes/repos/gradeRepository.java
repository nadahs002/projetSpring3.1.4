package com.nada.employes.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nada.employes.entities.grade;

@RepositoryRestResource(path = "grade")
@CrossOrigin(origins="http://localhost:4200/") 
public interface gradeRepository extends JpaRepository<grade, Long> {

}
