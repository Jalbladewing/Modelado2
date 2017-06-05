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
			bd.Factura bDFactura = bd.FacturaDAO.createFactura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad, precioTotal, telefonoCliente, direccionCliente, nifCliente, apellidosCliente, nombreCliente, fecha, nombre, cliente
			bd.FacturaDAO.save(bDFactura);
			bd.Modalidad bDModalidad = bd.ModalidadDAO.createModalidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : factura, contratos, oferta, tipo, visibilidad, precio, nombre
			bd.ModalidadDAO.save(bDModalidad);
			bd.Television bDTelevision = bd.TelevisionDAO.createTelevision();
			// Initialize the properties of the persistent object here
			bd.TelevisionDAO.save(bDTelevision);
			bd.Canal bDCanal = bd.CanalDAO.createCanal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paquete
			bd.CanalDAO.save(bDCanal);
			bd.Incidencia bDIncidencia = bd.IncidenciaDAO.createIncidencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asunto, correoCliente, cliente
			bd.IncidenciaDAO.save(bDIncidencia);
			bd.Usuario bDUsuario = bd.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : password, nif, email, telefono, direccion, apellidos, nombre
			bd.UsuarioDAO.save(bDUsuario);
			bd.Incidencia_administrador bDIncidencia_administrador = bd.Incidencia_administradorDAO.createIncidencia_administrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administrador, correoComercial
			bd.Incidencia_administradorDAO.save(bDIncidencia_administrador);
			bd.Cliente bDCliente = bd.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : comercial, incidencia, factura, contratos, administrador
			bd.ClienteDAO.save(bDCliente);
			bd.Movil bDMovil = bd.MovilDAO.createMovil();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consumoMax, consumoActual
			bd.MovilDAO.save(bDMovil);
			bd.Oferta bDOferta = bd.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad
			bd.OfertaDAO.save(bDOferta);
			bd.contrato bDcontrato = bd.contratoDAO.createContrato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad, cliente
			bd.contratoDAO.save(bDcontrato);
			bd.Comercial bDComercial = bd.ComercialDAO.createComercial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, administrador
			bd.ComercialDAO.save(bDComercial);
			bd.Administrador bDAdministrador = bd.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : incidencia, comercial, cliente
			bd.AdministradorDAO.save(bDAdministrador);
			bd.Paquete bDPaquete = bd.PaqueteDAO.createPaquete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad
			bd.PaqueteDAO.save(bDPaquete);
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
