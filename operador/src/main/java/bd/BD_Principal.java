package bd;

import bdgui.ICibernauta;
import bdgui.ICliente;
import bdgui.IComercial;

import java.util.List;

import org.orm.PersistentException;

import bdgui.IAdministrador;

public class BD_Principal implements ICibernauta, ICliente, IComercial, IAdministrador {
	public BD_Oferta _bd_ofer = new BD_Oferta();
	public BD_Movil _bd_movil = new BD_Movil();
	public BD_Paquete _bd_paq = new BD_Paquete();
	public BD_Canal _bd_canal = new BD_Canal();
	public BD_Cliente _bd_clien = new BD_Cliente();
	public BD_Factura _bd_fact = new BD_Factura();
	public BD_Comercial _bd_comer = new BD_Comercial();
	public BD_Administrador _bd_admin = new BD_Administrador();
	public BD_Incidencia_administrador _bd_incid_admin = new BD_Incidencia_administrador();

	public List cargar_modalidades_destacadas() {
		List modalidades = null;
		try {
			modalidades = _bd_admin.cargar_modalidades_destacadas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
		
	}

	public List cargar_modalidades_telefono_fijo() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_movil() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_internet() {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_oferta() {
		throw new UnsupportedOperationException();
	}

	public List cargar_paquetes() {
		throw new UnsupportedOperationException();
	}

	public List cargar_canales() {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_incidencia_llamada(String aTelefono) {
		throw new UnsupportedOperationException();
	}

	public boolean iniciar_sesion(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public boolean recuperar_password(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_cliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public List cargar_facturas(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_factura(int aIdFactura) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_mis_servicios(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_cliente(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_incidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_comercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_comercial(int aIdComercial) {
		throw new UnsupportedOperationException();
	}

	public boolean resolver_incidencia(int aIdIncidencia) {
		throw new UnsupportedOperationException();
	}

	public List cargar_clientes() {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_cliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean contratar_modalidad(int aIdCliente, int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean baja_cliente(int aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean baja_modalidad_cliente(int aIdCliente, int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_visibilidad_modalidad_destacada(int aIdIncidencia) {
		throw new UnsupportedOperationException();
	}

	public boolean cambiar_modalidad_destacada(int aIdAntigua, int aIdNueva) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_administrador(Administrador aAdministrador) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_administrador() {
		throw new UnsupportedOperationException();
	}

	public List cargar_comerciales() {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_incidencia_asignada(int aIdComercial, int aIdIncidencia) {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_comercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades() {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_movil(Movil aMovil) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_incluidas_oferta(int aIdOferta) {
		throw new UnsupportedOperationException();
	}

	public List cargar_canales_incluidos_paquete(int aIdPaquete) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_paquete(Paquete aPaquete) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_canal(Canal aCanal) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_oferta(Oferta aOferta) {
		throw new UnsupportedOperationException();
	}

	public boolean crear_modalidad_general(Modalidad aModalidad) {
		throw new UnsupportedOperationException();
	}

	public List cargar_clientes_traspaso(int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean traspasar_usuarios(int aIdAntiguo, int aIdNuevo, List aUsuarios) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_modalidad(int aIdModalidad, int aDias) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_cliente(String aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean baja_comercial(int aIdComercial) {
		throw new UnsupportedOperationException();
	}
}