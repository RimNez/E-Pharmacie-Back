package com.example.epharmacieback.controllers;

import com.example.epharmacieback.models.Admin;
import com.example.epharmacieback.models.Pharmacien;
import com.example.epharmacieback.service.PharmacieService;
import com.example.epharmacieback.service.PharmacienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/ph")
public class PharmacienController {
    @Autowired
    private PharmacienService service;

    @GetMapping("/")
    public List<Pharmacien> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public Pharmacien save(@RequestBody Pharmacien entity) {
        return service.save(entity);
    }

    @GetMapping("/{id}")
    public Pharmacien findById(@PathVariable("id") Long aLong) {
        return service.findById(aLong);
    }

    @DeleteMapping("/delete")
    public void delete(Pharmacien entity) {
        service.delete(entity);
    }
}
