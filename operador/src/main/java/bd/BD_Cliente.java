package bd;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
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
			cliente.setAdministrador(AdministradorDAO.getAdministradorByORMID(1));
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
		contrato _contrato = null;
		boolean resultado = false;
		PersistentTransaction t = bd.IteracionFinalPersistentManager.instance().getSession().beginTransaction();
		
		try
		{
			cliente = ClienteDAO.getClienteByORMID(idCliente);
			modalidad = ModalidadDAO.getModalidadByORMID(idModalidad);
			
			_contrato = cliente.getContratoByModalidad(modalidad);
			
			cliente.contratos.remove(_contrato);
			modalidad.contratos.remove(_contrato);
			
			resultado = ClienteDAO.save(cliente);
			if(resultado) resultado = ModalidadDAO.save(modalidad);
			if(resultado) resultado = contratoDAO.delete(_contrato);
			
			t.commit();
			
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
	}