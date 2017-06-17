package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;

import bd.BD_Principal;
import bd.Modalidad;
import bd.Oferta;
import bdgui.IAdministrador;

public class Modalidades_destacadas_administrador extends Modalidades_destacadas_administrador_ventana implements View {
	public Administrador2 _unnamed_Administrador2_;
	public Vector<Modalidad_individual_administrador> _modalidad = new Vector<Modalidad_individual_administrador>();
	public Vector<Modalidad_ofertas_administrador> _oferta = new Vector<Modalidad_ofertas_administrador>();
	public static final String VIEW_NAME = "modalidades_destacadas_administrador";
	private IAdministrador administrador = new BD_Principal();
	
	public Modalidades_destacadas_administrador()
	{
		cargar_modalidades_destacadas();
	}
	
	public void cargar_modalidades_destacadas()
	{
		List<Modalidad> modalidades = administrador.cargar_modalidades_destacadas();
		List<Modalidad> modalidades_oferta;
		Oferta oferta_destacada;
		Modalidad_individual_administrador servicio;
		Modalidad_ofertas_administrador oferta;
	    Modalidad_individual_generico individual;
	    
	    if(modalidades == null)
	    {
	    	modalidades = new ArrayList<Modalidad>();
	    }
		
		for(int i = 0; i < modalidades.size(); i++)
		{
			//Si es una oferta se "destripan" sus modalidades y se muestran
			if(modalidades.get(i).getTipo().equals("oferta"))
			{
				oferta = new Modalidad_ofertas_administrador(modalidades.get(i).getID());
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
				oferta.visibleCheckBx.setValue(oferta_destacada.getVisibilidad());
				
				if(!oferta_destacada.getVisibilidad()) oferta.noVisible();
				
				oferta.precioL.setValue(oferta_destacada.getPrecio()+"€");
				addComponent(oferta);
				
			}else //Si no es una oferta se añade directamente
			{
				servicio = new Modalidad_individual_administrador(modalidades.get(i).getID());
				servicio.tituloL.setValue(modalidades.get(i).getNombre());
				servicio.caracteristicasL.setValue(modalidades.get(i).getCaracteristicas());
				servicio.visibleCheckBx.setValue(modalidades.get(i).getVisibilidad());
				
				if(!modalidades.get(i).getVisibilidad()) servicio.noVisible();
				
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