package com.fikambanantsika.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "membre")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Membre {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="matricule_membre", nullable = false)
    private Long matricule;

    @Column(name = "nom_membre", nullable = false)
    private String nom;

    @Column(name = "adresse_membre")
    private String adresse;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "dateNaissance_membre")
    private LocalDate dateNaiss;

    @Column(name = "lieuNaiss_membre")
    private String lieuNaiss;

    @Column(name = "imagePath")
    private String imagePath;

    @Column(name = "tel_membre")
    private String tel;

    @Column(name = "annee_bacc")
    private String anneeBacc;

    @Column(name = "cycle")
    private String cycle;

    @Column(name = "ecole_membre")
    private String ecole;

    @Column(name = "niveau_membre")
    private String niveau;

    @Column(name = "filiere")
    private String filiere;

    @Column(name = "Situation_matrimoniale")
    private String situationMatrimoniale;

    @Column(name = "empreinte_membre")
    private String empreinte;

    @ManyToMany()
    @JoinTable(
            name = "maison_membre",
            joinColumns = @JoinColumn(name = "id_membre"),
            inverseJoinColumns = @JoinColumn(name = "id_maison"))
    private List<Maison> maisons;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_association", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Association association;

    @CreatedDate
    @Column(name = "createdOn", nullable = false)
    @JsonIgnore
    private Instant createdOn;

    @LastModifiedDate
    @Column(name = "updatedOn", nullable = false)
    @JsonIgnore
    private Instant updatedOn;

}
