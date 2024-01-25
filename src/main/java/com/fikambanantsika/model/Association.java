package com.fikambanantsika.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Association")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Association {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "code_association")
    private String code;

    @Column(name = "nom_association")
    private String nom;

    @Column(name = "tel_association")
    private String tel;

    @Column(name = "lieu")
    private String lieu;

    @Column(name = "adresse_mail")
    private String email;

    @Column(name = "logoPath")
    private String logoPath;

    @Column(name = "password")
    private String password;

    @Column(name = "biographie")
    private String biographie;

    @OneToMany(mappedBy="association")
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
