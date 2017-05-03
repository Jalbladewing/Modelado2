package bdgui;

import java.util.List;

import bd.Administrador;
import bd.Cliente;
import bd.Comercial;
import bd.Movil;
import bd.Paquete;
import bd.Canal;
import bd.Oferta;
import bd.Modalidad;
import bd.Incidencia;

public interface IAdministrador {

	public List cargar_modalidades_destacadas();

	public List cargar_modalidades_telefono_fijo();

	public List cargar_modalidades_movil();

	public List cargar_modalidades_internet();

	public List cargar_modalidades_oferta();

	public List cargar_paquetes();

	public List cargar_canales();

	public boolean cambiar_visibilidad_modalidad_destacada(int aIdIncidencia);

	public boolean cambiar_modalidad_destacada(int aIdAntigua, int aIdNueva);

	public boolean modificar_administrador(Administrador aAdministrador);

	public List cargar_clientes();

	public boolean registrar_cliente(Cliente aCliente);

	public List cargar_incidencias_administrador();

	public List cargar_comerciales();

	public boolean registrar_incidencia_asignada(int aIdComercial, int aIdIncidencia);

	public boolean registrar_comercial(Comercial aComercial);

	public List cargar_modalidades();

	public boolean crear_modalidad_movil(Movil aMovil);

	public List cargar_modalidades_incluidas_oferta(int aIdOferta);

	public List cargar_canales_incluidos_paquete(int aIdPaquete);

	public boolean crear_modalidad_paquete(Paquete aPaquete);

	public boolean crear_modalidad_canal(Canal aCanal);

	public boolean crear_modalidad_oferta(Oferta aOferta);

	public boolean crear_modalidad_general(Modalidad aModalidad);

	public List cargar_clientes_traspaso(int aIdModalidad);

	public boolean traspasar_usuarios(int aIdAntiguo, int aIdNuevo, List aUsuarios);

	public boolean eliminar_modalidad(int aIdModalidad, int aDias);

	public boolean modificar_cliente(Cliente aCliente);

	public List cargar_facturas(int aIdCliente);

	public List cargar_modalidades_factura(int aIdFactura);

	public List cargar_modalidades_mis_servicios(int aIdCliente);

	public List cargar_incidencias_cliente(String aIdCliente);

	public boolean registrar_incidencia(Incidencia aIncidencia);

	public boolean contratar_modalidad(int aIdCliente, int aIdModalidad);

	public boolean baja_cliente(int aIdCliente);

	public boolean modificar_comercial(Comercial aComercial);

	public boolean baja_comercial(int aIdComercial);

	public List cargar_incidencias_comercial(int aIdComercial);

	public boolean resolver_incidencia(int aIdComercial);
}