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
@Table(name="Cliente")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioID", referencedColumnName="ID")
public class Cliente extends bd.Usuario implements Serializable {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd.ORMConstants.KEY_CLIENTE_CONTRATOS) {
			return ORM_contratos;
		}
		else if (key == bd.ORMConstants.KEY_CLIENTE_FACTURA) {
			return ORM_factura;
		}
		else if (key == bd.ORMConstants.KEY_CLIENTE_INCIDENCIA) {
			return ORM_incidencia;
		}
		else if (key == bd.ORMConstants.KEY_CLIENTE_COMERCIAL) {
			return ORM_comercial;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd.ORMConstants.KEY_CLIENTE_ADMINISTRADOR) {
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
	
	@OneToMany(mappedBy="cliente", targetEntity=bd.contrato.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contratos = new java.util.HashSet();
	
	@OneToMany(mappedBy="cliente", targetEntity=bd.Factura.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_factura = new java.util.HashSet();
	
	@OneToMany(mappedBy="cliente", targetEntity=bd.Incidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incidencia = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cliente", targetEntity=bd.Comercial.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comercial = new java.util.HashSet();
	
	public bd.Modalidad[] getModalidads() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = contratos.getIterator();lIter.hasNext();) {
			lValues.add(((bd.contrato)lIter.next()).getModalidad());
		}
		return (bd.Modalidad[])lValues.toArray(new bd.Modalidad[lValues.size()]);
	}
	
	public void removeModalidad(bd.Modalidad aModalidad) {
		bd.contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getModalidad().equals(aModalidad)) {
				contratos.remove(lContratos[i]);
			}
		}
	}
	
	public void addModalidad(bd.contrato aContrato, bd.Modalidad aModalidad) {
		aContrato.setModalidad(aModalidad);
		contratos.add(aContrato);
	}
	
	public bd.contrato getContratoByModalidad(bd.Modalidad aModalidad) {
		bd.contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getModalidad().equals(aModalidad)) {
				return lContratos[i];
			}
		}
		return null;
	}
	
	private void setORM_Contratos(java.util.Set value) {
		this.ORM_contratos = value;
	}
	
	private java.util.Set getORM_Contratos() {
		return ORM_contratos;
	}
	
	@Transient	
	public final bd.contratoSetCollection contratos = new bd.contratoSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_CLIENTE_CONTRATOS, bd.ORMConstants.KEY_CONTRATO_CLIENTE, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Factura(java.util.Set value) {
		this.ORM_factura = value;
	}
	
	private java.util.Set getORM_Factura() {
		return ORM_factura;
	}
	
	@Transient	
	public final bd.FacturaSetCollection factura = new bd.FacturaSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_CLIENTE_FACTURA, bd.ORMConstants.KEY_FACTURA_CLIENTE, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Incidencia(java.util.Set value) {
		this.ORM_incidencia = value;
	}
	
	private java.util.Set getORM_Incidencia() {
		return ORM_incidencia;
	}
	
	@Transient	
	public final bd.IncidenciaSetCollection incidencia = new bd.IncidenciaSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_CLIENTE_INCIDENCIA, bd.ORMConstants.KEY_INCIDENCIA_CLIENTE, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comercial(java.util.Set value) {
		this.ORM_comercial = value;
	}
	
	private java.util.Set getORM_Comercial() {
		return ORM_comercial;
	}
	
	@Transient	
	public final bd.ComercialSetCollection comercial = new bd.ComercialSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_CLIENTE_COMERCIAL, bd.ORMConstants.KEY_COMERCIAL_CLIENTE, bd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrador(bd.Administrador value) {
		if (administrador != null) {
			administrador.cliente.remove(this);
		}
		if (value != null) {
			value.cliente.add(this);
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
