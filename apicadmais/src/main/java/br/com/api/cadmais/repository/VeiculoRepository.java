package br.com.api.cadmais.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.api.cadmais.repository.entity.VeiculoEntity;;

public class VeiculoRepository {
	private final EntityManagerFactory entityManagerFactory;
	private final EntityManager entityManager;
 
	public VeiculoRepository(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_db_estudo");
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	public void salvar(VeiculoEntity veiculoEntity){
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(veiculoEntity);
		this.entityManager.getTransaction().commit();
	}
 
	public void alterar(VeiculoEntity veiculoEntity){
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(veiculoEntity);
		this.entityManager.getTransaction().commit();
	}
 
	@SuppressWarnings("unchecked")
	public List<VeiculoEntity> listar(){
		return this.entityManager.createQuery("SELECT v FROM VeiculoEntity v ORDER BY v.modelo ASC").getResultList();
	}
 
	public VeiculoEntity getVeiculo(Integer idVeiculo){
		return this.entityManager.find(VeiculoEntity.class, idVeiculo);
	}
 
	public void excluir(Integer idVeiculo){
		VeiculoEntity veiculo = this.getVeiculo(idVeiculo);
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(veiculo);
		this.entityManager.getTransaction().commit();
	}
}
