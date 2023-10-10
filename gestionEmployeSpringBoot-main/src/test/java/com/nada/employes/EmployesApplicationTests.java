/*package com.nada.employes;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nada.employes.entities.employe;
import com.nada.employes.repos.EmployeRepository;

@SpringBootTest
class EmployesApplicationTests {

	@Autowired
	private EmployeRepository EmployeRepository;
	@Test
	public void testCreateEmploye() {
	employe emp = new employe("nada",2200.500,new Date());
    EmployeRepository.save(emp);
	}
	
	 @Test
	 public void testFindEmploye()
	 {
	 employe emp = EmployeRepository.findById(1L).get(); 
	 System.out.println(emp);
	 }
	 
	 @Test
	 public void testUpdateEmploye()
	 {
	 employe emp = EmployeRepository.findById(1L).get();
	 emp.setSalaireEmploye(2000.0);
	 EmployeRepository.save(emp);
	 }
	 
	 
	 @Test
	 public void testDeleteEmploye()
	 {
	 EmployeRepository.deleteById(1L);;
	 }
	  
	 @Test
	 public void testListerTousEmployes()
	 {
	 List<employe> emps = EmployeRepository.findAll();
	 for (employe emp : emps)
	 {
	 System.out.println(emp);
	 }
	 }
	 
	 @Test
	 public void testFindByNomEmploye()
	 {
	
	 List<employe> emps = EmployeRepository.findByNomEmploye("nada");
	 for (employe emp : emps)
	 {
	 System.out.println(emp);
	 }
	 }
	 
	 @Test
	 public void testFindByNomProduitContains ()
	 {
	 List<employe> emps=EmployeRepository.findByNomEmployeContains("na");
	 for (employe emp : emps)
	 {
	 System.out.println(emp);
	 } }




}
*/
