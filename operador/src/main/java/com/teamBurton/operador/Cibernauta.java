package com.teamBurton.operador;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("newtheme")
public class Cibernauta extends Cibernauta_ventana
{
	public Cabecera_cibernauta _cabecera;
	public Contratar_cibernauta _contrata;
	VerticalLayout prueba;
	
	
	public Cibernauta()
	{
		prueba = new VerticalLayout();
		_cabecera = new Cabecera_cibernauta();
		
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
		navigator.addView(Acceder.VIEW_NAME, Acceder.class);
		navigator.addView(Recuperar_password.VIEW_NAME, Recuperar_password.class);
		
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
		
		
		_cabecera.accederB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Acceder.VIEW_NAME);
			} 
		}); 
		
		_cabecera.inicioB.addClickListener(new Button.ClickListener() 
		{ 
			public void buttonClick(ClickEvent event) 
			{ 
				doNavigate(Modalidades_destacadas_generico.VIEW_NAME);
			} 
		}); 
		
	}
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	
	
}