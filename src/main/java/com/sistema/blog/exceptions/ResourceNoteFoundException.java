package com.sistema.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNoteFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2241845383667580104L;

	private String nombreRecurso;
	private String nombreCampo;
	private long valorCampo;
	
	
	
	
	
	public ResourceNoteFoundException(String nombreRecurso, String nombreCampo, long valorCampo) {
		super(String.format("%s no encontrada con : %s : '%s'", nombreRecurso, nombreCampo, valorCampo ));
		this.nombreRecurso = nombreRecurso;
		this.nombreCampo = nombreCampo;
		this.valorCampo = valorCampo;
	}





	public String getNombreRecurso() {
		return nombreRecurso;
	}





	public void setNombreRecurso(String nombreRecurso) {
		this.nombreRecurso = nombreRecurso;
	}





	public String getNombreCampo() {
		return nombreCampo;
	}





	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}





	public long getValorCampo() {
		return valorCampo;
	}





	public void setValorCampo(long valorCampo) {
		this.valorCampo = valorCampo;
	}
	
	
	
}
