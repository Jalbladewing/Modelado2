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

public class Incidencia_administradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression comercialId;
	public final AssociationExpression comercial;
	public final StringExpression correoCliente;
	public final StringExpression asunto;
	public final StringExpression descripcion;
	public final StringExpression observacion;
	public final StringExpression tipoIncidencia;
	public final StringExpression estado;
	public final DateExpression fecha;
	public final StringExpression correoComercial;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	
	public Incidencia_administradorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		clienteId = new IntegerExpression("cliente.", this);
		cliente = new AssociationExpression("cliente", this);
		comercialId = new IntegerExpression("comercial.", this);
		comercial = new AssociationExpression("comercial", this);
		correoCliente = new StringExpression("correoCliente", this);
		asunto = new StringExpression("asunto", this);
		descripcion = new StringExpression("descripcion", this);
		observacion = new StringExpression("observacion", this);
		tipoIncidencia = new StringExpression("tipoIncidencia", this);
		estado = new StringExpression("estado", this);
		fecha = new DateExpression("fecha", this);
		correoComercial = new StringExpression("correoComercial", this);
		administradorId = new IntegerExpression("administrador.", this);
		administrador = new AssociationExpression("administrador", this);
	}
	
	public Incidencia_administradorCriteria(PersistentSession session) {
		this(session.createCriteria(Incidencia_administrador.class));
	}
	
	public Incidencia_administradorCriteria() throws PersistentException {
		this(bd.IteracionFinalPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public ComercialCriteria createComercialCriteria() {
		return new ComercialCriteria(createCriteria("comercial"));
	}
	
	public Incidencia_administrador uniqueIncidencia_administrador() {
		return (Incidencia_administrador) super.uniqueResult();
	}
	
	public Incidencia_administrador[] listIncidencia_administrador() {
		java.util.List list = super.list();
		return (Incidencia_administrador[]) list.toArray(new Incidencia_administrador[list.size()]);
	}
}

