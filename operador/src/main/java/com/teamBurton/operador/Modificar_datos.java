package com.teamBurton.operador;

import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.Administrador;
import bd.BD_Principal;
import bd.Cliente;
import bd.Comercial;
import bd.Usuario;
import bdgui.IAdministrador;
import bdgui.ICliente;
import bdgui.IComercial;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_datos extends Modificar_datos_ventana {
	/*private Label _tituloDato;
	private TextField _valorDato;
	private Button _cancelar;
	private Button _guardar;*/
	public Datos_modificables _unnamed_Datos_modificables_;
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	
	public Modificar_datos(String titulo, String valor)
	{
		campoL.setValue(titulo);
		campoF.setValue(valor);
		
		guardarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(!campoF.isEmpty())
				{
					modificar_perfil();
					UI.getCurrent().removeWindow((Window) getParent());
				}
				else{
					errorL.setVisible(true);
				}
				
				
			}
		});
		
		cancelarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				
				UI.getCurrent().removeWindow((Window) getParent());
				
			}
		});
	}
	
	public void modificar_perfil()
	{
		Usuario usuarioDatos;
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			usuarioDatos = ((NavigatorUI) UI.getCurrent()).getVistaCliente();
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Comercial"))
		{
			
			usuarioDatos = ((NavigatorUI) UI.getCurrent()).getVistaComercial();
		}else
		{
			usuarioDatos = ((NavigatorUI) UI.getCurrent()).getUsuario();
		}
		
		if(campoL.getValue().equals("Nombre"))
		{
			usuarioDatos.setNombre(campoF.getValue());
			
		}else if(campoL.getValue().equals("Apellidos"))
		{
			usuarioDatos.setApellidos(campoF.getValue());
			
		}else if(campoL.getValue().equals("Dirección"))
		{
			usuarioDatos.setDireccion(campoF.getValue());
			
		}else if(campoL.getValue().equals("Telefono"))
		{
			usuarioDatos.setTelefono(campoF.getValue());
			
		}else if(campoL.getValue().equals("DNI/NIF/Pasaporte"))
		{
			usuarioDatos.setNif(campoF.getValue());
			
		}else if(campoL.getValue().equals("Contraseña"))
		{
			usuarioDatos.setPassword(campoF.getValue());
		}
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			cliente.modificar_cliente((Cliente) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setUsuario(usuarioDatos);
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Comercial"))
		{
			comercial.modificar_comercial((Comercial) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setUsuario(usuarioDatos);
		
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Administrador"))
		{
			administrador.modificar_administrador((Administrador) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setUsuario(usuarioDatos);
		
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Comercial"))
		{
			administrador.modificar_comercial((Comercial) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setVistaComercial(usuarioDatos);
			
		}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Administrador") && ((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			administrador.modificar_cliente((Cliente) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setVistaCliente(usuarioDatos);
		}else
		{
			comercial.modificar_cliente((Cliente) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setVistaCliente(usuarioDatos);
		}
		
		
		
		
	}
}