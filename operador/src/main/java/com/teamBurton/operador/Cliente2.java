package com.teamBurton.operador;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class Cliente2 extends Cliente2_ventana 
{
	public Cabecera_cliente _cabecera;
	public Contratar_cliente _contrata;
	VerticalLayout prueba;
	
	public Cliente2()
	{
		prueba = new VerticalLayout();
		_cabecera = new Cabecera_cliente();

		this.addComponent(_cabecera);
		this.addComponent(prueba); //Zona donde se "instanciarán" las subventanas
		
		Navigator navigator = new Navigator(NavigatorUI.getCurrent(), prueba);
		
		//Subventanas a las que se puede acceder
		navigator.addView(Modalidades_destacadas_generico.VIEW_NAME, Modalidades_destacadas_generico.class);
		navigator.addView(Television2.VIEW_NAME, Television2.class);
		navigator.addView(Canal2.VIEW_NAME, Canal2.class);
		navigator.addView(Telefono_fijo.VIEW_NAME, Telefono_fijo.class);
		navigator.addView(Movil2.VIEW_NAME, Movil2.class);
		navigator.addView(Internet.VIEW_NAME, Internet.class);
		navigator.addView(Oferta2.VIEW_NAME, Oferta2.class);
		navigator.addView(Perfil_cliente.VIEW_NAME, Perfil_cliente.class);
		navigator.addView(Mis_servicios.VIEW_NAME, Mis_servicios.class);
		navigator.addView(Modalidad_individual_cliente.VIEW_NAME, Modalidad_individual_cliente.class);
		navigator.addView(Modalidad_oferta_cliente.VIEW_NAME, Modalidad_oferta_cliente.class);
		navigator.addView(Mis_facturas.VIEW_NAME, Mis_facturas.class);
		navigator.addView(Factura2.VIEW_NAME, Factura2.class);
		navigator.addView(Mis_incidencias_cliente.VIEW_NAME, Mis_incidencias_cliente.class);
		navigator.addView(Incidencia_cliente.VIEW_NAME, Incidencia_cliente.class);
		navigator.addView(Crear_incidencia.VIEW_NAME, Crear_incidencia.class);
		
		//Como la ventana estaba en Acceder la cambia a modalidades destacadas
		navigator.navigateTo(Modalidades_destacadas_generico.VIEW_NAME);
		
		if (navigator.getState().isEmpty()) {
	        navigator.navigateTo(Modalidades_destacadas_generico.VIEW_NAME);
		}
	        
		_cabecera.televisionL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Television2.VIEW_NAME);
			} 
		}); 
		

		_cabecera.telefonoL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Telefono_fijo.VIEW_NAME);
			} 
		}); 
		
		
		_cabecera.movilL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Movil2.VIEW_NAME);
			} 
		}); 
		
		
		_cabecera.internetL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Internet.VIEW_NAME);
			} 
		}); 
		
		
		_cabecera.ofertasL.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Oferta2.VIEW_NAME);
			} 
		}); 
		
		_cabecera.miCuentaB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				_cabecera.miCuentaLista.setNullSelectionAllowed(false);
				
				if(_cabecera.miCuentaLista.isVisible())
				{
					_cabecera.miCuentaLista.setVisible(false);
				}else
				{
					_cabecera.miCuentaLista.setVisible(true);
				}
				
			} 
		});
		
		_cabecera.miCuentaLista.addValueChangeListener(new Property.ValueChangeListener() 
		{
			
			@Override
			public void valueChange(ValueChangeEvent event) 
			{
				switch ((String)_cabecera.miCuentaLista.getValue())
				{
					case "Perfil":
						doNavigate(Perfil_cliente.VIEW_NAME);
						break;
						
					case "Mis Servicios":
						doNavigate(Mis_servicios.VIEW_NAME);
						break;
						
					case "Mis Facturas":
						doNavigate(Mis_facturas.VIEW_NAME);
						break;
						
					case "Mis Incidencias":
						doNavigate(Mis_incidencias_cliente.VIEW_NAME);
						break;				
						
					default:
						break;
				}
				
				_cabecera.miCuentaLista.setVisible(false);
				
			}
		});
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}