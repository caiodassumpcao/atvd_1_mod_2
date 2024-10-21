import java.util.Scanner;

public class questao_11 {
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do triangulo:");
        double base = sc.nextInt();
        System.out.println("Digite a altura do triangulo:");
        double altura = sc.nextInt();
        sc.close();

        double area = base * altura / 2;
        System.out.printf("A área do triangulo: %.2f\n", area);
    }
}
