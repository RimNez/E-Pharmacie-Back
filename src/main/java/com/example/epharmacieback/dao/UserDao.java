package com.example.epharmacieback.dao;

import com.example.epharmacieback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findByEmailAndPassword(String email, String password);
}
