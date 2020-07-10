package com.example.democleanarch.adapter.in.web.mapper;

import org.springframework.stereotype.Component;

import com.example.democleanarch.adapter.in.web.recurso.CarroDTO;
import com.example.democleanarch.domain.Carro;

@Component
public class CarroMapper {
	
	public Carro toDomain(CarroDTO dto) {
		return new Carro(dto.getModelo(), dto.getMarca(), dto.getPlaca(), dto.getNovo());
	}

}
