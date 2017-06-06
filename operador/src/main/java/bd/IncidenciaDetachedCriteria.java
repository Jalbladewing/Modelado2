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

public class IncidenciaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public IncidenciaDetachedCriteria() {
		super(bd.Incidencia.class, bd.IncidenciaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		comercialId = new IntegerExpression("comercial.", this.getDetachedCriteria());
		comercial = new AssociationExpression("comercial", this.getDetachedCriteria());
		correoCliente = new StringExpression("correoCliente", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		observacion = new StringExpression("observacion", this.getDetachedCriteria());
		tipoIncidencia = new StringExpression("tipoIncidencia", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public IncidenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd.IncidenciaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		comercialId = new IntegerExpression("comercial.", this.getDetachedCriteria());
		comercial = new AssociationExpression("comercial", this.getDetachedCriteria());
		correoCliente = new StringExpression("correoCliente", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		observacion = new StringExpression("observacion", this.getDetachedCriteria());
		tipoIncidencia = new StringExpression("tipoIncidencia", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public ComercialDetachedCriteria createComercialCriteria() {
		return new ComercialDetachedCriteria(createCriteria("comercial"));
	}
	
	public Incidencia uniqueIncidencia(PersistentSession session) {
		return (Incidencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Incidencia[] listIncidencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
	}
}

