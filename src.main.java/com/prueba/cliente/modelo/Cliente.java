package com.prueba.cliente.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigocliente;
	private String tipodocumento;
	private String numerodocumento;
	private String nombresyapellidos;
	private Date fechanacimiento;
	
	
	public Long getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(Long codigocliente) {
		this.codigocliente = codigocliente;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	public String getNombresyapellidos() {
		return nombresyapellidos;
	}
	public void setNombresyapellidos(String nombresyapellidos) {
		this.nombresyapellidos = nombresyapellidos;
	}
	public Date getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	

}
