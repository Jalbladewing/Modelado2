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
			bd.Factura bDFactura = bd.Factura.createFactura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad, precioTotal, telefonoCliente, direccionCliente, nifCliente, apellidosCliente, nombreCliente, fecha, nombre, cliente
			bDFactura.save();
			bd.Modalidad bDModalidad = bd.Modalidad.createModalidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : factura, contratos, oferta, tipo, visibilidad, precio, nombre, administrador
			bDModalidad.save();
			bd.Television bDTelevision = bd.Television.createTelevision();
			// Initialize the properties of the persistent object here
			bDTelevision.save();
			bd.Canal bDCanal = bd.Canal.createCanal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paquete
			bDCanal.save();
			bd.Incidencia bDIncidencia = bd.Incidencia.createIncidencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asunto, correoCliente, cliente
			bDIncidencia.save();
			bd.Usuario bDUsuario = bd.Usuario.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : password, nif, email, telefono, direccion, apellidos, nombre
			bDUsuario.save();
			bd.Incidencia_administrador bDIncidencia_administrador = bd.Incidencia_administrador.createIncidencia_administrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administrador, correoComercial
			bDIncidencia_administrador.save();
			bd.Cliente bDCliente = bd.Cliente.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : comercial, incidencia, factura, contratos, administrador
			bDCliente.save();
			bd.Movil bDMovil = bd.Movil.createMovil();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consumoMax, consumoActual
			bDMovil.save();
			bd.Oferta bDOferta = bd.Oferta.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad
			bDOferta.save();
			bd.contrato bDcontrato = bd.contrato.createContrato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad, cliente
			bDcontrato.save();
			bd.Comercial bDComercial = bd.Comercial.createComercial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, administrador
			bDComercial.save();
			bd.Administrador bDAdministrador = bd.Administrador.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : incidencia, comercial, modalidadDestacada, cliente
			bDAdministrador.save();
			bd.Paquete bDPaquete = bd.Paquete.createPaquete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : modalidad
			bDPaquete.save();
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
