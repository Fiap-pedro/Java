public class FilmeComedia extends Filme {
    private String tipoHumor = "";
    private boolean engracado;

    public FilmeComedia(String titulo, String diretor, String tipoHumor, boolean engracado) {
        super(titulo, diretor);
        this.tipoHumor = tipoHumor;
        this.engracado = engracado;
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }

    public boolean isEngracado() {
        return engracado;
    }

    public void setEngracado(boolean engracado) {
        this.engracado = engracado;
    }
}
