package construtores;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	//Construtor - Ao criar o objeto Força que os dados sejam inseridos obrigatoriamente 
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//Construtor sem argumento	
	public Pessoa() {
		super();
	}
	

	public String getNome() {
		return nome;
	}	
	public String getCpf() {
		return cpf;
	}	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
