package com.example.employeemanager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "User") // Nom de la table dans la base de données
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String lastName;
    private String firstName;
    private String mail;

    @Temporal(TemporalType.DATE)
    private Date hireDate;

    private String password;

    // Enum pour le privilège (peut être ajusté en fonction de vos besoins)
    public enum Privilege {USER, ADMIN}

    @Enumerated(EnumType.STRING)
    private Privilege privilege;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String nom) {
        this.lastName = nom;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String prenom) {
        this.firstName = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date dateEmbauche) {
        this.hireDate = dateEmbauche;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String motDePasse) {
        this.password = motDePasse;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }

    // Getters et Setters
}
