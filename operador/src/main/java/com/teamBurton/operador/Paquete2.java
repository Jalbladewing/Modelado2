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

public class Paquete2 extends Paquete2_ventana {
	/*private Label _listaCanalLabel;
	private Button _contratar;
	private List<Button> _canalesL;*/
	public Television2 _unnamed_Television2_;
	public Vector<Canal2> _canal = new Vector<Canal2>();
	public Contratar_generico _contrata;
	private List<Integer> idModalidad;
	private boolean contratacion = false;
	
	public Paquete2(int id)
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