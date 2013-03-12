package revocatoria;

import static fj.data.List.list;

import org.junit.Before;
import org.junit.Test;

import fj.F;
import fj.data.List;
import static org.junit.Assert.*;

public class CedulaTest {
	List<Cedula> cedulas = null;

	@Before
	public void setup() {
		AutoridadMunicipal am1 = new AutoridadMunicipal(1, "SUSANA VILLARAN");		
		AutoridadMunicipal am2 = new AutoridadMunicipal(2, "EDUARDO ARIEL ZEGARRA MENDEZ");		
		AutoridadMunicipal am3 = new AutoridadMunicipal(2, "MARISA GLAVE REMY");
				
		CedulaItem item1 = new CedulaItem(am1, "SI");
		CedulaItem item2 = new CedulaItem(am2, "SI");
		CedulaItem item3 = new CedulaItem(am3, "NO");
		
		CedulaItem itemA = new CedulaItem(am1, "SI");
		CedulaItem itemB = new CedulaItem(am2, "NO");
		CedulaItem itemC = new CedulaItem(am3, "SI");

		List<CedulaItem> items1 = list(item1, item2, item3);
		List<CedulaItem> items2 = list(itemA, itemB, itemC);
		
		Cedula cedula1 = new Cedula(1, items1);
		Cedula cedula2 = new Cedula(2, items2);
		
		cedulas = list(cedula1, cedula2);

	}
	
	
	@Test
	public void cantidadSISusanaVillaran(){
		
		List<Cedula> listaSISusana = cedulas.filter(new F<Cedula, Boolean>() {

			public Boolean f(Cedula cedula) {
				return cedula.getItems().exists(new F<CedulaItem, Boolean>() {

					public Boolean f(CedulaItem item) {
						return item.getResultado().equals("SI") && item.esNombreAutoridadMunicipal("SUSANA VILLARAN");
					}
					
				});
			}
			
		});
		assertEquals(2, listaSISusana.length());
	}
	
	
}
