package com.stcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stcar.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {

}
