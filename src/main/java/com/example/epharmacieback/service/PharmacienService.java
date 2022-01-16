package com.example.epharmacieback.service;

import com.example.epharmacieback.dao.PharmacienDao;
import com.example.epharmacieback.models.Pharmacien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacienService {
    @Autowired
    private PharmacienDao dao;

    public List<Pharmacien> findAll() {
        return dao.findAll();
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
