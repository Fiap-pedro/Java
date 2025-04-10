public class Assistente extends Funcionario{
    private int numeroDeMatricula = 0;

    public Assistente(String nome, float salario, int numeroDeMatricula) {
        super(nome, salario);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    @Override
    public void exibeFicha() {
        super.exibeFicha();
        System.out.println("Número de matrícula: " + numeroDeMatricula);
    }
}
