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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression direccion;
	public final StringExpression telefono;
	public final StringExpression email;
	public final StringExpression nif;
	public final StringExpression password;
	public final DateExpression fechaEliminacion;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final CollectionExpression contratos;
	public final CollectionExpression factura;
	public final CollectionExpression incidencia;
	public final CollectionExpression comercial;
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		direccion = new StringExpression("direccion", this);
		telefono = new StringExpression("telefono", this);
		email = new StringExpression("email", this);
		nif = new StringExpression("nif", this);
		password = new StringExpression("password", this);
		fechaEliminacion = new DateExpression("fechaEliminacion", this);
		administradorId = new IntegerExpression("administrador.", this);
		administrador = new AssociationExpression("administrador", this);
		contratos = new CollectionExpression("ORM_contratos", this);
		factura = new CollectionExpression("ORM_factura", this);
		incidencia = new CollectionExpression("ORM_incidencia", this);
		comercial = new CollectionExpression("ORM_comercial", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(bd.IteracionFinalPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public bd.contratoCriteria createContratosCriteria() {
		return new bd.contratoCriteria(createCriteria("ORM_contratos"));
	}
	
	public bd.FacturaCriteria createFacturaCriteria() {
		return new bd.FacturaCriteria(createCriteria("ORM_factura"));
	}
	
	public bd.IncidenciaCriteria createIncidenciaCriteria() {
		return new bd.IncidenciaCriteria(createCriteria("ORM_incidencia"));
	}
	
	public bd.ComercialCriteria createComercialCriteria() {
		return new bd.ComercialCriteria(createCriteria("ORM_comercial"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

