package com.nada.employes.repos;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nada.employes.entities.grade;
import com.nada.employes.entities.employe;

@SpringBootApplication
@EnableJpaRepositories("com.nada.employes.repos.EmployeRepository")

@RepositoryRestResource(path = "rest")
public interface EmployeRepository extends JpaRepository<employe, Long> {
	
	List<employe> findByNomEmploye(String nom);
	List<employe> findByNomEmployeContains(String nom);
	
	
	
	@Query("select emp from employe emp where emp.nomEmploye like %:nom and emp.salaireEmploye > :salaire")
	List<employe> findByNomsalaire (@Param("nom") String nom,@Param("salaire") Double salaire);

	@Query("select emp from employe emp where emp.grade = ?1")
	List<employe> findByGrade (grade grade);
	
	List<employe> findByGradeIdG(Long id);
	
	List<employe> findByOrderByNomEmployeAsc();
	
	@Query("select emp from employe emp order by emp.nomEmploye ASC, emp.salaireEmploye DESC")
	List<employe> trierEmployesNomsSalaire ();
	

}