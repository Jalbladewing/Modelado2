package com.teamBurton.operador;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;

import bd.Usuario;

import com.vaadin.ui.Button.ClickEvent;

@PreserveOnRefresh
@Theme("newtheme")
public class NavigatorUI extends UI {
    Navigator navigator;
    private String mainView;
    private String parentView;
    private Usuario usuario;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	mainView = "Cibernauta";
    	parentView = ""; //para identificar las vistas
        setContent(new Cibernauta());
     
    }
    
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = NavigatorUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
    
    public void setMainView(String mainView)
    {
    	this.mainView = mainView;
    }
    
    public String getMainView()
    {
    	return mainView;
    }
    
    public void setParentView(String parentView)
    {
    	this.parentView = parentView;
    }
    
    public String getParentView()
    {
    	return parentView;
    }
    
    public void setUsuario(Usuario u)
    {
    	usuario = u;
    }
    
    public Usuario getUsuario()
    {
    	return usuario;
    }
    
}
