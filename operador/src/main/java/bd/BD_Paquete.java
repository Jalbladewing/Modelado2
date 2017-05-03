package bd;

import java.util.List;
import java.util.Vector;



public class BD_Paquete {
	public Vector<Paquete> _contiene_paq = new Vector<Paquete>();
	public BD_Principal _bd_prin_paq;

	public List cargar_paquetes() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_factura(int aIdFactura) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_cliente(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_paquete(Paquete aPaquete) {
		throw new UnsupportedOperationException();
	}

	public List cargar_canales_incluidos_paquete(int aIdPaquete) {
		throw new UnsupportedOperationException();
	}
}