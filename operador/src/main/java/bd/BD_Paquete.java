package bd;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;



public class BD_Paquete {
	public Vector<Paquete> _contiene_paq = new Vector<Paquete>();
	public BD_Principal _bd_prin_paq;

	public List cargar_paquetes() throws PersistentException 
	{
		List<Paquete> paquetes = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			paquetes = PaqueteDAO.queryPaquete(null, null);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return paquetes;
	}

	public boolean crear_modalidad_paquete(Paquete paquete) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = PaqueteDAO.save(paquete);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
	public boolean actualizar_modalidad_paquete(Paquete paquete) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = PaqueteDAO.save(paquete);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_canales_incluidos_paquete(int idPaquete) throws PersistentException 
	{
		List<Canal> canales = null;
		Paquete paquete = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			paquete = PaqueteDAO.getPaqueteByORMID(idPaquete);
			canales = Arrays.asList(paquete.modalidad.toArray());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return canales;
	}
}