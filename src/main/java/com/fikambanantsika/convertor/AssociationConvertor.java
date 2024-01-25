package com.fikambanantsika.convertor;

import com.fikambanantsika.dto.AssociationDto;
import com.fikambanantsika.model.Association;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AssociationConvertor {

    public AssociationDto modelToDto(Association association){
        return AssociationDto.builder()
                .id(association.getId())
                .code(association.getCode())
                .nom(association.getNom())
                .tel(association.getTel())
                .lieu(association.getLieu())
                .email(association.getEmail())
                .logoPath(association.getLogoPath())
                .password(association.getPassword())
                .biographie(association.getBiographie())
                .membres(association.getMembres())
                .createdOn(association.getCreatedOn())
                .updatedOn(association.getUpdatedOn())
                .build();
    }
    public Association dtoToModel(AssociationDto associationDto){
        return Association.builder()
                .id(associationDto.getId())
                .code(associationDto.getCode())
                .nom(associationDto.getNom())
                .tel(associationDto.getTel())
                .lieu(associationDto.getLieu())
                .email(associationDto.getEmail())
                .logoPath(associationDto.getLogoPath())
                .password(associationDto.getPassword())
                .biographie(associationDto.getBiographie())
                .membres(associationDto.getMembres())
                .createdOn(associationDto.getCreatedOn())
                .updatedOn(associationDto.getUpdatedOn())
                .build();
    }

    public List<AssociationDto> modelToDto(List<Association> associations){
        List<AssociationDto> associationDtos = new ArrayList<>();
        for (Association association : associations) {
            associationDtos.add(modelToDto(association));
        }
        return associationDtos;
    }

    public List<Association> dtoToModel(List<AssociationDto> associationDtos){
        List<Association> associations = new ArrayList<>();
        for (AssociationDto associationDto : associationDtos) {
            associations.add(dtoToModel(associationDto));
        }
        return associations;
    }
}
