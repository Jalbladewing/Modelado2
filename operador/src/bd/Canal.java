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
@Table(name="Canal")
@Inheritance(strategy=InheritanceType.JOINED)
public class Canal extends bd.Television implements Serializable {
	public Canal() {
	}
	
	public static Canal loadCanalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadCanalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getCanalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadCanalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getCanalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Canal) session.load(bd.Canal.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Canal) session.get(bd.Canal.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Canal) session.load(bd.Canal.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal getCanalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Canal) session.get(bd.Canal.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanal(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryCanal(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanal(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryCanal(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listCanalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listCanalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCanal(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Canal as Canal");
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
	
	public static List queryCanal(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Canal as Canal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Canal", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCanal(session, condition, orderBy);
			return (Canal[]) list.toArray(new Canal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal[] listCanalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCanal(session, condition, orderBy, lockMode);
			return (Canal[]) list.toArray(new Canal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadCanalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadCanalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Canal[] canals = listCanalByQuery(session, condition, orderBy);
		if (canals != null && canals.length > 0)
			return canals[0];
		else
			return null;
	}
	
	public static Canal loadCanalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Canal[] canals = listCanalByQuery(session, condition, orderBy, lockMode);
		if (canals != null && canals.length > 0)
			return canals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCanalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateCanalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCanalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateCanalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCanalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Canal as Canal");
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
	
	public static java.util.Iterator iterateCanalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Canal as Canal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Canal", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Canal loadCanalByCriteria(CanalCriteria canalCriteria) {
		Canal[] canals = listCanalByCriteria(canalCriteria);
		if(canals == null || canals.length == 0) {
			return null;
		}
		return canals[0];
	}
	
	public static Canal[] listCanalByCriteria(CanalCriteria canalCriteria) {
		return canalCriteria.listCanal();
	}
	
	public static Canal createCanal() {
		return new bd.Canal();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			bd.Paquete[] lPaquetes = paquete.toArray();
			for(int i = 0; i < lPaquetes.length; i++) {
				lPaquetes[i].modalidad.remove(this);
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
			bd.Paquete[] lPaquetes = paquete.toArray();
			for(int i = 0; i < lPaquetes.length; i++) {
				lPaquetes[i].modalidad.remove(this);
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
