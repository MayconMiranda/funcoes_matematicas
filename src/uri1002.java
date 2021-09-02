import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner folha = new Scanner(System.in);
		
		double sal, vlhora;
		int num,horas;
		String nome;
		
		System.out.print("qual o nome do funcionario? ");
		nome = folha.next();
		System.out.print("digite o numero do funcionário: ");
		num = folha.nextInt();
		System.out.print("digite as horas trabalhadas: ");
		horas = folha.nextInt();
		System.out.print("quanto é a hora na empresa ");
		vlhora = folha.nextDouble();
		
		sal = horas * vlhora;
		
		System.out.println(nome+" seu número é o "+num+".");
		System.out.printf("e o seu salario foi = R$ %.2f%n", sal);
		
		folha.close();
	}
}