package com.stcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stcar.model.Variedade;

@Repository
public interface VariedadeRepository extends JpaRepository<Variedade, Integer> {

}
