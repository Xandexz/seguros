import java.util.Arrays;

public class Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    private int numero_chassi;
    private Origem origem;
    private String matricula;

    private Cliente[] cliente = new Cliente[1];
    
    public Veiculo(String marca, String modelo, int ano, int numero_chassi, Origem origem, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numero_chassi = numero_chassi;
        this.origem = origem;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumero_chassi() {
        return numero_chassi;
    }

    public void setNumero_chassi(int numero_chassi) {
        this.numero_chassi = numero_chassi;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", numero_chassi=" + numero_chassi
                + ", origem=" + origem + ", matricula=" + matricula + ", cliente=" + Arrays.toString(cliente) + "]";
    }
    
    
}
