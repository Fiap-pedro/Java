public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro", 8000);
        Assistente assistente1 = new Assistente("Carlos", 1500, 58957);
        AssistenteTecnico assistenteTecnico1 = new AssistenteTecnico("Julia", 2000, 556789, 700);
        AssistenteAdministrativo assistenteAdministrativo1 = new AssistenteAdministrativo("Bruno", 1700, 55478, "Noite");

        assistenteAdministrativo1.exibeFicha();

    }
}