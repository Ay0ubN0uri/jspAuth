/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.a00n.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 *
 * @author ay0ub
 */
@Entity
public class Client extends User {

    @GeneratedValue
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date datenaissance;

    public Client() {
    }

    public Client(String nom, String prenom, Date dateNaissance, String email, String password, int etat, String code) {
        super(email, password, etat, code);
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = dateNaissance;
        this.etat = etat;
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

}
