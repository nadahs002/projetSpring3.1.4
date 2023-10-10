package com.nada.employes.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nada.employes.entities.employe;
import com.nada.employes.entities.grade;
import com.nada.employes.repos.gradeRepository;
@RestController
@RequestMapping("/api/grade")
@CrossOrigin("*")
public class gradeRestController {
@Autowired
gradeRepository gradeRepository;
@RequestMapping(method=RequestMethod.GET)
public List<grade> getAllGrades()
{
return gradeRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public grade getGradeById(@PathVariable("id") Long id) {
return gradeRepository.findById(id).get();
}

@RequestMapping(method = RequestMethod.POST)
public grade createGrade(@RequestBody grade grade) {
return gradeRepository.save(grade);
}
}
