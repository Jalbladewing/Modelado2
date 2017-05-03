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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Paquete")
@Inheritance(strategy=InheritanceType.JOINED)
public class Paquete extends bd.Television implements Serializable {
	public Paquete() {
	}
	
	public static Paquete loadPaqueteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadPaqueteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete getPaqueteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getPaqueteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete loadPaqueteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadPaqueteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete getPaqueteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getPaqueteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete loadPaqueteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Paquete) session.load(bd.Paquete.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete getPaqueteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Paquete) session.get(bd.Paquete.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete loadPaqueteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paquete) session.load(bd.Paquete.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete getPaqueteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paquete) session.get(bd.Paquete.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaquete(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryPaquete(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaquete(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryPaquete(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete[] listPaqueteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listPaqueteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete[] listPaqueteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listPaqueteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaquete(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Paquete as Paquete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaquete(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Paquete as Paquete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paquete", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete[] listPaqueteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaquete(session, condition, orderBy);
			return (Paquete[]) list.toArray(new Paquete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete[] listPaqueteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaquete(session, condition, orderBy, lockMode);
			return (Paquete[]) list.toArray(new Paquete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete loadPaqueteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadPaqueteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete loadPaqueteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadPaqueteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete loadPaqueteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paquete[] paquetes = listPaqueteByQuery(session, condition, orderBy);
		if (paquetes != null && paquetes.length > 0)
			return paquetes[0];
		else
			return null;
	}
	
	public static Paquete loadPaqueteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paquete[] paquetes = listPaqueteByQuery(session, condition, orderBy, lockMode);
		if (paquetes != null && paquetes.length > 0)
			return paquetes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaqueteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iteratePaqueteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaqueteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iteratePaqueteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaqueteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Paquete as Paquete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaqueteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Paquete as Paquete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paquete", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete loadPaqueteByCriteria(PaqueteCriteria paqueteCriteria) {
		Paquete[] paquetes = listPaqueteByCriteria(paqueteCriteria);
		if(paquetes == null || paquetes.length == 0) {
			return null;
		}
		return paquetes[0];
	}
	
	public static Paquete[] listPaqueteByCriteria(PaqueteCriteria paqueteCriteria) {
		return paqueteCriteria.listPaquete();
	}
	
	public static Paquete createPaquete() {
		return new bd.Paquete();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			bd.Canal[] lModalidads = modalidad.toArray();
			for(int i = 0; i < lModalidads.length; i++) {
				lModalidads[i].paquete.remove(this);
			}
			if(getAdministrador() != null) {
				getAdministrador().modalidadDestacada.remove(this);
			}
			
			bd.Oferta[] lOfertas = oferta.toArray();
			for(int i = 0; i < lOfertas.length; i++) {
				lOfertas[i].modalidad.remove(this);
			}
			bd.contrato[] lContratoss = contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setModalidad(null);
			}
			bd.Factura[] lFacturas = factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].modalidad.remove(this);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			bd.Canal[] lModalidads = modalidad.toArray();
			for(int i = 0; i < lModalidads.length; i++) {
				lModalidads[i].paquete.remove(this);
			}
			if(getAdministrador() != null) {
				getAdministrador().modalidadDestacada.remove(this);
			}
			
			bd.Oferta[] lOfertas = oferta.toArray();
			for(int i = 0; i < lOfertas.length; i++) {
				lOfertas[i].modalidad.remove(this);
			}
			bd.contrato[] lContratoss = contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setModalidad(null);
			}
			bd.Factura[] lFacturas = factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].modalidad.remove(this);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bd.ORMConstants.KEY_PAQUETE_MODALIDAD) {
			return ORM_modalidad;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(mappedBy="ORM_paquete", targetEntity=bd.Canal.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_modalidad = new java.util.HashSet();
	
	private void setORM_Modalidad(java.util.Set value) {
		this.ORM_modalidad = value;
	}
	
	private java.util.Set getORM_Modalidad() {
		return ORM_modalidad;
	}
	
	@Transient	
	public final bd.CanalSetCollection modalidad = new bd.CanalSetCollection(this, _ormAdapter, bd.ORMConstants.KEY_PAQUETE_MODALIDAD, bd.ORMConstants.KEY_CANAL_PAQUETE, bd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
