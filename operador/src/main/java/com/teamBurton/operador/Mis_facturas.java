package com.teamBurton.operador;

import java.util.Vector;

import com.vaadin.data.Property;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;

public class Mis_facturas extends Mis_facturas_ventana implements View {
	/*private Label _seccion;
	private List _facturasL;*/
	public Mi_cuenta_cliente _unnamed_Mi_cuenta_cliente_;
	public Vector<Factura_Lista> _factura = new Vector<Factura_Lista>();
	public static final String VIEW_NAME = "mis_facturas";
	
	public Mis_facturas()
	{
		facturasTabla.setImmediate(true);
		
		
		
		facturasTabla.addItemClickListener(new ItemClickListener() 
		{
			
			@Override
			public void itemClick(ItemClickEvent event) 
			{
				Object rowId = event.getItemId();
				
				doNavigate(Factura2.VIEW_NAME + "/" + (String) facturasTabla.getContainerProperty(rowId, "Concepto").getValue() );
				
			}
		});
	}
	
	//Esto debería estar en Cliente
		private void doNavigate(String viewName) 
		{
			UI.getCurrent().getNavigator().navigateTo(viewName);
		}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}