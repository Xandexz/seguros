
public class Campanhas {
    private String idCampanhas;
    private String Veiculo;
    private int Preco;
    private String Duracao;
    
    // construtor das campanhas
    public Campanhas(String idCampanhas, String veiculo, int preco, String duracao) {
        this.idCampanhas = idCampanhas;
        Veiculo = veiculo;
        Preco = preco;
        Duracao = duracao;
    }
    //Getters and setters
    public String getIdCampanhas() {
        return idCampanhas;
    }

    public void setIdCampanhas(String idCampanhas) {
        this.idCampanhas = idCampanhas;
    }

    public String getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(String veiculo) {
        Veiculo = veiculo;
    }

    public int getPreco() {
        return Preco;
    }

    public void setPreco(int preco) {
        Preco = preco;
    }

    public String getDuracao() {
        return Duracao;
    }

    public void setDuracao(String duracao) {
        Duracao = duracao;
    }

    @Override
    public String toString() {
        return "Campanhas [idCampanhas=" + idCampanhas + ", Veiculo=" + Veiculo + ", Preco=" + Preco + ", Duracao="
                + Duracao + "]";
    }
    
}
