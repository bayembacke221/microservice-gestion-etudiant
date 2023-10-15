package com.example.serviceexamen.model;

import lombok.Data;

//import jakarta.persistence.*;

import javax.persistence.*;
@Data
@Entity
public class Moyenne {
    @Id
    private String numCarte;
    private String prenom;
    private String nom;
    private double moyenne;
}
