package sn.esmt.CurriculumVitae.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv")

public class AppCvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 private int id;
 private String nom;
 private String prenom;
 private int age;
 private String adresse;
 private String email;
 private String telephone;
 private String specialite;
 private String niveauEtude;
 private String experienceProfessionnelle;


}
