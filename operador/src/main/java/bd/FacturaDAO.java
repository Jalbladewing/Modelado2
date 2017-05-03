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

public class FacturaDAO {
	public static Factura loadFacturaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadFacturaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura getFacturaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getFacturaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura loadFacturaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadFacturaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura getFacturaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return getFacturaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura loadFacturaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Factura) session.load(bd.Factura.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura getFacturaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Factura) session.get(bd.Factura.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura loadFacturaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Factura) session.load(bd.Factura.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura getFacturaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Factura) session.get(bd.Factura.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFactura(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryFactura(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFactura(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return queryFactura(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura[] listFacturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listFacturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura[] listFacturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return listFacturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFactura(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Factura as Factura");
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
	
	public static List queryFactura(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Factura as Factura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Factura", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura[] listFacturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFactura(session, condition, orderBy);
			return (Factura[]) list.toArray(new Factura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura[] listFacturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFactura(session, condition, orderBy, lockMode);
			return (Factura[]) list.toArray(new Factura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura loadFacturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadFacturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura loadFacturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return loadFacturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura loadFacturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Factura[] facturas = listFacturaByQuery(session, condition, orderBy);
		if (facturas != null && facturas.length > 0)
			return facturas[0];
		else
			return null;
	}
	
	public static Factura loadFacturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Factura[] facturas = listFacturaByQuery(session, condition, orderBy, lockMode);
		if (facturas != null && facturas.length > 0)
			return facturas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFacturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateFacturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFacturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bd.IteracionFinalPersistentManager.instance().getSession();
			return iterateFacturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFacturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Factura as Factura");
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
	
	public static java.util.Iterator iterateFacturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bd.Factura as Factura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Factura", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura createFactura() {
		return new bd.Factura();
	}
	
	public static boolean save(bd.Factura factura) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().saveObject(factura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bd.Factura factura) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().deleteObject(factura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Factura factura)throws PersistentException {
		try {
			if (factura.getCliente() != null) {
				factura.getCliente().factura.remove(factura);
			}
			
			bd.Modalidad[] lModalidads = factura.modalidad.toArray();
			for(int i = 0; i < lModalidads.length; i++) {
				lModalidads[i].factura.remove(factura);
			}
			return delete(factura);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bd.Factura factura, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (factura.getCliente() != null) {
				factura.getCliente().factura.remove(factura);
			}
			
			bd.Modalidad[] lModalidads = factura.modalidad.toArray();
			for(int i = 0; i < lModalidads.length; i++) {
				lModalidads[i].factura.remove(factura);
			}
			try {
				session.delete(factura);
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
	
	public static boolean refresh(bd.Factura factura) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().refresh(factura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bd.Factura factura) throws PersistentException {
		try {
			bd.IteracionFinalPersistentManager.instance().getSession().evict(factura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Factura loadFacturaByCriteria(FacturaCriteria facturaCriteria) {
		Factura[] facturas = listFacturaByCriteria(facturaCriteria);
		if(facturas == null || facturas.length == 0) {
			return null;
		}
		return facturas[0];
	}
	
	public static Factura[] listFacturaByCriteria(FacturaCriteria facturaCriteria) {
		return facturaCriteria.listFactura();
	}
}
