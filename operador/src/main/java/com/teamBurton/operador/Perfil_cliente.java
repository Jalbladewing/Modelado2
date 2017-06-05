package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import bd.Usuario;

public class Perfil_cliente extends Perfil_cliente_ventana implements View {
	/*private Label _seccion;
	private Label _tituloPerfil;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Datos_modificables> _datosModificables = new Vector<Datos_modificables>();
	public Vector<Datos_no_modificables> _datosNoModificables = new Vector<Datos_no_modificables>();
	public static final String VIEW_NAME = "perfil_cliente";
	
	public Perfil_cliente()
	{
		
		colocar_datos();	
		
	}
	
	public void colocar_datos()
	{
		Usuario usuario = ((NavigatorUI) UI.getCurrent()).getUsuario();
		Datos_modificables dato_modificable = new Datos_modificables();
		
		//NOMBRE
		dato_modificable.tituloL.setValue("Nombre");
		dato_modificable.valorL.setValue(usuario.getNombre());
		vLayoutCamposModificables.addComponent(dato_modificable);
				
		//APELLIDOS
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("Apellidos");
		dato_modificable.valorL.setValue(usuario.getApellidos());
		vLayoutCamposModificables.addComponent(dato_modificable);
				
		//DIRECCION
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("Dirección");
		dato_modificable.valorL.setValue(usuario.getDireccion());
		vLayoutCamposModificables.addComponent(dato_modificable);
				
		//TELEFONO
		dato_modificable = new Datos_modificables();
		dato_modificable.tituloL.setValue("Telefono");
		dato_modificable.valorL.setValue(usuario.getTelefono());
		vLayoutCamposModificables.addComponent(dato_modificable);
				
				
		//DATOS QUE NO PUEDE MODIFICAR
				
		//EMAIL
		Datos_no_modificables dato_noModificable = new Datos_no_modificables();
		dato_noModificable.tituloL.setValue("E-mail");
		dato_noModificable.valorL.setValue(usuario.getEmail());
		vLayoutDatosNoModificables.addComponent(dato_noModificable);
				
		//NIF
		dato_noModificable = new Datos_no_modificables();
		dato_noModificable.tituloL.setValue("DNI/NIF/Pasaporte");
		dato_noModificable.valorL.setValue(usuario.getNif());
		vLayoutDatosNoModificables.addComponent(dato_noModificable);
				
		//CONTRASEÑA
		dato_noModificable = new Datos_no_modificables();
		dato_noModificable.tituloL.setValue("Contraseña");
		dato_noModificable.valorL.setValue("*******");
		vLayoutDatosNoModificables.addComponent(dato_noModificable);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}