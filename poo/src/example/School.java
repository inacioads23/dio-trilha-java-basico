package example;
import java.awt.Color;

public class School {

	public static void main(String[] args) {
		Student student1 = new Student(); //instanciando/ criando um novo objeto a partir da classe Student
		student1.name=  "Jonh";
		student1.age = 12;
		student1.color = Color.black;
		student1.sex = "MALE";
		
		Student student2 = new Student();
		student2.name=  "Sophia";
		student2.age = 10;
		student2.color = Color.white;
		student2.sex = "FEMALE";
		
		Student student3 = new Student();
		student3.name=  "lILY";
		student3.age = 11;
		student3.color = Color.DARK_GRAY;
		student3.sex = "FEMALE";
		
		System.out.println("Estudante 1");
		System.out.println("Nome: " + student1.name);
		

	}

}
