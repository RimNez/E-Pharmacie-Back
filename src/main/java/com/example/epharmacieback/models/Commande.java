package com.example.epharmacieback.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String etat;
    private float totalPrix;
    @OneToMany(targetEntity = Pharmacy.class)
    @JsonManagedReference(value = "medicament-commande-ref")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Medicament> medicaments;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = true, name = "user_id")
    @JsonBackReference(value = "commande-ref")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = true, name = "pharmacy_id")
    @JsonBackReference(value = "pharmacy-ref")
    private Pharmacy pharmacy;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotalPrix() {
        return totalPrix;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setTotalPrix(float totalPrix) {
        this.totalPrix = totalPrix;
    }

    public List<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
}
