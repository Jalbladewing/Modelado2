/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteIteracionFinalData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		try {
			bd.Factura bDFactura = bd.FacturaDAO.loadFacturaByQuery(null, null);
			// Delete the persistent object
			bd.FacturaDAO.delete(bDFactura);
			bd.Modalidad bDModalidad = bd.ModalidadDAO.loadModalidadByQuery(null, null);
			// Delete the persistent object
			bd.ModalidadDAO.delete(bDModalidad);
			bd.Television bDTelevision = bd.TelevisionDAO.loadTelevisionByQuery(null, null);
			// Delete the persistent object
			bd.TelevisionDAO.delete(bDTelevision);
			bd.Canal bDCanal = bd.CanalDAO.loadCanalByQuery(null, null);
			// Delete the persistent object
			bd.CanalDAO.delete(bDCanal);
			bd.Incidencia bDIncidencia = bd.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Delete the persistent object
			bd.IncidenciaDAO.delete(bDIncidencia);
			bd.Usuario bDUsuario = bd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			bd.UsuarioDAO.delete(bDUsuario);
			bd.Incidencia_administrador bDIncidencia_administrador = bd.Incidencia_administradorDAO.loadIncidencia_administradorByQuery(null, null);
			// Delete the persistent object
			bd.Incidencia_administradorDAO.delete(bDIncidencia_administrador);
			bd.Cliente bDCliente = bd.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			bd.ClienteDAO.delete(bDCliente);
			bd.Movil bDMovil = bd.MovilDAO.loadMovilByQuery(null, null);
			// Delete the persistent object
			bd.MovilDAO.delete(bDMovil);
			bd.Oferta bDOferta = bd.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			bd.OfertaDAO.delete(bDOferta);
			bd.contrato bDcontrato = bd.contratoDAO.loadContratoByQuery(null, null);
			// Delete the persistent object
			bd.contratoDAO.delete(bDcontrato);
			bd.Comercial bDComercial = bd.ComercialDAO.loadComercialByQuery(null, null);
			// Delete the persistent object
			bd.ComercialDAO.delete(bDComercial);
			bd.Administrador bDAdministrador = bd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			bd.AdministradorDAO.delete(bDAdministrador);
			bd.Paquete bDPaquete = bd.PaqueteDAO.loadPaqueteByQuery(null, null);
			// Delete the persistent object
			bd.PaqueteDAO.delete(bDPaquete);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteIteracionFinalData deleteIteracionFinalData = new DeleteIteracionFinalData();
			try {
				deleteIteracionFinalData.deleteTestData();
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
