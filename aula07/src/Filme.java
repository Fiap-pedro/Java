public class Filme {
    protected String titulo = "";
    protected String diretor = "";
    protected double avaliacao = 0;

    public Filme(String titulo, String diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.avaliacao = 0.0;
    }

    protected void exibirInfo() {
        System.out.println("Nome: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Avaliação: " + (avaliacao == 0 ? "Não foi avaliado" : avaliacao + "/5"));

    }

    public void avaliarFilme(double nota) {
        if (nota>=0 || nota<=5) {
            avaliacao = nota;
            System.out.printf("O filme %s recebeu nota: %.2f.", titulo, nota);
        } else {
            System.out.println("Coloque uma nota válida (entre 0 e 5).");
        }
    }
}
