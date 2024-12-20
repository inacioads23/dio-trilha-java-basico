package estruturasExcepcionais;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("23765064");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.out.println("Ver quantidade de dígito no cep");
		}
	}

	// Método que vai tratar a quantidade de dígitos do cep 
	static String formatarCep(String cep) throws CepInvalidoException {
		if (cep.length() != 8) {
			throw new CepInvalidoException();
		} else {
			return "23.765-064";
		}
	}

}
