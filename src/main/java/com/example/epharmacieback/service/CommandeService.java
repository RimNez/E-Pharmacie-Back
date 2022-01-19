package com.example.epharmacieback.service;

import com.example.epharmacieback.dao.CommandeDao;
import com.example.epharmacieback.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeDao dao;

    public List<Commande> findAll() {
        return dao.findAll();
    }

    public Commande save(Commande entity) {
        return dao.save(entity);
    }

    public Commande findById(Long aLong) {
        return dao.findById(aLong).get();
    }

    public void delete(Commande entity) {
        dao.delete(entity);
    }
}
