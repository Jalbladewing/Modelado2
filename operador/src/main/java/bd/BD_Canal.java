package bd;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;



public class BD_Canal {
	public BD_Principal _bd_prin_canal;
	public Vector<Canal> _contiene_canal = new Vector<Canal>();

	public List cargar_canales()  throws PersistentException 
	{
		List<Canal> canales = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			canales = CanalDAO.queryCanal(null, null);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return canales;
	}

	public boolean crear_modalidad_canal(Canal canal)  throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = CanalDAO.save(canal);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
	
	public boolean actualizar_modalidad_canal(Canal canal)  throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = CanalDAO.refresh(canal);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
}