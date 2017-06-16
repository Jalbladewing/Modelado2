package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Canal;
import bd.Cliente;
import bd.contrato;
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
	private List<Integer> idModalidad;
	private boolean contratacion = false;

	
	public Canal2(int id)
	{
		Window subWindow = new Window("Contratar");	
		idModalidad = new ArrayList<Integer>();
		idModalidad.add(id);
		
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
					contratacion = comprobarContratacion();
					
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_vista_usuario(canalL.getValue(), contratacion, idModalidad));
					UI.getCurrent().addWindow(subWindow);
					
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
				{
					contratacion = comprobarContratacion();
					
					if(contratacion || idModalidad.isEmpty())
					{
						subWindow.setModal(true);
						subWindow.setResizable(false);
						subWindow.setContent(new Contratar_cliente(canalL.getValue()));
						UI.getCurrent().addWindow(subWindow);
					}else
					{
						doNavigate(Crear_incidencia.VIEW_NAME + "/" + "contratacion" +";" +canalL.getValue());
					}
							
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
	
	public boolean comprobarContratacion()
	{
		Cliente cliente;
		List<contrato> contratos;
		
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
		{
			cliente = (Cliente) ((NavigatorUI) UI.getCurrent()).getUsuario();
		}else
		{
			cliente = (Cliente) ((NavigatorUI) UI.getCurrent()).getVistaCliente();
		}
		

		
		contratos = Arrays.asList(cliente.contratos.toArray());
		
		for(int i = 0; i < contratos.size(); i++)
		{
			if(contratos.get(i).getModalidad().getID() == idModalidad.get(0))
			{
				return true;
			}
		}
		
		return false;
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