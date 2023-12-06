
public class Cliente {
    private String nome;
    private int contacto;
    private String palavra_passe;
    private char data_de_nascimento;
    private int numeroContribuinte;
    
    public Cliente(String nome, int contacto, char data_de_nascimento, int numeroContribuinte) {
        this.nome = nome;
        this.contacto = contacto;
        this.data_de_nascimento = data_de_nascimento;
        this.numeroContribuinte = numeroContribuinte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public char getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(char data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public int getNumeroContribuinte() {
        return numeroContribuinte;
    }

    public void setNumeroContribuinte(int numeroContribuinte) {
        this.numeroContribuinte = numeroContribuinte;
    }

    
    
}
