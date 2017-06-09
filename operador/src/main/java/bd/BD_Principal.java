package bd;

import bdgui.ICibernauta;
import bdgui.ICliente;
import bdgui.IComercial;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;

import com.teamBurton.operador.Gestor_Correos;
import com.teamBurton.operador.Gestor_correo;

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
		List modalidades = null;
		try {
			modalidades = _bd_ofer.cargar_modalidades_telefono_fijo();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
	}

	public List cargar_modalidades_movil() {
		List modalidades = null;
		try {
			modalidades = _bd_movil.cargar_modalidades_movil();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
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
		List modalidades = null;
		try {
			modalidades = _bd_ofer.cargar_modalidades_oferta();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
	}

	public List cargar_paquetes() {
		List modalidades = null;
		try {
			modalidades = _bd_paq.cargar_paquetes();

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
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

	public boolean registrar_incidencia_llamada(String telefono) {
		try {
			return _bd_incid_admin.registrar_incidencia_llamada(telefono);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public Usuario iniciar_sesion(String email, String password) {
		Usuario u;
		try {
			u = _bd_clien.verificar_loguin(email, password);
			if (u != null) {
				return _bd_clien.acceder_cliente(u.getID());
			} else {
				u = _bd_comer.verificar_loguin(email, password);
				if (u != null) {
					return _bd_comer.acceder_comercial(u.getID());
				} else {
					u = _bd_admin.verificar_loguin(email, password);
					if (u != null) {
						return _bd_admin.acceder_administrador(u.getID());
					}
				}
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return null;

	}

	public boolean recuperar_password(String email) {
		Usuario u;
		String pass;
		Gestor_Correos gestor = new Gestor_Correos();
		try {
			u = _bd_clien.verificar_usuario(email);
			if (u != null) {
				pass = u.getPassword();
				return gestor.enviar_correo_recuperacion(u.getEmail(), pass);
			} else {
				u = _bd_comer.verificar_usuario(email);
				if (u != null) {
					pass = u.getPassword();
					return gestor.enviar_correo_recuperacion(u.getEmail(), pass);

				} else {
					u = _bd_admin.verificar_usuario(email);
					if (u != null) {
						pass = u.getPassword();
						return gestor.enviar_correo_recuperacion(u.getEmail(), pass);

					}
				}
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;

	}

	public boolean modificar_cliente(Cliente cliente) {
		try {
			return _bd_clien.modificar_cliente(cliente);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
			facturas.add(_bd_fact.cargar_modalidades_factura(idFactura));

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return facturas;
	}

	public List cargar_modalidades_mis_servicios(int idCliente) {
		List modalidades = null;
		try {
			modalidades = _bd_ofer.cargar_modalidades_cliente(idCliente);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidades;
	}

	public boolean registrar_incidencia(Incidencia incidencia) {
		try {
			return _bd_incid_admin.registrar_incidencia(incidencia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean modificar_comercial(Comercial comercial) {
		try {
			return _bd_comer.modificar_perfil_comercial(comercial);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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

	
	 public boolean registrar_cliente(Cliente cliente) 
	 { 
		 Usuario u; String pass;
		 Gestor_Correos gestor = new Gestor_Correos(); 
		 try 
		 { 
			 u = _bd_clien.verificar_usuario(cliente.getEmail()); 
			 if (u == null)
			 { 
				 u = _bd_comer.verificar_usuario(cliente.getEmail()); 
				 
				 if (u == null) 
				 { 
					 u = _bd_admin.verificar_usuario(cliente.getEmail());
				 } 
				 
				 if (u == null) 
				 { 
					 pass = _bd_clien.generar_password(); 
					 cliente.setPassword(pass);
	 
					 if(_bd_clien.registrar_cliente(cliente)) 
					 {
						 return gestor.enviar_correo_registro_password(cliente.getEmail(),cliente.getPassword());
					 }
				 } 
			}
	 
		 } catch (PersistentException e) 
		 { 
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 return false; 
		 } 
		
		 return false;
	 
	 }
	 
	public boolean contratar_modalidad(int idCliente, int idModalidad) {
		try {
			return _bd_clien.registrar_modalidad_contratada(idCliente, idModalidad);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
			if (_bd_ofer.eliminar_modalidad_destacada(idAntigua))
				return _bd_ofer.add_modalidad_destacada(idNueva);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean modificar_administrador(Administrador administrador) {
		try {
			return _bd_admin.modificar_perfil_administrador(administrador);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
		List comerciales = null;
		try {
			comerciales = _bd_comer.cargar_comerciales();

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comerciales;
	}

	public boolean registrar_incidencia_asignada(int idComercial, int idIncidencia) {
		try {
			return _bd_incid_admin.registrar_incidencia_asignada(idComercial, idIncidencia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean registrar_comercial(Comercial comercial) {
		// TODO Auto-generated method stub
		return false;
	}

	/*public boolean registrar_comercial(Comercial comercial) {
		Usuario u;
		String pass;
		Gestor_Correos gestor = new Gestor_Correos();
		try {
			u = _bd_clien.verificar_usuario(comercial.getEmail());
			if (u == null) {
				u = _bd_comer.verificar_usuario(comercial.getEmail());
				if (u == null) {
					u = _bd_admin.verificar_usuario(comercial.getEmail());
				}
				if (u == null) {
					pass = _bd_comer.generar_password();
					comercial.setPassword(pass);
					if (_bd_comer.registrar_comercial(comercial))
						return gestor.enviar_correo_registro_password(comercial.getEmail(), comercial.getPassword());

				}
			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;

	}*/

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

	public boolean traspasar_usuarios(int idAntiguo, int idNuevo, List usuarios) {
		try {
			_bd_ofer.guardar_traspaso(idNuevo, usuarios);
			_bd_ofer.eliminar_traspaso(idAntiguo);

			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean eliminar_modalidad(int idModalidad, int dias) {
		try {
			return _bd_ofer.eliminar_modalidad(idModalidad, dias);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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

	@Override
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

	@Override
	public boolean crear_modalidad(Modalidad modalidad) {
		// TODO Auto-generated method stub
		try {
			if (modalidad.getTipo().equals("movil")) {
				return _bd_movil.crear_modalidad_movil((Movil) modalidad);
			} else if (modalidad.getTipo().equals("television")) {
				if (modalidad instanceof Canal) {
					return _bd_canal.crear_modalidad_canal((Canal) modalidad);
				} else {
					return _bd_paq.crear_modalidad_paquete((Paquete) modalidad);
				}
			}

			else if (modalidad.getTipo().equals("oferta")) {
				return _bd_ofer.crear_modalidad(((Oferta) modalidad));
			} else {
				return _bd_ofer.crear_modalidad_general(modalidad);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean modificar_modalidad(Modalidad modalidad) {
		// TODO Auto-generated method stub
		try {
			if (modalidad.getTipo().equals("movil")) {
				return _bd_movil.actualizar_modalidad_movil((Movil) modalidad);
			} else if (modalidad.getTipo().equals("television")) {
				if (modalidad instanceof Canal) {
					return _bd_canal.actualizar_modalidad_canal((Canal) modalidad);
				} else {
					return _bd_paq.actualizar_modalidad_paquete((Paquete) modalidad);
				}
			}

			else if (modalidad.getTipo().equals("oferta")) {
				return _bd_ofer.actualizar_modalidad(((Oferta) modalidad));
			} else {
				return _bd_ofer.actualizar_modalidad_general(modalidad);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean resolver_incidencia(int idIncidencia, String observaciones) {

		try {
			return _bd_incid_admin.resolver_incidencia(idIncidencia, observaciones);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean cancelar_incidencia(int idIncidencia) {
		try {
			return _bd_incid_admin.cancelar_incidencia(idIncidencia);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Movil cargar_modalidad_movil(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modalidad cargar_modalidad_internet(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modalidad cargar_modalidad_telefono_fijo(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paquete cargar_modalidad_paquete(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta cargar_modalidad_oferta(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canal cargar_canal(String nombre) {
		Canal canal = null;
		try {
			return _bd_canal.cargar_canal(nombre);
		} catch (PersistentException e) {

			e.printStackTrace();
		}
		return canal;
	}
	/*
	 * public Movil cargar_modalidad_movil(String nombre){ Movil movil = null;
	 * try { return _bd_movil.cargar_modalidad_movil(nombre); } catch
	 * (PersistentException e) {
	 * 
	 * e.printStackTrace(); } return movil; }
	 * 
	 * public Modalidad cargar_modalidad_internet(String nombre){ Modalidad
	 * internet = null; try { return _bd_ofer.cargar_modalidad_internet(nombre);
	 * } catch (PersistentException e) {
	 * 
	 * e.printStackTrace(); } return internet;
	 * 
	 * }
	 * 
	 * public Modalidad cargar_modalidad_telefono_fijo(String nombre){ Modalidad
	 * telefono = null; try { return
	 * _bd_ofer.cargar_modalidad_telefono_fijo(nombre); } catch
	 * (PersistentException e) {
	 * 
	 * e.printStackTrace(); } return telefono; }
	 * 
	 * public Paquete cargar_modalidad_paquete(String nombre){ Paquete paquete =
	 * null; try { return _bd_paq.cargar_modalidad_paquete(nombre); } catch
	 * (PersistentException e) {
	 * 
	 * e.printStackTrace(); } return paquete; }
	 * 
	 * public Oferta cargar_modalidad_oferta(String nombre){ Oferta oferta =
	 * null; try { return _bd_ofer.cargar_modalidad_oferta(nombre); } catch
	 * (PersistentException e) {
	 * 
	 * e.printStackTrace(); } return oferta; }
	 */

	@Override
	public Incidencia cargar_incidencia(int id) {
		Incidencia incidencia = null;
		try {
			return _bd_incid_admin.cargar_incidencia(id);
		} catch (PersistentException e) {

			e.printStackTrace();
		}
		return incidencia;
	}

	public Factura cargar_factura(int id) {
		Factura factura = null;
		try {
			return _bd_fact.cargar_factura(id);
		} catch (PersistentException e) {

			e.printStackTrace();
		}
		return factura;
	}



}