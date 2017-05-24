package bd;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;



public class BD_Comercial {
	public BD_Principal _bd_prin_comerc;
	public Vector<Comercial> _contiene_comerc = new Vector<Comercial>();

	public Usuario verificar_loguin(String email, String password) throws PersistentException 
	{
		Usuario user = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			ComercialCriteria comercialCriteria = new ComercialCriteria();
			comercialCriteria.email.eq(email);
			user = ComercialDAO.loadComercialByCriteria(comercialCriteria);
			
			if(!user.getPassword().equals(password)) user = null;
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return user;
 
	}
	
	public boolean acceder_comercial(int idComercial)  throws PersistentException 
	{
		Comercial comercial = null;
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			comercial = ComercialDAO.getComercialByORMID(idComercial);
			resultado = true;
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
	public Usuario verificar_usuario(String email) throws PersistentException 
	{
		Usuario user = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			ComercialCriteria comercialCriteria = new ComercialCriteria();
			comercialCriteria.email.eq(email);
			user = ComercialDAO.loadComercialByCriteria(comercialCriteria);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return user;
	}


	public String generar_password(int idComercial)  throws PersistentException 
	{
		throw new UnsupportedOperationException();
	}

	public boolean modificar_perfil_comercial(Comercial comercial)  throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = ComercialDAO.refresh(comercial);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_comerciales()  throws PersistentException 
	{
		List<Comercial> comerciales = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			comerciales = ComercialDAO.queryComercial(null, null);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return comerciales;
	}

	public boolean registrar_comercial(Comercial comercial)  throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = ComercialDAO.save(comercial);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean baja_comercial(int idComercial)  throws PersistentException 
	{
		Comercial comercial = null;
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			comercial = ComercialDAO.getComercialByORMID(idComercial);
			resultado = ComercialDAO.delete(comercial);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
}