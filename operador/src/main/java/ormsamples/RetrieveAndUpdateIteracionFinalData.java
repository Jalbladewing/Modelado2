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
			bd.Factura lbdFactura = bd.FacturaDAO.loadFacturaByQuery(null, null);
			// Update the properties of the persistent object
			bd.FacturaDAO.save(lbdFactura);
			bd.Modalidad lbdModalidad = bd.ModalidadDAO.loadModalidadByQuery(null, null);
			// Update the properties of the persistent object
			bd.ModalidadDAO.save(lbdModalidad);
			bd.Television lbdTelevision = bd.TelevisionDAO.loadTelevisionByQuery(null, null);
			// Update the properties of the persistent object
			bd.TelevisionDAO.save(lbdTelevision);
			bd.Canal lbdCanal = bd.CanalDAO.loadCanalByQuery(null, null);
			// Update the properties of the persistent object
			bd.CanalDAO.save(lbdCanal);
			bd.Incidencia lbdIncidencia = bd.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Update the properties of the persistent object
			bd.IncidenciaDAO.save(lbdIncidencia);
			bd.Usuario lbdUsuario = bd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			bd.UsuarioDAO.save(lbdUsuario);
			bd.Incidencia_administrador lbdIncidencia_administrador = bd.Incidencia_administradorDAO.loadIncidencia_administradorByQuery(null, null);
			// Update the properties of the persistent object
			bd.Incidencia_administradorDAO.save(lbdIncidencia_administrador);
			bd.Cliente lbdCliente = bd.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			bd.ClienteDAO.save(lbdCliente);
			bd.Movil lbdMovil = bd.MovilDAO.loadMovilByQuery(null, null);
			// Update the properties of the persistent object
			bd.MovilDAO.save(lbdMovil);
			bd.Oferta lbdOferta = bd.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			bd.OfertaDAO.save(lbdOferta);
			bd.contrato lbdcontrato = bd.contratoDAO.loadContratoByQuery(null, null);
			// Update the properties of the persistent object
			bd.contratoDAO.save(lbdcontrato);
			bd.Comercial lbdComercial = bd.ComercialDAO.loadComercialByQuery(null, null);
			// Update the properties of the persistent object
			bd.ComercialDAO.save(lbdComercial);
			bd.Administrador lbdAdministrador = bd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			bd.AdministradorDAO.save(lbdAdministrador);
			bd.Paquete lbdPaquete = bd.PaqueteDAO.loadPaqueteByQuery(null, null);
			// Update the properties of the persistent object
			bd.PaqueteDAO.save(lbdPaquete);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Factura by FacturaCriteria");
		bd.FacturaCriteria lbdFacturaCriteria = new bd.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdFacturaCriteria.ID.eq();
		System.out.println(lbdFacturaCriteria.uniqueFactura());
		
		System.out.println("Retrieving Modalidad by ModalidadCriteria");
		bd.ModalidadCriteria lbdModalidadCriteria = new bd.ModalidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdModalidadCriteria.ID.eq();
		System.out.println(lbdModalidadCriteria.uniqueModalidad());
		
		System.out.println("Retrieving Television by TelevisionCriteria");
		bd.TelevisionCriteria lbdTelevisionCriteria = new bd.TelevisionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdTelevisionCriteria.ID.eq();
		System.out.println(lbdTelevisionCriteria.uniqueTelevision());
		
		System.out.println("Retrieving Canal by CanalCriteria");
		bd.CanalCriteria lbdCanalCriteria = new bd.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdCanalCriteria.ID.eq();
		System.out.println(lbdCanalCriteria.uniqueCanal());
		
		System.out.println("Retrieving Incidencia by IncidenciaCriteria");
		bd.IncidenciaCriteria lbdIncidenciaCriteria = new bd.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdIncidenciaCriteria.ID.eq();
		System.out.println(lbdIncidenciaCriteria.uniqueIncidencia());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		bd.UsuarioCriteria lbdUsuarioCriteria = new bd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdUsuarioCriteria.ID.eq();
		System.out.println(lbdUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Incidencia_administrador by Incidencia_administradorCriteria");
		bd.Incidencia_administradorCriteria lbdIncidencia_administradorCriteria = new bd.Incidencia_administradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdIncidencia_administradorCriteria.ID.eq();
		System.out.println(lbdIncidencia_administradorCriteria.uniqueIncidencia_administrador());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		bd.ClienteCriteria lbdClienteCriteria = new bd.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdClienteCriteria.ID.eq();
		System.out.println(lbdClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Movil by MovilCriteria");
		bd.MovilCriteria lbdMovilCriteria = new bd.MovilCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdMovilCriteria.ID.eq();
		System.out.println(lbdMovilCriteria.uniqueMovil());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		bd.OfertaCriteria lbdOfertaCriteria = new bd.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdOfertaCriteria.ID.eq();
		System.out.println(lbdOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving contrato by contratoCriteria");
		bd.contratoCriteria lbdcontratoCriteria = new bd.contratoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdcontratoCriteria.ID.eq();
		System.out.println(lbdcontratoCriteria.uniqueContrato());
		
		System.out.println("Retrieving Comercial by ComercialCriteria");
		bd.ComercialCriteria lbdComercialCriteria = new bd.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdComercialCriteria.ID.eq();
		System.out.println(lbdComercialCriteria.uniqueComercial());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		bd.AdministradorCriteria lbdAdministradorCriteria = new bd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdAdministradorCriteria.ID.eq();
		System.out.println(lbdAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Paquete by PaqueteCriteria");
		bd.PaqueteCriteria lbdPaqueteCriteria = new bd.PaqueteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbdPaqueteCriteria.ID.eq();
		System.out.println(lbdPaqueteCriteria.uniquePaquete());
		
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
