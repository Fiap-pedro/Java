package herois_e_viloes;

public class Vilao {
    public String nome;
    public String habilidade;
    public boolean podeVoar;
    public double altura;

    public Vilao(String nome, String habilidade, boolean podeVoar, double altura) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.podeVoar = podeVoar;
        this.altura = altura;
    }

    public void cometendoMaldade() {
        System.out.printf("\n%s está cometendo um atentado.", nome);
    }

    public void ficha() {
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nHabilidade: %s", habilidade);
        System.out.printf("\nAltura: %.2f", altura);
        System.out.printf("\nPode voar: %b", podeVoar);
    }

}
