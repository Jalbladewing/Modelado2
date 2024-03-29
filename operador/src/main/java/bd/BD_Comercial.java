package bd;

import java.util.Calendar;
import java.util.List;
import java.util.Random;
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
	
	public Comercial acceder_comercial(int idComercial)  throws PersistentException 
	{
		Comercial comercial = null;
		
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			comercial = ComercialDAO.getComercialByORMID(idComercial);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
			return null;
		}
		
		return comercial;
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


	
	public boolean modificar_perfil_comercial(Comercial comercial)  throws PersistentException 
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
			comercial.setAdministrador(AdministradorDAO.getAdministradorByORMID(1));
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
		Calendar fechaEliminacion = Calendar.getInstance();
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			fechaEliminacion.add(Calendar.MONTH, 1);
			comercial = ComercialDAO.getComercialByORMID(idComercial);
			comercial.setFechaEliminacion(fechaEliminacion.getTime());
			resultado = ComercialDAO.save(comercial);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	 public String generar_password()  
	   {
		   String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		   String SPECIALCHARS = "?¿¡![]{}()-+<>*,.;^";
		   String NUMCHARS = "1234567890";
		   String order = "123";
	       StringBuilder salt = new StringBuilder();
	       String password;
	       boolean number = false;
	       boolean special = false;
	       boolean letter = false;
	       Random rnd = new Random();
	       while (salt.length() < 10) // length of the random string
	       { 
	    	   int index = (int) (rnd.nextFloat() * order.length());
	    	   
	    	   if(order.charAt(index) == '1')
	    	   {
	    		   
	    		   index = (int) (rnd.nextFloat() * SALTCHARS.length());
	               salt.append(SALTCHARS.charAt(index));
	               letter = true;
	    		   
	    	   }else if(order.charAt(index) == '2')
	    	   {
	    		   
	    		   index  = (int) (rnd.nextFloat() * SPECIALCHARS.length());
	               salt.append(SPECIALCHARS.charAt(index));
	               special = true;
	    		   
	    	   }else
	    	   {
	    		   index  = (int) (rnd.nextFloat() * NUMCHARS.length());
	               salt.append(NUMCHARS.charAt(index));
	               number = true;
	    	   } 
	         
	       }
	       
	       if(!number)
	       {
	    	   int index = (int) (rnd.nextFloat() * NUMCHARS.length());
	           salt.append(NUMCHARS.charAt(index));
	    	   
	       }
	      
	       if(!letter)
	       {
	    	   int index = (int) (rnd.nextFloat() * NUMCHARS.length());
	           salt.append(NUMCHARS.charAt(index));
	       }
	       
	       if(!special)
	       {
	    	   int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	           salt.append(SALTCHARS.charAt(index));
	       }
	       
	       password = salt.toString();
	       return password;
	   }

	 public boolean cancelar_baja_comercial(int idComercial) throws PersistentException
	 {
		  Comercial comercial = null;
		  boolean resultado = false;
		  PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		  
		  try
		  {
			    comercial = ComercialDAO.getComercialByORMID(idComercial);
			    comercial.setFechaEliminacion(null);
				resultado = ComercialDAO.save(comercial);
				
				t.commit();
				
			}catch(Exception e)
			{
				t.rollback();
			}
		  
		  return resultado;
	}
}