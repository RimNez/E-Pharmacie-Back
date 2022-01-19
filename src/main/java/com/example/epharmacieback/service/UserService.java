package com.example.epharmacieback.service;

import com.example.epharmacieback.dao.UserDao;
import com.example.epharmacieback.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDao dao;

    public List<User> findAll() {
        return dao.findAll();
    }

    public User save(User entity) {
        return dao.save(entity);
    }

    public User findById(Long aLong) {
        return dao.findById(aLong).get();
    }

    public void delete(User entity) {
        dao.delete(entity);git
    }
}
