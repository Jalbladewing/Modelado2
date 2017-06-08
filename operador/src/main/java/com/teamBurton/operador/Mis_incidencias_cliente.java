package com.teamBurton.operador;

import java.util.List;
import java.util.Vector;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import bd.BD_Principal;
import bd.Incidencia;
import bdgui.ICliente;
import bdgui.IComercial;

public class Mis_incidencias_cliente extends Mis_incidencias_cliente_ventana implements View {
	/*private Label _seccion;
	private Button _crearIncidencia;
	private List _incidenciasL;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Incidencia_lista_cliente> _incidencia = new Vector<Incidencia_lista_cliente>();
	public Crear_incidencia _creaIncidencia;
	public static final String VIEW_NAME = "mis_incidencias_cliente";
	private ICliente cliente = new BD_Principal();
	private IComercial comercial = new BD_Principal();
	private List<Incidencia> incidencias;
	
	public Mis_incidencias_cliente()
	{
		cargar_incidencias_cliente();
		
		incidenciasGrid.setImmediate(true);
		
		incidenciasGrid.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				int id = (int) rowId;
				
				doNavigate(Incidencia_cliente.VIEW_NAME + "/" + incidencias.get(id-1).getID() );
				
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
	
	public void cargar_incidencias_cliente()
	{
		//Según si estamos en vista cliente o en cliente.
		if(((NavigatorUI) UI.getCurrent()).getMainView().equals("Vista_Cliente"))
		{
			incidencias = comercial.cargar_incidencias_cliente(((NavigatorUI) UI.getCurrent()).getVistaCliente().getID());
		}else
		{
			incidencias = cliente.cargar_incidencias_cliente(((NavigatorUI) UI.getCurrent()).getUsuario().getID());
		}
		
		for(int i = 0; i < incidencias.size(); i++)
		{
			incidenciasGrid.addRow(incidencias.get(i).getFecha().toString(), incidencias.get(i).getTipoIncidencia(), incidencias.get(i).getAsunto(), incidencias.get(i).getID()+"",incidencias.get(i).getEstado());
		}
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