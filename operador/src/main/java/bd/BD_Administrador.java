package bd;

import java.util.List;

import java.util.Vector;

import org.orm.PersistentException;


public class BD_Administrador {
	public BD_Principal _bd_prin_admin;
	public Vector<Administrador> _contiene_admin = new Vector<Administrador>();

	public List cargar_modalidades_destacadas()  throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public boolean acceder_administrador(int aIdAdministrador) {
		throw new UnsupportedOperationException();
	}

	public String generar_password(int aIdAdministrador) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_perfil_administrador(Administrador aAdministrador) {
		throw new UnsupportedOperationException();
	}
}