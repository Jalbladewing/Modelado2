package bdgui;

import bd.Comercial;

import java.util.List;

import bd.Cliente;
import bd.Incidencia;

public interface IComercial {

	public List cargar_modalidades_destacadas();

	public List cargar_modalidades_telefono_fijo();

	public List cargar_modalidades_movil();

	public List cargar_modalidades_internet();

	public List cargar_modalidades_oferta();

	public List cargar_paquetes();

	public List cargar_canales();

	public boolean modificar_comercial(Comercial aComercial);

	public List cargar_incidencias_comercial(int aIdComercial);

	public boolean resolver_incidencia(int aIdIncidencia);

	public List cargar_clientes();

	public boolean registrar_cliente(Cliente aCliente);

	public boolean modificar_cliente(Cliente aCliente);

	public List cargar_facturas(int aIdCliente);

	public List cargar_modalidades_factura(int aIdFactura);

	public List cargar_modalidades_mis_servicios(int aIdCliente);

	public List cargar_incidencias_cliente(int aIdCliente);

	public boolean registrar_incidencia(Incidencia aIncidencia);

	public boolean contratar_modalidad(int aIdCliente, int aIdModalidad);

	public boolean baja_cliente(int aIdCliente);

	public boolean baja_modalidad_cliente(int aIdCliente, int aIdModalidad);
}