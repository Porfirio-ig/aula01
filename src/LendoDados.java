import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		String Nome; 
		
		System.out.println("Por favor, insira seu nome");
		Nome = leitor.next();
		System.out.println("Bem vindo, " + Nome);
		leitor.close();

	}

}
