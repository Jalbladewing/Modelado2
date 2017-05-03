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

public class contratoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression fecha;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression modalidadId;
	public final AssociationExpression modalidad;
	
	public contratoDetachedCriteria() {
		super(bd.contrato.class, bd.contratoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
		modalidadId = new IntegerExpression("ORM_Modalidad.null", this.getDetachedCriteria());
		modalidad = new AssociationExpression("ORM_Modalidad", this.getDetachedCriteria());
	}
	
	public contratoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd.contratoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
		modalidadId = new IntegerExpression("ORM_Modalidad.null", this.getDetachedCriteria());
		modalidad = new AssociationExpression("ORM_Modalidad", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public ModalidadDetachedCriteria createModalidadCriteria() {
		return new ModalidadDetachedCriteria(createCriteria("modalidad"));
	}
	
	public contrato uniqueContrato(PersistentSession session) {
		return (contrato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public contrato[] listContrato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (contrato[]) list.toArray(new contrato[list.size()]);
	}
}

