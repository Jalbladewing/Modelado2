package com.teamBurton.operador;

import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bd.Cliente;
import bd.Comercial;
import bd.Usuario;
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
	
	public Modificar_datos(String titulo, String valor)
	{
		campoL.setValue(titulo);
		campoF.setValue(valor);
		
		guardarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				modificar_perfil();
				UI.getCurrent().removeWindow((Window) getParent());
				
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
		}
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			cliente.modificar_cliente((Cliente) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setUsuario(usuarioDatos);
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Comercial"))
		{
			comercial.modificar_comercial((Comercial) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setUsuario(usuarioDatos);
		
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			comercial.modificar_cliente((Cliente) usuarioDatos);
			((NavigatorUI) UI.getCurrent()).setVistaCliente(usuarioDatos);
		}
		
		
		
		
	}
}