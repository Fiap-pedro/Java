import herois_e_viloes.Vilao;
import herois_e_viloes.Vingador;

public class Main {
    public static void main(String[] args) {
        Vingador homemDeFerro = new Vingador("Tony Stark", "Rico e gênio", 1.82, 47, true);
        Vilao loki = new Vilao("Loki", "Magia", false, 1.87);

        homemDeFerro.ficha();
        homemDeFerro.combate();

        loki.ficha();
        loki.cometendoMaldade();
    }
}