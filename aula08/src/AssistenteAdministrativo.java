import java.util.Objects;

public class AssistenteAdministrativo extends Assistente{
    private String turno = "";
    private final float bonusNoturno = 500;

    public AssistenteAdministrativo(String nome, float salario, int numeroDeMatricula, String turno) {
        super(nome, salario, numeroDeMatricula);
        this.turno = turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public float getSalario() {
        if (turno.equalsIgnoreCase( "noite")) {
            return super.getSalario() + bonusNoturno;
        } else {
            return super.getSalario();
        }
    }

    @Override
    public void exibeFicha() {
        super.exibeFicha();
        System.out.println("Turno: " + turno);
        if (turno.equalsIgnoreCase( "noite")) {
            System.out.println("Salário com bônus noturno: R$" + getSalario());
        }

    }

}
