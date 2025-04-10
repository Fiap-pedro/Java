public class Funcionario {
    private String nome = "";
    private float salario = 0;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void exibeFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }
}
