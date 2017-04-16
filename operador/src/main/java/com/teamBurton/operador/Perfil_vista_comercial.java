package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Perfil_vista_comercial extends Perfil_vista_comercial_ventana implements View {
	public Mi_cuenta_vista_comercial _unnamed_Mi_cuenta_vista_comercial_;
	public Dar_baja_comercial _daBaja;
	public static final String VIEW_NAME = "perfil_vista_comercial";
	
	public Perfil_vista_comercial()
	{
		Datos_modificables dm = new Datos_modificables();
		dm.tituloL.setValue("Nombre");
		dm.valorL.setValue("Aitor");
		vLayoutDatosModificables.addComponent(dm);
		dm = new Datos_modificables();
		dm.tituloL.setValue("Apellidos");
		dm.valorL.setValue("Tilla Santos");
		vLayoutDatosModificables.addComponent(dm);
		dm = new Datos_modificables();
		dm.tituloL.setValue("Dirección");
		dm.valorL.setValue("C/America nº7, 2ºA");
		vLayoutDatosModificables.addComponent(dm);
		dm = new Datos_modificables();
		dm.tituloL.setValue("Telefono");
		dm.valorL.setValue("950000000");
		vLayoutDatosModificables.addComponent(dm);
		
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
		
		bajaB.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				Window subWindow = new Window("Dar de baja");	
				subWindow.setModal(true);
				subWindow.setResizable(false);
				subWindow.setContent(new Dar_baja_comercial());
				UI.getCurrent().addWindow(subWindow);
			}
		});
		
	}

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}