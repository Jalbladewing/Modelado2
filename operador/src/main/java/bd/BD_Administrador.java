package bd;

import java.util.Arrays;
import java.util.List;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


public class BD_Administrador {
	public BD_Principal _bd_prin_admin;
	public Vector<Administrador> _contiene_admin = new Vector<Administrador>();

	public Usuario verificar_loguin(String email, String password) throws PersistentException 
	{
		Usuario user = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			AdministradorCriteria administradorCriteria = new AdministradorCriteria();
			administradorCriteria.email.eq(email);
			user = AdministradorDAO.loadAdministradorByCriteria(administradorCriteria);
			
			if(!user.getPassword().equals(password)) user = null;
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return user;
 
	}
	
	public List cargar_modalidades_destacadas()  throws PersistentException 
	{
		List<Modalidad> modalidades = null;
		List<Administrador> administrador = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			administrador = AdministradorDAO.queryAdministrador(null, null);
			modalidades = Arrays.asList(administrador.get(0).modalidadDestacada.toArray());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidades;
	}

	public Administrador acceder_administrador(int idAdministrador) throws PersistentException  
	{
		Administrador administrador = null;
		
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			administrador = AdministradorDAO.getAdministradorByORMID(idAdministrador);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
			return null;
		}
		
		return administrador;
	}
	
	public Usuario verificar_usuario(String email) throws PersistentException 
	{
		Usuario user = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			AdministradorCriteria administradorCriteria = new AdministradorCriteria();
			administradorCriteria.email.eq(email);
			user = AdministradorDAO.loadAdministradorByCriteria(administradorCriteria);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return user;
	}

	

	public boolean modificar_perfil_administrador(Administrador administrador) throws PersistentException  
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = AdministradorDAO.save(administrador);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
}