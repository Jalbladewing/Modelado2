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

public class MovilDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final DoubleExpression consumoActual;
	public final DoubleExpression consumoMax;
	
	public MovilDetachedCriteria() {
		super(bd.Movil.class, bd.MovilCriteria.class);
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
		consumoActual = new DoubleExpression("consumoActual", this.getDetachedCriteria());
		consumoMax = new DoubleExpression("consumoMax", this.getDetachedCriteria());
	}
	
	public MovilDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bd.MovilCriteria.class);
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
		consumoActual = new DoubleExpression("consumoActual", this.getDetachedCriteria());
		consumoMax = new DoubleExpression("consumoMax", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public bd.OfertaDetachedCriteria createOfertaCriteria() {
		return new bd.OfertaDetachedCriteria(createCriteria("ORM_oferta"));
	}
	
	public bd.contratoDetachedCriteria createContratosCriteria() {
		return new bd.contratoDetachedCriteria(createCriteria("ORM_contratos"));
	}
	
	public bd.FacturaDetachedCriteria createFacturaCriteria() {
		return new bd.FacturaDetachedCriteria(createCriteria("ORM_factura"));
	}
	
	public Movil uniqueMovil(PersistentSession session) {
		return (Movil) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Movil[] listMovil(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Movil[]) list.toArray(new Movil[list.size()]);
	}
}

