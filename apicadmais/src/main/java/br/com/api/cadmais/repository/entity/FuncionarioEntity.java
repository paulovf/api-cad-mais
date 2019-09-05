package br.com.api.cadmais.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funcionario")
public class FuncionarioEntity {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_funcionario")
	private Integer idFuncionario;
 
	@Column(name="nome")	
	private String nome;
 
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="data_nascimento")	
	private Date dataNascimento;
 
	@Column(name="login")
	private String login;
	
	@Column(name="senha")	
	private String senha;

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
