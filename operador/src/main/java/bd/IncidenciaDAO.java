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

public class IncidenciaDAO {
	public static Incidencia loadIncidenciaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidenciaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getIncidenciaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidenciaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getIncidenciaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Incidencia) session.load(bd.Incidencia.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Incidencia) session.get(bd.Incidencia.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia) session.load(bd.Incidencia.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia) session.get(bd.Incidencia.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryIncidencia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryIncidencia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia as Incidencia");
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
	
	public static List queryIncidencia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia as Incidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryIncidencia(session, condition, orderBy);
			return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryIncidencia(session, condition, orderBy, lockMode);
			return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Incidencia[] incidencias = listIncidenciaByQuery(session, condition, orderBy);
		if (incidencias != null && incidencias.length > 0)
			return incidencias[0];
		else
			return null;
	}
	
	public static Incidencia loadIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Incidencia[] incidencias = listIncidenciaByQuery(session, condition, orderBy, lockMode);
		if (incidencias != null && incidencias.length > 0)
			return incidencias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia as Incidencia");
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
	
	public static java.util.Iterator iterateIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Incidencia as Incidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia createIncidencia() {
		return new bd.Incidencia();
	}
	
	public static boolean save(bd.Incidencia incidencia) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().saveObject(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd.Incidencia incidencia) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().deleteObject(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Incidencia incidencia)throws PersistentException {
		if (incidencia instanceof bd.Incidencia_administrador) {
			return bd.Incidencia_administradorDAO.deleteAndDissociate((bd.Incidencia_administrador) incidencia);
		}
		
		try {
			if (incidencia.getCliente() != null) {
				incidencia.getCliente().incidencia.remove(incidencia);
			}
			
			if (incidencia.getComercial() != null) {
				incidencia.getComercial().incidencia.remove(incidencia);
			}
			
			return delete(incidencia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Incidencia incidencia, org.orm.PersistentSession session)throws PersistentException {
		if (incidencia instanceof bd.Incidencia_administrador) {
			return bd.Incidencia_administradorDAO.deleteAndDissociate((bd.Incidencia_administrador) incidencia, session);
		}
		
		try {
			if (incidencia.getCliente() != null) {
				incidencia.getCliente().incidencia.remove(incidencia);
			}
			
			if (incidencia.getComercial() != null) {
				incidencia.getComercial().incidencia.remove(incidencia);
			}
			
			try {
				session.delete(incidencia);
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
	
	public static boolean refresh(bd.Incidencia incidencia) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().refresh(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd.Incidencia incidencia) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().evict(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByCriteria(IncidenciaCriteria incidenciaCriteria) {
		Incidencia[] incidencias = listIncidenciaByCriteria(incidenciaCriteria);
		if(incidencias == null || incidencias.length == 0) {
			return null;
		}
		return incidencias[0];
	}
	
	public static Incidencia[] listIncidenciaByCriteria(IncidenciaCriteria incidenciaCriteria) {
		return incidenciaCriteria.listIncidencia();
	}
}
