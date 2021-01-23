package mundo;

import PredictionModel.RegresionLineal;
import static java.util.Arrays.asList;

public class principal {
	
	
	public static void main(String[] args) {
		
		// En este ejemplo estoy creando el modelo lineal con los siguientes parametros:
		// X: Genero del comprador (1 - Hombre, 0 - Mujer)
		// Y: Si compraron el producto o no (1 - Si, 0 - No)
		RegresionLineal lr = new RegresionLineal(asList(0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1), asList(1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0)); 
		System.out.println(lr.predecirValor(1));
		System.out.println(lr.predecirValor(0));
		
		// Predice los valores Y tomando en cuenta la lista X
		lr.predecir();
	}
	
}
