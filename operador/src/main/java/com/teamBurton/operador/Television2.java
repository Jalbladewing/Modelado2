package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.w3c.dom.stylesheets.LinkStyle;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;

import bd.BD_Principal;
import bd.Canal;
import bd.Modalidad;
import bd.Paquete;
import bdgui.IAdministrador;
import bdgui.ICibernauta;
import bdgui.ICliente;
import bdgui.IComercial;

public class Television2 extends Television2_ventana implements View{
	/*private Label _seccion;
	private Button _buscarCanalB;
	private TextField _buscarCanalT;
	private Button _contratarCanales;
	private List _canalesL;*/
	public Cabecera_generico _unnamed_Cabecera_generico_;
	public Vector<Paquete2> _paquete = new Vector<Paquete2>();
	public Contratar_generico _contrata;
	public Vector<Canal_television> _canal = new Vector<Canal_television>();
	public static final String VIEW_NAME = "television2";
	private ICibernauta cibernauta = new BD_Principal();
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();
	
	public Television2()
	{
		cargar_modalidades_television();
		  
	}
	
	
	public void cargar_modalidades_television()
	{
		//Cargar paquetes
		List<Paquete> paquetes;
		List<Canal> canales;
		Paquete paquete;
		Paquete2 paqueteL;//"layout"
		Button canal;
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
		{
			paquetes = cibernauta.cargar_paquetes();
			
		}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			paquetes = comercial.cargar_paquetes();
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			paquetes = cliente.cargar_paquetes();
			
		}else
		{
			paquetes = administrador.cargar_paquetes();
		}
		
		for(int i = 0; i < paquetes.size(); i++)
		{
			if(!paquetes.get(i).getVisibilidad()) continue;
			paqueteL = new Paquete2();
			paquete = paquetes.get(i);
			paqueteL.tituloL.setValue(paquete.getNombre());
			paqueteL.caracteristicasL.setValue(paquete.getCaracteristicas());
			paqueteL.precioL.setValue(paquete.getPrecio()+"€");
			
			canales = Arrays.asList(paquete.modalidad.toArray());
			
			for(int j = 0; j < canales.size(); j++)
			{
				canal = new Button(canales.get(j).getNombre());
				canal.addStyleName("link");
				paqueteL.canalesGrid.addComponent(canal);
				
				canal.addClickListener(new Button.ClickListener() 
				{
					
					@Override
					public void buttonClick(ClickEvent event) 
					{
						doNavigate(Canal2.VIEW_NAME + "/" + event.getButton().getCaption());
						
					}
				});
			}
			
			paquetesGrid.addComponent(paqueteL);
		}
		
		
		//Cargar canales
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
		{
			canales = cibernauta.cargar_canales();
			
		}else if(((NavigatorUI) UI.getCurrent()).getParentView().equals("Comercial"))
		{
			canales = comercial.cargar_canales();
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			canales = cliente.cargar_canales();
			
		}else
		{
			canales = administrador.cargar_canales();
		}
		
		for(int i = 0; i < canales.size(); i++)
		{
			if(!canales.get(i).getVisibilidad()) continue;
			canalesTabla.addRow(canales.get(i).getNombre(),canales.get(i).getCaracteristicas(),canales.get(i).getPrecio()+"€");
		}
		
	}
	
	//Esto debería estar en Cibernauta
		private void doNavigate(String viewName) {
		    UI.getCurrent().getNavigator().navigateTo(viewName);
		}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}