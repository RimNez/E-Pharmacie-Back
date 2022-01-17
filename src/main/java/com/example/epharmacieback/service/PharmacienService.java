package com.example.epharmacieback.service;

import com.example.epharmacieback.dao.PharmacienDao;
import com.example.epharmacieback.dao.PharmacyDao;
import com.example.epharmacieback.models.Pharmacien;
import com.example.epharmacieback.models.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacienService {
    @Autowired
    private PharmacienDao dao;
    @Autowired
    private PharmacyDao pharmacyDao;

    public List<Pharmacien> findAll() {
        return dao.findAll();
    }

    public Pharmacien addPharmacie(Pharmacien pharmacien){
        Pharmacien p = dao.findById(pharmacien.getId()).get();
        List<Pharmacy> pharmacies = pharmacien.getPharmacies();

        pharmacies.forEach( pharmacy -> pharmacy.setPharmacien(p) );
        dao.save(p);
        pharmacies.forEach( pharmacy -> pharmacyDao.save(pharmacy) );
        return dao.findById(pharmacien.getId()).get();
    }

    public Pharmacien save(Pharmacien entity) {
        return dao.save(entity);
    }

    public Pharmacien findById(Long aLong) {
        return dao.findById(aLong).get();
    }

    public void delete(Pharmacien entity) {
        dao.delete(entity);
    }
}
