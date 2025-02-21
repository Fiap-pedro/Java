public class Casting {
    public static void main(String[] args) {
        //Widening
        byte valorByte = 18;
        double valorDouble = valorByte;

        //Narrowing
        double media = 9.8;
        int valorInt = (int) media;

        //String para Double
        String num = "9.9";
        double numDouble = Double.parseDouble(num);

        //String para Int
        String num2 = "10";
        int numInt = Integer.parseInt(num2);

        System.out.println("Valor Byte: "+valorByte);
        System.out.println("Valor Double: "+valorDouble);

        System.out.println("Média: "+media);
        System.out.println("Valor Inteiro: "+valorInt);

        System.out.println("String: "+num);
        System.out.println("Double: "+numDouble);

        System.out.println("String: "+num2);
        System.out.println("Int: "+numInt);
    }
}
