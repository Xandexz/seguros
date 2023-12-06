public class Administrador {
    private String iniciais;
    private TipoContrato tipoContrato;
    private Habilitacoes habilitacoes;
    private char inicioContrato;
    private char fimContrato;

    private Cliente[] cliente = new Cliente[1];
    private Campanhas[] campanhas = new Campanhas[3];

    public Administrador(String iniciais, TipoContrato tipoContrato, Habilitacoes habilitacoes, char inicioContrato,
            char fimContrato, Cliente[] cliente) {
        this.iniciais = iniciais;
        this.tipoContrato = tipoContrato;
        this.habilitacoes = habilitacoes;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
        this.cliente = cliente;
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
    
    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    } 

    public boolean adicionarCliente(Cliente cl) {
        for(int i = 0; i < cliente.length; i++){
            if (cliente[i] == null){
                cliente[i] = cl;
                return true;
            }
        }
        return false;
    }

    public boolean removerCliente(String numero_cc){
        for (int i = 0; i < cliente.length; i++){
            if (cliente[i] != null && cliente[i].getNumero_cc() == numero_cc){
                cliente[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarCliente(String numero_cc){
        for (int i = 0; i < cliente.length; i++){
            if (cliente[i] != null && cliente[i].getNumero_cc().equals(numero_cc)){
                System.out.println(cliente[i].toString());
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarCampanha(String idCampanha){
        for (int i = 0; i < campanhas.length; i++) {
            if (campanhas[i] != null && campanhas[i].getIdCampanhas()== idCampanha){
                System.out.println(campanhas[i].toString());
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Administrador [iniciais=" + iniciais + ", tipoContrato=" + tipoContrato + ", habilitacoes="
                + habilitacoes + ", inicioContrato=" + inicioContrato + ", fimContrato=" + fimContrato + "]";
    }
    
}
