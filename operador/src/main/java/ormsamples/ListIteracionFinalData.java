/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListIteracionFinalData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Factura...");
		bd.Factura[] bDFacturas = bd.FacturaDAO.listFacturaByQuery(null, null);
		int length = Math.min(bDFacturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDFacturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Modalidad...");
		bd.Modalidad[] bDModalidads = bd.ModalidadDAO.listModalidadByQuery(null, null);
		length = Math.min(bDModalidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDModalidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Television...");
		bd.Television[] bDTelevisions = bd.TelevisionDAO.listTelevisionByQuery(null, null);
		length = Math.min(bDTelevisions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDTelevisions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Canal...");
		bd.Canal[] bDCanals = bd.CanalDAO.listCanalByQuery(null, null);
		length = Math.min(bDCanals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDCanals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Incidencia...");
		bd.Incidencia[] bDIncidencias = bd.IncidenciaDAO.listIncidenciaByQuery(null, null);
		length = Math.min(bDIncidencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDIncidencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		bd.Usuario[] bDUsuarios = bd.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(bDUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Incidencia_administrador...");
		bd.Incidencia_administrador[] bDIncidencia_administradors = bd.Incidencia_administradorDAO.listIncidencia_administradorByQuery(null, null);
		length = Math.min(bDIncidencia_administradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDIncidencia_administradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		bd.Cliente[] bDClientes = bd.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(bDClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Movil...");
		bd.Movil[] bDMovils = bd.MovilDAO.listMovilByQuery(null, null);
		length = Math.min(bDMovils.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDMovils[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		bd.Oferta[] bDOfertas = bd.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(bDOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing contrato...");
		bd.contrato[] bDcontratos = bd.contratoDAO.listContratoByQuery(null, null);
		length = Math.min(bDcontratos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDcontratos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comercial...");
		bd.Comercial[] bDComercials = bd.ComercialDAO.listComercialByQuery(null, null);
		length = Math.min(bDComercials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDComercials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		bd.Administrador[] bDAdministradors = bd.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(bDAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paquete...");
		bd.Paquete[] bDPaquetes = bd.PaqueteDAO.listPaqueteByQuery(null, null);
		length = Math.min(bDPaquetes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bDPaquetes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Factura by Criteria...");
		bd.FacturaCriteria bDFacturaCriteria = new bd.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDFacturaCriteria.ID.eq();
		bDFacturaCriteria.setMaxResults(ROW_COUNT);
		bd.Factura[] bDFacturas = bDFacturaCriteria.listFactura();
		int length =bDFacturas== null ? 0 : Math.min(bDFacturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDFacturas[i]);
		}
		System.out.println(length + " Factura record(s) retrieved."); 
		
		System.out.println("Listing Modalidad by Criteria...");
		bd.ModalidadCriteria bDModalidadCriteria = new bd.ModalidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDModalidadCriteria.ID.eq();
		bDModalidadCriteria.setMaxResults(ROW_COUNT);
		bd.Modalidad[] bDModalidads = bDModalidadCriteria.listModalidad();
		length =bDModalidads== null ? 0 : Math.min(bDModalidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDModalidads[i]);
		}
		System.out.println(length + " Modalidad record(s) retrieved."); 
		
		System.out.println("Listing Television by Criteria...");
		bd.TelevisionCriteria bDTelevisionCriteria = new bd.TelevisionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDTelevisionCriteria.ID.eq();
		bDTelevisionCriteria.setMaxResults(ROW_COUNT);
		bd.Television[] bDTelevisions = bDTelevisionCriteria.listTelevision();
		length =bDTelevisions== null ? 0 : Math.min(bDTelevisions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDTelevisions[i]);
		}
		System.out.println(length + " Television record(s) retrieved."); 
		
		System.out.println("Listing Canal by Criteria...");
		bd.CanalCriteria bDCanalCriteria = new bd.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDCanalCriteria.ID.eq();
		bDCanalCriteria.setMaxResults(ROW_COUNT);
		bd.Canal[] bDCanals = bDCanalCriteria.listCanal();
		length =bDCanals== null ? 0 : Math.min(bDCanals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDCanals[i]);
		}
		System.out.println(length + " Canal record(s) retrieved."); 
		
		System.out.println("Listing Incidencia by Criteria...");
		bd.IncidenciaCriteria bDIncidenciaCriteria = new bd.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDIncidenciaCriteria.ID.eq();
		bDIncidenciaCriteria.setMaxResults(ROW_COUNT);
		bd.Incidencia[] bDIncidencias = bDIncidenciaCriteria.listIncidencia();
		length =bDIncidencias== null ? 0 : Math.min(bDIncidencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDIncidencias[i]);
		}
		System.out.println(length + " Incidencia record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		bd.UsuarioCriteria bDUsuarioCriteria = new bd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDUsuarioCriteria.ID.eq();
		bDUsuarioCriteria.setMaxResults(ROW_COUNT);
		bd.Usuario[] bDUsuarios = bDUsuarioCriteria.listUsuario();
		length =bDUsuarios== null ? 0 : Math.min(bDUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Incidencia_administrador by Criteria...");
		bd.Incidencia_administradorCriteria bDIncidencia_administradorCriteria = new bd.Incidencia_administradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDIncidencia_administradorCriteria.ID.eq();
		bDIncidencia_administradorCriteria.setMaxResults(ROW_COUNT);
		bd.Incidencia_administrador[] bDIncidencia_administradors = bDIncidencia_administradorCriteria.listIncidencia_administrador();
		length =bDIncidencia_administradors== null ? 0 : Math.min(bDIncidencia_administradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDIncidencia_administradors[i]);
		}
		System.out.println(length + " Incidencia_administrador record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		bd.ClienteCriteria bDClienteCriteria = new bd.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDClienteCriteria.ID.eq();
		bDClienteCriteria.setMaxResults(ROW_COUNT);
		bd.Cliente[] bDClientes = bDClienteCriteria.listCliente();
		length =bDClientes== null ? 0 : Math.min(bDClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Movil by Criteria...");
		bd.MovilCriteria bDMovilCriteria = new bd.MovilCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDMovilCriteria.ID.eq();
		bDMovilCriteria.setMaxResults(ROW_COUNT);
		bd.Movil[] bDMovils = bDMovilCriteria.listMovil();
		length =bDMovils== null ? 0 : Math.min(bDMovils.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDMovils[i]);
		}
		System.out.println(length + " Movil record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		bd.OfertaCriteria bDOfertaCriteria = new bd.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDOfertaCriteria.ID.eq();
		bDOfertaCriteria.setMaxResults(ROW_COUNT);
		bd.Oferta[] bDOfertas = bDOfertaCriteria.listOferta();
		length =bDOfertas== null ? 0 : Math.min(bDOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing contrato by Criteria...");
		bd.contratoCriteria bDcontratoCriteria = new bd.contratoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDcontratoCriteria.ID.eq();
		bDcontratoCriteria.setMaxResults(ROW_COUNT);
		bd.contrato[] bDcontratos = bDcontratoCriteria.listContrato();
		length =bDcontratos== null ? 0 : Math.min(bDcontratos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDcontratos[i]);
		}
		System.out.println(length + " contrato record(s) retrieved."); 
		
		System.out.println("Listing Comercial by Criteria...");
		bd.ComercialCriteria bDComercialCriteria = new bd.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDComercialCriteria.ID.eq();
		bDComercialCriteria.setMaxResults(ROW_COUNT);
		bd.Comercial[] bDComercials = bDComercialCriteria.listComercial();
		length =bDComercials== null ? 0 : Math.min(bDComercials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDComercials[i]);
		}
		System.out.println(length + " Comercial record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		bd.AdministradorCriteria bDAdministradorCriteria = new bd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDAdministradorCriteria.ID.eq();
		bDAdministradorCriteria.setMaxResults(ROW_COUNT);
		bd.Administrador[] bDAdministradors = bDAdministradorCriteria.listAdministrador();
		length =bDAdministradors== null ? 0 : Math.min(bDAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Paquete by Criteria...");
		bd.PaqueteCriteria bDPaqueteCriteria = new bd.PaqueteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bDPaqueteCriteria.ID.eq();
		bDPaqueteCriteria.setMaxResults(ROW_COUNT);
		bd.Paquete[] bDPaquetes = bDPaqueteCriteria.listPaquete();
		length =bDPaquetes== null ? 0 : Math.min(bDPaquetes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bDPaquetes[i]);
		}
		System.out.println(length + " Paquete record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListIteracionFinalData listIteracionFinalData = new ListIteracionFinalData();
			try {
				listIteracionFinalData.listTestData();
				//listIteracionFinalData.listByCriteria();
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
