import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Entre com uma nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10 ){
            System.out.println("Digite novamente a nota: ");
            nota = scan.nextInt();
        }

    }
}