package com.nada.employes.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeDTO {
    private Long idEmploye ;
    private String nomEmploye ;
    private Double salaireEmploye ;
    private Date date ;
    private grade grade;
    private Image image ;
}