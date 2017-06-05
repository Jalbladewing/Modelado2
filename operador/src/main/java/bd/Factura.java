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
@Table(name="Factura")
public class Factura implements Serializable {
	public Factura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd.ORMConstants.KEY_FACTURA_MODALIDAD) {
			return ORM_modalidad;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd.ORMConstants.KEY_FACTURA_CLIENTE) {
			this.cliente = (bd.Cliente) owner;
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
	@GeneratedValue(generator="BD_FACTURA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_FACTURA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=bd.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteUsuarioID", referencedColumnName="UsuarioID", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private bd.Cliente cliente;
	
	@Column(name="Nombre", nullable=false, length=255)	
	private String nombre;
	
	@Column(name="Fecha", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@Column(name="NombreCliente", nullable=false, length=255)	
	private String nombreCliente;
	
	@Column(name="ApellidosCliente", nullable=false, length=255)	
	private String apellidosCliente;
	
	@Column(name="NifCliente", nullable=false, length=255)	
	private String nifCliente;
	
	@Column(name="DireccionCliente", nullable=false, length=255)	
	private String direccionCliente;
	
	@Column(name="TelefonoCliente", nullable=false, length=255)	
	private String telefonoCliente;
	
	@Column(name="PrecioTotal", nullable=false)	
	private double precioTotal;
	
	@ManyToMany(targetEntity=bd.Modalidad.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Modalidad_Factura", joinColumns={ @JoinColumn(name="FacturaID") }, inverseJoinColumns={ @JoinColumn(name="ModalidadID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_modalidad = new java.util.HashSet();
	
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
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setNombreCliente(String value) {
		this.nombreCliente = value;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public void setApellidosCliente(String value) {
		this.apellidosCliente = value;
	}
	
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	
	public void setNifCliente(String value) {
		this.nifCliente = value;
	}
	
	public String getNifCliente() {
		return nifCliente;
	}
	
	public void setDireccionCliente(String value) {
		this.direccionCliente = value;
	}
	
	public String getDireccionCliente() {
		return direccionCliente;
	}
	
	public void setTelefonoCliente(String value) {
		this.telefonoCliente = value;
	}
	
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	
	public void setPrecioTotal(double value) {
		this.precioTotal = value;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	private void setORM_Modalidad(java.util.Set value) {
		this.ORM_modalidad = value;
	}
	
	private java.util.Set getORM_Modalidad() {
		return ORM_modalidad;
	}
	
	@Transient	
	public final bd.ModalidadSetCollection modalidad = new bd.ModalidadSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_FACTURA_MODALIDAD, bd.ORMConstants.KEY_MODALIDAD_FACTURA, bd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCliente(bd.Cliente value) {
		if (cliente != null) {
			cliente.factura.remove(this);
		}
		if (value != null) {
			value.factura.add(this);
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
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
