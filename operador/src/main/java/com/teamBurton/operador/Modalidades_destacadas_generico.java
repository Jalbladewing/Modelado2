package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import bd.*;
import bdgui.*;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;


public class Modalidades_destacadas_generico extends Modalidades_destacadas_generico_Ventana implements View{
	public Generico _unnamed_Generico_;
	public Vector<Modalidad_servicio> _modalidad = new Vector<Modalidad_servicio>();
	public Vector<Modalidad_oferta_generico> _oferta = new Vector<Modalidad_oferta_generico>();
	public static final String VIEW_NAME = "modalidadD";
	private ICibernauta cibernauta = new BD_Principal();
	
	
	public Modalidades_destacadas_generico()
	{
		
		   cargar_modalidades_destacadas();   
	       
	}
	
	public void cargar_modalidades_destacadas()
	{
		List<Modalidad> modalidades = cibernauta.cargar_modalidades_destacadas();
		List<Modalidad> modalidades_oferta;
		Oferta oferta_destacada;
		Modalidad_servicio servicio;
		Modalidad_oferta_generico oferta;
	    Modalidad_individual_generico individual;
		
		for(int i = 0; i < modalidades.size(); i++)
		{
			//Si es una oferta se "destripan" sus modalidades y se muestran
			if(modalidades.get(i).getTipo().equals("oferta"))
			{
				oferta = new Modalidad_oferta_generico();
				oferta_destacada = (Oferta) modalidades.get(i);
				modalidades_oferta = Arrays.asList(oferta_destacada.modalidad.toArray());
				
				for(int j = 0; j < modalidades_oferta.size(); j++)
				{
					individual = new Modalidad_individual_generico();
					individual.tituloL.setValue(modalidades_oferta.get(j).getNombre());
					individual.caracteristicasL.setValue(modalidades_oferta.get(j).getCaracteristicas());
					individual.precioL.setValue(modalidades_oferta.get(j).getPrecio()+"€");
					oferta.hLayoutModalidades.addComponent(individual);
				}
				
				oferta.tituloL.setValue(oferta_destacada.getNombre());
				oferta.precioL.setValue(oferta_destacada.getPrecio()+"€");
				addComponent(oferta);
				
			}else //Si no es una oferta se añade directamente
			{
				servicio = new Modalidad_servicio();
				servicio.tituloL.setValue(modalidades.get(i).getNombre());
				servicio.caracteristicasL.setValue(modalidades.get(i).getCaracteristicas());
				servicio.precioL.setValue(modalidades.get(i).getPrecio()+"€");
				addComponent(servicio);
			}
		}
	}
	
	
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

	
}