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

public class contratoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression fecha;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression modalidadId;
	public final AssociationExpression modalidad;
	
	public contratoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		fecha = new DateExpression("fecha", this);
		clienteId = new IntegerExpression("ORM_Cliente.null", this);
		cliente = new AssociationExpression("ORM_Cliente", this);
		modalidadId = new IntegerExpression("ORM_Modalidad.null", this);
		modalidad = new AssociationExpression("ORM_Modalidad", this);
	}
	
	public contratoCriteria(PersistentSession session) {
		this(session.createCriteria(contrato.class));
	}
	
	public contratoCriteria() throws PersistentException {
		this(bd.IteracionFinalPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente"));
	}
	
	public ModalidadCriteria createModalidadCriteria() {
		return new ModalidadCriteria(createCriteria("ORM_Modalidad"));
	}
	
	public contrato uniqueContrato() {
		return (contrato) super.uniqueResult();
	}
	
	public contrato[] listContrato() {
		java.util.List list = super.list();
		return (contrato[]) list.toArray(new contrato[list.size()]);
	}
}

