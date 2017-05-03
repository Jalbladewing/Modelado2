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
			bd.Factura bDFactura = bd.Factura.loadFacturaByQuery(null, null);
			bDFactura.delete();
			bd.Modalidad bDModalidad = bd.Modalidad.loadModalidadByQuery(null, null);
			bDModalidad.delete();
			bd.Television bDTelevision = bd.Television.loadTelevisionByQuery(null, null);
			bDTelevision.delete();
			bd.Canal bDCanal = bd.Canal.loadCanalByQuery(null, null);
			bDCanal.delete();
			bd.Incidencia bDIncidencia = bd.Incidencia.loadIncidenciaByQuery(null, null);
			bDIncidencia.delete();
			bd.Usuario bDUsuario = bd.Usuario.loadUsuarioByQuery(null, null);
			bDUsuario.delete();
			bd.Incidencia_administrador bDIncidencia_administrador = bd.Incidencia_administrador.loadIncidencia_administradorByQuery(null, null);
			bDIncidencia_administrador.delete();
			bd.Cliente bDCliente = bd.Cliente.loadClienteByQuery(null, null);
			bDCliente.delete();
			bd.Movil bDMovil = bd.Movil.loadMovilByQuery(null, null);
			bDMovil.delete();
			bd.Oferta bDOferta = bd.Oferta.loadOfertaByQuery(null, null);
			bDOferta.delete();
			bd.contrato bDcontrato = bd.contrato.loadContratoByQuery(null, null);
			bDcontrato.delete();
			bd.Comercial bDComercial = bd.Comercial.loadComercialByQuery(null, null);
			bDComercial.delete();
			bd.Administrador bDAdministrador = bd.Administrador.loadAdministradorByQuery(null, null);
			bDAdministrador.delete();
			bd.Paquete bDPaquete = bd.Paquete.loadPaqueteByQuery(null, null);
			bDPaquete.delete();
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
