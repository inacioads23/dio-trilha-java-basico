package construtores;

public class SistemaCadastro {

	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("000.000.000-00","Jose");
		
		//insere endereço
		marcos.setEndereco("RUA DAS MARIAS");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());

	}

}
