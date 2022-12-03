import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu peso (Kg): ");
		Double peso = scan.nextDouble();
		
		System.out.println("Digite a sua altura (Mt): ");
		Double altura = scan.nextDouble();
		
		Double AlturaAoQuadrado = altura * altura;
		Double resultado = peso / AlturaAoQuadrado;
		
		System.out.println("O seu Imc é: " + resultado);
		scan.close();
	}
}
