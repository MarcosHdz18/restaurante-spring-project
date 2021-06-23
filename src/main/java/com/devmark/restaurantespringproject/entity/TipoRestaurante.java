/**
 * 
 */
package com.devmark.restaurantespringproject.entity;

import java.time.LocalDateTime;

/**
 * @author marcos.hernandez
 *
 */
public class TipoRestaurante {
	
	/**
	 * Identificador del Tipo de Restaurante
	 */
	private Long idTipoRestaurante;
	
	/**
	 * Descripcion del Tipo de Restaurante
	 */
	private String descripcion;
	
	/**
	 * Fecha de Creacion del Tipo de Restaurante	
	 */
	private LocalDateTime fechaCreacion;
	
	/**
	 * Fecha de Modificacion del Tipo de Restaurante
	 */
	private LocalDateTime fechaModificacion;
	
	/**
	 * Estatus del Tipo de Restaurante
	 */
	private boolean estatus;

	/**
	 * @return the idTipoRestaurante
	 */
	public Long getIdTipoRestaurante() {
		return idTipoRestaurante;
	}

	/**
	 * @param idTipoRestaurante the idTipoRestaurante to set
	 */
	public void setIdTipoRestaurante(Long idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}
