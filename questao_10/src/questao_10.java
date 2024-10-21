import java.util.Scanner;

public class questao_10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da esfera:");
        double raio = sc.nextInt();
        
        sc.close();

        double volume = Math.PI * Math.pow(raio, 3) * 4 / 3;

        System.out.printf("Volume da esfera: %.2f\n", volume);

    }
}
