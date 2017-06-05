package com.teamBurton.operador;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import bd.BD_Principal;
import bd.Modalidad;
import bd.Oferta;
import bdgui.ICibernauta;

public class Oferta2 extends Oferta2_ventana implements View{
	//private Label _seccion;
	public Cabecera_generico _unnamed_Cabecera_generico_;
	public Vector<Modalidad_oferta_generico> _oferta = new Vector<Modalidad_oferta_generico>();
	public static final String VIEW_NAME = "oferta2";
	private ICibernauta cibernauta = new BD_Principal();
	
	public Oferta2()
	{
		cargar_modalidades_oferta();
		    
	}
	
	public void cargar_modalidades_oferta()
	{
		List<Modalidad> modalidades = cibernauta.cargar_modalidades_oferta();
		List<Modalidad> modalidades_oferta;
		Oferta oferta_destacada;
		Modalidad_oferta_generico oferta;
	    Modalidad_individual_generico individual;
		
		for(int i = 0; i < modalidades.size(); i++)
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
				ofertasGrid.addComponent(oferta);
		}
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}