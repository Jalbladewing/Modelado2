package bd;

import java.util.Arrays;
import java.util.List;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


public class BD_Movil {
	public BD_Principal _bd_prin_movil;
	public Vector<Movil> _contiene_movil = new Vector<Movil>();

	public List cargar_modalidades_movil()  throws PersistentException 
	{
		List<Movil> moviles = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			moviles = MovilDAO.queryMovil(null, null);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return moviles;
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

	public boolean crear_modalidad_movil(Movil movil)  throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = MovilDAO.save(movil);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}
}