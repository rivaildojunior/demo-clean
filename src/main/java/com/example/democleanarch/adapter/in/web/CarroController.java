package com.example.democleanarch.adapter.in.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.democleanarch.adapter.in.web.mapper.CarroMapper;
import com.example.democleanarch.adapter.in.web.recurso.CarroDTO;
import com.example.democleanarch.application.in.CarroUseCase;
import com.example.democleanarch.domain.Carro;

@RestController
public class CarroController {
	
	@Autowired
	private CarroUseCase carroUseCase;
	
	@Autowired
	private CarroMapper mapper;
	
	@PostMapping("/carros")
	public void adicionar(@RequestBody CarroDTO carro) {
		Carro carroDomain = mapper.toDomain(carro);
		carroUseCase.adicionar(carroDomain);	
	}
	

}
