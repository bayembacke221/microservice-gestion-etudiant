package com.example.serviceinscription.model;

//import jakarta.persistence.*;
import javax.persistence.*;
import lombok.Data;



@Data
@Entity
public class Etudiant {
    @Id
    private String numCarte;
    private String prenom;
    private String nom;
    private String classe;
}
