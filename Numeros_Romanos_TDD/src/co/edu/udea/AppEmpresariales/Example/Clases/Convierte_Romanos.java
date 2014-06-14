package co.edu.udea.AppEmpresariales.Example.Clases;

/*Clase definida para convertir numeros arábigos en romanos*/
public class Convierte_Romanos {

	/*Variables globales*/
	private String resultado="";
	private int posicion=0;
	private int i=1;
	private int [] numerosArabigos;
	private String[] numerosRomanos;
	private int MaximoRomano=3999;
	private int MinimoRomano=1;
	
	
	
	/* Método que convierte números Arábigos en Romanos */
	public String convierteRomano(int numeroArabigo) {

		/*
		 * Números arábigos desde 1 hasta 1000, comenzando de mayor a menor para
		 * descontar unidades
		 */
		numerosArabigos = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10,
				9, 5, 4, 1 };
		/* Números Romanos desde 1 hasta 1000, comenzando de mayor a menor */
		numerosRomanos = new String[] { "M", "CM", "D", "CD", "C", "XC", "L",
				"XL", "X", "IX", "V", "IV", "I" };
		/* Se valida condición de que el número esté entre 1 y 3999 */
		if (numeroArabigo >= MinimoRomano && i <= MaximoRomano) {
				/* Variable x contendrá el número que deseamos convertir */
				int x = numeroArabigo;
				/* Se valida que el número no sea negativo */
				while (x > 0) {
					/* Se valida si el número actual contiene el valor romano */
					while (x >= numerosArabigos[posicion]) {
						/*
						 * Concatenamos lo que tiene el resultado con el nuevo
						 * número romano encontrado
						 */
						resultado += (numerosRomanos[posicion]);
						/* Restamos el valor actual con el número arábigo */
						x = x - numerosArabigos[posicion];
					}
					/*
					 * Cuando se complete un número arabigo con un número
					 * romano, se sigue con el siguiente en el array
					 */
					posicion++;
				} /* Fin del while */
			}/* Fin del if */
		/*Se valida que cumpla con la regla*/
		if(numeroArabigo>MaximoRomano || numeroArabigo<MinimoRomano){
		return	resultado ="No valido";
		}
		return resultado;
	}


}
