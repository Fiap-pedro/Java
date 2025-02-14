import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, endereco;
        int idade;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual seu endereço ?");
        endereco = sc.nextLine();

        System.out.println("Quantos anos você tem ?");
        idade = sc.nextInt();

        System.out.printf("Seu nome é %s, você mora na rua %s e tem %d anos.", nome, endereco, idade);
    }
}