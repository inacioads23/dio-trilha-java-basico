// Uma classe é definida por atributos e métodos
/* Ex.: Classe carro
 * atributos/ variáveis: anoFabricacao, numeroChassi
 * métodos: acelerar, buzinar, frear 
 */

// CRITÉRIOS
/* Deve ser nomeado como verbo: frear, buzinar, somar, dividir
 * Seguir o padrão camelCase: calcularImposto * 
 */

 // NOMENCLATURA de métodos indicadas:
 /* somar(int n1, int n2){}
  * abrirConexao(){}
  * concluirProcessamento(){}	
	//Buscar por id
  *	findById(int id){}
  */

 // NOMENCLATURA de métodos não indicadas:
  /* calcularImprimir(){} // método tem duas funções. O ideal é quebrar em dois
   * calcular(){}
   * Imprimir(){} 
   */

 // os métodos também
   /* precisam de parâmetros
    * às vezes precisa tratar as excessões (que geram erros)
    * precisa definir a visibilidade dele: public, private, protected
    */

import java.util.Scanner;

public class Métodos {

	public static void main(String[] args) throws Exception {
		Scanner ler = new Scanner(System.in);		
		int n1, n2;
		
		imprimir("msg");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		
		System.out.println(somar(n1, n2));
		System.out.println(dividir(n1, n2));
	}
	
	public static double somar(int num1, int num2) {
		double soma = num1 + num2;
		return soma;
	}
	
	public static double dividir(int dividendo, int divisor) throws Exception {
	    if (divisor == 0) {
	        throw new Exception("Divisão por zero não é permitida.");
	    }
	    			//uso da cast
	    double divisao = (double) dividendo / divisor;
	    return divisao;
	}

	
	public static void imprimir(String texto) {
		System.out.println("Digite o número: ");
	}
	
	
	
	//Não pode ser visto diretamente por outras classes
	private void metodoPrivado() {}
	
	//Quando um método prcisa de muitos atributos, o ideal é transformá-lo em objeto
	public void gravaCliente(String nome, String cpf, int indade) {}
	
	//Usar Objeto ao invés de método - OPÇÃO1
	public void gravaCliente(Cliente cliente) {}
	
	//Usar Objeto ao invés de método - OPÇÃO2
	public void grava(Cliente cliente) {}
	

}
