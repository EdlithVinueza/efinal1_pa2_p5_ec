package com.uce.edu.repository;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TranferenciaRepositoryImpl implements ITranferenciaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Transferencia selecccionar(Integer Id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, Id);
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);

	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transferencia);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Transferencia transferencia = this.selecccionar(id);
		this.entityManager.remove(transferencia);

	}

	@Override
	public java.util.List<Transferencia>seleccionarTodasTranferencias (){
		// TODO Auto-generated method stub
		TypedQuery<Transferencia> myQuery = this.entityManager.createNamedQuery("Transferencia.buscarPorCosto", Transferencia.class);
		myQuery.setParameter("numero", 0);
		 return  myQuery.getResultList();
	
	}

}
