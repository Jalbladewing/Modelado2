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

public class CanalCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final StringExpression tipo;
	public final DateExpression fechaEliminacion;
	public final CollectionExpression oferta;
	public final CollectionExpression contratos;
	public final CollectionExpression factura;
	public final CollectionExpression paquete;
	
	public CanalCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		administradorId = new IntegerExpression("administrador.", this);
		administrador = new AssociationExpression("administrador", this);
		nombre = new StringExpression("nombre", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		precio = new DoubleExpression("precio", this);
		visibilidad = new BooleanExpression("visibilidad", this);
		tipo = new StringExpression("tipo", this);
		fechaEliminacion = new DateExpression("fechaEliminacion", this);
		oferta = new CollectionExpression("ORM_oferta", this);
		contratos = new CollectionExpression("ORM_contratos", this);
		factura = new CollectionExpression("ORM_factura", this);
		paquete = new CollectionExpression("ORM_paquete", this);
	}
	
	public CanalCriteria(PersistentSession session) {
		this(session.createCriteria(Canal.class));
	}
	
	public CanalCriteria() throws PersistentException {
		this(bd.IteracionFinalPersistentManager.instance().getSession());
	}
	
	public PaqueteCriteria createPaqueteCriteria() {
		return new PaqueteCriteria(createCriteria("ORM_paquete"));
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public OfertaCriteria createOfertaCriteria() {
		return new OfertaCriteria(createCriteria("ORM_oferta"));
	}
	
	public contratoCriteria createContratosCriteria() {
		return new contratoCriteria(createCriteria("ORM_contratos"));
	}
	
	public FacturaCriteria createFacturaCriteria() {
		return new FacturaCriteria(createCriteria("ORM_factura"));
	}
	
	public Canal uniqueCanal() {
		return (Canal) super.uniqueResult();
	}
	
	public Canal[] listCanal() {
		java.util.List list = super.list();
		return (Canal[]) list.toArray(new Canal[list.size()]);
	}
}

