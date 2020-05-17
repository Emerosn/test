package org.edu.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ManagedBean
public class Pessoa {

	private Long id;
	private String nome;
	private String dnacimento;
	private String cpf;
	private String sobrenome;
	
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDnacimento() {
		return dnacimento;
	}
	public void setDnacimento(String dnacimento) {
		this.dnacimento = dnacimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}
