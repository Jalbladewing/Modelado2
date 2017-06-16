package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import bd.Cliente;
import bd.contrato;

public class Modalidad_oferta_generico extends Modalidad_oferta_generico_ventana {
/*	private Label _nombre;
	private Label _precio;
	private Button _contratar;*/
	public Oferta2 _unnamed_Oferta2_;
	public Modalidades_destacadas_generico _unnamed_Modalidades_destacadas_generico_;
	public Vector<Modalidad_individual_generico> _modalidad = new Vector<Modalidad_individual_generico>();
	public Contratar_generico _contrata;
	private List<Integer> idModalidad;
	private boolean contratacion = false;
	
	public Modalidad_oferta_generico(int id)
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
					
					if(contratacion || idModalidad.isEmpty())
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
}