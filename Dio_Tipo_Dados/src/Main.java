
public class Main {

	public static void main(String[] args) {
		String texto ="333";
		char c ='4';
		//8bits -128 a 127
		byte b1=-128;
		byte b2=127;
		
		short s1 =-32768;
		short s2 =32767;
		
		int i1 =-2147483648;
		int i2 =2147483647;
		int i3 = 32;
		
		long l1 = -9223372036854775807L;
		long l2 = 9223372036854775807L;
		
		
		System.out.println("O tipo byte tem 8-bit e vai de "+b1+" a "+ b2);
		System.out.println("O tipo short tem 16-bit e vai de "+s1+" a "+ s2);
		System.out.println("O tipo int tem 32-bit e vai de "+i1+" a "+ i2);
		System.out.println("O tipo long tem 64-bit e vai de "+l1+" a "+ l2);
		
		//upcast
		//downcast
		long l3 =b1;
		System.out.println("Exemplo de upCast:");
		System.out.println("l3 recebendo um b1: "+l3);
		
		byte b3 = (byte)i3;
		System.out.println("Exemplo de downCast:");
		System.out.println("b3 recebendo um (byte)i3: "+b3);
	}

}
