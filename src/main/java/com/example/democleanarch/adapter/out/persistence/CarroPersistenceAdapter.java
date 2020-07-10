package com.example.democleanarch.adapter.out.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.democleanarch.adapter.out.persistence.entity.CarroEntity;
import com.example.democleanarch.adapter.out.persistence.mapper.CarroDBMapper;
import com.example.democleanarch.adapter.out.persistence.repository.CarroRepository;
import com.example.democleanarch.application.out.CarroPort;
import com.example.democleanarch.domain.Carro;

@Repository
public class CarroPersistenceAdapter implements CarroPort {
	
	@Autowired
	private CarroRepository carroRepository;
	
	@Autowired
	private CarroDBMapper mapper;
	
	@Override
	public void salvar(Carro carro) {
		CarroEntity mapToJpaEntity = mapper.mapToJpaEntity(carro);
		carroRepository.save(mapToJpaEntity);
	}

}
