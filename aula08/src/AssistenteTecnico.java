public class AssistenteTecnico extends Assistente {
    private float bonusSalarial = 0;

    public AssistenteTecnico(String nome, float salario, int numeroDeMatricula, float bonusSalarial) {
        super(nome, salario + bonusSalarial, numeroDeMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void exibeFicha() {
        super.exibeFicha();
        System.out.println("Bônus salarial: R$" + bonusSalarial);
        System.out.println("Salário sem bônus: R$" + (getSalario() - bonusSalarial));
    }

}
