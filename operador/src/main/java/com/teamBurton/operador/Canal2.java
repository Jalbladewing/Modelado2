package com.teamBurton.operador;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Canal;
import bdgui.IAdministrador;
import bdgui.ICibernauta;
import bdgui.ICliente;
import bdgui.IComercial;

public class Canal2 extends Canal2_ventana implements View
{
	/*private Label _seccion;
	private Button _contratar;*/
	public Paquete2 _unnamed_Paquete2_;
	public Contratar_generico _contrata;
	public static final String VIEW_NAME = "canal2";
	private ICibernauta cibernauta = new BD_Principal();
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private IAdministrador administrador = new BD_Principal();

	
	public Canal2()
	{
		Window subWindow = new Window("Contratar");	
		
		contratarB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				// TODO Auto-generated method stub
				if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
				{

					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_cibernauta(canalL.getValue()));
					UI.getCurrent().addWindow(subWindow);
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
				{
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_vista_usuario());
					UI.getCurrent().addWindow(subWindow);
					
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
				{
					doNavigate(Crear_incidencia.VIEW_NAME + "/" + "contratacion" +";" +canalL.getValue());
				}
				
			}
		});
	}
	
	public void cargar_canal()
	{
		Canal canal;
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cibernauta"))
		{
			canal = cibernauta.cargar_canal(canalL.getValue());
			
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Comercial"))
		{
			canal = comercial.cargar_canal(canalL.getValue());
		
		}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			canal = cliente.cargar_canal(canalL.getValue());
			
		}else
		{
			canal = administrador.cargar_canal(canalL.getValue());
		}
		
		caracteristicasL.setValue(canal.getCaracteristicas());
		precioL.setValue(canal.getPrecio() +"€");
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getParameters() != null)
		{
			seccionL.setValue(event.getParameters());
			canalL.setValue(event.getParameters());
			
			cargar_canal();
		}
	}
}