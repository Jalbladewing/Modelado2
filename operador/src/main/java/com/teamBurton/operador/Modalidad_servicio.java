package com.teamBurton.operador;

import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import bd.Cliente;
import bd.contrato;

import java.util.Arrays;
import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Modalidad_servicio extends Modalidad_servicio_Ventana {
	//private Button _contratar;
	public Telefono_fijo _unnamed_Telefono_fijo_;
	public Movil2 _unnamed_Movil2_;
	public Internet _unnamed_Internet_;
	public Modalidades_destacadas_generico _unnamed_Modalidades_destacadas_generico_;
	public Contratar_generico _contrata;
	private int idModalidad;
	private boolean contratacion = false;
	
	public Modalidad_servicio(int id)
	{
		Window subWindow = new Window("Contratar");	
		idModalidad = id;
		
		
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
					subWindow.setContent(new Contratar_cibernauta(tituloL.getValue()));
					UI.getCurrent().addWindow(subWindow);
					
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
				{
					contratacion = comprobarContratacion();
					
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Contratar_vista_usuario(tituloL.getValue(), contratacion, idModalidad));
					UI.getCurrent().addWindow(subWindow);
					
				}else if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Cliente"))
				{
					contratacion = comprobarContratacion();
					
					if(contratacion)
					{
						subWindow.setModal(true);
						subWindow.setResizable(false);
						subWindow.setContent(new Contratar_cliente(tituloL.getValue()));
						UI.getCurrent().addWindow(subWindow);
					}else
					{
						doNavigate(Crear_incidencia.VIEW_NAME + "/" + "contratacion" +";" +tituloL.getValue());
					}
							
				}
				
			}
		});
		
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
			if(contratos.get(i).getModalidad().getID() == idModalidad)
			{
				return true;
			}
		}
		
		return false;
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}