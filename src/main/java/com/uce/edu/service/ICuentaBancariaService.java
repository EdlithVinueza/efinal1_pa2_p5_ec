package com.uce.edu.service;
import java.math.BigDecimal;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public CuentaBancaria buscar(Integer Id);
	public void guardar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	public CuentaBancaria buscarPorNumero(String numero);
	

}
