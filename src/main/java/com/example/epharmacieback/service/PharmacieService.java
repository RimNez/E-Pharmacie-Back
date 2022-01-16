package com.example.epharmacieback.service;

import com.example.epharmacieback.dao.AdminDao;
import com.example.epharmacieback.dao.PharmacyDao;
import com.example.epharmacieback.models.Admin;
import com.example.epharmacieback.models.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacieService{
    @Autowired
    private PharmacyDao pharmacyDao;
    @Autowired
    private AdminDao adminDao;

    public List<Pharmacy> findAll() {
        return pharmacyDao.findAll();
    }

    public boolean save(Pharmacy pharmacy, Long idAdmin) {
        Admin admin = adminDao.getById(idAdmin);
        if (pharmacy != null) {
            pharmacy.setAdmin(admin);
            pharmacyDao.save(pharmacy);
            return true;
        } else return false;
    }

    public boolean update(Pharmacy pharmacy) {
        Pharmacy p = pharmacyDao.findById(pharmacy.getId()).get();
        if (p != null) {
            p.setNom(pharmacy.getNom());
            p.setAdresse(pharmacy.getAdresse());
            p.setPatente(pharmacy.getPatente());
            p.setTel(pharmacy.getTel());
            pharmacyDao.save(p);
            return true;
        } else return false;
    }

    public Pharmacy findById(Long id) {
        if(pharmacyDao.findById(id)!= null) {
            return pharmacyDao.findById(id).get();
        }
        else return null;
    }

    public void delete(Pharmacy pharmacy) {
        pharmacyDao.delete(pharmacy);
    }
}
