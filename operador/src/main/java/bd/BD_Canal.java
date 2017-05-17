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

	public List cargar_modalidades_factura(int idFactura)  throws PersistentException 
	{
		List<Modalidad> modalidades = null;
		Factura factura = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			factura = FacturaDAO.getFacturaByORMID(idFactura);
			modalidades = Arrays.asList(factura.modalidad.toArray());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return modalidades;
	}

	public List cargar_modalidades_cliente(int idCliente)  throws PersistentException 
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
}