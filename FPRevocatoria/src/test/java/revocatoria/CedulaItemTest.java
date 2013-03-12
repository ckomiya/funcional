package revocatoria;

import static fj.data.List.list;

import org.junit.Before;
import org.junit.Test;

import fj.F;
import fj.data.List;
import static org.junit.Assert.*;

public class CedulaItemTest {
	
	List<CedulaItem> items = null;
	
	@Before
	public void setup(){
		AutoridadMunicipal am1 = new AutoridadMunicipal(1, "SUSANA VILLARAN");		
		AutoridadMunicipal am2 = new AutoridadMunicipal(2, "EDUARDO ARIEL ZEGARRA MENDEZ");		
		AutoridadMunicipal am3 = new AutoridadMunicipal(2, "MARISA GLAVE REMY");
				
		CedulaItem item1 = new CedulaItem(am1, "SI");
		CedulaItem item2 = new CedulaItem(am2, "SI");
		CedulaItem item3 = new CedulaItem(am3, "NO");
		
		items = list(item1, item2, item3);
		
	}

	
	@Test
	public void cantidadDeNoEnCedula(){
		
		List<CedulaItem> listaA = items.filter(new F<CedulaItem, Boolean>() {
			public Boolean f(CedulaItem cedula) {
				return cedula.getResultado().equals("NO");
			}
		});
		
		assertEquals(1,listaA.length());
	}
}
