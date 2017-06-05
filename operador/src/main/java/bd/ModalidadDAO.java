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

public class ModalidadDAO {
	public static Modalidad loadModalidadByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadModalidadByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad getModalidadByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getModalidadByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad loadModalidadByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadModalidadByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad getModalidadByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getModalidadByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad loadModalidadByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Modalidad) session.load(bd.Modalidad.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad getModalidadByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Modalidad) session.get(bd.Modalidad.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad loadModalidadByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Modalidad) session.load(bd.Modalidad.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad getModalidadByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Modalidad) session.get(bd.Modalidad.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModalidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryModalidad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModalidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryModalidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad[] listModalidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listModalidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad[] listModalidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listModalidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModalidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Modalidad as Modalidad");
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
	
	public static List queryModalidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Modalidad as Modalidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Modalidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad[] listModalidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryModalidad(session, condition, orderBy);
			return (Modalidad[]) list.toArray(new Modalidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad[] listModalidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryModalidad(session, condition, orderBy, lockMode);
			return (Modalidad[]) list.toArray(new Modalidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad loadModalidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadModalidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad loadModalidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadModalidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad loadModalidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Modalidad[] modalidads = listModalidadByQuery(session, condition, orderBy);
		if (modalidads != null && modalidads.length > 0)
			return modalidads[0];
		else
			return null;
	}
	
	public static Modalidad loadModalidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Modalidad[] modalidads = listModalidadByQuery(session, condition, orderBy, lockMode);
		if (modalidads != null && modalidads.length > 0)
			return modalidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateModalidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateModalidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModalidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateModalidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModalidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Modalidad as Modalidad");
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
	
	public static java.util.Iterator iterateModalidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Modalidad as Modalidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Modalidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad createModalidad() {
		return new bd.Modalidad();
	}
	
	public static boolean save(bd.Modalidad modalidad) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().saveObject(modalidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd.Modalidad modalidad) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().deleteObject(modalidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Modalidad modalidad)throws PersistentException {
		if (modalidad instanceof Television) {
			return TelevisionDAO.deleteAndDissociate((Television) modalidad);
		}
		
		if (modalidad instanceof Movil) {
			return MovilDAO.deleteAndDissociate((Movil) modalidad);
		}
		
		if (modalidad instanceof Oferta) {
			return OfertaDAO.deleteAndDissociate((Oferta) modalidad);
		}
		
		try {
			if (modalidad.getAdministrador() != null) {
				modalidad.getAdministrador().modalidadDestacada.remove(modalidad);
			}
			
			bd.Oferta[] lOfertas = modalidad.oferta.toArray();
			for(int i = 0; i < lOfertas.length; i++) {
				lOfertas[i].modalidad.remove(modalidad);
			}
			bd.contrato[] lContratoss = modalidad.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setModalidad(null);
			}
			bd.Factura[] lFacturas = modalidad.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].modalidad.remove(modalidad);
			}
			return delete(modalidad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Modalidad modalidad, org.orm.PersistentSession session)throws PersistentException {
		if (modalidad instanceof Television) {
			return TelevisionDAO.deleteAndDissociate((Television) modalidad, session);
		}
		
		if (modalidad instanceof Movil) {
			return MovilDAO.deleteAndDissociate((Movil) modalidad, session);
		}
		
		if (modalidad instanceof Oferta) {
			return OfertaDAO.deleteAndDissociate((Oferta) modalidad, session);
		}
		
		try {
			if (modalidad.getAdministrador() != null) {
				modalidad.getAdministrador().modalidadDestacada.remove(modalidad);
			}
			
			bd.Oferta[] lOfertas = modalidad.oferta.toArray();
			for(int i = 0; i < lOfertas.length; i++) {
				lOfertas[i].modalidad.remove(modalidad);
			}
			bd.contrato[] lContratoss = modalidad.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setModalidad(null);
			}
			bd.Factura[] lFacturas = modalidad.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].modalidad.remove(modalidad);
			}
			try {
				session.delete(modalidad);
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
	
	public static boolean refresh(bd.Modalidad modalidad) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().refresh(modalidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd.Modalidad modalidad) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().evict(modalidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Modalidad loadModalidadByCriteria(ModalidadCriteria modalidadCriteria) {
		Modalidad[] modalidads = listModalidadByCriteria(modalidadCriteria);
		if(modalidads == null || modalidads.length == 0) {
			return null;
		}
		return modalidads[0];
	}
	
	public static Modalidad[] listModalidadByCriteria(ModalidadCriteria modalidadCriteria) {
		return modalidadCriteria.listModalidad();
	}
}
