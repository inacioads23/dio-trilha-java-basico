package estruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

	public static void main(String[] args) {

		try {
			Number valor1 = Double.valueOf("a1.75");
			System.out.println(valor1);
		} catch (NumberFormatException e) {
			System.out.println("Não é possível converter texto em double\n" + e);
		}

		try {
			Number valor = NumberFormat.getInstance().parse("a1.75");
			System.out.println(valor);
		} catch (ParseException e) {
			System.out.println("Não é possível converter texto em double\n" + e);
		}

	}

}
