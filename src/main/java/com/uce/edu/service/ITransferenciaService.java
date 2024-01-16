package com.uce.edu.service;

import java.math.BigDecimal;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaService {
	
	public Transferencia Buscar(Integer Id);
	public void insertar(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
	public void eliminar(Integer id);
	public java.util.List<Transferencia>seleccionarTodasTranferencias();
	public void realizarTranferencia(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto);

}
