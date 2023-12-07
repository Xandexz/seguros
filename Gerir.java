import java.util.ArrayList;

class Gerir{

    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Campanhas> campanhas = new ArrayList<>();

    public Gerir(){
        Cliente cliente1 = new Cliente("AA", "AA", "AA", 1, "AA", 22.1f);
        clientes.add(cliente1);
    }

    public boolean adicionarCliente(Cliente cl) {
        return clientes.add(cl);
    }

    public boolean removerCliente(String numero_cc){
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i) != null && clientes.get(i).getNumero_cc() == numero_cc){
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarCliente(String numero_cc){
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i) != null && clientes.get(i).getNumero_cc().equals(numero_cc)){
                System.out.println(clientes.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarCampanha(String idCampanha){
        for (int i = 0; i < campanhas.size(); i++) {
            if (campanhas.get(i) != null && campanhas.get(i).getIdCampanhas()== idCampanha){
                System.out.println(campanhas.get(i));
                return true;
            }
        }
        return false;
    }
    
}
