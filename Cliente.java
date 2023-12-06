
public class Cliente {
    private String nome;
    private int dataNascimento;
    private String morada;
    private int nif;
    private String numero_cc;
    private Float salario;

    //Criação de um Array
    private Veiculo[] veiculos = new Veiculo[5];
    
    public Cliente(String nome, int dataNascimento, String morada, int nif, String numero_cc, Float salario,
            Veiculo[] veiculos) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.nif = nif;
        this.numero_cc = numero_cc;
        this.salario = salario;
        this.veiculos = veiculos;
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

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }
   
    public boolean adicionarVeiculo(Veiculo v){
        for(int i =0;i < veiculos.length;i++){
            if(veiculos[i]== null){
                veiculos[i]= v;
                return true;
            }
        }
        return false;
    }

    public boolean removerVeiculo(String matricula){
        for(int i=0; i<veiculos.length;i++){
            if(veiculos[i]!= null && veiculos[i].getMatricula()== matricula){
                veiculos[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarVeiculo(String matricula){
        for(int i = 0; i<veiculos.length; i++){
            if(veiculos[i]!= null && veiculos[i].getMatricula()==matricula){
                System.out.println(veiculos[i].toString());
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
