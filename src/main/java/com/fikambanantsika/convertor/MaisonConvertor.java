package com.fikambanantsika.convertor;

import com.fikambanantsika.dto.MaisonDto;
import com.fikambanantsika.dto.MembreDto;
import com.fikambanantsika.model.Maison;
import com.fikambanantsika.model.Membre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaisonConvertor {

    public MaisonDto modelToDto(Maison maison){
        return MaisonDto.builder()
                .id(maison.getId())
                .code(maison.getCode())
                .adresse(maison.getAdresse())
                .description(maison.getDescription())
                .association(maison.getAssociation())
                .membres(maison.getMembres())
                .longitude(maison.getLongitude())
                .latitude(maison.getLatitude())
                .createdOn(maison.getCreatedOn())
                .updatedOn(maison.getUpdatedOn())
                .build();
    }

    public Maison dtoToModel(MaisonDto maisonDto){
        return Maison.builder()
                .id(maisonDto.getId())
                .code(maisonDto.getCode())
                .adresse(maisonDto.getAdresse())
                .description(maisonDto.getDescription())
                .association(maisonDto.getAssociation())
                .membres(maisonDto.getMembres())
                .longitude(maisonDto.getLongitude())
                .latitude(maisonDto.getLatitude())
                .createdOn(maisonDto.getCreatedOn())
                .updatedOn(maisonDto.getUpdatedOn())
                .build();
    }

    public List<MaisonDto> modelToDto(List<Maison> maisons){
        List<MaisonDto> maisonDto = new ArrayList<>();
        for (Maison maison : maisons) {
            maisonDto.add(modelToDto(maison));
        }
        return maisonDto;
    }

    public List<Maison> dtoToModel(List<MaisonDto> maisonDtos){
        List<Maison> maison = new ArrayList<>();
        for (MaisonDto maisonDto : maisonDtos) {
            maison.add(dtoToModel(maisonDto));
        }
        return maison;
    }
}
