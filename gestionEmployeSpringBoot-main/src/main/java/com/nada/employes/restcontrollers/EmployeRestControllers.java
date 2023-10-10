package com.nada.employes.restcontrollers;

import java.util.List;

import com.nada.employes.entities.EmployeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nada.employes.entities.employe;
import com.nada.employes.service.EmployeService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeRestControllers {
	
	@Autowired
	
	EmployeService employeService;
	
	@RequestMapping(path="all",method=RequestMethod.GET)
	public List<employe>getAllEmployes()
	{
		return employeService.getAllEmployes();
	}

	/*@RequestMapping(method = RequestMethod.GET)
	public List<EmployeDTO> getAllEmployes() {
		return employeService.getAllEmployes();
	}*/
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public employe getEmployeById(@PathVariable("id") Long id) {
	return employeService.getEmploye(id);
	 }

	/*@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public EmployeDTO getEmployeById(@PathVariable("id") Long id) {
		return employeService.getEmploye(id);
	}*/
	
	@RequestMapping(path="/addemp",method = RequestMethod.POST)
	public employe createEmploye(@RequestBody employe employe) {
	return employeService.saveEmploye(employe);
	}
	/*@RequestMapping(path="/addemp",method = RequestMethod.POST)
	public EmployeDTO createEmploye(@RequestBody employe employe) {
		return employeService.saveEmploye(employe);
	}*/
	
	@RequestMapping(path="/updateemp",method = RequestMethod.PUT)
	public employe updateEmploye(@RequestBody employe employe) {
	return employeService.updateEmploye(employe);
	}

	/*@RequestMapping(method = RequestMethod.PUT)
	public EmployeDTO updateEmploye(@RequestBody EmployeDTO employeDTO) {
		return employeService.updateEmploye(employeDTO);
	}*/
	
	@RequestMapping(value="/delemp/{id}",method = RequestMethod.DELETE)
	public void deleteEmploye(@PathVariable("id") Long id)
	{
	employeService.deleteEmployeById(id);
	}
	
	
	@RequestMapping(value="/empG/{idG}",method = RequestMethod.GET)
	public List<employe> getemployesByGId(@PathVariable("idG") Long idG) {
	return employeService.findByGradeIdG(idG);
	}
	
	
	@RequestMapping(value="/empsByName/{nom}",method = RequestMethod.GET)
	public List<employe> findByNomEmployeContains(@PathVariable("nom") String nom) {
	return employeService.findByNomEmployeContains(nom);
	}
	
	
	



	
}