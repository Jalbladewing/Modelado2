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

	public boolean cambiar_visibilidad_modalidad_destacada(int idIncidencia);

	public boolean cambiar_modalidad_destacada(int aIdAntigua, int idNueva);

	public boolean modificar_administrador(Administrador administrador);

	public List cargar_clientes();

	public boolean registrar_cliente(Cliente cliente);

	public List cargar_incidencias_administrador();

	public List cargar_comerciales();

	public boolean registrar_incidencia_asignada(int idComercial, int idIncidencia);

	public boolean registrar_comercial(Comercial comercial);

	public List cargar_modalidades();

	public List cargar_modalidades_incluidas_oferta(int idOferta);

	public List cargar_canales_incluidos_paquete(int idPaquete);

	public List cargar_clientes_traspaso(int idModalidad);

	public boolean traspasar_usuarios(int idAntiguo, int idNuevo, List usuarios);

	public boolean eliminar_modalidad(int idModalidad, int dias);

	public boolean modificar_cliente(Cliente cliente);

	public List cargar_facturas(int idCliente);

	public List cargar_modalidades_factura(int idFactura);

	public List cargar_modalidades_mis_servicios(int idCliente);

	public List cargar_incidencias_cliente(int idCliente);

	public boolean registrar_incidencia(Incidencia incidencia);

	public boolean contratar_modalidad(int idCliente, int idModalidad);

	public boolean baja_cliente(int idCliente);

	public boolean modificar_comercial(Comercial comercial);

	public boolean baja_comercial(int idComercial);

	public List cargar_incidencias_comercial(int idComercial);

	public boolean resolver_incidencia(int idIncidencia, String observaciones);
	
	public boolean cancelar_incidencia(int idIncidencia, String observaciones);
	
	public boolean crear_modalidad(Modalidad modalidad);
	
	public boolean modificar_modalidad(Modalidad modalidad);
}