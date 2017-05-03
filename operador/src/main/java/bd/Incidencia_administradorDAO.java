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

public class Incidencia_administradorDAO {
	public static Incidencia_administrador loadIncidencia_administradorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidencia_administradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador getIncidencia_administradorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getIncidencia_administradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidencia_administradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador getIncidencia_administradorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getIncidencia_administradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Incidencia_administrador) session.load(bd.Incidencia_administrador.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador getIncidencia_administradorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Incidencia_administrador) session.get(bd.Incidencia_administrador.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia_administrador) session.load(bd.Incidencia_administrador.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador getIncidencia_administradorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia_administrador) session.get(bd.Incidencia_administrador.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia_administrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryIncidencia_administrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia_administrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryIncidencia_administrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador[] listIncidencia_administradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listIncidencia_administradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador[] listIncidencia_administradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listIncidencia_administradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia_administrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia_administrador as Incidencia_administrador");
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
	
	public static List queryIncidencia_administrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia_administrador as Incidencia_administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia_administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador[] listIncidencia_administradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryIncidencia_administrador(session, condition, orderBy);
			return (Incidencia_administrador[]) list.toArray(new Incidencia_administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador[] listIncidencia_administradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryIncidencia_administrador(session, condition, orderBy, lockMode);
			return (Incidencia_administrador[]) list.toArray(new Incidencia_administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidencia_administradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidencia_administradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Incidencia_administrador[] incidencia_administradors = listIncidencia_administradorByQuery(session, condition, orderBy);
		if (incidencia_administradors != null && incidencia_administradors.length > 0)
			return incidencia_administradors[0];
		else
			return null;
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Incidencia_administrador[] incidencia_administradors = listIncidencia_administradorByQuery(session, condition, orderBy, lockMode);
		if (incidencia_administradors != null && incidencia_administradors.length > 0)
			return incidencia_administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateIncidencia_administradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateIncidencia_administradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidencia_administradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateIncidencia_administradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidencia_administradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia_administrador as Incidencia_administrador");
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
	
	public static java.util.Iterator iterateIncidencia_administradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia_administrador as Incidencia_administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia_administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador createIncidencia_administrador() {
		return new bd.Incidencia_administrador();
	}
	
	public static boolean save(bd.Incidencia_administrador incidencia_administrador) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().saveObject(incidencia_administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd.Incidencia_administrador incidencia_administrador) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().deleteObject(incidencia_administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Incidencia_administrador incidencia_administrador)throws PersistentException {
		try {
			if (incidencia_administrador.getAdministrador() != null) {
				incidencia_administrador.getAdministrador().incidencia.remove(incidencia_administrador);
			}
			
			if (incidencia_administrador.getCliente() != null) {
				incidencia_administrador.getCliente().incidencia.remove(incidencia_administrador);
			}
			
			if (incidencia_administrador.getComercial() != null) {
				incidencia_administrador.getComercial().incidencia.remove(incidencia_administrador);
			}
			
			return delete(incidencia_administrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Incidencia_administrador incidencia_administrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (incidencia_administrador.getAdministrador() != null) {
				incidencia_administrador.getAdministrador().incidencia.remove(incidencia_administrador);
			}
			
			if (incidencia_administrador.getCliente() != null) {
				incidencia_administrador.getCliente().incidencia.remove(incidencia_administrador);
			}
			
			if (incidencia_administrador.getComercial() != null) {
				incidencia_administrador.getComercial().incidencia.remove(incidencia_administrador);
			}
			
			try {
				session.delete(incidencia_administrador);
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
	
	public static boolean refresh(bd.Incidencia_administrador incidencia_administrador) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().refresh(incidencia_administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd.Incidencia_administrador incidencia_administrador) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().evict(incidencia_administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrador loadIncidencia_administradorByCriteria(Incidencia_administradorCriteria incidencia_administradorCriteria) {
		Incidencia_administrador[] incidencia_administradors = listIncidencia_administradorByCriteria(incidencia_administradorCriteria);
		if(incidencia_administradors == null || incidencia_administradors.length == 0) {
			return null;
		}
		return incidencia_administradors[0];
	}
	
	public static Incidencia_administrador[] listIncidencia_administradorByCriteria(Incidencia_administradorCriteria incidencia_administradorCriteria) {
		return incidencia_administradorCriteria.listIncidencia_administrador();
	}
}
