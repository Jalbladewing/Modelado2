package com.teamBurton.operador;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Gestion_incidencias_administrador_ventana extends VerticalLayout {
	protected Label seccionL;
	protected VerticalLayout vLayout;
	protected HorizontalLayout hLayoutBuscar;
	protected Button buscarL;
	protected TextField buscarF;
	protected TabSheet tabsTabSheet;
	protected Table todasTabla;
	protected Table llamadaTabla;
	protected Table asignadasTabla;
	protected Table sinAsignarTabla;
	protected Table resueltasTabla;
	protected Button asignarB;

	public Gestion_incidencias_administrador_ventana() {
		Design.read(this);
	}
}
