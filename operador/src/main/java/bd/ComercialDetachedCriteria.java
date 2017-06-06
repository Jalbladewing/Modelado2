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

public class ComercialDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ComercialDetachedCriteria() {
		super(bd.Comercial.class, bd.ComercialCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
	}
	
	public ComercialDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd.ComercialCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public IncidenciaDetachedCriteria createIncidenciaCriteria() {
		return new IncidenciaDetachedCriteria(createCriteria("ORM_incidencia"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_cliente"));
	}
	
	public Comercial uniqueComercial(PersistentSession session) {
		return (Comercial) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comercial[] listComercial(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comercial[]) list.toArray(new Comercial[list.size()]);
	}
}

