package com.uce.edu.repository;


import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioRepository {
	
	public Propietario selecccionar(Integer Id);
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void eliminar(Integer id);

}
