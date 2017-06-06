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
			bd.Factura lbdFactura = bd.FacturaDAO.loadFacturaByQuery(null, null);
			// Delete the persistent object
			bd.FacturaDAO.delete(lbdFactura);
			bd.Modalidad lbdModalidad = bd.ModalidadDAO.loadModalidadByQuery(null, null);
			// Delete the persistent object
			bd.ModalidadDAO.delete(lbdModalidad);
			bd.Television lbdTelevision = bd.TelevisionDAO.loadTelevisionByQuery(null, null);
			// Delete the persistent object
			bd.TelevisionDAO.delete(lbdTelevision);
			bd.Canal lbdCanal = bd.CanalDAO.loadCanalByQuery(null, null);
			// Delete the persistent object
			bd.CanalDAO.delete(lbdCanal);
			bd.Incidencia lbdIncidencia = bd.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Delete the persistent object
			bd.IncidenciaDAO.delete(lbdIncidencia);
			bd.Usuario lbdUsuario = bd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			bd.UsuarioDAO.delete(lbdUsuario);
			bd.Incidencia_administrador lbdIncidencia_administrador = bd.Incidencia_administradorDAO.loadIncidencia_administradorByQuery(null, null);
			// Delete the persistent object
			bd.Incidencia_administradorDAO.delete(lbdIncidencia_administrador);
			bd.Cliente lbdCliente = bd.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			bd.ClienteDAO.delete(lbdCliente);
			bd.Movil lbdMovil = bd.MovilDAO.loadMovilByQuery(null, null);
			// Delete the persistent object
			bd.MovilDAO.delete(lbdMovil);
			bd.Oferta lbdOferta = bd.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			bd.OfertaDAO.delete(lbdOferta);
			bd.contrato lbdcontrato = bd.contratoDAO.loadContratoByQuery(null, null);
			// Delete the persistent object
			bd.contratoDAO.delete(lbdcontrato);
			bd.Comercial lbdComercial = bd.ComercialDAO.loadComercialByQuery(null, null);
			// Delete the persistent object
			bd.ComercialDAO.delete(lbdComercial);
			bd.Administrador lbdAdministrador = bd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			bd.AdministradorDAO.delete(lbdAdministrador);
			bd.Paquete lbdPaquete = bd.PaqueteDAO.loadPaqueteByQuery(null, null);
			// Delete the persistent object
			bd.PaqueteDAO.delete(lbdPaquete);
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
