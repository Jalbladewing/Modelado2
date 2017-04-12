package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;

public class Perfil_cliente extends Perfil_cliente_ventana implements View {
	/*private Label _seccion;
	private Label _tituloPerfil;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Datos_modificables> _datosModificables = new Vector<Datos_modificables>();
	public Vector<Datos_no_modificables> _datosNoModificables = new Vector<Datos_no_modificables>();
	public static final String VIEW_NAME = "perfil_cliente";
	
	public Perfil_cliente(){
		Datos_modificables dm = new Datos_modificables();
		dm.tituloL.setValue("Nombre");
		dm.valorL.setValue("Aitor");
		vLayoutCamposModificables.addComponent(dm);
		dm = new Datos_modificables();
		dm.tituloL.setValue("Apellidos");
		dm.valorL.setValue("Tilla Santos");
		vLayoutCamposModificables.addComponent(dm);
		dm = new Datos_modificables();
		dm.tituloL.setValue("Dirección");
		dm.valorL.setValue("C/America nº7, 2ºA");
		vLayoutCamposModificables.addComponent(dm);
		dm = new Datos_modificables();
		dm.tituloL.setValue("Telefono");
		dm.valorL.setValue("950000000");
		vLayoutCamposModificables.addComponent(dm);
		
		Datos_no_modificables dn = new Datos_no_modificables();
		dn.tituloL.setValue("E-mail");
		dn.valorL.setValue("tilla96@gmail.com");
		vLayoutDatosNoModificables.addComponent(dn);
		dn = new Datos_no_modificables();
		dn.tituloL.setValue("DNI/NIF/Pasaporte");
		dn.valorL.setValue("9999999999");
		vLayoutDatosNoModificables.addComponent(dn);
		dn = new Datos_no_modificables();
		dn.tituloL.setValue("Contraseña");
		dn.valorL.setValue("*******");
		vLayoutDatosNoModificables.addComponent(dn);
		
	}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}