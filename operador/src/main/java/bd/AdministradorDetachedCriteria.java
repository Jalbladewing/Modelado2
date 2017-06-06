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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public AdministradorDetachedCriteria() {
		super(bd.Administrador.class, bd.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
		modalidadDestacada = new CollectionExpression("ORM_modalidadDestacada", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
		modalidadDestacada = new CollectionExpression("ORM_modalidadDestacada", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_cliente"));
	}
	
	public ModalidadDetachedCriteria createModalidadDestacadaCriteria() {
		return new ModalidadDetachedCriteria(createCriteria("ORM_modalidadDestacada"));
	}
	
	public ComercialDetachedCriteria createComercialCriteria() {
		return new ComercialDetachedCriteria(createCriteria("ORM_comercial"));
	}
	
	public Incidencia_administradorDetachedCriteria createIncidenciaCriteria() {
		return new Incidencia_administradorDetachedCriteria(createCriteria("ORM_incidencia"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

