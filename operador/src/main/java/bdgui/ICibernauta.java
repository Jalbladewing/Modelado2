package bdgui;

import java.util.List;

public interface ICibernauta {

	public List cargar_modalidades_destacadas();

	public List cargar_modalidades_telefono_fijo();

	public List cargar_modalidades_movil();

	public List cargar_modalidades_internet();

	public List cargar_modalidades_oferta();

	public List cargar_paquetes();

	public List cargar_canales();

	public boolean registrar_incidencia_llamada(String aTelefono);

	public boolean iniciar_sesion(String aEmail, String aPassword);

	public boolean recuperar_password(String aEmail);
}