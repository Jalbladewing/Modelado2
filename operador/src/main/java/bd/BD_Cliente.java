package bd;

import java.util.List;
import java.util.Vector;



public class BD_Cliente {
	public BD_Principal _bd_prin_clien;
	public Vector<Cliente> _contiene_clen = new Vector<Cliente>();

	public Usuario verificar_loguin(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public boolean acceder_cliente(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public Usuario verificar_usuario(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public String generar_password(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_cliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public List cargar_clientes() {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_cliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_modalidad_contratada(int aIdCliente, int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_cliente(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_modalidad_cliente(int aIdCliente, int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public List cargar_clientes_traspaso(int aIdModalidad) {
		throw new UnsupportedOperationException();
	}
}