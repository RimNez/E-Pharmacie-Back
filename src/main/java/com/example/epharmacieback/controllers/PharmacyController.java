package com.example.epharmacieback.controllers;

import com.example.epharmacieback.models.Pharmacy;
import com.example.epharmacieback.service.PharmacieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pharmacie")
public class PharmacyController {
    @Autowired
    private PharmacieService pharmacieService;

    @GetMapping("/")
    public List<Pharmacy> findAll() {
        return pharmacieService.findAll();
    }

    @PostMapping("/{id}")
    public boolean save(@RequestBody Pharmacy pharmacy, @PathVariable("id") Long idAdmin) {
        return pharmacieService.save(pharmacy, idAdmin);
    }

    @PutMapping("/update/{id}")
    public boolean update(@RequestBody Pharmacy pharmacy,@PathVariable("id") Long id) {
        return pharmacieService.update(pharmacy, id);
    }

    @GetMapping("/{id}")
    public Pharmacy findById(@PathVariable("id") Long id) {
        return pharmacieService.findById(id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Pharmacy pharmacy) {
        pharmacieService.delete(pharmacy);
    }
}
