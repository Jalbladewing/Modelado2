/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package bd;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Incidencia")
@Inheritance(strategy=InheritanceType.JOINED)
public class Incidencia implements Serializable {
	public Incidencia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd.ORMConstants.KEY_INCIDENCIA_CLIENTE) {
			this.cliente = (bd.Cliente) owner;
		}
		
		else if (key == bd.ORMConstants.KEY_INCIDENCIA_COMERCIAL) {
			this.comercial = (bd.Comercial) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="BD_INCIDENCIA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_INCIDENCIA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=bd.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteUsuarioID", referencedColumnName="UsuarioID", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd.Cliente cliente;
	
	@ManyToOne(targetEntity=bd.Comercial.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ComercialUsuarioID", referencedColumnName="UsuarioID") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd.Comercial comercial;
	
	@Column(name="CorreoCliente", nullable=false, length=255)	
	private String correoCliente;
	
	@Column(name="Asunto", nullable=false, length=255)	
	private String asunto;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Observacion", nullable=true, length=255)	
	private String observacion;
	
	@Column(name="TipoIncidencia", nullable=true, length=255)	
	private String tipoIncidencia;
	
	@Column(name="Estado", nullable=true, length=255)	
	private String estado;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCorreoCliente(String value) {
		this.correoCliente = value;
	}
	
	public String getCorreoCliente() {
		return correoCliente;
	}
	
	public void setAsunto(String value) {
		this.asunto = value;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setObservacion(String value) {
		this.observacion = value;
	}
	
	public String getObservacion() {
		return observacion;
	}
	
	public void setTipoIncidencia(String value) {
		this.tipoIncidencia = value;
	}
	
	public String getTipoIncidencia() {
		return tipoIncidencia;
	}
	
	public void setEstado(String value) {
		this.estado = value;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setCliente(bd.Cliente value) {
		if (cliente != null) {
			cliente.incidencia.remove(this);
		}
		if (value != null) {
			value.incidencia.add(this);
		}
	}
	
	public bd.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(bd.Cliente value) {
		this.cliente = value;
	}
	
	private bd.Cliente getORM_Cliente() {
		return cliente;
	}
	
	public void setComercial(bd.Comercial value) {
		if (comercial != null) {
			comercial.incidencia.remove(this);
		}
		if (value != null) {
			value.incidencia.add(this);
		}
	}
	
	public bd.Comercial getComercial() {
		return comercial;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comercial(bd.Comercial value) {
		this.comercial = value;
	}
	
	private bd.Comercial getORM_Comercial() {
		return comercial;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
