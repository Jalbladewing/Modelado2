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
		bd.Factura[] bdFacturas = bd.FacturaDAO.listFacturaByQuery(null, null);
		int length = Math.min(bdFacturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdFacturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Modalidad...");
		bd.Modalidad[] bdModalidads = bd.ModalidadDAO.listModalidadByQuery(null, null);
		length = Math.min(bdModalidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdModalidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Television...");
		bd.Television[] bdTelevisions = bd.TelevisionDAO.listTelevisionByQuery(null, null);
		length = Math.min(bdTelevisions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdTelevisions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Canal...");
		bd.Canal[] bdCanals = bd.CanalDAO.listCanalByQuery(null, null);
		length = Math.min(bdCanals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdCanals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Incidencia...");
		bd.Incidencia[] bdIncidencias = bd.IncidenciaDAO.listIncidenciaByQuery(null, null);
		length = Math.min(bdIncidencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdIncidencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		bd.Usuario[] bdUsuarios = bd.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(bdUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Incidencia_administrador...");
		bd.Incidencia_administrador[] bdIncidencia_administradors = bd.Incidencia_administradorDAO.listIncidencia_administradorByQuery(null, null);
		length = Math.min(bdIncidencia_administradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdIncidencia_administradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		bd.Cliente[] bdClientes = bd.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(bdClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Movil...");
		bd.Movil[] bdMovils = bd.MovilDAO.listMovilByQuery(null, null);
		length = Math.min(bdMovils.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdMovils[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		bd.Oferta[] bdOfertas = bd.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(bdOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing contrato...");
		bd.contrato[] bdcontratos = bd.contratoDAO.listContratoByQuery(null, null);
		length = Math.min(bdcontratos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdcontratos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comercial...");
		bd.Comercial[] bdComercials = bd.ComercialDAO.listComercialByQuery(null, null);
		length = Math.min(bdComercials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdComercials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		bd.Administrador[] bdAdministradors = bd.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(bdAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paquete...");
		bd.Paquete[] bdPaquetes = bd.PaqueteDAO.listPaqueteByQuery(null, null);
		length = Math.min(bdPaquetes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bdPaquetes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Factura by Criteria...");
		bd.FacturaCriteria lbdFacturaCriteria = new bd.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdFacturaCriteria.ID.eq();
		lbdFacturaCriteria.setMaxResults(ROW_COUNT);
		bd.Factura[] bdFacturas = lbdFacturaCriteria.listFactura();
		int length =bdFacturas== null ? 0 : Math.min(bdFacturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdFacturas[i]);
		}
		System.out.println(length + " Factura record(s) retrieved."); 
		
		System.out.println("Listing Modalidad by Criteria...");
		bd.ModalidadCriteria lbdModalidadCriteria = new bd.ModalidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdModalidadCriteria.ID.eq();
		lbdModalidadCriteria.setMaxResults(ROW_COUNT);
		bd.Modalidad[] bdModalidads = lbdModalidadCriteria.listModalidad();
		length =bdModalidads== null ? 0 : Math.min(bdModalidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdModalidads[i]);
		}
		System.out.println(length + " Modalidad record(s) retrieved."); 
		
		System.out.println("Listing Television by Criteria...");
		bd.TelevisionCriteria lbdTelevisionCriteria = new bd.TelevisionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdTelevisionCriteria.ID.eq();
		lbdTelevisionCriteria.setMaxResults(ROW_COUNT);
		bd.Television[] bdTelevisions = lbdTelevisionCriteria.listTelevision();
		length =bdTelevisions== null ? 0 : Math.min(bdTelevisions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdTelevisions[i]);
		}
		System.out.println(length + " Television record(s) retrieved."); 
		
		System.out.println("Listing Canal by Criteria...");
		bd.CanalCriteria lbdCanalCriteria = new bd.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdCanalCriteria.ID.eq();
		lbdCanalCriteria.setMaxResults(ROW_COUNT);
		bd.Canal[] bdCanals = lbdCanalCriteria.listCanal();
		length =bdCanals== null ? 0 : Math.min(bdCanals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdCanals[i]);
		}
		System.out.println(length + " Canal record(s) retrieved."); 
		
		System.out.println("Listing Incidencia by Criteria...");
		bd.IncidenciaCriteria lbdIncidenciaCriteria = new bd.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdIncidenciaCriteria.ID.eq();
		lbdIncidenciaCriteria.setMaxResults(ROW_COUNT);
		bd.Incidencia[] bdIncidencias = lbdIncidenciaCriteria.listIncidencia();
		length =bdIncidencias== null ? 0 : Math.min(bdIncidencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdIncidencias[i]);
		}
		System.out.println(length + " Incidencia record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		bd.UsuarioCriteria lbdUsuarioCriteria = new bd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdUsuarioCriteria.ID.eq();
		lbdUsuarioCriteria.setMaxResults(ROW_COUNT);
		bd.Usuario[] bdUsuarios = lbdUsuarioCriteria.listUsuario();
		length =bdUsuarios== null ? 0 : Math.min(bdUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Incidencia_administrador by Criteria...");
		bd.Incidencia_administradorCriteria lbdIncidencia_administradorCriteria = new bd.Incidencia_administradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdIncidencia_administradorCriteria.ID.eq();
		lbdIncidencia_administradorCriteria.setMaxResults(ROW_COUNT);
		bd.Incidencia_administrador[] bdIncidencia_administradors = lbdIncidencia_administradorCriteria.listIncidencia_administrador();
		length =bdIncidencia_administradors== null ? 0 : Math.min(bdIncidencia_administradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdIncidencia_administradors[i]);
		}
		System.out.println(length + " Incidencia_administrador record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		bd.ClienteCriteria lbdClienteCriteria = new bd.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdClienteCriteria.ID.eq();
		lbdClienteCriteria.setMaxResults(ROW_COUNT);
		bd.Cliente[] bdClientes = lbdClienteCriteria.listCliente();
		length =bdClientes== null ? 0 : Math.min(bdClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Movil by Criteria...");
		bd.MovilCriteria lbdMovilCriteria = new bd.MovilCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdMovilCriteria.ID.eq();
		lbdMovilCriteria.setMaxResults(ROW_COUNT);
		bd.Movil[] bdMovils = lbdMovilCriteria.listMovil();
		length =bdMovils== null ? 0 : Math.min(bdMovils.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdMovils[i]);
		}
		System.out.println(length + " Movil record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		bd.OfertaCriteria lbdOfertaCriteria = new bd.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdOfertaCriteria.ID.eq();
		lbdOfertaCriteria.setMaxResults(ROW_COUNT);
		bd.Oferta[] bdOfertas = lbdOfertaCriteria.listOferta();
		length =bdOfertas== null ? 0 : Math.min(bdOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing contrato by Criteria...");
		bd.contratoCriteria lbdcontratoCriteria = new bd.contratoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdcontratoCriteria.ID.eq();
		lbdcontratoCriteria.setMaxResults(ROW_COUNT);
		bd.contrato[] bdcontratos = lbdcontratoCriteria.listContrato();
		length =bdcontratos== null ? 0 : Math.min(bdcontratos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdcontratos[i]);
		}
		System.out.println(length + " contrato record(s) retrieved."); 
		
		System.out.println("Listing Comercial by Criteria...");
		bd.ComercialCriteria lbdComercialCriteria = new bd.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdComercialCriteria.ID.eq();
		lbdComercialCriteria.setMaxResults(ROW_COUNT);
		bd.Comercial[] bdComercials = lbdComercialCriteria.listComercial();
		length =bdComercials== null ? 0 : Math.min(bdComercials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdComercials[i]);
		}
		System.out.println(length + " Comercial record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		bd.AdministradorCriteria lbdAdministradorCriteria = new bd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdAdministradorCriteria.ID.eq();
		lbdAdministradorCriteria.setMaxResults(ROW_COUNT);
		bd.Administrador[] bdAdministradors = lbdAdministradorCriteria.listAdministrador();
		length =bdAdministradors== null ? 0 : Math.min(bdAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Paquete by Criteria...");
		bd.PaqueteCriteria lbdPaqueteCriteria = new bd.PaqueteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbdPaqueteCriteria.ID.eq();
		lbdPaqueteCriteria.setMaxResults(ROW_COUNT);
		bd.Paquete[] bdPaquetes = lbdPaqueteCriteria.listPaquete();
		length =bdPaquetes== null ? 0 : Math.min(bdPaquetes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bdPaquetes[i]);
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
