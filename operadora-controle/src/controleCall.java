
import java.util.Locale;
import java.util.Scanner;

public class controleCall {

	public static void main(String[] args) {
		float valorBase = 50; // Placement - (Oracle code conventions 6.2)

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos minutos totais foram usados este mês? ");
		int minutos = sc.nextInt();

		if (minutos > 100) {
			float valorFinal = valorBase + (minutos * 2); // One declaration per line (Oracle code conventions 6.1)
			float excedente = minutos - 100;
			System.out.printf(
					"Esse mês esse usuário falou por %d minutos, foram exedidos %.2f minutos após o térrmino de sua fanquia. \nSendo tarifado em R$ 2 reais por minuto adicional. \nSua fatura mensal final foi de R$ %.2f",
					minutos, excedente, valorFinal);
		} else {
			System.out.printf(
					"Esse mês esse usuário falou por %d minutos, não havendo excedentes em sua franquia mensal sua fatura final é de %.2f",
					minutos, valorBase);
		}

		sc.close();
	}

}
