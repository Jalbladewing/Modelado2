package com.teamBurton.operador;

import java.util.List;
import java.util.Vector;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import bd.BD_Principal;
import bd.Modalidad;
import bdgui.ICibernauta;

public class Internet extends Internet_ventana implements View{
	//private Label _seccion;
	public Cabecera_generico _unnamed_Cabecera_generico_;
	public Vector<Modalidad_servicio> _modalidad = new Vector<Modalidad_servicio>();
	public static final String VIEW_NAME = "internet";
	private ICibernauta cibernauta = new BD_Principal();
	
	public Internet()
	{
		cargar_modalidades_internet();
	}
	
	public void cargar_modalidades_internet()
	{
		List<Modalidad> modalidades = cibernauta.cargar_modalidades_internet();
		Modalidad_servicio servicio;
		
		for(int i = 0; i < modalidades.size(); i++)
		{
			servicio = new Modalidad_servicio();
			servicio.tituloL.setValue(modalidades.get(i).getNombre());
			servicio.caracteristicasL.setValue(modalidades.get(i).getCaracteristicas());
			servicio.precioL.setValue(modalidades.get(i).getPrecio()+"€");
			addComponent(servicio);
		}
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}