package com.teamBurton.operador;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.MenuBar.MenuItem;

public class Comercial2 extends Comercial2_ventana {
	public Contratar_comercial _contrata;
	public Cabecera_comercial _cabecera;
    VerticalLayout prueba;
	
	public Comercial2()
	{
		prueba = new VerticalLayout();
		_cabecera = new Cabecera_comercial();
		
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
		navigator.addView(Perfil_comercial.VIEW_NAME, Perfil_comercial.class);
		navigator.addView(Mis_incidencias_comercial.VIEW_NAME, Mis_incidencias_comercial.class);
		navigator.addView(Incidencia_comercial.VIEW_NAME, Incidencia_comercial.class);
		navigator.addView(Gestion_usuarios_comercial.VIEW_NAME, Gestion_usuarios_comercial.class);
		navigator.addView(Alta_usuario.VIEW_NAME, Alta_usuario.class);
		
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
		
		_cabecera.inicioB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Modalidades_destacadas_generico.VIEW_NAME);
			} 
		}); 
		/*
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
						doNavigate(Perfil_comercial.VIEW_NAME);
						break;
						
					case "Mis Incidencias":
						doNavigate(Mis_incidencias_comercial.VIEW_NAME);
						break;
						
					case "Gestión de Usuario":
						doNavigate(Gestion_usuarios_comercial.VIEW_NAME);
						break;
						
					case "Desconectar":
						Window subWindow = new Window("Desconectar");	
						subWindow.setModal(true);
						subWindow.setResizable(false);
						subWindow.setContent(new Desconectar_comercial());
						UI.getCurrent().addWindow(subWindow);
						break;
						
					default:
						break;
				}
				
				_cabecera.miCuentaLista.setVisible(false);
				
			}
		});
		*/
MenuBar.Command mycommand = new MenuBar.Command() {
			
		    public void menuSelected(MenuItem selectedItem) {
		    	switch ((String)selectedItem.getText())
				{
				case "Perfil":
					doNavigate(Perfil_comercial.VIEW_NAME);
					break;
					
				case "Mis Incidencias":
					doNavigate(Mis_incidencias_comercial.VIEW_NAME);
					break;
					
				case "Gestión de Usuarios":
					doNavigate(Gestion_usuarios_comercial.VIEW_NAME);
					break;
					
				case "Desconectar":
					Window subWindow = new Window("Desconectar");	
					subWindow.setModal(true);
					subWindow.setResizable(false);
					subWindow.setContent(new Desconectar_comercial());
					UI.getCurrent().addWindow(subWindow);
					break;
					
				default:
					break;
			}
		    }
		};
		for(MenuItem i:_cabecera.miCuentaMenu.getItems().get(0).getChildren()){
		i.setCommand(mycommand);
		}
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}