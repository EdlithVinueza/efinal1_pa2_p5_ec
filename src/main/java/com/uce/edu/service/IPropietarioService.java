package com.uce.edu.service;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioService {
	
	public Propietario buscar(Integer Id);
	public void guardar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void borrar(Integer id);

}
