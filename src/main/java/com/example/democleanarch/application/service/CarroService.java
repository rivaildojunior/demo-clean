package com.example.democleanarch.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democleanarch.application.port.in.CarroUseCase;
import com.example.democleanarch.application.port.out.CarroPort;
import com.example.democleanarch.domain.Carro;

@Service
public class CarroService implements CarroUseCase {
	
	@Autowired
	private CarroPort carroPort;

	@Override
	public void adicionar(Carro carro) {
		carroPort.salvar(carro);
	}

	@Override
	public List<Carro> listar() {
		return carroPort.listar();
	}

}
