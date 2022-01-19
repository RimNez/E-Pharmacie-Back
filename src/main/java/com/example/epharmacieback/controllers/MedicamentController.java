package com.example.epharmacieback.controllers;

import com.example.epharmacieback.models.Medicament;
import com.example.epharmacieback.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/medicament")
public class MedicamentController {
    @Autowired
    private MedicamentService service;

    @GetMapping("/")
    public List<Medicament> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public Medicament save(@RequestBody Medicament entity) {
        return service.save(entity);
    }

    @GetMapping("/{id}")
    public Medicament findById(@PathVariable("id") Long aLong) {
        return service.findById(aLong);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Medicament entity) {
        service.delete(entity);
    }
}
