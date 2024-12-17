import java.util.Locale;

public class CaixaEletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double saldo = 25.0;
		double valorSolicitado = 22.0;
		
		// Condicional simples
		if(valorSolicitado < saldo) {
			System.out.printf("Saldo anterior: R$ %.2f ", saldo);
			System.out.printf("%nValor do saque: R$ %.2f ",valorSolicitado);
			saldo = saldo - valorSolicitado;
			
			System.out.printf("%nNovo saldo: R$ %.2f", saldo);
		// Condicional composta
		}else {
			System.out.println("Saldo insuficiente");
		}

	}

}
