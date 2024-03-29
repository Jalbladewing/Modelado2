package bdgui;

import java.util.List;


import bd.Canal;
import bd.Cliente;
import bd.Factura;
import bd.Incidencia;
import bd.Incidencia_administrador;
import bd.Modalidad;
import bd.Movil;
import bd.Oferta;
import bd.Paquete;

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

	public boolean registrar_incidencia(Incidencia_administrador incidencia);
	
	public Canal cargar_canal(String nombre);
	
	public Modalidad cargar_modalidad_nombre(String nombre);
	
	public Oferta cargar_modalidad_oferta(String nombre);
	
	public Incidencia cargar_incidencia(int id);
	
	public Factura cargar_factura(int id);
	
	public boolean cancelar_incidencia(int idIncidencia);
}