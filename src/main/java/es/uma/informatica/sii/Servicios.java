package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Servicios
 *
 */
@Entity

public class Servicios implements Serializable {

	@Id @GeneratedValue
	private Long codigoServicio;
	private String tipoServicio;
	private String nombre;
	private String descripcion;
	private Integer numParticipantes;
	private Integer numHoras;
	private String zona;
	
	@ManyToOne
	@JoinColumn(name = "ONG")
	private Ong ong;
	
	private static final long serialVersionUID = 1L;

	public Servicios() {
		super();
	}   
	public Long getCodigoServicio() {
		return this.codigoServicio;
	}

	public void setCodigoServicio(Long codigoServicio) {
		this.codigoServicio = codigoServicio;
	}   
	public String getTipoServicio() {
		return this.tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}   
	public Integer getNumParticipantes() {
		return this.numParticipantes;
	}

	public void setNumParticipantes(Integer numParticipantes) {
		this.numParticipantes = numParticipantes;
	}   
	public Integer getNumHoras() {
		return this.numHoras;
	}

	public void setNumHoras(Integer numHoras) {
		this.numHoras = numHoras;
	}   
	public String getZona() {
		return this.zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	public Ong getOng() {
		return ong;
	}
	public void setOng(Ong ong) {
		this.ong = ong;
	}
   
}
