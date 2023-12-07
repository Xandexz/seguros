public class Administrador extends Cliente{
    private String iniciais;
    private TipoContrato tipoContrato;
    private Habilitacoes habilitacoes;
    private char inicioContrato;
    private char fimContrato;

    
    public Administrador(String nome, String dataNascimento, String morada, int nif, String numero_cc, Float salario,
            String iniciais, TipoContrato tipoContrato, Habilitacoes habilitacoes,
            char inicioContrato, char fimContrato) {
        super(nome, dataNascimento, morada, nif, numero_cc, salario);
        this.iniciais = iniciais;
        this.tipoContrato = tipoContrato;
        this.habilitacoes = habilitacoes;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }


    public String getIniciais() {
        return iniciais;
    }


    public void setIniciais(String iniciais) {
        this.iniciais = iniciais;
    }


    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }


    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }


    public Habilitacoes getHabilitacoes() {
        return habilitacoes;
    }


    public void setHabilitacoes(Habilitacoes habilitacoes) {
        this.habilitacoes = habilitacoes;
    }


    public char getInicioContrato() {
        return inicioContrato;
    }


    public void setInicioContrato(char inicioContrato) {
        this.inicioContrato = inicioContrato;
    }


    public char getFimContrato() {
        return fimContrato;
    }


    public void setFimContrato(char fimContrato) {
        this.fimContrato = fimContrato;
    }


    @Override
    public String toString() {
        return "Administrador [iniciais=" + iniciais + ", tipoContrato=" + tipoContrato + ", habilitacoes="
                + habilitacoes + ", inicioContrato=" + inicioContrato + ", fimContrato=" + fimContrato + "]";
    }
    
}
