package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Modalidades_destacadas_generico extends Modalidades_destacadas_generico_Ventana implements View{
	public Generico _unnamed_Generico_;
	public Vector<Modalidad_servicio> _modalidad = new Vector<Modalidad_servicio>();
	public Vector<Modalidad_oferta_generico> _oferta = new Vector<Modalidad_oferta_generico>();
	public static final String VIEW_NAME = "modalidadD";
	
	
	public Modalidades_destacadas_generico(){
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