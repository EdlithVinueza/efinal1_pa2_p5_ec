package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	
	public CuentaBancaria selecccionar(Integer Id);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void eliminar(Integer id);
	public CuentaBancaria seleccionarPorNumero(String numero);

}
