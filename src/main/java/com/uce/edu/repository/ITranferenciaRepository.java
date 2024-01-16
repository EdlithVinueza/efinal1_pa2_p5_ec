package com.uce.edu.repository;


import org.hibernate.mapping.List;


import com.uce.edu.repository.modelo.Transferencia;

public interface ITranferenciaRepository {
	
	public Transferencia selecccionar(Integer Id);
	public void insertar(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
	public void eliminar(Integer id);
	public java.util.List<Transferencia>seleccionarTodasTranferencias();

}
