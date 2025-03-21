package herois_e_viloes;

public class Vingador {
    public String nome;
    public String habilidade;
    public double altura;
    public int idade;
    public boolean podeVoar;

    public Vingador(String nome, String habilidade, double altura, int idade, boolean podeVoar) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.altura = altura;
        this.idade = idade;
        this.podeVoar = podeVoar;
    }

    public void combate() {
        System.out.printf("\n%s está combatendo os vilões.", nome);
    }

    public void ficha() {
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nHabilidade: %s", habilidade);
        System.out.printf("\nAltura: %.2f", altura);
        System.out.printf("\nIdade: %d", idade);
        System.out.printf("\nPode voar: %b", podeVoar);
    }


}
