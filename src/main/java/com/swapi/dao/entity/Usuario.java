package com.swapi.dao.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "REGISTRATION_USERS")
public class Usuario {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	@Enumerated(EnumType.STRING)
	private Pefil perfil;
	private String cpf;
}
