/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateIteracionFinalData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			bd.Factura lbdFactura = bd.FacturaDAO.createFactura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad, precioTotal, telefonoCliente, direccionCliente, nifCliente, apellidosCliente, nombreCliente, fecha, nombre, cliente
			bd.FacturaDAO.save(lbdFactura);
			bd.Modalidad lbdModalidad = bd.ModalidadDAO.createModalidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : factura, contratos, oferta, tipo, visibilidad, precio, nombre
			bd.ModalidadDAO.save(lbdModalidad);
			bd.Television lbdTelevision = bd.TelevisionDAO.createTelevision();
			// Initialize the properties of the persistent object here
			bd.TelevisionDAO.save(lbdTelevision);
			bd.Canal lbdCanal = bd.CanalDAO.createCanal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paquete
			bd.CanalDAO.save(lbdCanal);
			bd.Incidencia lbdIncidencia = bd.IncidenciaDAO.createIncidencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asunto, correoCliente
			bd.IncidenciaDAO.save(lbdIncidencia);
			bd.Usuario lbdUsuario = bd.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : password, nif, email, telefono, direccion, apellidos, nombre
			bd.UsuarioDAO.save(lbdUsuario);
			bd.Incidencia_administrador lbdIncidencia_administrador = bd.Incidencia_administradorDAO.createIncidencia_administrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administrador, correoComercial
			bd.Incidencia_administradorDAO.save(lbdIncidencia_administrador);
			bd.Cliente lbdCliente = bd.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : comercial, factura, contratos, administrador
			bd.ClienteDAO.save(lbdCliente);
			bd.Movil lbdMovil = bd.MovilDAO.createMovil();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consumoMax, consumoActual
			bd.MovilDAO.save(lbdMovil);
			bd.Oferta lbdOferta = bd.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad
			bd.OfertaDAO.save(lbdOferta);
			bd.contrato lbdcontrato = bd.contratoDAO.createContrato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad, cliente
			bd.contratoDAO.save(lbdcontrato);
			bd.Comercial lbdComercial = bd.ComercialDAO.createComercial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, administrador
			bd.ComercialDAO.save(lbdComercial);
			bd.Administrador lbdAdministrador = bd.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : incidencia, comercial, cliente
			bd.AdministradorDAO.save(lbdAdministrador);
			bd.Paquete lbdPaquete = bd.PaqueteDAO.createPaquete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad
			bd.PaqueteDAO.save(lbdPaquete);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateIteracionFinalData createIteracionFinalData = new CreateIteracionFinalData();
			try {
				createIteracionFinalData.createTestData();
			}
			finally {
				bd.IteracionFinalPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
