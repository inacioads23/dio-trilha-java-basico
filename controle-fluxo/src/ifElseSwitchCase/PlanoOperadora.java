package ifElseSwitchCase;

public class PlanoOperadora {

	public static void main(String[] args) {
		String plano = "T";

		if (plano == "B") {
			System.out.println("100 minutos de ligação\n");
		} else if (plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Instagram grátis\n");
		} else if (plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Instagram grátis");
			System.out.println("5Gb Youtube\n");
		}

		//Como não uso break, então ele vai mostrar tudo que atender a partir da menor condição [B]
		switch (plano) {
		case "T":
			System.out.println("5Gb Youtube");
		case "M":
			System.out.println("Whats e Instagram grátis");
		case "B":
			System.out.println("100 minutos de ligação");
		}
	}

}
