import java.util.Scanner;

public class Treino {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		var nome = scanner.nextLine();
		
		System.out.printf("Olá %s, tudo bem com você!", nome);
	}
}
