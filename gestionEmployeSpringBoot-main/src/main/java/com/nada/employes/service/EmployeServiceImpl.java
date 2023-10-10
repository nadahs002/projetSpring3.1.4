package com.nada.employes.service;

import java.util.List;
import java.util.stream.Collectors;

import com.nada.employes.entities.EmployeDTO;
import com.nada.employes.repos.ImageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.nada.employes.entities.grade;
import com.nada.employes.entities.employe;
import com.nada.employes.repos.EmployeRepository;


@Service
@SpringBootApplication
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	EmployeRepository employeRepository;
	@Autowired
	ImageRepository imageRepository;


    public employe saveEmploye(employe emp) {
		return employeRepository.save(emp);
	}
    /*@Override
	public employe updateEmploye(employe emp) {
	return employeRepository.save(emp);
	}*/

	@Override
	public employe updateEmploye(employe emp) {
		Long oldProdImageId =
				this.getEmploye(emp.getIdEmploye()).getImage().getIdImage();
		Long newProdImageId = emp.getImage().getIdImage();
		employe empUpdated = employeRepository.save(emp);
		if (oldProdImageId != newProdImageId) //si l'image a été modifiée
			imageRepository.deleteById(oldProdImageId);
		return empUpdated;
	}


	@Override
	public void deleteEmploye(employe emp) {
		employeRepository.delete(emp);
	}

	@Override
	public void deleteEmployeById(Long id) {
		employeRepository.deleteById(id);
	}

    @Override
	public employe getEmploye(Long id) {
		return employeRepository.findById(id).get();
	}

    @Override
	public List<employe> getAllEmployes() {
		return employeRepository.findAll();
	}

	@Override
	public List<employe> findByNomEmploye(String nom) {
		// TODO Auto-generated method stub
		return employeRepository.findByNomEmploye(nom);
	}

	@Override
	public List<employe> findByNomEmployeContains(String nom) {
		// TODO Auto-generated method stub
		return employeRepository.findByNomEmployeContains(nom);
	}

	@Override
	public List<employe> findByNomSalaire(String nom, Double salaire) {
		// TODO Auto-generated method stub
		return employeRepository.findByNomsalaire(nom, salaire);
	}

	@Override
	public List<employe> findByGrade(grade grade) {
		// TODO Auto-generated method stub
		return employeRepository.findByGrade(grade);
	}

	@Override
	public List<employe> findByGradeIdG(Long id) {
		// TODO Auto-generated method stub
		return employeRepository.findByGradeIdG(id);
	}

	@Override
	public List<employe> findByOrderByNomEmployeAsc() {
		// TODO Auto-generated method stub
		return employeRepository.findByOrderByNomEmployeAsc();
	}


	@Override
	public List<employe> trierEmployesNomSalaire(){
		// TODO Auto-generated method stub
		return employeRepository.trierEmployesNomsSalaire();
	}


	/*@Override
	public EmployeDTO convertEntityToDto(employe employe) {
		EmployeDTO employeDTO = modelMapper.map(employe, EmployeDTO.class);
		return employeDTO;
	}*/


	/*@Override
	public EmployeDTO saveEmploye(employe p) {
		return convertEntityToDto( employeRepository.save(p));
	}*/

	/*@Override
	public EmployeDTO getEmploye(Long id) {
		return convertEntityToDto( employeRepository.findById(id).get());
	}*/

	/*@Override
	public List<EmployeDTO> getAllEmployes() {
		return employeRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());

	}*/


	/*@Override
	public employe convertDtoToEntity(EmployeDTO employeDTO) {
		employe employe = new employe();
		employe = modelMapper.map(employeDTO, employe.class);
		return employe;
	}*/

	/*@Override
	public EmployeDTO saveEmploye(EmployeDTO p) {
		return convertEntityToDto( employeRepository.save(convertDtoToEntity(p)));
	}
	@Override
	public EmployeDTO updateEmploye(EmployeDTO p) {
		return convertEntityToDto(employeRepository.save(convertDtoToEntity(p)));
	}
*/

}
