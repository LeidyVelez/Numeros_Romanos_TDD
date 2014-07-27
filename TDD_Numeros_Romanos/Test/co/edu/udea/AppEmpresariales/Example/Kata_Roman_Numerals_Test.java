package co.edu.udea.AppEmpresariales.Example;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import co.edu.udea.AppEmpresariales.Example.Clases.Convierte_Romanos;

/*Clase definida para realizar pruebas unitarias de la aplicación TDD_Números_Romanos*/
public class Kata_Roman_Numerals_Test {

	/*Variables globales*/
	Convierte_Romanos convertir;
	private String resultado;
	
	/*Métodos de clase*/
	@Before
	public void setUp() throws Exception {
		convertir= new Convierte_Romanos();
	}

	/*Las siguientes líneas de código describen las Pruebas unitarias*/
	@Test
	public void numero_es_1_romano_es_I() {
		 resultado= convertir.convierteRomano(1);
		Assert.assertEquals("I", resultado);
	}
	@Test
	public void numero_es_2_romano_es_II() {
		 resultado= convertir.convierteRomano(2);
		Assert.assertEquals("II", resultado);
	}
	
	@Test
	public void numero_es_3_romano_es_III() {
		 resultado= convertir.convierteRomano(3);
		Assert.assertEquals("III", resultado);
	}
	
	@Test
	public void numero_es_4_romano_es_IV() {
		resultado= convertir.convierteRomano(4);
		Assert.assertEquals("IV", resultado);
	}
	@Test
	public void numero_es_5_romano_es_V() {
		 resultado= convertir.convierteRomano(5);
		Assert.assertEquals("V", resultado);
	}
	
	@Test
	public void numero_es_6_romano_es_VI() {
		 resultado= convertir.convierteRomano(6);
		Assert.assertEquals("VI", resultado);
	}
	
	@Test
	public void numero_es_7_romano_es_VII() {
		 resultado= convertir.convierteRomano(7);
		Assert.assertEquals("VII", resultado);
	}
	@Test
	public void numero_es_8_romano_es_VIII() {
		 resultado= convertir.convierteRomano(8);
		Assert.assertEquals("VIII", resultado);
	}
	@Test
	public void numero_es_9_romano_es_IX() {
		 resultado= convertir.convierteRomano(7);
		Assert.assertEquals("VII", resultado);
	}
	@Test
	public void numero_es_10_romano_es_X() {
		 resultado= convertir.convierteRomano(10);
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void numero_es_menor_que_1() {
		 resultado= convertir.convierteRomano(-1);
		Assert.assertEquals("No valido", resultado);
	}
	@Test
	public void numero_es_mayor_que_3999() {
		 resultado= convertir.convierteRomano(4109);
		Assert.assertEquals("No valido", resultado);
	}
	@Test
	public void numero_es_20_romano_es_XX() {
		 resultado= convertir.convierteRomano(20);
		Assert.assertEquals("XX", resultado);
	}
	
	@Test
	public void numero_es_31_romano_es_XXXI() {
		 resultado= convertir.convierteRomano(31);
		Assert.assertEquals("XXXI", resultado);
	}
	@Test
	public void numero_es_40_romano_es_XL() {
		 resultado= convertir.convierteRomano(40);
		Assert.assertEquals("XL", resultado);
	}
	@Test
	public void numero_es_50_romano_es_L() {
		 resultado= convertir.convierteRomano(50);
		Assert.assertEquals("L", resultado);
	}
	@Test
	public void numero_es_60_romano_es_LX() {
		 resultado= convertir.convierteRomano(60);
		Assert.assertEquals("LX", resultado);
	}
	@Test
	public void numero_es_100_romano_es_C() {
		 resultado= convertir.convierteRomano(100);
		Assert.assertEquals("C", resultado);
	}
	@Test
	public void numero_es_1000_romano_es_M() {
		 resultado= convertir.convierteRomano(1000);
		Assert.assertEquals("M", resultado);
	}
	@Test
	public void numero_es_2000_romano_es_MM() {
		 resultado= convertir.convierteRomano(2000);
		Assert.assertEquals("MM", resultado);
	}
	@Test
	public void numero_es_3000_romano_es_MMM() {
		 resultado= convertir.convierteRomano(3000);
		Assert.assertEquals("MMM", resultado);
	}
	@Test
	public void numero_es_3999_romano_es_MMMCMXCIX() {
		 resultado= convertir.convierteRomano(3999);
		Assert.assertEquals("MMMCMXCIX", resultado);
	}

}
