package com.example.epharmacieback.dao;

import com.example.epharmacieback.models.Pharmacien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacienDao extends JpaRepository<Pharmacien,Long> {
}
