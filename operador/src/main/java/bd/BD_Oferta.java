package bd;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;



public class BD_Oferta {
	public BD_Principal _bd_prin_ofer;
	public Vector<Oferta> _contiene_ofer = new Vector<Oferta>();

	public List cargar_modalidades_telefono_fijo() throws PersistentException 
	{
		List<Modalidad> modalidades = null;
		ModalidadCriteria modalidadCriteria = new ModalidadCriteria();
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidadCriteria.tipo.eq("telefonoFijo");
			modalidades = Arrays.asList(ModalidadDAO.listModalidadByCriteria(modalidadCriteria));

			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidades;
	}

	public List cargar_modalidades_internet() throws PersistentException 
	{
		List<Modalidad> modalidades = null;
		ModalidadCriteria modalidadCriteria = new ModalidadCriteria();
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidadCriteria.tipo.eq("internet");
			modalidades = Arrays.asList(ModalidadDAO.listModalidadByCriteria(modalidadCriteria));

			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidades;
	}

	public List cargar_modalidades_oferta() throws PersistentException 
	{
		List<Oferta> ofertas = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			ofertas = OfertaDAO.queryOferta(null, null);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return ofertas;
	}

	public List cargar_modalidades_cliente(int idCliente) throws PersistentException 
	{
		List<Modalidad> modalidades = null;
		Cliente cliente = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			modalidades = Arrays.asList(cliente.getModalidads());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidades;
	}

	public boolean cambiar_visibilidad_modalidad(int idModalidad) throws PersistentException 
	{
		boolean resultado = false;
		Modalidad modalidad = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			
			if(modalidad.getVisibilidad())
			{
				modalidad.setVisibilidad(false);
			}else
			{
				modalidad.setVisibilidad(true);
			}
			
			resultado = ModalidadDAO.save(modalidad);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean eliminar_modalidad_destacada(int idModalidad) throws PersistentException 
	{
		boolean resultado = false;
		List<Modalidad> modalidades = null;
		List<Administrador> administrador = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			administrador = AdministradorDAO.queryAdministrador(null, null);
			modalidades = Arrays.asList(administrador.get(0).modalidadDestacada.toArray());
			
			for(int i = 0; i < modalidades.size();i++)
			{
				if(modalidades.get(i).getID() == idModalidad)
				{
					administrador.get(0).modalidadDestacada.remove(modalidades.get(i));
					break;
				}
			}
			
			resultado = AdministradorDAO.save(administrador.get(0));
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean add_modalidad_destacada(int idModalidad) throws PersistentException 
	{
		boolean resultado = false;
		List<Modalidad> modalidades = null;
		List<Administrador> administrador = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			administrador = AdministradorDAO.queryAdministrador(null, null);		
			administrador.get(0).modalidadDestacada.add(ModalidadDAO.getModalidadByORMID(idModalidad));
			
			resultado = AdministradorDAO.save(administrador.get(0));
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_modalidades() throws PersistentException 
	{
		List<Modalidad> modalidades = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidades = ModalidadDAO.queryModalidad(null, null);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidades;
	}

	public boolean crear_modalidad(Oferta oferta) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = OfertaDAO.save(oferta);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
	public boolean actualizar_modalidad(Oferta oferta) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = OfertaDAO.save(oferta);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_modalidades_incluidas_oferta(int idOferta) throws PersistentException 
	{
		List<Modalidad> modalidades = null;
		Oferta oferta = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			oferta = OfertaDAO.getOfertaByORMID(idOferta);
			modalidades = Arrays.asList(oferta.modalidad.toArray());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidades;
	}

	public boolean crear_modalidad_general(Modalidad modalidad) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = ModalidadDAO.save(modalidad);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
	public boolean actualizar_modalidad_general(Modalidad modalidad) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = ModalidadDAO.save(modalidad);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	//idANuevo es la modalidad nueva a la que se traspasan los usuarios
	public boolean guardar_traspaso(int idNuevo, List usuarios) throws PersistentException 
	{
		boolean resultado = false;
		Modalidad modalidad = null;
		Cliente cliente = null;
		contrato _contrato = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidad = ModalidadDAO.getModalidadByORMID(idNuevo);
			
			for(int i = 0; i < usuarios.size(); i++)
			{
				cliente = ClienteDAO.getClienteByORMID(((Cliente)usuarios.get(i)).getID());
				
				_contrato = contratoDAO.createContrato();
				_contrato.setCliente(cliente);
				_contrato.setModalidad(modalidad);
				_contrato.setFecha(new Date());
				
				cliente.addModalidad(_contrato, modalidad);
				
				resultado = ClienteDAO.save(cliente);
				
				if(!resultado) break;
			}
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	//idAntiguo es la modalidad antigua de la que se "eliminan" los usuarios
	public boolean eliminar_traspaso(int idAntiguo) throws PersistentException 
	{
		boolean resultado = false;
		Modalidad modalidad = null;
		Cliente cliente = null;
		List<contrato> _contrato = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidad = ModalidadDAO.getModalidadByORMID(idAntiguo);
			_contrato = contratoDAO.queryContrato(null, null);
			
			
			for(int i = 0; i < modalidad.getClientes().length; i++)
			{
				cliente = ClienteDAO.getClienteByORMID(modalidad.getClientes()[i].getID());
				
				cliente.contratos.remove(cliente.getContratoByModalidad(modalidad));
				
				
				resultado = ClienteDAO.save(cliente);
				
				if(!resultado) break;
			}
			
			modalidad.contratos.clear();
			
			if(resultado) resultado = ModalidadDAO.save(modalidad);
			
			for(int i = 0; i < _contrato.size(); i++)
			{
				if(_contrato.get(i).getModalidad().getID() == idAntiguo)
				{
					resultado = contratoDAO.delete(_contrato.get(i));
					
					if(!resultado) break;
				}		
				
			}
			
						
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean eliminar_modalidad(int idModalidad, int dias) throws PersistentException 
	{
		Modalidad modalidad = null;
		boolean resultado = false;
		Calendar fecha = Calendar.getInstance();
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			fecha.add(Calendar.DATE, dias);
			modalidad.setFechaEliminacion(fecha.getTime());
			resultado = ModalidadDAO.save(modalidad);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
	public Modalidad cargar_modalidad_nombre(String nombre)throws PersistentException 
	{
		Modalidad modalidad = null;
    	PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
    	try
		{
    		ModalidadCriteria modalidadCriteria = new ModalidadCriteria();
    		modalidadCriteria.nombre.eq(nombre);
    		modalidad = ModalidadDAO.loadModalidadByCriteria(modalidadCriteria);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
    	
    	return modalidad;
	}

	public Oferta cargar_modalidad_oferta(String nombre) throws PersistentException
	{
		Oferta oferta = null;
    	PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
    	try
		{
    		OfertaCriteria ofertaCriteria = new OfertaCriteria();
    		ofertaCriteria.nombre.eq(nombre);
    		oferta = OfertaDAO.loadOfertaByCriteria(ofertaCriteria);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
    	
    	return oferta;
	}

	
	public Modalidad cargar_modalidad(int idModalidad)throws PersistentException 
	{
		Modalidad modalidad = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidad;
	}

	public boolean cancelar_eliminacion_modalidad(int idModalidad) throws PersistentException 
	{
		Modalidad modalidad = null;
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			modalidad.setFechaEliminacion(null);
			resultado = ModalidadDAO.save(modalidad);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
}