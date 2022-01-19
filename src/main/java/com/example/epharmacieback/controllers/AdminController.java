package com.example.epharmacieback.controllers;

import com.example.epharmacieback.models.Admin;
import com.example.epharmacieback.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService service;

    @GetMapping("/")
    public List<Admin> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public Admin save(@RequestBody Admin entity) {
        return service.save(entity);
    }

    @GetMapping("/{id}")
    public Admin findById(@PathVariable("id") Long aLong) {
        return service.findById(aLong);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Admin entity) {
        service.delete(entity);
    }
}
