package com.teamBurton.operador;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.Cliente;
import bd.Comercial;
import bd.Usuario;

public class Perfil_vista_comercial extends Perfil_vista_comercial_ventana implements View {
	public Mi_cuenta_vista_comercial _unnamed_Mi_cuenta_vista_comercial_;
	public Dar_baja_comercial _daBaja;
	public static final String VIEW_NAME = "perfil_vista_comercial";
	private Comercial comercial;
	
	public Perfil_vista_comercial()
	{
		colocar_datos();	
		
		bajaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(comercial.getFechaEliminacion() == null)
				{
					Window subWindow = new Window("Dar de baja");	
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Dar_baja_comercial());
					UI.getCurrent().addWindow(subWindow);
				}else
				{
					
				}
			}
		});
		
	}
	
	public void colocar_datos()
	{
		Usuario usuario = ((NavigatorUI) UI.getCurrent()).getVistaComercial();
		Datos_modificables dato_modificable = new Datos_modificables();
		Datos_no_modificables dato_noModificable = new Datos_no_modificables();
		
		//NOMBRE
		dato_modificable.tituloL.setValue("Nombre");
		dato_modificable.valorL.setValue(usuario.getNombre());
		vLayoutDatosModificables.addComponent(dato_modificable);
				
		//APELLIDOS
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("Apellidos");
		dato_modificable.valorL.setValue(usuario.getApellidos());
		vLayoutDatosModificables.addComponent(dato_modificable);
				
		//DIRECCION
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("Dirección");
		dato_modificable.valorL.setValue(usuario.getDireccion());
		vLayoutDatosModificables.addComponent(dato_modificable);
				
		//TELEFONO
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("Telefono");
		dato_modificable.valorL.setValue(usuario.getTelefono());
		vLayoutDatosModificables.addComponent(dato_modificable);
				
		//NIF
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("DNI/NIF/Pasaporte");
		dato_modificable.valorL.setValue(usuario.getNif());
		vLayoutDatosModificables.addComponent(dato_modificable);
					
		//CONTRASEÑA
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("Contraseña");
		dato_modificable.valorL.setValue("*******");
		vLayoutDatosModificables.addComponent(dato_modificable);
				
		//DATOS QUE NO PUEDE MODIFICAR
				
		//EMAIL
		dato_noModificable.tituloL.setValue("E-mail");
		dato_noModificable.valorL.setValue(usuario.getEmail());
		vLayoutDatosNoModificables.addComponent(dato_noModificable);
				
		
	}

	
	@Override
	public void enter(ViewChangeEvent event) 
	{
		comercial = (Comercial) ((NavigatorUI) UI.getCurrent()).getVistaComercial();
		
		if(comercial.getFechaEliminacion() != null)
		{
			bajaB.setCaption("Cancelar baja (" +getDifferenceDays(new Date(),comercial.getFechaEliminacion())+")");
		}
		
	}
	
	public long getDifferenceDays(Date d1, Date d2)
	{
		long diff = d2.getTime() - d1.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
}