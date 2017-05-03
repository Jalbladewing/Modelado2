/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateIteracionFinalData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			bd.Factura bDFactura = bd.Factura.loadFacturaByQuery(null, null);
			// Update the properties of the persistent object
			bDFactura.save();
			bd.Modalidad bDModalidad = bd.Modalidad.loadModalidadByQuery(null, null);
			// Update the properties of the persistent object
			bDModalidad.save();
			bd.Television bDTelevision = bd.Television.loadTelevisionByQuery(null, null);
			// Update the properties of the persistent object
			bDTelevision.save();
			bd.Canal bDCanal = bd.Canal.loadCanalByQuery(null, null);
			// Update the properties of the persistent object
			bDCanal.save();
			bd.Incidencia bDIncidencia = bd.Incidencia.loadIncidenciaByQuery(null, null);
			// Update the properties of the persistent object
			bDIncidencia.save();
			bd.Usuario bDUsuario = bd.Usuario.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			bDUsuario.save();
			bd.Incidencia_administrador bDIncidencia_administrador = bd.Incidencia_administrador.loadIncidencia_administradorByQuery(null, null);
			// Update the properties of the persistent object
			bDIncidencia_administrador.save();
			bd.Cliente bDCliente = bd.Cliente.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			bDCliente.save();
			bd.Movil bDMovil = bd.Movil.loadMovilByQuery(null, null);
			// Update the properties of the persistent object
			bDMovil.save();
			bd.Oferta bDOferta = bd.Oferta.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			bDOferta.save();
			bd.contrato bDcontrato = bd.contrato.loadContratoByQuery(null, null);
			// Update the properties of the persistent object
			bDcontrato.save();
			bd.Comercial bDComercial = bd.Comercial.loadComercialByQuery(null, null);
			// Update the properties of the persistent object
			bDComercial.save();
			bd.Administrador bDAdministrador = bd.Administrador.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			bDAdministrador.save();
			bd.Paquete bDPaquete = bd.Paquete.loadPaqueteByQuery(null, null);
			// Update the properties of the persistent object
			bDPaquete.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Factura by FacturaCriteria");
		bd.FacturaCriteria bDFacturaCriteria = new bd.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDFacturaCriteria.ID.eq();
		System.out.println(bDFacturaCriteria.uniqueFactura());
		
		System.out.println("Retrieving Modalidad by ModalidadCriteria");
		bd.ModalidadCriteria bDModalidadCriteria = new bd.ModalidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDModalidadCriteria.ID.eq();
		System.out.println(bDModalidadCriteria.uniqueModalidad());
		
		System.out.println("Retrieving Television by TelevisionCriteria");
		bd.TelevisionCriteria bDTelevisionCriteria = new bd.TelevisionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDTelevisionCriteria.ID.eq();
		System.out.println(bDTelevisionCriteria.uniqueTelevision());
		
		System.out.println("Retrieving Canal by CanalCriteria");
		bd.CanalCriteria bDCanalCriteria = new bd.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDCanalCriteria.ID.eq();
		System.out.println(bDCanalCriteria.uniqueCanal());
		
		System.out.println("Retrieving Incidencia by IncidenciaCriteria");
		bd.IncidenciaCriteria bDIncidenciaCriteria = new bd.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDIncidenciaCriteria.ID.eq();
		System.out.println(bDIncidenciaCriteria.uniqueIncidencia());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		bd.UsuarioCriteria bDUsuarioCriteria = new bd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDUsuarioCriteria.ID.eq();
		System.out.println(bDUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Incidencia_administrador by Incidencia_administradorCriteria");
		bd.Incidencia_administradorCriteria bDIncidencia_administradorCriteria = new bd.Incidencia_administradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDIncidencia_administradorCriteria.ID.eq();
		System.out.println(bDIncidencia_administradorCriteria.uniqueIncidencia_administrador());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		bd.ClienteCriteria bDClienteCriteria = new bd.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDClienteCriteria.ID.eq();
		System.out.println(bDClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Movil by MovilCriteria");
		bd.MovilCriteria bDMovilCriteria = new bd.MovilCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDMovilCriteria.ID.eq();
		System.out.println(bDMovilCriteria.uniqueMovil());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		bd.OfertaCriteria bDOfertaCriteria = new bd.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDOfertaCriteria.ID.eq();
		System.out.println(bDOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving contrato by contratoCriteria");
		bd.contratoCriteria bDcontratoCriteria = new bd.contratoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDcontratoCriteria.ID.eq();
		System.out.println(bDcontratoCriteria.uniqueContrato());
		
		System.out.println("Retrieving Comercial by ComercialCriteria");
		bd.ComercialCriteria bDComercialCriteria = new bd.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDComercialCriteria.ID.eq();
		System.out.println(bDComercialCriteria.uniqueComercial());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		bd.AdministradorCriteria bDAdministradorCriteria = new bd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDAdministradorCriteria.ID.eq();
		System.out.println(bDAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Paquete by PaqueteCriteria");
		bd.PaqueteCriteria bDPaqueteCriteria = new bd.PaqueteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bDPaqueteCriteria.ID.eq();
		System.out.println(bDPaqueteCriteria.uniquePaquete());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateIteracionFinalData retrieveAndUpdateIteracionFinalData = new RetrieveAndUpdateIteracionFinalData();
			try {
				retrieveAndUpdateIteracionFinalData.retrieveAndUpdateTestData();
				//retrieveAndUpdateIteracionFinalData.retrieveByCriteria();
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
