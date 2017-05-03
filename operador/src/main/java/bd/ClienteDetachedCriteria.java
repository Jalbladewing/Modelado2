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

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ClienteDetachedCriteria() {
		super(bd.Cliente.class, bd.ClienteCriteria.class);
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
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd.ClienteCriteria.class);
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
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public bd.contratoDetachedCriteria createContratosCriteria() {
		return new bd.contratoDetachedCriteria(createCriteria("ORM_contratos"));
	}
	
	public bd.FacturaDetachedCriteria createFacturaCriteria() {
		return new bd.FacturaDetachedCriteria(createCriteria("ORM_factura"));
	}
	
	public bd.IncidenciaDetachedCriteria createIncidenciaCriteria() {
		return new bd.IncidenciaDetachedCriteria(createCriteria("ORM_incidencia"));
	}
	
	public bd.ComercialDetachedCriteria createComercialCriteria() {
		return new bd.ComercialDetachedCriteria(createCriteria("ORM_comercial"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

