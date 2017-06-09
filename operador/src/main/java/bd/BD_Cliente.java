package bd;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;



public class BD_Cliente {
	public BD_Principal _bd_prin_clien;
	public Vector<Cliente> _contiene_clen = new Vector<Cliente>();

	public Usuario verificar_loguin(String email, String password) throws PersistentException 
	{
		Usuario user = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			ClienteCriteria clienteCriteria = new ClienteCriteria();
			clienteCriteria.email.eq(email);
			user = ClienteDAO.loadClienteByCriteria(clienteCriteria);
			
			if(!user.getPassword().equals(password)) user = null;
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
			return null;
		}
		
		return user;
 
	}

	public Cliente acceder_cliente(int idCliente) throws PersistentException 
	{
		Cliente cliente = null;
		
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return cliente;
	}

	public Usuario verificar_usuario(String email) throws PersistentException 
	{
		Usuario user = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			ClienteCriteria clienteCriteria = new ClienteCriteria();
			clienteCriteria.email.eq(email);
			user = ClienteDAO.loadClienteByCriteria(clienteCriteria);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return user;
	}

	
	public boolean modificar_cliente(Cliente cliente) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = ClienteDAO.save(cliente);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_clientes() throws PersistentException 
	{
		List<Cliente> clientes = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			clientes = ClienteDAO.queryCliente(null, null);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return clientes;
	}

	public boolean registrar_cliente(Cliente cliente) throws PersistentException 
	{
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			resultado = ClienteDAO.save(cliente);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean registrar_modalidad_contratada(int idCliente, int idModalidad) throws PersistentException 
	{
		Cliente cliente = null;
		contrato _contrato = null;
		Modalidad modalidad = null;
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			
			_contrato = contratoDAO.createContrato();
			_contrato.setCliente(cliente);
			_contrato.setModalidad(modalidad);
			_contrato.setFecha(new Date());
			
			cliente.addModalidad(_contrato, modalidad);
			
			resultado = ClienteDAO.save(cliente);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean eliminar_cliente(int idCliente) throws PersistentException 
	{
		Cliente cliente = null;
		boolean resultado = false;
		Calendar fechaEliminacion = Calendar.getInstance();
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			fechaEliminacion.add(Calendar.MONTH, 1);
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			cliente.setFechaEliminacion(fechaEliminacion.getTime());
			resultado = ClienteDAO.save(cliente);
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public boolean eliminar_modalidad_cliente(int idCliente, int idModalidad) throws PersistentException 
	{
		Cliente cliente = null;
		Modalidad modalidad = null;
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			
			cliente.removeModalidad(modalidad);
			
			t.commit();
			
			resultado = true;
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return resultado;
	}

	public List cargar_clientes_traspaso(int idModalidad) throws PersistentException 
	{
		List<Cliente> clientes = null;
		Modalidad modalidad = null;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			clientes = Arrays.asList(modalidad.getClientes());
			
			t.commit();
			
		}catch(Exception e)
		{
			t.rollback();
		}
		
		return clientes;
	}

/*	public String generar_password()  {
		// TODO Auto-generated method stub
		return null;
	}*/
	}