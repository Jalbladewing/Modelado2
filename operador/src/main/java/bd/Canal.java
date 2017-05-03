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
@Table(name="Canal")
@Inheritance(strategy=InheritanceType.JOINED)
public class Canal extends bd.Television implements Serializable {
	public Canal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd.ORMConstants.KEY_CANAL_PAQUETE) {
			return ORM_paquete;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(targetEntity=bd.Paquete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Paquete_Canal", joinColumns={ @JoinColumn(name="CanalModalidadID") }, inverseJoinColumns={ @JoinColumn(name="PaqueteModalidadID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_paquete = new java.util.HashSet();
	
	private void setORM_Paquete(java.util.Set value) {
		this.ORM_paquete = value;
	}
	
	private java.util.Set getORM_Paquete() {
		return ORM_paquete;
	}
	
	@Transient	
	public final bd.PaqueteSetCollection paquete = new bd.PaqueteSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_CANAL_PAQUETE, bd.ORMConstants.KEY_PAQUETE_MODALIDAD, bd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
