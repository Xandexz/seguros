import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String dataNascimento;
    private String morada;
    private int nif;
    private String numero_cc;
    private Float salario;

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public Cliente(String nome, String dataNascimento, String morada, int nif, String numero_cc, Float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.nif = nif;
        this.numero_cc = numero_cc;
        this.salario = salario;
        veiculos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public boolean adicionarVeiculo(Veiculo v) {
        return veiculos.add(v);
    }

    public boolean removerVeiculo(String matricula) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i) != null && veiculos.get(i).getMatricula() == matricula) {
                veiculos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarVeiculo(String matricula) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i) != null && veiculos.get(i).getMatricula() == matricula) {
                System.out.println(veiculos.get(i).toString());
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", dataNascimento=" + dataNascimento + ", morada=" + morada + ", nif=" + nif
                + ", numero_cc=" + numero_cc + ", salario=" + salario + "]";
    }

}
