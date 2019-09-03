package br.com.api.cadmais.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="veiculo")
public class VeiculoEntity {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_veiculo")
	private Integer idVeiculo;
 
	@Column(name="placa")	
	private String placa;
 
	@Column(name="ativo")
	private String ativo;
 
	@Column(name="ano_fabricacao")	
	private String anoFabricacao;
 
	@Column(name="ano_modelo")
	private String anoModelo;
	
	@Column(name="chassi")	
	private String chassi;
 
	@Column(name="data_cadastro")
	private Date dataCadastro;
	
	@Column(name="data_desativacao")	
	private Date dataDesativacao;
 
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="cor")	
	private String cor;
 
	@Column(name="consumo_medio_km")
	private Double consumoMedioKm;
	
	@Column(name="quantidade_passageiros")
	private Integer quantidadePassageiros;

	public Integer getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Integer idVeiculo) {
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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(Date dataDesativacao) {
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

	public Double getConsumoMedioKm() {
		return consumoMedioKm;
	}

	public void setConsumoMedioKm(Double consumoMedioKm) {
		this.consumoMedioKm = consumoMedioKm;
	}

	public Integer getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(Integer quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	} 
}
