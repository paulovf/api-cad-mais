package br.com.api.cadmais.http;

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Veiculo {
	private int idVeiculo;	
	private String placa;
	private String ativo;	
	private String anoFabricacao;
	private String anoModelo;
	private String chassi;
	private String dataCadastro;	
	private String dataDesativacao;
	private String modelo;
	private String cor;
	private double consumoMedioKm;
	private int quantidadePassageiros;
 
	public Veiculo(){}

	public Veiculo(int idVeiculo, String placa, String ativo, String anoFabricacao, String anoModelo, String chassi,
			String dataCadastro, String dataDesativacao, String modelo, String cor, double consumoMedioKm,
			int quantidadePassageiros) {
		super();
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.ativo = ativo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.chassi = chassi;
		this.dataCadastro = dataCadastro;
		this.dataDesativacao = dataDesativacao;
		this.modelo = modelo;
		this.cor = cor;
		this.consumoMedioKm = consumoMedioKm;
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(String dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getConsumoMedioKm() {
		return consumoMedioKm;
	}

	public void setConsumoMedioKm(double consumoMedioKm) {
		this.consumoMedioKm = consumoMedioKm;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}
}
