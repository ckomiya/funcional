package revocatoria;

public class CedulaItem {
	

	private AutoridadMunicipal autoridadMunicipal;
	private String resultado;
	
	public CedulaItem(AutoridadMunicipal autoridadMunicipal, String resultado) {
		this.autoridadMunicipal = autoridadMunicipal;
		this.resultado = resultado;
	}
	

	public String getResultado() {
		return resultado;
	}


	public AutoridadMunicipal getAutoridadMunicipal() {
		return autoridadMunicipal;
	}
	
	public boolean esNombreAutoridadMunicipal(String nombre){
		return nombre.equals(this.getAutoridadMunicipal().getNombre());
	}

}