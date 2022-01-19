package com.example.epharmacieback.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private String patente;
    private String tel;
    @OneToMany(targetEntity = Pharmacy.class)
    @JsonManagedReference(value = "medicament-ref")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Medicament> medicaments;

    @OneToMany(targetEntity = Pharmacy.class)
    @JsonManagedReference(value = "pharmacy-ref")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Commande> commandes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "admin_id")
    @JsonBackReference(value = "admin-ref")
    private Admin admin;

    /*@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = true, name = "pharmacien_id")
    @JsonBackReference(value = "pharmacien-ref")
    private Pharmacien pharmacien;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = true, name = "user_id")
    @JsonBackReference(value = "user-ref")
    private User user;*/



    public Pharmacy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", patente='" + patente + '\'' +
                ", tel='" + tel + '\'' +
                ", admin=" + admin +
                '}';
    }
}
