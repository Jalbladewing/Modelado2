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
@Table(name="Movil")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ModalidadID", referencedColumnName="ID")
public class Movil extends bd.Modalidad implements Serializable {
	public Movil() {
	}
	
	@Column(name="ConsumoActual", nullable=false)	
	private double consumoActual;
	
	@Column(name="ConsumoMax", nullable=false)	
	private double consumoMax;
	
	public void setConsumoActual(double value) {
		this.consumoActual = value;
	}
	
	public double getConsumoActual() {
		return consumoActual;
	}
	
	public void setConsumoMax(double value) {
		this.consumoMax = value;
	}
	
	public double getConsumoMax() {
		return consumoMax;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
