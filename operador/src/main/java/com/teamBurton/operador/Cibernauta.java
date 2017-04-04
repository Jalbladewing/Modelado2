package com.teamBurton.operador;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("newtheme")
public class Cibernauta extends UI
{
	public Cabecera_cibernauta _cabecera = new Cabecera_cibernauta() ;
	public Contratar_cibernauta _contrata;
	public Modalidades_destacadas_generico mg = new  Modalidades_destacadas_generico();
	@Override
	protected void init(VaadinRequest vaadinRequest) {
		final VerticalLayout layout = new VerticalLayout();
         layout.addComponent(_cabecera);
         layout.addComponent(mg);
		 setContent(layout);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = Cibernauta.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
	
}