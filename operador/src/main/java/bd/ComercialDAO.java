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

public class ComercialDAO {
	public static Comercial loadComercialByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadComercialByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial getComercialByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getComercialByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial loadComercialByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadComercialByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial getComercialByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getComercialByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial loadComercialByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Comercial) session.load(bd.Comercial.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial getComercialByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Comercial) session.get(bd.Comercial.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial loadComercialByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comercial) session.load(bd.Comercial.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial getComercialByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comercial) session.get(bd.Comercial.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComercial(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryComercial(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComercial(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryComercial(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial[] listComercialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listComercialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial[] listComercialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listComercialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComercial(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Comercial as Comercial");
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
	
	public static List queryComercial(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Comercial as Comercial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comercial", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial[] listComercialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComercial(session, condition, orderBy);
			return (Comercial[]) list.toArray(new Comercial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial[] listComercialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComercial(session, condition, orderBy, lockMode);
			return (Comercial[]) list.toArray(new Comercial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial loadComercialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadComercialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial loadComercialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadComercialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial loadComercialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Comercial[] comercials = listComercialByQuery(session, condition, orderBy);
		if (comercials != null && comercials.length > 0)
			return comercials[0];
		else
			return null;
	}
	
	public static Comercial loadComercialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Comercial[] comercials = listComercialByQuery(session, condition, orderBy, lockMode);
		if (comercials != null && comercials.length > 0)
			return comercials[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateComercialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateComercialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComercialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateComercialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComercialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Comercial as Comercial");
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
	
	public static java.util.Iterator iterateComercialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Comercial as Comercial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comercial", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial createComercial() {
		return new bd.Comercial();
	}
	
	public static boolean save(bd.Comercial comercial) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().saveObject(comercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd.Comercial comercial) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().deleteObject(comercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Comercial comercial)throws PersistentException {
		try {
			if (comercial.getAdministrador() != null) {
				comercial.getAdministrador().comercial.remove(comercial);
			}
			
			bd.Incidencia[] lIncidencias = comercial.incidencia.toArray();
			for(int i = 0; i < lIncidencias.length; i++) {
				lIncidencias[i].setComercial(null);
			}
			bd.Cliente[] lClientes = comercial.cliente.toArray();
			for(int i = 0; i < lClientes.length; i++) {
				lClientes[i].comercial.remove(comercial);
			}
			return delete(comercial);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Comercial comercial, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (comercial.getAdministrador() != null) {
				comercial.getAdministrador().comercial.remove(comercial);
			}
			
			bd.Incidencia[] lIncidencias = comercial.incidencia.toArray();
			for(int i = 0; i < lIncidencias.length; i++) {
				lIncidencias[i].setComercial(null);
			}
			bd.Cliente[] lClientes = comercial.cliente.toArray();
			for(int i = 0; i < lClientes.length; i++) {
				lClientes[i].comercial.remove(comercial);
			}
			try {
				session.delete(comercial);
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
	
	public static boolean refresh(bd.Comercial comercial) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().refresh(comercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd.Comercial comercial) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().evict(comercial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comercial loadComercialByCriteria(ComercialCriteria comercialCriteria) {
		Comercial[] comercials = listComercialByCriteria(comercialCriteria);
		if(comercials == null || comercials.length == 0) {
			return null;
		}
		return comercials[0];
	}
	
	public static Comercial[] listComercialByCriteria(ComercialCriteria comercialCriteria) {
		return comercialCriteria.listComercial();
	}
}
