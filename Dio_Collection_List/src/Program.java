import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// java.util.List<E>
		// java.util.LinkedList<E>
		List<Double> notas = new ArrayList<>();
		notas.add(2.0);
		//Não posso adicionar no Array.asList e no List.of
		List<Double> classes = new ArrayList(Arrays.asList(7, 4, 3, 4, 4, 3, 4.3));
		List<String> sequencia = new ArrayList(List.of("a","b","c"));
		//classes.add(2.0) ou sequencia.add(3.0) dao erro
		System.out.println("Sequencia "+sequencia);
		
		System.out.println(notas);
		System.out.println(classes.toString());
		System.out.println("Posicao 4.3: "+classes.indexOf(4.3));
		notas.add(0, 9.9);
		notas.add(0, 8.8);
		System.out.println(notas);
		notas.set(1, 7.7);
		System.out.println(notas);
		System.out.println(notas.contains(7.7));
		System.out.println(notas.contains(7.6));
		
		System.out.println("Exibindo notas na order:");
		for(Double nota: notas) System.out.println(nota);
		
		System.out.println("A nota na posição zero é: "+notas.get(0));
		System.out.println("A menor nota é: "+ Collections.min(notas));
		System.out.println("A menor nota é: "+ Collections.max(notas));
		
		Iterator<Double>it = notas.iterator();
		Double soma =0d;
		while(it.hasNext()) {
			Double next = it.next();
			soma+=next;
		}
		System.out.println("Exiba a soma dos valores: "+ soma);
		System.out.println("Exiba a média dos valores: "+ (soma/notas.size()));
		
		System.out.println("Lista de notas antes do remove:");
		System.out.println(notas);
		System.out.println("Remova a nota 7.7: ");
		notas.remove(0);
		notas.remove(7.7);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7.7: ");
		Iterator<Double>iti = notas.iterator();
		while(iti.hasNext()) {
			Double next = iti.next();
			if(next<7.7) iti.remove();
		}
		System.out.println(notas);
		//notas.clear();
		System.out.println("Há notas?"+ notas+ notas.isEmpty());
		
		
	}
}
