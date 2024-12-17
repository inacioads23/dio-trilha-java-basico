
public class SistemaMedida {

	public static void main(String[] args) {
		String sigla = "T";

		// Usando if/ else
		if (sigla == "P") {
			System.out.println("PEQUENO");
		} else if (sigla == "M") {
			System.out.println("MÉDIO");
		} else if (sigla == "G"){
			System.out.println("GRANDE");
		} else {
			System.out.println("INDEFINIDO");
		}

		//Usando Switch/ case
		switch (sigla) {
		case "P":
			System.out.println("Switch - PEQUENO");
			break;
		case "M":
			System.out.println("Switch - MÉDIO");
			break;
		case "G":
			System.out.println("Switch - GRANDE");
			break;
		default:
			System.out.println("Switch - INDEFINIDO");
		}

	}

}
