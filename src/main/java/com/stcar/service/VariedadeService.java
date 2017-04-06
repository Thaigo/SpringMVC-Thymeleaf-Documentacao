package com.stcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stcar.model.Variedade;
import com.stcar.repository.VariedadeRepository;

@Service
public class VariedadeService {

	@Autowired
	private VariedadeRepository variedadeRepository;
	
	public List<Variedade> findAll() {
		return this.variedadeRepository.findAll();
	}
	
	public Variedade findById(Integer id) {
		return this.variedadeRepository.findOne(id);
	}
}
