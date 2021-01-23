package PredictionModel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.Arrays.asList;

import java.util.LinkedList;

public class RegresionLineal 
{
	// Hacemos listas de listas
	private List<Integer> x; // X son los datos historicos
	private List<Integer> y; // Y son los resultados
	
	//Constructor
	public RegresionLineal(List x, List y)
	{
		this.x = x;
		this.y = y;
	}
	
	public List<Double> predecir() 
	{
		// Excepcion cuando el tamaño de X e Y son distintos
		if (x.size() != y.size()) 
		{
            throw new IllegalStateException("Must have equal X and Y data points");
        }
        
        Integer valoresX = x.size();

        List<Double> xCuadrado = x
                .stream()
                .map(position -> Math.pow(position, 2))
                .collect(Collectors.toList());

        List<Integer> xMultiplicadoY = IntStream.range(0, valoresX)
                .map(i -> x.get(i) * y.get(i))
                .boxed()
                .collect(Collectors.toList());

        Integer sumatoriaX = x
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Integer sumatoriaY = y
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Double sumatoriaXCuadrado = xCuadrado
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Integer sumatoriaXMultiplicadoY = xMultiplicadoY
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        int betaNum = valoresX * sumatoriaXMultiplicadoY - sumatoriaY * sumatoriaX;
        Double betaDem = valoresX * sumatoriaXCuadrado - Math.pow(sumatoriaX, 2);
        Double beta = betaNum / betaDem;

        double alphaNum = sumatoriaY - beta * sumatoriaX;
        double alphaDem = valoresX;
        Double alpha = alphaNum / alphaDem;
        
        List<Double> Y = new LinkedList<Double>(asList());
        
        for(int i = 0; i < valoresX; i++) 
        {
	        Y.add(alpha + (beta * x.get(i)));
        }
        
        int n = 0;
        for(int i = 0; i < valoresX; i++) 
        {
        	n += Y.get(i) - sumatoriaY;
        }

        Double SSR = Math.pow(n, 2);
        
        n = 0;
        for(int i = 0; i < valoresX; i++) 
        {
        	n += y.get(i) - sumatoriaY;
        }
        
        Double SST = Math.pow(n, 2);
        
        Double R2 = SSR / SST;
        
        System.out.println();
    	System.out.println("R2: " + R2);
        
    	for(int i = 0; i < valoresX; i++) 
    	{
        	System.out.println("Y actual: " + y.get(i) + " | Y predict: " + Y.get(i));
        }
    	
        return Y;
	}
	
	public Double predecirValor(int X) 
	{
    	// Excepcion cuando el tamaño de X e Y son distintos
		if (x.size() != y.size()) 
		{
            throw new IllegalStateException("Must have equal X and Y data points");
        }
        
        Integer valoresX = x.size();

        List<Double> xCuadrado = x
                .stream()
                .map(position -> Math.pow(position, 2))
                .collect(Collectors.toList());

        List<Integer> xMultiplicadoY = IntStream.range(0, valoresX)
                .map(i -> x.get(i) * y.get(i))
                .boxed()
                .collect(Collectors.toList());

        Integer sumatoriaX = x
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Integer sumatoriaY = y
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Double sumatoriaXCuadrado = xCuadrado
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Integer sumatoriaXMultiplicadoY = xMultiplicadoY
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        int betaNum = valoresX * sumatoriaXMultiplicadoY - sumatoriaY * sumatoriaX;
        Double betaDem = valoresX * sumatoriaXCuadrado - Math.pow(sumatoriaX, 2);
        Double beta = betaNum / betaDem;

        double alphaNum = sumatoriaY - beta * sumatoriaX;
        double alphaDem = valoresX;
        Double alpha = alphaNum / alphaDem;

        Double Y = (beta * X) + alpha;
        
        return Y;
    }
}
