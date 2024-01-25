package com.fikambanantsika.dto;

import com.fikambanantsika.model.Membre;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;


@Builder
@Data
@Getter
@Setter

public class AssociationDto {
    private Long id;

    private String code;

    private String nom;

    private String tel;

    private String lieu;

    private String email;

    private String logoPath;

    private String password;

    private String biographie;

    private List<Membre> membres;

    private Instant createdOn;

    private Instant updatedOn;
}
