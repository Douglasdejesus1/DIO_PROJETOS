import java.util.stream.IntStream;

public class PararelStreamExemplo {

	public static void main(String[] args) {
	long inicio =	System.currentTimeMillis();
	IntStream.range(1, 240000).forEach(num -> fatorial(num));//serial Stream
	long fim =System.currentTimeMillis();

	System.out.println("Tempo de execucao: "+(fim-inicio));
	
	inicio =	System.currentTimeMillis();
	IntStream.range(1, 390000).parallel().forEach(num -> fatorial(num));//parallel Stream
	fim =System.currentTimeMillis();

	System.out.println("Tempo de execucao: "+(fim-inicio));
	}
	public static long  fatorial(long num) {
		int fat =1;
		for(int i=0; i<=num;i++) {
			fat *=i;
		}
		return fat;
	}

}
