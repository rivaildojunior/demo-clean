package com.example.democleanarch.application.port.out;

import java.util.List;

import com.example.democleanarch.domain.Carro;

public interface CarroPort {
	
	void salvar(Carro carro);

	List<Carro> listar();

}
