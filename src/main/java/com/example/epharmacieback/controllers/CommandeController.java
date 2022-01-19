package com.example.epharmacieback.controllers;

import com.example.epharmacieback.models.Commande;
import com.example.epharmacieback.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/commande")
public class CommandeController {
    @Autowired
    private CommandeService service;

    @GetMapping("/")
    public List<Commande> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public Commande save(@RequestBody Commande entity) {
        return service.save(entity);
    }

    @GetMapping("/{id}")
    public Commande findById(@PathVariable("id") Long aLong) {
        return service.findById(aLong);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Commande entity) {
        service.delete(entity);
    }
}
