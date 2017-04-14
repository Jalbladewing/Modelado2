package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Modalidades_destacadas_vista_comercial extends Modalidades_destacadas_vista_comercial_ventana implements View {
	public Comercial_administrador _unnamed_Comercial_administrador_;
	public static final String VIEW_NAME = "modalidades_destacadas_vista_comercial";

	public Modalidades_destacadas_vista_comercial()
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