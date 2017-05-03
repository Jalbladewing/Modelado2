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
			bd.Factura bDFactura = bd.FacturaDAO.loadFacturaByQuery(null, null);
			// Update the properties of the persistent object
			bd.FacturaDAO.save(bDFactura);
			bd.Modalidad bDModalidad = bd.ModalidadDAO.loadModalidadByQuery(null, null);
			// Update the properties of the persistent object
			bd.ModalidadDAO.save(bDModalidad);
			bd.Television bDTelevision = bd.TelevisionDAO.loadTelevisionByQuery(null, null);
			// Update the properties of the persistent object
			bd.TelevisionDAO.save(bDTelevision);
			bd.Canal bDCanal = bd.CanalDAO.loadCanalByQuery(null, null);
			// Update the properties of the persistent object
			bd.CanalDAO.save(bDCanal);
			bd.Incidencia bDIncidencia = bd.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Update the properties of the persistent object
			bd.IncidenciaDAO.save(bDIncidencia);
			bd.Usuario bDUsuario = bd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			bd.UsuarioDAO.save(bDUsuario);
			bd.Incidencia_administrador bDIncidencia_administrador = bd.Incidencia_administradorDAO.loadIncidencia_administradorByQuery(null, null);
			// Update the properties of the persistent object
			bd.Incidencia_administradorDAO.save(bDIncidencia_administrador);
			bd.Cliente bDCliente = bd.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			bd.ClienteDAO.save(bDCliente);
			bd.Movil bDMovil = bd.MovilDAO.loadMovilByQuery(null, null);
			// Update the properties of the persistent object
			bd.MovilDAO.save(bDMovil);
			bd.Oferta bDOferta = bd.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			bd.OfertaDAO.save(bDOferta);
			bd.contrato bDcontrato = bd.contratoDAO.loadContratoByQuery(null, null);
			// Update the properties of the persistent object
			bd.contratoDAO.save(bDcontrato);
			bd.Comercial bDComercial = bd.ComercialDAO.loadComercialByQuery(null, null);
			// Update the properties of the persistent object
			bd.ComercialDAO.save(bDComercial);
			bd.Administrador bDAdministrador = bd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			bd.AdministradorDAO.save(bDAdministrador);
			bd.Paquete bDPaquete = bd.PaqueteDAO.loadPaqueteByQuery(null, null);
			// Update the properties of the persistent object
			bd.PaqueteDAO.save(bDPaquete);
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
