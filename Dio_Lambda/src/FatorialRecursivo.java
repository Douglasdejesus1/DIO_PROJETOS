
public class FatorialRecursivo {

	public static void main(String[] args) {
		System.out.println(fatorial(500000000));

	}

	public static long fatorial(long value) {
		if (value == 1) {
			return value;
		} else {
			return value * fatorial((value - 1));
		}
	}

}
