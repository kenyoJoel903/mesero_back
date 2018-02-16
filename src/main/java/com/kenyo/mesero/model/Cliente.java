package com.kenyo.mesero.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombreCompleto;
	
	private String dni;
	
	@OneToMany(mappedBy = "cliente")
	private Set<Consumo> consumos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Set<Consumo> getConsumos() {
		return consumos;
	}

	public void setConsumos(Set<Consumo> consumos) {
		this.consumos = consumos;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Cliente) obj).id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	public Long getResourceId() {
		return this.id;
	}
	

}
