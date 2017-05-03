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
@Table(name="Comercial")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioID", referencedColumnName="ID")
public class Comercial extends bd.Usuario implements Serializable {
	public Comercial() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd.ORMConstants.KEY_COMERCIAL_INCIDENCIA) {
			return ORM_incidencia;
		}
		else if (key == bd.ORMConstants.KEY_COMERCIAL_CLIENTE) {
			return ORM_cliente;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd.ORMConstants.KEY_COMERCIAL_ADMINISTRADOR) {
			this.administrador = (bd.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=bd.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AdministradorUsuarioID", referencedColumnName="UsuarioID", nullable=false) })	
	private bd.Administrador administrador;
	
	@OneToMany(mappedBy="comercial", targetEntity=bd.Incidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incidencia = new java.util.HashSet();
	
	@ManyToMany(targetEntity=bd.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cliente_Comercial", joinColumns={ @JoinColumn(name="ComercialUsuarioID") }, inverseJoinColumns={ @JoinColumn(name="ClienteUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	private void setORM_Incidencia(java.util.Set value) {
		this.ORM_incidencia = value;
	}
	
	private java.util.Set getORM_Incidencia() {
		return ORM_incidencia;
	}
	
	@Transient	
	public final bd.IncidenciaSetCollection incidencia = new bd.IncidenciaSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_COMERCIAL_INCIDENCIA, bd.ORMConstants.KEY_INCIDENCIA_COMERCIAL, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Cliente(java.util.Set value) {
		this.ORM_cliente = value;
	}
	
	private java.util.Set getORM_Cliente() {
		return ORM_cliente;
	}
	
	@Transient	
	public final bd.ClienteSetCollection cliente = new bd.ClienteSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_COMERCIAL_CLIENTE, bd.ORMConstants.KEY_CLIENTE_COMERCIAL, bd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrador(bd.Administrador value) {
		if (administrador != null) {
			administrador.comercial.remove(this);
		}
		if (value != null) {
			value.comercial.add(this);
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
