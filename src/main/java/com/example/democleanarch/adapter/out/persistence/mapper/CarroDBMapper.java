package com.example.democleanarch.adapter.out.persistence.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.democleanarch.adapter.out.persistence.entity.CarroEntity;
import com.example.democleanarch.domain.Carro;

@Component
public class CarroDBMapper {

	public CarroEntity mapToJpaEntity(Carro carro) {
		CarroEntity carroEntity = new CarroEntity();
		carroEntity.setMarca(carro.getMarca());
		carroEntity.setModelo(carro.getModelo());
		carroEntity.setPlaca(carro.getPlaca());
		carroEntity.setNovo(carro.getNovo());
		return carroEntity;
	}

	public List<Carro> mapListEntityToDomain(List<CarroEntity> listCarroEntity) {
		List<Carro> lista = new ArrayList<>();
		listCarroEntity.forEach(carroEntity -> {
			Carro carro = new Carro();
			carro.setMarca(carroEntity.getMarca());
			carro.setModelo(carroEntity.getModelo());
			carro.setPlaca(carroEntity.getPlaca());
			carro.setNovo(carroEntity.getNovo());
			lista.add(carro);
		});
		return lista;
	}

}
