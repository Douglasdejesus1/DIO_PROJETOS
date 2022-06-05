import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Map<String, Double> carrosPopulares = new HashMap<>() {
			{
				put("gol", 14.4);
				put("uno", 12.4);
				put("celta", 9.4);
				put("sandeiro", 10.4);
				put("ka", 16.4);
			}
		};
		System.out.println(carrosPopulares);
		System.out.println();

		System.out.println("Substitua o consumo do gol por 15.2");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		System.out.println();

		System.out.println("Confira se o modelo bmw está no dicionário: " + carrosPopulares.containsKey("bmw"));
		System.out.println();
		
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
		System.out.println();
		
		System.out.println("Exiba os modelos: " + carrosPopulares.keySet());
		System.out.println();
		
		System.out.println("Exiba os consumos: " + carrosPopulares.values());
		System.out.println();

		Double economico = Collections.max(carrosPopulares.values());
		System.out.println("Qual o menor consumo? " + economico);
		
		
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";

		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(economico)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + ", " + economico);
			}
		}
		System.out.println();
		
		
		Double gastao = Collections.min(carrosPopulares.values());
		System.out.println("Qual o carro mais gastao? " + gastao);
		Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
		String modeloMaisGastao = "";

		for (Map.Entry<String, Double> entry : entries1) {
			if (entry.getValue().equals(gastao)) {
				modeloMaisGastao = entry.getKey();
				System.out.println("Modelos mais gastao: " + modeloMaisGastao + ", " + gastao);
			}
		}
		System.out.println();
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Exiba a soma dos consumos: " + soma);
		System.out.println("Exiba a media dos consumos: " + (soma/carrosPopulares.size()));
		System.out.println();
		
		
		System.out.println("Remova os modelos com consumo igual a 14.4: ");
		Iterator<Double> iterator2 = carrosPopulares.values().iterator();
		
		while (iterator2.hasNext()) {
			if(iterator2.next().equals(15.2)) iterator2.remove();
		}
		System.out.println(carrosPopulares);
		System.out.println();
		
		
		System.out.println("Exiba os carros na ordem em que foram informados: ");
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {
			{
				put("gol", 14.4);
				put("uno", 12.4);
				put("celta", 9.4);
				put("sandeiro", 10.4);
				put("ka", 16.4);
			}
		};
		System.out.println(carrosPopulares2);
		System.out.println();
		
		
		System.out.println("Exiba o dicionario ordenado pelo modelo");
		//Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2) {
		Map<String, Double> carrosPopulares3 = new TreeMap<>() {
			{
				put("gol", 14.4);
				put("uno", 12.4);
				put("celta", 9.4);
				put("sandeiro", 10.4);
				put("ka", 16.4);
			}
		};
		System.out.println(carrosPopulares3);
		System.out.println();
		
		System.out.println("Apague o dicionario de carros");
		carrosPopulares3.clear();
		System.err.println(carrosPopulares3.isEmpty());
	}
}
