package com.example.epharmacieback.service;

import com.example.epharmacieback.dao.MedicamentDao;
import com.example.epharmacieback.models.Medicament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentService {
    @Autowired
    private MedicamentDao dao;

    public List<Medicament> findAll() {
        return dao.findAll();
    }

    public Medicament save(Medicament entity) {
        return dao.save(entity);
    }

    public Medicament findById(Long aLong) {
        return dao.findById(aLong).get();
    }

    public void delete(Medicament entity) {
        dao.delete(entity);
    }
}
