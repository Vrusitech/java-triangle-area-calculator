import java.util.Scanner; //Código para calculo de área do Triângulo

public class Calculator{

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double base, altura, area;
		
		System.out.print("Digite o valor da base: ");
		base = leitor.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		altura = leitor.nextDouble();
		
		area = (base * altura)/2;
		
		System.out.println("A area do triangulo e: " + area);
		
		leitor.close();
	}
}