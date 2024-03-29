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

public class PaqueteDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression modalidad;
	
	public PaqueteDetachedCriteria() {
		super(bd.Paquete.class, bd.PaqueteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		oferta = new CollectionExpression("ORM_oferta", this.getDetachedCriteria());
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		modalidad = new CollectionExpression("ORM_modalidad", this.getDetachedCriteria());
	}
	
	public PaqueteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd.PaqueteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		oferta = new CollectionExpression("ORM_oferta", this.getDetachedCriteria());
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		modalidad = new CollectionExpression("ORM_modalidad", this.getDetachedCriteria());
	}
	
	public CanalDetachedCriteria createModalidadCriteria() {
		return new CanalDetachedCriteria(createCriteria("ORM_modalidad"));
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public OfertaDetachedCriteria createOfertaCriteria() {
		return new OfertaDetachedCriteria(createCriteria("ORM_oferta"));
	}
	
	public contratoDetachedCriteria createContratosCriteria() {
		return new contratoDetachedCriteria(createCriteria("ORM_contratos"));
	}
	
	public FacturaDetachedCriteria createFacturaCriteria() {
		return new FacturaDetachedCriteria(createCriteria("ORM_factura"));
	}
	
	public Paquete uniquePaquete(PersistentSession session) {
		return (Paquete) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paquete[] listPaquete(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paquete[]) list.toArray(new Paquete[list.size()]);
	}
}

