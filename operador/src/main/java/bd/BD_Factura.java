package bd;

import java.util.Arrays;
import java.util.List;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Factura {
	public BD_Principal _bd_prin_fact;
	public Vector<Factura> _contiene_fact = new Vector<Factura>();

	public List cargar_facturas(int idCliente)  throws PersistentException 
	{
		List<Factura> facturas = null;
		Cliente cliente = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			facturas = Arrays.asList(cliente.factura.toArray());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return facturas;
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
}