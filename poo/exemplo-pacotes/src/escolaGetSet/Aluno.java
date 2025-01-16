/*
 * Getter: RETORNA (return) o valor do atributo especificado
 * Setter: define outro novo valor para o atributo especificado
 * */
package escolaGetSet;

public class Aluno {
	private String nome;
	private int idade;
	private String sexo;

	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	public int getIdade() {
		return idade;
	}	
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}	
	public String getSexo() {		
		return sexo;
	}	
	public void setSexo(String sexo) {
		if(sexo.equals("M")) {
			sexo = "Masculino";
		}else if(sexo.equals("F")) {
			sexo ="Feminino";
		}else {
			sexo = "OUTROS";
		}
		this.sexo = sexo;
	}	
	
}
