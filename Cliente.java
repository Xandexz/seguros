
public class Cliente {
    private String nome;
    private char data_de_nascimento;
    private String morada;
    private int nif;
    private String numero_cc;
    private Float salario;
    private Veiculo veiculo;
    
    public Cliente(String nome, char data_de_nascimento, String morada, int nif, String numero_cc, Float salario,
            Veiculo veiculo) {
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.morada = morada;
        this.nif = nif;
        this.numero_cc = numero_cc;
        this.salario = salario;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(char data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNumero_cc() {
        return numero_cc;
    }

    public void setNumero_cc(String numero_cc) {
        this.numero_cc = numero_cc;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
}
