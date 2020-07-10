package com.example.democleanarch.adapter.out.persistence.mapper;

import org.springframework.stereotype.Component;

import com.example.democleanarch.adapter.out.persistence.entity.CarroEntity;
import com.example.democleanarch.domain.Carro;

@Component
public class CarroDBMapper {
	
	  public CarroEntity mapToJpaEntity(Carro carro) {
		  CarroEntity carroEntity = new CarroEntity();
		  carroEntity.setMarca(carro.getMarca());
		  carroEntity.setModelo(carro.getModelo());
		  carroEntity.setPlaca(carro.getMarca());
		  carroEntity.setNovo(carro.getNovo());
		  return carroEntity;
	  }

}
