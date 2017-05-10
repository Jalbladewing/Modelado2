package bd;

import java.util.List;
import java.util.Vector;



public class BD_Canal {
	public BD_Principal _bd_prin_canal;
	public Vector<Canal> _contiene_canal = new Vector<Canal>();

	public List cargar_canales() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_factura(int aIdFactura) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_cliente(int idCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_canal(Canal aCanal) {
		throw new UnsupportedOperationException();
	}
}