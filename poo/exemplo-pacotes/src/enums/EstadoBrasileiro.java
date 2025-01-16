package enums;

public enum EstadoBrasileiro {
	//Enum
	SAO_PAULO ("SP", "São Paulo", 11),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
	PIAUI("PI", "Piaui", 13),
	MARANHAO("MA", "Marranhão", 14),
	CEARA("CE", "Ceará", 15)	;
	

	//Atributos (Variáveis)
	private String nome;
	private String sigla;
	private int ibge;
	
	//Construtor - Setters
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		// TODO Auto-generated constructor stub
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}	
	
	//Método que retorna o nome em maiúsculo
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

	public int getIbge() {
		return ibge;
	}	
	
}
