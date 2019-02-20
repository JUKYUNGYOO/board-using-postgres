package com.example.wospringmvc.repository;

import com.example.wospringmvc.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
    @Query("SELECT p " +
            "FROM Users p " +
            "ORDER BY p.id DESC")
    public Users findByUsers_idAndAndUsers_pw(String user_id,String user_pw);


}
