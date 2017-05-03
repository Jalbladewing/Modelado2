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
@Table(name="contrato")
public class contrato implements Serializable {
	public contrato() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bd.ORMConstants.KEY_CONTRATO_MODALIDAD) {
			this.modalidad = (bd.Modalidad) owner;
		}
		
		else if (key == bd.ORMConstants.KEY_CONTRATO_CLIENTE) {
			this.cliente = (bd.Cliente) owner;
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
	@GeneratedValue(generator="BD_CONTRATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_CONTRATO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Fecha", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@ManyToOne(targetEntity=bd.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteUsuarioID", referencedColumnName="UsuarioID", nullable=false) })	
	private bd.Cliente cliente;
	
	@ManyToOne(targetEntity=bd.Modalidad.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ModalidadID", referencedColumnName="ID", nullable=false) })	
	private bd.Modalidad modalidad;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setModalidad(bd.Modalidad value) {
		if (modalidad != null) {
			modalidad.contratos.remove(this);
		}
		if (value != null) {
			value.contratos.add(this);
		}
	}
	
	public bd.Modalidad getModalidad() {
		return modalidad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Modalidad(bd.Modalidad value) {
		this.modalidad = value;
	}
	
	private bd.Modalidad getORM_Modalidad() {
		return modalidad;
	}
	
	public void setCliente(bd.Cliente value) {
		if (cliente != null) {
			cliente.contratos.remove(this);
		}
		if (value != null) {
			value.contratos.add(this);
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
