package bdgui;

import java.util.List;


import bd.Cliente;
import bd.Incidencia;

public interface ICliente {

	public List cargar_modalidades_destacadas();

	public List cargar_modalidades_telefono_fijo();

	public List cargar_modalidades_movil();

	public List cargar_modalidades_internet();

	public List cargar_modalidades_oferta();

	public List cargar_paquetes();

	public List cargar_canales();

	public boolean modificar_cliente(Cliente aCliente);

	public List cargar_facturas(int aIdCliente);

	public List cargar_modalidades_factura(int aIdFactura);

	public List cargar_modalidades_mis_servicios(int aIdCliente);

	public List cargar_incidencias_cliente(int aIdCliente);

	public boolean registrar_incidencia(Incidencia aIncidencia);
}