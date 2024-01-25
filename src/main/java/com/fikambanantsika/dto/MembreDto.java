package com.fikambanantsika.dto;

import com.fikambanantsika.model.Association;
import com.fikambanantsika.model.Maison;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@Getter
@Setter
public class MembreDto {
    private Long id;
    private Long matricule;
    private String nom;
    private String adresse;
    private LocalDate dateNaiss;
    private String lieuNaiss;
    private String imagePath;
    private String tel;
    private String anneeBacc;
    private String cycle;
    private String ecole;
    private String niveau;
    private String filiere;
    private String situationMatrimoniale;
    private String empreinte;
    private List<Maison> maisons;
    private Association association;
    private Instant CreatedOn;
    private Instant updatedOn;


}
