package br.com.api.cadmais.http;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Funcionario {
	private int idFuncionario;
	private String nome;
	private String cpf;	
	private Date dataNascimento;
	private String login;
	private String senha;
 
	public Funcionario(){}

	public Funcionario(int idFuncionario, String nome, String cpf, Date dataNascimento, String login, String senha) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.login = login;
		this.senha = senha;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
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
