package refactoring;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws ParseException {
		
		// demostració de construccuó d'un lloguer amb una data
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		
		// demostració de construcció d'un vehicle de categoria BASIC
		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date1 = dateFormat.parse("2/8/2013");
		Lloguer lloguer1 = new Lloguer(date1, 3, vehicle1);
		
		Vehicle vehicle2 = new Vehicle("Citroen", "Saxo", Vehicle.GENERAL);
		Date date2 = dateFormat.parse("22/1/2018");
		Lloguer lloguer2 = new Lloguer(date2, 2, vehicle2);
		
		Vehicle vehicle3 = new Vehicle("BMW", "Z4", Vehicle.LUXE);
		Date date3 = dateFormat.parse("3/3/2016");
		Lloguer lloguer3 = new Lloguer(date3, 5, vehicle3);
		
		Client miCliente = new Client("71306213A", "David Díez", "636722659");
		miCliente.afegeix(lloguer1);
		miCliente.afegeix(lloguer2);
		miCliente.afegeix(lloguer3);
		System.out.println(miCliente.informe());
		System.out.println(miCliente.informeHTML());
		
	}
	
	public static String GestorLloguerLite (Client client) {
		
		return client.informe();
	}

}
