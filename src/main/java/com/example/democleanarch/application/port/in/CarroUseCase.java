package com.example.democleanarch.application.port.in;

import java.util.List;

import com.example.democleanarch.domain.Carro;

public interface CarroUseCase {
	
	void adicionar(Carro carro);

	List<Carro> listar();

}
