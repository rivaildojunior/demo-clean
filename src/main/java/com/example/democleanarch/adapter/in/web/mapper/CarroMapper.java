package com.example.democleanarch.adapter.in.web.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.democleanarch.adapter.in.web.recurso.CarroDTO;
import com.example.democleanarch.domain.Carro;

@Component
public class CarroMapper {

	public Carro toDomain(CarroDTO dto) {
		return new Carro(dto.getModelo(), dto.getMarca(), dto.getPlaca(), dto.getNovo());
	}

	public List<CarroDTO> toDTOList(List<Carro> lista) {
		List<CarroDTO> dtoList = new ArrayList<>();
		lista.forEach(carro -> {
			CarroDTO carroDTO = new CarroDTO();
			carroDTO.setMarca(carro.getMarca());
			carroDTO.setModelo(carro.getModelo());
			carroDTO.setPlaca(carro.getPlaca());
			carroDTO.setNovo(carro.getNovo());
			dtoList.add(carroDTO);
		});
		return dtoList;
	}

}
