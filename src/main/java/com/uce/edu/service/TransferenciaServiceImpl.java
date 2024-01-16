package com.uce.edu.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

public class TransferenciaServiceImpl implements ITransferenciaService {
	
	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;


	@Override
	public Transferencia Buscar(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Transferencia> seleccionarTodasTranferencias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void realizarTranferencia(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaOrige = this.iCuentaBancariaRepository.seleccionarPorNumero(numeroCuentaOrigen);
		CuentaBancaria cuentaDestino = this.iCuentaBancariaRepository.seleccionarPorNumero(numeroCuentaDestino);

		// Actualizamos el monto de la cuenta orige

		BigDecimal saldoCuentaOrige = cuentaOrige.getSaldo();

		BigDecimal comision = monto.multiply(new BigDecimal(0.1)); // comission

		BigDecimal saldoResta = monto.subtract(comision); // monto - comission

		BigDecimal nuevoSaldoOrige = saldoCuentaOrige.subtract(saldoResta); // nuevo monto

		if (nuevoSaldoOrige.compareTo(new BigDecimal(0)) == -1) {
			System.out.println("Lo sentimos, el saldo de la cuenta " + cuentaOrige.getNumero() + "no es suficiete");
		}

		else {
			cuentaOrige.setSaldo(nuevoSaldoOrige); // acutualizamos el objeto

			this.iCuentaBancariaRepository.actualizar(cuentaDestino); // actualizamos la cuenta Origen

			BigDecimal saldoCuentaDestino = cuentaDestino.getSaldo();

			BigDecimal nuevoSaldoDestino = saldoCuentaDestino.add(monto);

			cuentaDestino.setSaldo(nuevoSaldoDestino);

			this.iCuentaBancariaRepository.actualizar(cuentaDestino); // actualizamos cuenta Destino

			System.out.println("Transaccion Exitosa");
			
			//crear objeto cuenta 
			
		}
		

	}

}
