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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="BD_USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BD_USUARIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nombre", nullable=false, length=255)	
	private String nombre;
	
	@Column(name="Apellidos", nullable=false, length=255)	
	private String apellidos;
	
	@Column(name="Direccion", nullable=false, length=255)	
	private String direccion;
	
	@Column(name="Telefono", nullable=false, length=255)	
	private String telefono;
	
	@Column(name="Email", nullable=false, length=255)	
	private String email;
	
	@Column(name="Nif", nullable=false, length=255)	
	private String nif;
	
	@Column(name="Password", nullable=false, length=255)	
	private String password;
	
	@Column(name="FechaEliminacion", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaEliminacion;
	
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
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNif(String value) {
		this.nif = value;
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFechaEliminacion(java.util.Date value) {
		this.fechaEliminacion = value;
	}
	
	public java.util.Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
