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

public class ComercialCriteria extends AbstractORMCriteria {
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
	public final CollectionExpression incidencia;
	public final CollectionExpression cliente;
	
	public ComercialCriteria(Criteria criteria) {
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
		incidencia = new CollectionExpression("ORM_incidencia", this);
		cliente = new CollectionExpression("ORM_cliente", this);
	}
	
	public ComercialCriteria(PersistentSession session) {
		this(session.createCriteria(Comercial.class));
	}
	
	public ComercialCriteria() throws PersistentException {
		this(bd.IteracionFinalPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public bd.IncidenciaCriteria createIncidenciaCriteria() {
		return new bd.IncidenciaCriteria(createCriteria("ORM_incidencia"));
	}
	
	public bd.ClienteCriteria createClienteCriteria() {
		return new bd.ClienteCriteria(createCriteria("ORM_cliente"));
	}
	
	public Comercial uniqueComercial() {
		return (Comercial) super.uniqueResult();
	}
	
	public Comercial[] listComercial() {
		java.util.List list = super.list();
		return (Comercial[]) list.toArray(new Comercial[list.size()]);
	}
}

