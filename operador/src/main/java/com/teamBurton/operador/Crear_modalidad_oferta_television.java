package com.teamBurton.operador;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import bd.Modalidad;

import com.vaadin.ui.Button.ClickEvent;

public class Crear_modalidad_oferta_television extends Crear_modalidad_oferta_television_ventana
{
	public Crear_modalidad_administrador _unnamed_Crear_modalidad_administrador_;
	private List<Modalidad> _modalidades;
	private String modalidadesId = "";
	private String _tipo = "";
	private String selected = "";
	
	public Crear_modalidad_oferta_television()
	{
		_modalidades = new ArrayList<Modalidad>();
		modalidadesLista.setNullSelectionAllowed(false);
		
		modalidadesLista.addValueChangeListener(event ->
		{
			selected = (String) event.getProperty().getValue();
		});
		
		removeB.addClickListener(new Button.ClickListener() 
		{
			
			@Override
			public void buttonClick(ClickEvent event) 
			{
				if(!selected.equals(""))
				{
					removeListaModalidad(selected);
					modalidadesLista.removeItem(selected);
					selected = "";
				}
				
			}
		});
	}
	
	public void removeListaModalidad(String nombre)
	{
		for(int i = 0; i < _modalidades.size(); i++)
		{
			if(_modalidades.get(i).getNombre().equals(nombre))
			{
				_modalidades.remove(i);
				break;
			}
		}
	}
	
	public void guardarModalidadesId()
	{
		for(int i = 0; i < _modalidades.size(); i++)
		{
			modalidadesId += _modalidades.get(i);
			
			if(i < _modalidades.size()-1)
			{
				modalidadesId += ";";
			}
		}
	}
	
	public String getTipo()
	{
		return _tipo;
	}
	
	public void setTipo(String tipo)
	{
		_tipo = tipo;
	}
	
	public void setModalidades(List<Modalidad> modalidades)
	{
		_modalidades = modalidades;
		
		if(_modalidades.size() == 1)
		{
			modalidadesLista.setRows(2);
		}else
		{
			modalidadesLista.setRows(_modalidades.size());
		}
		
		
		for(int i = 0; i < _modalidades.size(); i++)
		{
			modalidadesLista.addItem(_modalidades.get(i).getNombre());
		}
		
	}
	
	public void clearModalidades()
	{
		_modalidades.clear();
		modalidadesLista.removeAllItems();
	}
	
	public List<Modalidad> getModalidades()
	{
		return _modalidades;
	}
	
	public void navigateTo()
	{
		guardarModalidadesId();
		
		
		doNavigate(Add_modalidad.VIEW_NAME + "/" +_tipo +";creacion;" +modalidadesId);
	}
	
	
	private void doNavigate(String viewName) {
	    UI.getCurrent().getNavigator().navigateTo(viewName);
	}
}