package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Modalidades_destacadas_vista_usuario extends Modalidades_destacadas_vista_usuario_ventana implements View {
	public Usuario_gestion_comercial _unnamed_Usuario_gestion_comercial_;
	public static final String VIEW_NAME = "modalidades_destacadas_vista_usuario";

	public Modalidades_destacadas_vista_usuario()
	{
		//insercion de modalidades a modo de ejemplo
		   Modalidad_servicio ms = new Modalidad_servicio();     
	       Modalidad_oferta_generico mg = new  Modalidad_oferta_generico();
	       Modalidad_individual_generico mi = new Modalidad_individual_generico();
	       
	       mg.hLayoutModalidades.addComponent(mi);
	       mi = new  Modalidad_individual_generico();
	       mg.hLayoutModalidades.addComponent(mi);
	       addComponent(mg);
	       mg = new  Modalidad_oferta_generico();
	       mi = new  Modalidad_individual_generico();
	       mg.hLayoutModalidades.addComponent(mi);
	       mi = new  Modalidad_individual_generico();
	       mg.hLayoutModalidades.addComponent(mi);
	       addComponent(mg);
	       
	       ms = new Modalidad_servicio();
		   addComponent(ms);
	       ms = new Modalidad_servicio();
	       addComponent(ms);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}