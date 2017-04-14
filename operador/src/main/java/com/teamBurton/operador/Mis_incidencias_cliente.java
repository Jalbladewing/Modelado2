package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Mis_incidencias_cliente extends Mis_incidencias_cliente_ventana implements View {
	/*private Label _seccion;
	private Button _crearIncidencia;
	private List _incidenciasL;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Incidencia_lista_cliente> _incidencia = new Vector<Incidencia_lista_cliente>();
	public Crear_incidencia _creaIncidencia;
	public static final String VIEW_NAME = "mis_incidencias_cliente";
	
	public Mis_incidencias_cliente()
	{
		incidenciasTabla.setImmediate(true);
		
		incidenciasTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				String numero = (String) incidenciasTabla.getContainerProperty(rowId, "Nº Incidencia").getValue();
				String asunto = (String) incidenciasTabla.getContainerProperty(rowId, "Asunto").getValue();
				
				doNavigate(Incidencia_cliente.VIEW_NAME + "/" + numero + "_" + asunto);
				
			}
		});
		
		crearB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Crear_incidencia.VIEW_NAME);
			} 
		}); 
	}
	
	//Esto debería estar en Cliente
		private void doNavigate(String viewName) {
		    UI.getCurrent().getNavigator().navigateTo(viewName);
		}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}