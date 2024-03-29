package bdgui;

import java.util.List;

import bd.Canal;
import bd.Usuario;


public interface ICibernauta {

	public List cargar_modalidades_destacadas();

	public List cargar_modalidades_telefono_fijo();

	public List cargar_modalidades_movil();

	public List cargar_modalidades_internet();

	public List cargar_modalidades_oferta();

	public List cargar_paquetes();

	public List cargar_canales();

	public boolean registrar_incidencia_llamada(String telefono);

	public Usuario iniciar_sesion(String email, String password);

	public boolean recuperar_password(String email);
	
	public Canal cargar_canal(String nombre);
}