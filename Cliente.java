
public class Cliente {
    private String nome;
    private int dataNascimento;
    private String morada;
    private int nif;
    private String numero_cc;
    private Float salario;

    public Cliente(String nome, int dataNascimento, String morada, int nif, String numero_cc, Float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.nif = nif;
        this.numero_cc = numero_cc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    
    
}
