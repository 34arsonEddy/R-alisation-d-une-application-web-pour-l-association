package com.fikambanantsika.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fikambanantsika.model.Association;
import com.fikambanantsika.model.Membre;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MaisonDto {
    private Long id;
    private String code;
    private String adresse;
    private String description;
    private String longitude;
    private String latitude;
    private Association association;
    private List<Membre> membres;
    private Instant createdOn;
    private Instant updatedOn;
}
