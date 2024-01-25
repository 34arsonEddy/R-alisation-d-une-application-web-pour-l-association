package com.fikambanantsika.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.util.List;

@Entity
@Data
@Table(name = "maison")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Maison {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "adresse")
    private String adresse;

    @Column(name="description")
    private String description;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "latitude")
    private String latitude;

    @ManyToOne
    @JoinColumn(name = "id_association", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Association association;

    @ManyToMany(mappedBy = "maisons")
    private List<Membre> membres;

    @CreatedDate
    @Column(name = "createdOn", nullable = false)
    @JsonIgnore
    private Instant createdOn;

    @LastModifiedDate
    @Column(name = "updatedOn", nullable = false)
    @JsonIgnore
    private Instant updatedOn;

}
