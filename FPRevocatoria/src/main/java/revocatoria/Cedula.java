package revocatoria;

import fj.data.List;

public class Cedula {
	private Integer codigo;
	private List<CedulaItem> items;
	
	
	public Cedula(Integer codigo, List<CedulaItem> items) {
		this.codigo = codigo;
		this.items = items;
	}


	
	public List<CedulaItem> getItems() {
		return items;
	}
	
	
	
}

