package br.com.api.cadmais.repository;

import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.api.cadmais.repository.entity.FuncionarioEntity;

public class FuncionarioRepository {
	private final EntityManagerFactory entityManagerFactory;
	private final EntityManager entityManager;
 
	public FuncionarioRepository(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_db_estudo");
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	public void salvar(FuncionarioEntity funcionarioEntity){
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(funcionarioEntity);
		this.entityManager.getTransaction().commit();
	}
 
	public void alterar(FuncionarioEntity funcionarioEntity){
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(funcionarioEntity);
		this.entityManager.getTransaction().commit();
	}
 
	@SuppressWarnings("unchecked")
	public List<FuncionarioEntity> listar(){
		return this.entityManager.createQuery("SELECT f FROM FuncionarioEntity f ORDER BY f.nome ASC").getResultList();
	}
 
	public FuncionarioEntity getFuncionario(Integer idFuncionario){
		return this.entityManager.find(FuncionarioEntity.class, idFuncionario);
	}
 
	public void excluir(Integer idFuncionario){
		FuncionarioEntity funcionario = this.getFuncionario(idFuncionario);
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(funcionario);
		this.entityManager.getTransaction().commit();
	}
}
