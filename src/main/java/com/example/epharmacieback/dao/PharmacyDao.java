package com.example.epharmacieback.dao;

import com.example.epharmacieback.models.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyDao extends JpaRepository<Pharmacy,Long> {
    Pharmacy findByNomAndPatente(String nom, String patente);
}
