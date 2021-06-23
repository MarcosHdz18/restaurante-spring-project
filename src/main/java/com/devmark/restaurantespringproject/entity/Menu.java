/**
 * 
 */
package com.devmark.restaurantespringproject.entity;

import java.time.LocalDateTime;

/**
 * @author marcos.hernandez
 *
 */
public class Menu {
	
	/**
	 * Identificador del Menu
	 */
	private Long idMenu;
	
	/**
	 * Clave del Menu	
	 */
	private String clave;
	
	/**
	 * Descripcion del Menu	
	 */
	private String descripcion;
	
	/**
	 * Fecha de Creacion del Menu
	 */
	private LocalDateTime fechaCreacion;
	
	/**
	 * Fecha de Modificacion del Menu
	 */
	private LocalDateTime fechaModificacion;
	
	/**
	 * Estatus del Menu
	 */
	private boolean estatus;

	/**
	 * @return the idMenu
	 */
	public Long getIdMenu() {
		return idMenu;
	}

	/**
	 * @param idMenu the idMenu to set
	 */
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
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
