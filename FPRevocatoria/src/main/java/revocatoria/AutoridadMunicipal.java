package revocatoria;

public class AutoridadMunicipal {
	private Integer id;
	private String nombre;

	
	public AutoridadMunicipal(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

}
