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

public class TelevisionDAO {
	public static Television loadTelevisionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadTelevisionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television getTelevisionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getTelevisionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television loadTelevisionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadTelevisionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television getTelevisionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getTelevisionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television loadTelevisionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Television) session.load(bd.Television.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television getTelevisionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Television) session.get(bd.Television.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television loadTelevisionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Television) session.load(bd.Television.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television getTelevisionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Television) session.get(bd.Television.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTelevision(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryTelevision(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTelevision(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryTelevision(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television[] listTelevisionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listTelevisionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television[] listTelevisionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listTelevisionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTelevision(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Television as Television");
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
	
	public static List queryTelevision(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Television as Television");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Television", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television[] listTelevisionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTelevision(session, condition, orderBy);
			return (Television[]) list.toArray(new Television[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television[] listTelevisionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTelevision(session, condition, orderBy, lockMode);
			return (Television[]) list.toArray(new Television[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television loadTelevisionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadTelevisionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television loadTelevisionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadTelevisionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television loadTelevisionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Television[] televisions = listTelevisionByQuery(session, condition, orderBy);
		if (televisions != null && televisions.length > 0)
			return televisions[0];
		else
			return null;
	}
	
	public static Television loadTelevisionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Television[] televisions = listTelevisionByQuery(session, condition, orderBy, lockMode);
		if (televisions != null && televisions.length > 0)
			return televisions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTelevisionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateTelevisionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTelevisionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateTelevisionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTelevisionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Television as Television");
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
	
	public static java.util.Iterator iterateTelevisionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Television as Television");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Television", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television createTelevision() {
		return new bd.Television();
	}
	
	public static boolean save(bd.Television television) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().saveObject(television);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd.Television television) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().deleteObject(television);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Television television)throws PersistentException {
		if (television instanceof bd.Canal) {
			return bd.CanalDAO.deleteAndDissociate((bd.Canal) television);
		}
		
		if (television instanceof bd.Paquete) {
			return bd.PaqueteDAO.deleteAndDissociate((bd.Paquete) television);
		}
		
		try {
			if (television.getAdministrador() != null) {
				television.getAdministrador().modalidadDestacada.remove(television);
			}
			
			bd.Oferta[] lOfertas = television.oferta.toArray();
			for(int i = 0; i < lOfertas.length; i++) {
				lOfertas[i].modalidad.remove(television);
			}
			bd.contrato[] lContratoss = television.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setModalidad(null);
			}
			bd.Factura[] lFacturas = television.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].modalidad.remove(television);
			}
			return delete(television);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Television television, org.orm.PersistentSession session)throws PersistentException {
		if (television instanceof bd.Canal) {
			return bd.CanalDAO.deleteAndDissociate((bd.Canal) television, session);
		}
		
		if (television instanceof bd.Paquete) {
			return bd.PaqueteDAO.deleteAndDissociate((bd.Paquete) television, session);
		}
		
		try {
			if (television.getAdministrador() != null) {
				television.getAdministrador().modalidadDestacada.remove(television);
			}
			
			bd.Oferta[] lOfertas = television.oferta.toArray();
			for(int i = 0; i < lOfertas.length; i++) {
				lOfertas[i].modalidad.remove(television);
			}
			bd.contrato[] lContratoss = television.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setModalidad(null);
			}
			bd.Factura[] lFacturas = television.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].modalidad.remove(television);
			}
			try {
				session.delete(television);
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
	
	public static boolean refresh(bd.Television television) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().refresh(television);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd.Television television) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().evict(television);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Television loadTelevisionByCriteria(TelevisionCriteria televisionCriteria) {
		Television[] televisions = listTelevisionByCriteria(televisionCriteria);
		if(televisions == null || televisions.length == 0) {
			return null;
		}
		return televisions[0];
	}
	
	public static Television[] listTelevisionByCriteria(TelevisionCriteria televisionCriteria) {
		return televisionCriteria.listTelevision();
	}
}
