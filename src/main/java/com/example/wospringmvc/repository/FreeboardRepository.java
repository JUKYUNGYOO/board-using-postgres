package com.example.wospringmvc.repository;


import com.example.wospringmvc.model.Freeboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface FreeboardRepository extends JpaRepository<Freeboard, Long> {

    @Query("SELECT p " +
            "FROM Freeboard p " +
            "ORDER BY p.id DESC")
    Stream<Freeboard> findAllDesc();
}
