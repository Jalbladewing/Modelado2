package com.teamBurton.operador;

import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import bd.BD_Principal;
import bd.Cliente;
import bdgui.ICliente;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_datos extends Modificar_datos_ventana {
	/*private Label _tituloDato;
	private TextField _valorDato;
	private Button _cancelar;
	private Button _guardar;*/
	public Datos_modificables _unnamed_Datos_modificables_;
	private ICliente cliente = new BD_Principal();
	
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
		Cliente clienteDatos = (Cliente) ((NavigatorUI) UI.getCurrent()).getUsuario();
		
		if(campoL.getValue().equals("Nombre"))
		{
			clienteDatos.setNombre(campoF.getValue());
			
		}else if(campoL.getValue().equals("Apellidos"))
		{
			clienteDatos.setApellidos(campoF.getValue());
			
		}else if(campoL.getValue().equals("Dirección"))
		{
			clienteDatos.setDireccion(campoF.getValue());
			
		}else if(campoL.getValue().equals("Telefono"))
		{
			clienteDatos.setTelefono(campoF.getValue());
		}
		
		cliente.modificar_cliente(clienteDatos);
		
		((NavigatorUI) UI.getCurrent()).setUsuario(clienteDatos);
		
	}
}