package bd;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


public class BD_Incidencia_administrador {
	public BD_Principal _bd_prin_incid_admin;
	public Vector<Incidencia_administrador> _contiene_incid_admin = new Vector<Incidencia_administrador>();

	public boolean registrar_incidencia_llamada(String telefono) throws PersistentException 
	{
		boolean resultado = false;
		Incidencia incidencia = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			incidencia = IncidenciaDAO.createIncidencia();
			incidencia.setCliente(null);
			incidencia.setComercial(null);
			incidencia.setFecha(new Date());
			incidencia.setAsunto("Llamar al " + telefono);
			incidencia.setCorreoCliente("Sin registrar");
			incidencia.setDescripcion("Llamar al numero " + telefono);
			incidencia.setEstado("pendiente");
			incidencia.setObservacion("");
			incidencia.setTipoIncidencia("llamada");
			
			resultado = IncidenciaDAO.save(incidencia);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_incidencias_cliente(int idCliente) throws PersistentException 
	{
		List<Incidencia> incidencias = null;
		Cliente cliente = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			incidencias = Arrays.asList(cliente.incidencia.toArray());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return incidencias;
	}

	public boolean registrar_incidencia(Incidencia incidencia) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = IncidenciaDAO.save(incidencia);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_incidencias_comercial(int idComercial) throws PersistentException 
	{
		List<Incidencia> incidencias = null;
		Comercial comercial = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			comercial = ComercialDAO.getComercialByORMID(idComercial);
			incidencias = Arrays.asList(comercial.incidencia.toArray());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return incidencias;
	}

	public boolean resolver_incidencia(int idIncidencia, String observaciones) throws PersistentException 
	{
		boolean resultado = false;
		Incidencia incidencia = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			incidencia = IncidenciaDAO.getIncidenciaByORMID(idIncidencia);
			incidencia.setEstado("resuelta");
			incidencia.setObservacion(observaciones);
			resultado = IncidenciaDAO.save(incidencia);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
	public boolean cancelar_incidencia(int idIncidencia, String observaciones) throws PersistentException 
	{
		boolean resultado = false;
		Incidencia incidencia = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			incidencia = IncidenciaDAO.getIncidenciaByORMID(idIncidencia);
			incidencia.setEstado("cancelada");
			incidencia.setObservacion(observaciones);
			resultado = IncidenciaDAO.save(incidencia);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean registrar_incidencia_asignada(int idComercial, int idIncidencia) throws PersistentException 
	{
		Comercial comercial = null;
		Incidencia incidencia = null;
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			comercial = ComercialDAO.getComercialByORMID(idComercial);
			incidencia = IncidenciaDAO.getIncidenciaByORMID(idIncidencia);
			
			comercial.incidencia.add(incidencia);
			incidencia.setComercial(comercial);
			
			resultado = IncidenciaDAO.save(incidencia);
			
			if(resultado) resultado = ComercialDAO.save(comercial);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_incidencias() throws PersistentException 
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

	public Incidencia cargar_incidencia(int id) throws PersistentException  
	{
		Incidencia incidencia = null;
		
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			incidencia = IncidenciaDAO.getIncidenciaByORMID(id);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return incidencia;
	}
}