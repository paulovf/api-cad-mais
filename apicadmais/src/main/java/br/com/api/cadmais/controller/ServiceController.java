package br.com.api.cadmais.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.api.cadmais.http.Funcionario;
import br.com.api.cadmais.http.Veiculo;
import br.com.api.cadmais.repository.FuncionarioRepository;
import br.com.api.cadmais.repository.VeiculoRepository;
import br.com.api.cadmais.repository.entity.FuncionarioEntity;
import br.com.api.cadmais.repository.entity.VeiculoEntity;

@Path("/api")
@CrossOrigin("*")
public class ServiceController {
	private final FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
	private final VeiculoRepository veiculoRepository = new VeiculoRepository();
 
	@POST
	@Consumes("application/json; charset=utf-8")
	@Produces("application/json; charset=utf-8")
	@Path("/cadastrar_funcionario")
	public String cadastrarFuncionario(Funcionario funcionario){
		FuncionarioEntity entity = new FuncionarioEntity();
		try {
			entity.setCpf(funcionario.getCpf());
			entity.setNome(funcionario.getNome());
			//entity.setDataNascimento(funcionario.getDataNascimento());
			entity.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(
					funcionario.getDataNascimento()));
			entity.setLogin(funcionario.getLogin());
			entity.setSenha(funcionario.getSenha());
 
			funcionarioRepository.salvar(entity);
			return "Registro cadastrado com sucesso!";
		} catch (Exception e) {
			return "Erro ao cadastrar um registro " + e.getMessage();
		}
	}
	
	@POST
	@Consumes("application/json; charset=utf-8")
	@Produces("application/json; charset=utf-8")
	@Path("/cadastrar_veiculo")
	public String cadastrarVeiculo(Veiculo veiculo){
		VeiculoEntity entity = new VeiculoEntity();
		try {
			entity.setPlaca(veiculo.getPlaca());
			entity.setAtivo(veiculo.getAtivo());
			entity.setAnoFabricacao(veiculo.getAnoFabricacao());
			entity.setAnoModelo(veiculo.getAnoModelo());
			entity.setChassi(veiculo.getChassi());
			entity.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse(
					veiculo.getDataCadastro()));
			entity.setDataDesativacao(new SimpleDateFormat("dd/MM/yyyy").parse(
					veiculo.getDataDesativacao()));
			entity.setModelo(veiculo.getModelo());
			entity.setCor(veiculo.getCor());
			entity.setConsumoMedioKm(veiculo.getConsumoMedioKm());
			entity.setQuantidadePassageiros(veiculo.getQuantidadePassageiros());
 
			veiculoRepository.salvar(entity);
			return "Registro cadastrado com sucesso!";
		} catch (Exception e) {
			return "Erro ao cadastrar um registro " + e.getMessage();
		}
	}
 
	@PUT
	@Produces("application/json; charset=utf-8")
	@Consumes("application/json; charset=utf-8")	
	@Path("/alterar_funcionario")
	public String alterarFuncionario(Funcionario funcionario){
		FuncionarioEntity entity = new FuncionarioEntity();
		try {
			entity.setIdFuncionario(funcionario.getIdFuncionario());
			entity.setCpf(funcionario.getCpf());
			entity.setNome(funcionario.getNome());
			//entity.setDataNascimento(funcionario.getDataNascimento());
			entity.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(
					funcionario.getDataNascimento()));
			entity.setLogin(funcionario.getLogin());
			entity.setSenha(funcionario.getSenha());
			funcionarioRepository.alterar(entity);
			return "Registro alterado com sucesso!";
		} catch (Exception e) {
			return "Erro ao alterar o registro " + e.getMessage();
		}
	}
	
	@PUT
	@Produces("application/json; charset=utf-8")
	@Consumes("application/json; charset=utf-8")	
	@Path("/alterar_veiculo")
	public String alterarVeiculo(Veiculo veiculo){
		VeiculoEntity entity = new VeiculoEntity();
		try {
			entity.setPlaca(veiculo.getPlaca());
			entity.setAtivo(veiculo.getAtivo());
			entity.setAnoFabricacao(veiculo.getAnoFabricacao());
			entity.setAnoModelo(veiculo.getAnoModelo());
			entity.setChassi(veiculo.getChassi());
			entity.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse(
					veiculo.getDataCadastro()));
			entity.setDataDesativacao(new SimpleDateFormat("dd/MM/yyyy").parse(
					veiculo.getDataDesativacao()));
			entity.setModelo(veiculo.getModelo());
			entity.setCor(veiculo.getCor());
			entity.setConsumoMedioKm(veiculo.getConsumoMedioKm());
			entity.setQuantidadePassageiros(veiculo.getQuantidadePassageiros());
			veiculoRepository.alterar(entity);
			return "Registro alterado com sucesso!";
		} catch (Exception e) {
			return "Erro ao alterar o registro " + e.getMessage();
		}
	}
	
	@GET
	@Produces("application/json; charset=utf-8")
	@Path("/listar_funcionarios")
	public List<Funcionario> listarFuncionarios(){
		List<Funcionario> funcionarios =  new ArrayList<Funcionario>();
		List<FuncionarioEntity> listaEntityFuncionarios = funcionarioRepository.listar();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for (FuncionarioEntity entity : listaEntityFuncionarios) {
			try {
				funcionarios.add(new Funcionario(entity.getIdFuncionario(), entity.getNome(),
					entity.getCpf(), dateFormat.format(entity.getDataNascimento()), 
					entity.getLogin(), entity.getSenha()));
			}catch(Exception e) {
				funcionarios.add(new Funcionario(entity.getIdFuncionario(), entity.getNome(),
					entity.getCpf(), null, entity.getLogin(), entity.getSenha()));
			}
		}
		return funcionarios;
	}
	
	@GET
	@Produces("application/json; charset=utf-8")
	@Path("/listar_veiculos")
	public List<Veiculo> listarVeiculos(){
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		List<VeiculoEntity> listaEntityVeiculos = veiculoRepository.listar();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for (VeiculoEntity entity : listaEntityVeiculos) {
			try {
				veiculos.add(new Veiculo(entity.getIdVeiculo(), entity.getPlaca(), entity.getAtivo(),
					entity.getAnoFabricacao(), entity.getAnoModelo(), entity.getChassi(), 
					dateFormat.format(entity.getDataCadastro()), 
					dateFormat.format(entity.getDataDesativacao()), entity.getModelo(),
					entity.getCor(), entity.getConsumoMedioKm(), entity.getQuantidadePassageiros()));
			}catch(Exception e) {
				veiculos.add(new Veiculo(entity.getIdVeiculo(), entity.getPlaca(), entity.getAtivo(),
						entity.getAnoFabricacao(), entity.getAnoModelo(), entity.getChassi(), 
						null, null, entity.getModelo(), entity.getCor(), entity.getConsumoMedioKm(), 
						entity.getQuantidadePassageiros()));
			}
		}
		return veiculos;
	}
 
	@GET
	@Produces("application/json; charset=utf-8")
	@Path("/get_funcionario/{id_funcionario}")
	public Funcionario getFuncionario(@PathParam("id_funcionario") Integer idFuncionario){
		FuncionarioEntity entity = funcionarioRepository.getFuncionario(idFuncionario);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if(entity != null) {
			try {
				return new Funcionario(entity.getIdFuncionario(), entity.getNome(),
					entity.getCpf(), dateFormat.format(entity.getDataNascimento()), 
					entity.getLogin(), entity.getSenha());
			}catch(Exception e) {
				return new Funcionario(entity.getIdFuncionario(), entity.getNome(),
						entity.getCpf(), null, 
						entity.getLogin(), entity.getSenha());
			}
		}
		return null;
	}
	
	@GET
	@Produces("application/json; charset=utf-8")
	@Path("/get_veiculo/{id_veiculo}")
	public Veiculo getVeiculo(@PathParam("id_veiculo") Integer idVeiculo){
		VeiculoEntity entity = veiculoRepository.getVeiculo(idVeiculo);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if(entity != null) {
			try {
				return new Veiculo(entity.getIdVeiculo(), entity.getPlaca(), entity.getAtivo(),
					entity.getAnoFabricacao(), entity.getAnoModelo(), entity.getChassi(), 
					dateFormat.format(entity.getDataCadastro()), 
					dateFormat.format(entity.getDataDesativacao()), entity.getModelo(),
					entity.getCor(), entity.getConsumoMedioKm(), entity.getQuantidadePassageiros());
			}catch(Exception e) {
				return new Veiculo(entity.getIdVeiculo(), entity.getPlaca(), entity.getAtivo(),
						entity.getAnoFabricacao(), entity.getAnoModelo(), entity.getChassi(), 
						null, null, entity.getModelo(),
						entity.getCor(), entity.getConsumoMedioKm(), entity.getQuantidadePassageiros());
			}
		}
		return null;
	}
 
	@DELETE
	@Produces("application/json; charset=utf-8")
	@Path("/excluir_funcionario/{id_funcionario}")	
	public String excluirFuncionario(@PathParam("id_funcionario") Integer idFuncionario){
		try {
			funcionarioRepository.excluir(idFuncionario);
			return "Registro excluido com sucesso!";
		} catch (Exception e) {
			return "Erro ao excluir o registro! " + e.getMessage();
		}
	}
 
	@DELETE
	@Produces("application/json; charset=utf-8")
	@Path("/excluir_veiculo/{id_veiculo}")	
	public String excluirVeiculo(@PathParam("id_veiculo") Integer idVeiculo){
		try {
			veiculoRepository.excluir(idVeiculo);
			return "Registro excluido com sucesso!";
		} catch (Exception e) {
			return "Erro ao excluir o registro! " + e.getMessage();
		}
	}
}
