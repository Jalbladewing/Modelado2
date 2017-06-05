package bdgui;

import java.util.List;

import bd.Canal;
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

	public boolean modificar_cliente(Cliente cliente);

	public List cargar_facturas(int idCliente);

	public List cargar_modalidades_factura(int idFactura);

	public List cargar_modalidades_mis_servicios(int idCliente);

	public List cargar_incidencias_cliente(int idCliente);

	public boolean registrar_incidencia(Incidencia incidencia);
	
	public Canal cargar_canal(String nombre);
}