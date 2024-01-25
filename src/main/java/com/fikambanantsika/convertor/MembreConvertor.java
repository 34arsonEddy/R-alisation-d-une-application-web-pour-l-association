package com.fikambanantsika.convertor;

import com.fikambanantsika.dto.MembreDto;
import com.fikambanantsika.model.Membre;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
public class MembreConvertor {


    public MembreDto modelToDto(Membre membre){

        return MembreDto.builder()
                .id(membre.getId())
                .matricule(membre.getMatricule())
                .nom(membre.getNom())
                .adresse(membre.getAdresse())
                .dateNaiss(membre.getDateNaiss())
                .lieuNaiss(membre.getLieuNaiss())
                .tel(membre.getTel())
                .imagePath(membre.getImagePath())
                .anneeBacc(membre.getAnneeBacc())
                .cycle(membre.getCycle())
                .ecole(membre.getEcole())
                .niveau(membre.getNiveau())
                .filiere(membre.getFiliere())
                .situationMatrimoniale(membre.getSituationMatrimoniale())
                .empreinte(membre.getEmpreinte())
                .maisons(membre.getMaisons())
                .association(membre.getAssociation())
                .CreatedOn(membre.getCreatedOn())
                .updatedOn(membre.getUpdatedOn())
                .build();

    }

    public  Membre dtoToModel(MembreDto membreDto){

        return Membre.builder()
                .id(membreDto.getId())
                .matricule(membreDto.getMatricule())
                .nom(membreDto.getNom())
                .adresse(membreDto.getAdresse())
                .dateNaiss(membreDto.getDateNaiss())
                .lieuNaiss(membreDto.getLieuNaiss())
                .tel(membreDto.getTel())
                .imagePath(membreDto.getImagePath())
                .anneeBacc(membreDto.getAnneeBacc())
                .cycle(membreDto.getCycle())
                .ecole(membreDto.getEcole())
                .niveau(membreDto.getNiveau())
                .filiere(membreDto.getFiliere())
                .situationMatrimoniale(membreDto.getSituationMatrimoniale())
                .empreinte(membreDto.getEmpreinte())
                .maisons(membreDto.getMaisons())
                .association(membreDto.getAssociation())
                .createdOn(membreDto.getCreatedOn())
                .updatedOn(membreDto.getUpdatedOn())
                .build();
    }

    public List<MembreDto> modelToDto(List<Membre> membres){
        List<MembreDto> membreDtos = new ArrayList<>();
        for (Membre membre : membres) {
            membreDtos.add(modelToDto(membre));
        }
        return membreDtos;
    }

    public List<Membre> dtoToModel(List<MembreDto> membreDtos){
        List<Membre> membres = new ArrayList<>();
        for (MembreDto membreDto : membreDtos) {
            membres.add(dtoToModel(membreDto));
        }
        return membres;
    }
}
