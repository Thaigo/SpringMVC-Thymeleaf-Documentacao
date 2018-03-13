package com.stcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stcar.model.Carro;
import com.stcar.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;
	
	public List<Carro> findAll() {
		return this.carroRepository.findAll();
	}
	
	public Carro add(Carro carro) {
		return this.carroRepository.save(carro);
	}
	
	public Carro findById(Integer id) {
		return this.carroRepository.findOne(id);
	}

}
