public class FilmeTerror extends Filme {
    private int anoLancamento = 0;
    private String tipoCategoria = "";

    public FilmeTerror(String titulo, String diretor, int anoLancamento, String tipoCategoria) {
        super(titulo, diretor);
        this.anoLancamento = anoLancamento;
        this.tipoCategoria = tipoCategoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    protected void exibirInfo() {
        super.exibirInfo();
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Categoria: " + tipoCategoria);
    }
}
