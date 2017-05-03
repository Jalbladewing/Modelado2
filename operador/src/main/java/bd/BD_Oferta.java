package bd;

import java.util.List;
import java.util.Vector;



public class BD_Oferta {
	public BD_Principal _bd_prin_ofer;
	public Vector<Oferta> _contiene_ofer = new Vector<Oferta>();

	public List cargar_modalidades_telefono_fijo() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_internet() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_oferta() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_factura(int aIdFactura) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_cliente(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_visibilidad_modalidad(int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_modalidad_destacada(int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean add_modalidad_destacada(int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades() {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad(Oferta aOferta) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_incluidas_oferta(int aIdOferta) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_general(Modalidad aModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean guardar_traspaso(int aIdNuevo, List aUsuarios) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_traspaso(int aIdAntiguo) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_modalidad(int aIdModalidad, int aDias) {
		throw new UnsupportedOperationException();
	}
}