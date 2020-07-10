package com.example.democleanarch.adapter.in.web.recurso;

public class CarroDTO {
	
	private String modelo;
	private String marca;
	private String placa;
	private Boolean novo;
	
		
	public CarroDTO() {
	}

	public CarroDTO(String modelo, String marca, String placa, Boolean novo) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.novo = novo;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Boolean getNovo() {
		return novo;
	}
	public void setNovo(Boolean novo) {
		this.novo = novo;
	}
}
