package bd;

import java.util.List;

import java.util.Vector;


public class BD_Incidencia_administrador {
	public BD_Principal _bd_prin_incid_admin;
	public Vector<Incidencia_administrador> _contiene_incid_admin = new Vector<Incidencia_administrador>();

	public boolean registrar_incidencia_llamada(String aTelefono) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_cliente(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_incidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_comercial(int aIdComercial) {
		throw new UnsupportedOperationException();
	}

	public boolean resolver_incidencia(int aIdIncidencia) {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_incidencia_asignada(int aIdComercial, int aIdIncidencia) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias() {
		throw new UnsupportedOperationException();
	}
}