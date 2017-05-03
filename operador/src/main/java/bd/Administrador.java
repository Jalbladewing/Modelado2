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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioID", referencedColumnName="ID")
public class Administrador extends bd.Usuario implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd.ORMConstants.KEY_ADMINISTRADOR_CLIENTE) {
			return ORM_cliente;
		}
		else if (key == bd.ORMConstants.KEY_ADMINISTRADOR_MODALIDADDESTACADA) {
			return ORM_modalidadDestacada;
		}
		else if (key == bd.ORMConstants.KEY_ADMINISTRADOR_COMERCIAL) {
			return ORM_comercial;
		}
		else if (key == bd.ORMConstants.KEY_ADMINISTRADOR_INCIDENCIA) {
			return ORM_incidencia;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="administrador", targetEntity=bd.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=bd.Modalidad.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_modalidadDestacada = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=bd.Comercial.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comercial = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=bd.Incidencia_administrador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incidencia = new java.util.HashSet();
	
	private void setORM_Cliente(java.util.Set value) {
		this.ORM_cliente = value;
	}
	
	private java.util.Set getORM_Cliente() {
		return ORM_cliente;
	}
	
	@Transient	
	public final bd.ClienteSetCollection cliente = new bd.ClienteSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_ADMINISTRADOR_CLIENTE, bd.ORMConstants.KEY_CLIENTE_ADMINISTRADOR, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ModalidadDestacada(java.util.Set value) {
		this.ORM_modalidadDestacada = value;
	}
	
	private java.util.Set getORM_ModalidadDestacada() {
		return ORM_modalidadDestacada;
	}
	
	@Transient	
	public final bd.ModalidadSetCollection modalidadDestacada = new bd.ModalidadSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_ADMINISTRADOR_MODALIDADDESTACADA, bd.ORMConstants.KEY_MODALIDAD_ADMINISTRADOR, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comercial(java.util.Set value) {
		this.ORM_comercial = value;
	}
	
	private java.util.Set getORM_Comercial() {
		return ORM_comercial;
	}
	
	@Transient	
	public final bd.ComercialSetCollection comercial = new bd.ComercialSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_ADMINISTRADOR_COMERCIAL, bd.ORMConstants.KEY_COMERCIAL_ADMINISTRADOR, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Incidencia(java.util.Set value) {
		this.ORM_incidencia = value;
	}
	
	private java.util.Set getORM_Incidencia() {
		return ORM_incidencia;
	}
	
	@Transient	
	public final bd.Incidencia_administradorSetCollection incidencia = new bd.Incidencia_administradorSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_ADMINISTRADOR_INCIDENCIA, bd.ORMConstants.KEY_INCIDENCIA_ADMINISTRADOR_ADMINISTRADOR, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
