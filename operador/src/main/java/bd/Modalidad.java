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
@Table(name="Modalidad")
@Inheritance(strategy=InheritanceType.JOINED)
public class Modalidad implements Serializable {
	public Modalidad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd.ORMConstants.KEY_MODALIDAD_OFERTA) {
			return ORM_oferta;
		}
		else if (key == bd.ORMConstants.KEY_MODALIDAD_CONTRATOS) {
			return ORM_contratos;
		}
		else if (key == bd.ORMConstants.KEY_MODALIDAD_FACTURA) {
			return ORM_factura;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd.ORMConstants.KEY_MODALIDAD_ADMINISTRADOR) {
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
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="BD_MODALIDAD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_MODALIDAD_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=bd.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AdministradorUsuarioID", referencedColumnName="UsuarioID", nullable=false) })	
	private bd.Administrador administrador;
	
	@Column(name="Nombre", nullable=false, length=255)	
	private String nombre;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Visibilidad", nullable=false, length=1)	
	private boolean visibilidad;
	
	@Column(name="Tipo", nullable=false, length=255)	
	private String tipo;
	
	@Column(name="FechaEliminacion", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaEliminacion;
	
	@ManyToMany(targetEntity=bd.Oferta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Oferta_Modalidad", joinColumns={ @JoinColumn(name="ModalidadID") }, inverseJoinColumns={ @JoinColumn(name="OfertaModalidadID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_oferta = new java.util.HashSet();
	
	@OneToMany(mappedBy="modalidad", targetEntity=bd.contrato.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contratos = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_modalidad", targetEntity=bd.Factura.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_factura = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCaracteristicas(String value) {
		this.caracteristicas = value;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setPrecio(double value) {
		this.precio = value;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setVisibilidad(boolean value) {
		this.visibilidad = value;
	}
	
	public boolean getVisibilidad() {
		return visibilidad;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setFechaEliminacion(java.util.Date value) {
		this.fechaEliminacion = value;
	}
	
	public java.util.Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	
	private void setORM_Oferta(java.util.Set value) {
		this.ORM_oferta = value;
	}
	
	private java.util.Set getORM_Oferta() {
		return ORM_oferta;
	}
	
	@Transient	
	public final bd.OfertaSetCollection oferta = new bd.OfertaSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_MODALIDAD_OFERTA, bd.ORMConstants.KEY_OFERTA_MODALIDAD, bd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public bd.Cliente[] getClientes() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = contratos.getIterator();lIter.hasNext();) {
			lValues.add(((bd.contrato)lIter.next()).getCliente());
		}
		return (bd.Cliente[])lValues.toArray(new bd.Cliente[lValues.size()]);
	}
	
	public void removeCliente(bd.Cliente aCliente) {
		bd.contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getCliente().equals(aCliente)) {
				contratos.remove(lContratos[i]);
			}
		}
	}
	
	public void addCliente(bd.contrato aContrato, bd.Cliente aCliente) {
		aContrato.setCliente(aCliente);
		contratos.add(aContrato);
	}
	
	public bd.contrato getContratoByCliente(bd.Cliente aCliente) {
		bd.contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getCliente().equals(aCliente)) {
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
	public final bd.contratoSetCollection contratos = new bd.contratoSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_MODALIDAD_CONTRATOS, bd.ORMConstants.KEY_CONTRATO_MODALIDAD, bd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Factura(java.util.Set value) {
		this.ORM_factura = value;
	}
	
	private java.util.Set getORM_Factura() {
		return ORM_factura;
	}
	
	@Transient	
	public final bd.FacturaSetCollection factura = new bd.FacturaSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_MODALIDAD_FACTURA, bd.ORMConstants.KEY_FACTURA_MODALIDAD, bd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrador(bd.Administrador value) {
		if (administrador != null) {
			administrador.modalidadDestacada.remove(this);
		}
		if (value != null) {
			value.modalidadDestacada.add(this);
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
		return String.valueOf(getID());
	}
	
}
