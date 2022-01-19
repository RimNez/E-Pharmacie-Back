package com.example.epharmacieback.dao;

import com.example.epharmacieback.models.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentDao extends JpaRepository<Medicament,Long> {
}
