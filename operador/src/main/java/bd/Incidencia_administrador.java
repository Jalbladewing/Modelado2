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
@Table(name="Incidencia_administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="IncidenciaID", referencedColumnName="ID")
public class Incidencia_administrador extends bd.Incidencia implements Serializable {
	public Incidencia_administrador() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd.ORMConstants.KEY_INCIDENCIA_ADMINISTRADOR_ADMINISTRADOR) {
			this.administrador = (bd.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="CorreoComercial", nullable=false, length=255)	
	private String correoComercial;
	
	@ManyToOne(targetEntity=bd.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AdministradorUsuarioID", referencedColumnName="UsuarioID", nullable=false) })	
	private bd.Administrador administrador;
	
	public void setCorreoComercial(String value) {
		this.correoComercial = value;
	}
	
	public String getCorreoComercial() {
		return correoComercial;
	}
	
	public void setAdministrador(bd.Administrador value) {
		if (administrador != null) {
			administrador.incidencia.remove(this);
		}
		if (value != null) {
			value.incidencia.add(this);
		}
	}
	
	public bd.Administrador getAdministrador() {
		return administrador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Administrador(bd.Administrador value) {
		this.administrador = value;
	}
	
	private bd.Administrador getORM_Administrador() {
		return administrador;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
