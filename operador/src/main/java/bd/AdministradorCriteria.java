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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression direccion;
	public final StringExpression telefono;
	public final StringExpression email;
	public final StringExpression nif;
	public final StringExpression password;
	public final DateExpression fechaEliminacion;
	public final CollectionExpression cliente;
	public final CollectionExpression modalidadDestacada;
	public final CollectionExpression comercial;
	public final CollectionExpression incidencia;
	
	public AdministradorCriteria(Criteria criteria) {
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
		cliente = new CollectionExpression("ORM_cliente", this);
		modalidadDestacada = new CollectionExpression("ORM_modalidadDestacada", this);
		comercial = new CollectionExpression("ORM_comercial", this);
		incidencia = new CollectionExpression("ORM_incidencia", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(bd.IteracionFinalPersistentManager.instance().getSession());
	}
	
	public bd.ClienteCriteria createClienteCriteria() {
		return new bd.ClienteCriteria(createCriteria("ORM_cliente"));
	}
	
	public bd.ModalidadCriteria createModalidadDestacadaCriteria() {
		return new bd.ModalidadCriteria(createCriteria("ORM_modalidadDestacada"));
	}
	
	public bd.ComercialCriteria createComercialCriteria() {
		return new bd.ComercialCriteria(createCriteria("ORM_comercial"));
	}
	
	public bd.Incidencia_administradorCriteria createIncidenciaCriteria() {
		return new bd.Incidencia_administradorCriteria(createCriteria("ORM_incidencia"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

