package com.example.epharmacieback.service;

import com.example.epharmacieback.dao.AdminDao;
import com.example.epharmacieback.models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    public  Admin  save(Admin entity) {
        return adminDao.save(entity);
    }

    public Admin findById(Long aLong) {
        return adminDao.findById(aLong).get();
    }

    public void delete(Admin entity) {
        adminDao.delete(entity);
    }
}
