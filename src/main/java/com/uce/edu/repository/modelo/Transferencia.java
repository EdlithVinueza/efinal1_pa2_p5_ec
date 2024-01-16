package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.antlr.v4.runtime.CommonToken;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="tranferencia")
@NamedQuery(name = "Transferencia.buscarPorCosto", query = "SELECT t FROM Transferencia t WHERE t.costo >:costo") ///como toda tranferencia tiene un monto mayor a 0 se encuentran todas 
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transferencia")
	@SequenceGenerator(name = "seq_transferencia", sequenceName = "seq_transferencia", allocationSize = 1)
	@Column(name = "tran_id")
	private Integer id;
	@Column(name = "tran_fecha_nacimiento")
	private LocalDateTime fecha_tranferencia;
	@Column(name = "tran_cuenta_origen")
	private CuentaBancaria cuentaOrige;
	@Column(name = "tran_cuenta_destino")
	private CuentaBancaria cuentaDestino;
	@Column(name = "tran_monto")
	private BigDecimal monto;
	@Column(name = "tran_commision")
	private BigDecimal commision;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha_tranferencia() {
		return fecha_tranferencia;
	}
	public void setFecha_tranferencia(LocalDateTime fecha_tranferencia) {
		this.fecha_tranferencia = fecha_tranferencia;
	}
	public CuentaBancaria getCuentaOrige() {
		return cuentaOrige;
	}
	public void setCuentaOrige(CuentaBancaria cuentaOrige) {
		this.cuentaOrige = cuentaOrige;
	}
	public CuentaBancaria getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(CuentaBancaria cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getCommision() {
		return commision;
	}
	public void setCommision(BigDecimal commision) {
		this.commision = commision;
	}
	@Override
	public String toString() {
		return "Tranferencia [id=" + id + ", fecha_tranferencia=" + fecha_tranferencia + ", cuentaOrige=" + cuentaOrige
				+ ", cuentaDestino=" + cuentaDestino + ", monto=" + monto + ", commision=" + commision + "]";
	}

	
	
	
}
