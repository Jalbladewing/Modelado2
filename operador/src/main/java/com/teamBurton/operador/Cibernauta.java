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
public class Cibernauta extends Cibernauta_ventana
{
	public Cabecera_cibernauta _cabecera = new Cabecera_cibernauta() ;
	public Contratar_cibernauta _contrata;
	
}
