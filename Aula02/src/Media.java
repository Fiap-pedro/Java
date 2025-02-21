import java.sql.SQLOutput;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Digite o 1° número:");
        n1 = sc.nextFloat();
        System.out.println("Digite o 2° número:");
        n2 = sc.nextFloat();
        System.out.println("Digite o 3° número:");
        n3 = sc.nextFloat();

        float media = (n1+n2+n3)/3;

        System.out.printf("a média de %.2f, %.2f e %.2f é %.2f", n1, n2, n3, media);
        sc.close();
    }

}
