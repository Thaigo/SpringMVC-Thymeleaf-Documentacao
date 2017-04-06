package com.stcar.controller;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stcar.model.Carro;
import com.stcar.model.Recurso;
import com.stcar.model.Row;
import com.stcar.model.Tipo;
import com.stcar.model.Variedade;
import com.stcar.service.CarroService;
import com.stcar.service.VariedadeService;

@Controller
public class CarroController {
	
	@Autowired
	private CarroService carroService;
	
	@Autowired
	private VariedadeService variedadeService;
	
	
	
	@ModelAttribute("AllTipos")
	public List<Tipo> populaTipos() {
		return Arrays.asList(Tipo.ALL);
	}
	
	@ModelAttribute("AllRecursos")
	public List<Recurso> populaRecursos() {
		return Arrays.asList(Recurso.ALL);
	}
	
	@ModelAttribute("AllVariedades")
	public List<Variedade> populaVariedades() {
		return this.variedadeService.findAll();
	}
	
	@ModelAttribute("AllCarros")
	public List<Carro> populaCarros() {
		return this.carroService.findAll();
	}
	
	@RequestMapping({"/", "/carros"})
	public String showCarros(Carro carro) {
		carro.setDateCar(Calendar.getInstance().getTime());
		return "carros";
	}
	
	@RequestMapping(value = "/carros", params={"save"})
	public String saveCar(Carro carro, ModelMap model) {
		this.carroService.add(carro);
		model.clear();
		return "redirect:/carros";
	}
	
	@RequestMapping(value = "/carros", params={"addRow"})
	public String addRow(Carro carro) {
		carro.getRows().add(new Row());
		return "carros";
	}
	
	@RequestMapping(value = "/carros", params={"removeRow"})
	public String removeRow(Carro carro, final BindingResult bindingResult, final HttpServletRequest req) {
		final Integer rowId = Integer.valueOf(req.getParameter("removeRow"));
		carro.getRows().remove(rowId.intValue());
		return "carros";
	}
	
	
}
