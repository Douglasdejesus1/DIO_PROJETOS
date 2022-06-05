
public class Main2 {
	public static void main(String[] args) {
		String dia = "terca";

		switch (dia) {
		case "segunda":
			System.out.println("1");
			break;
		case "terca":
			System.out.println("2");
			break;
			
		}
		for (int i=1;i<6;i++){
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}
}