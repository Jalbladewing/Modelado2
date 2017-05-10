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
		List modalidades = null;
		try {
			modalidades = _bd_ofer.cargar_modalidades_internet();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
	}

	public List cargar_modalidades_oferta() {
		throw new UnsupportedOperationException();
	}

	public List cargar_paquetes() {
		throw new UnsupportedOperationException();
	}

	public List cargar_canales() {
		List modalidades = null;
		try {
			modalidades = _bd_canal.cargar_canales();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
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

	public List cargar_facturas(int idCliente) {
		List facturas = null;
		try {
			facturas = _bd_fact.cargar_facturas(idCliente);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return facturas;
	}
	

	public List cargar_modalidades_factura(int idFactura) {
		List facturas = null;
		try {
			facturas.addAll(_bd_movil.cargar_modalidades_factura(idFactura));
			facturas.addAll(_bd_paq.cargar_modalidades_factura(idFactura));
			facturas.addAll(_bd_canal.cargar_modalidades_factura(idFactura));
			facturas.addAll(_bd_ofer.cargar_modalidades_factura(idFactura));
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return facturas;
	}
	

	public List cargar_modalidades_mis_servicios(int idCliente) {
		List modalidades = null;
		try {
			modalidades.addAll(_bd_movil.cargar_modalidades_cliente(idCliente));
			modalidades.addAll(_bd_paq.cargar_modalidades_cliente(idCliente));
			modalidades.addAll(_bd_canal.cargar_modalidades_cliente(idCliente));
			modalidades.addAll(_bd_ofer.cargar_modalidades_cliente(idCliente));
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
	}
	

	public List cargar_incidencias_cliente(int idCliente) {
		List incidencias = null;
		try {
			incidencias = _bd_incid_admin.cargar_incidencias_cliente(idCliente);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return incidencias;
	}
	

	public boolean registrar_incidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public boolean modificar_comercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_comercial(int idComercial) {
		List incidencias = null;
		try {
			incidencias = _bd_incid_admin.cargar_incidencias_comercial(idComercial);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return incidencias;
	}
	

	public boolean resolver_incidencia(int aIdIncidencia) {
		throw new UnsupportedOperationException();
	}

	public List cargar_clientes() {
		List clientes = null;
		try {
			clientes = _bd_clien.cargar_clientes();
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}
	

	public boolean registrar_cliente(Cliente cliente) {

		try {
			return _bd_clien.registrar_cliente(cliente);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean contratar_modalidad(int aIdCliente, int aIdModalidad) {
		throw new UnsupportedOperationException();
	}

	public boolean baja_cliente(int idCliente) {
		try {
			return _bd_clien.eliminar_cliente(idCliente);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean baja_modalidad_cliente(int idCliente, int idModalidad) {
		try {
			return _bd_clien.eliminar_modalidad_cliente(idCliente, idModalidad);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean cambiar_visibilidad_modalidad_destacada(int idModalidad) {
		try {
			 _bd_ofer.cambiar_visibilidad_modalidad(idModalidad);
			 return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean cambiar_modalidad_destacada(int idAntigua, int idNueva) {
		try {
			 _bd_ofer.eliminar_modalidad_destacada(idAntigua);
			 _bd_ofer.add_modalidad_destacada(idNueva);
			 return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean modificar_administrador(Administrador aAdministrador) {
		throw new UnsupportedOperationException();
	}

	public List cargar_incidencias_administrador() {
		List incidencias = null;
		try {
			incidencias = _bd_incid_admin.cargar_incidencias();
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return incidencias;
	}
	

	public List cargar_comerciales() {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_incidencia_asignada(int aIdComercial, int aIdIncidencia) {
		throw new UnsupportedOperationException();
	}

	public boolean registrar_comercial(Comercial comercial) {
		try {
			return _bd_comer.registrar_comercial(comercial);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public List cargar_modalidades() {
		List modalidades = null;
		try {
			modalidades = _bd_ofer.cargar_modalidades();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
	}

	public boolean crear_modalidad_movil(Movil aMovil) {
		throw new UnsupportedOperationException();
	}

	public List cargar_modalidades_incluidas_oferta(int idOferta) {
		List modalidades = null;
		try {
			modalidades = _bd_ofer.cargar_modalidades_incluidas_oferta(idOferta);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
	}
	
	public List cargar_canales_incluidos_paquete(int idPaquete) {
		List canales = null;
		try {
			canales = _bd_paq.cargar_canales_incluidos_paquete(idPaquete);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return canales;
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

	public List cargar_clientes_traspaso(int idModalidad) {
		List clientes = null;
		try {
			clientes = _bd_clien.cargar_clientes_traspaso(idModalidad);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}
	

	public boolean traspasar_usuarios(int aIdAntiguo, int aIdNuevo, List aUsuarios) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminar_modalidad(int aIdModalidad, int aDias) {
		throw new UnsupportedOperationException();
	}



	public boolean baja_comercial(int idComercial) {
		try {
			return _bd_comer.baja_comercial(idComercial);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}