package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartaTest {
	
	public void miTest() {
		
		//PREPARACION: Informacion necesaria para ejecutar la prueba.	
		
		//EJECUCION: Ejecutar el metodo a probar. 
		
		//VERIFICACION: Verificar que el escenario final sea el requerido.
		
		
		
		
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
		
		//Lineamientos
		
		//Escribir un metodo, hacer que compile, ejecutarlo y tiene que fallar.
		
		//Agregar la menor cantidad de codigo necesaria para que la prueba pase.
		
		//REVISION DE CODIGO: Se revisa que se puede mejorar.
	}
	
	@Test
	public void dadoQueNoExisteUnaCartaAlCrearseLaSaludEs100() {
		//PREPARACION
		
		Carta carta = new Carta ();
		//EJECUCION
		
		//VERIFICACION
		int saludEsperada = 100;
		
		int saludObtenida = carta.getSalud();
		
		assertEquals(saludEsperada, saludObtenida);
	}
	@Test
	public void dadoQueExisteUnaCartaCon100DeSaludAlRecibir20DanioDebeQuedarCon80DeSalud(){
		//PREPARACION
		
		Carta carta = new Carta();
		
		//EJECUCION
		
		carta.recibirDanio(20);
		
		//VERIFICACION
		
		int saludEsperada = 80;
		
		int saludObtenida = carta.getSalud();
		
		assertEquals(saludEsperada, saludObtenida);
	}
	
}
