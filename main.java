import java.util.Scanner;

public class main {
    private Gerir gerir = new Gerir();
    public static void main(String[] args) {
        int option = 0;
        // scanner para fazer o input do utilizador
        Scanner menu = new Scanner(System.in);
        do {
            Scanner menu2 = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            System.out.println("[1] REGISTAR UTILIZADOR" );
            option = menu2.nextInt();
            switch (option) {
                case 1:
                    //Registrar o utilizador
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Data de nascimento: ");
                    String dataNascimento = scanner.nextLine();

                    System.out.println("Morada: ");
                    String morada = scanner.nextLine();

                    System.out.println("Número de identificação fiscal: ");
                    int nif = scanner.nextInt();

                    System.out.println("Número de cartão de cidadão: ");
                    String numero_cc = scanner.next();

                    System.out.println("Salário: ");
                    Float salario = scanner.nextFloat();

                    Cliente clientes = new Cliente(nome, dataNascimento, morada, nif, numero_cc, salario);
                    Gerir.clientes.add(clientes);

                    System.out.println("--------------------------");
                    System.out.println(clientes.getNome()+ " está registado no sitema");


                    
                    do {
                        Scanner menu3 = new Scanner(System.in);
                        Scanner scanners = new Scanner(System.in);
                        System.out.println("----- MENU -----");
                        System.out.println("[1] CADASTRAR VEÍCULO \n[2] VISUALIZAR CAMPANHAS \n[3] DEFINIÇÕES AVANÇADAS");
                        option = menu2.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Marca do veiculo: ");
                                String marca = " ";
                                marca = scanners.next();

                                System.out.println("Modelo: ");
                                String modelo = scanners.next();

                                System.out.println("Ano do seu veiculo: ");
                                int ano = scanners.nextInt();

                                System.out.println("Número de chassi: ");
                                int chassi = scanners.nextInt();

                                System.out.println("Nome da sua matricula: ");
                                String matricula = scanners.next();

                                System.out.println("----ORIGEM DO SEU VEICULO---- \n[1] Nacional \n[2] Importado ");
                                int org = scanners.nextInt();

                                if(org == 1){
                                    Origem origem = Origem.NACIONAL;
                                    Veiculo veiculo1 = new Veiculo(marca, modelo, ano, chassi, origem, matricula);
                                    clientes.adicionarVeiculo(veiculo1);
                                }else{
                                    Origem origem = Origem.IMPORTADO;
                                    Veiculo veiculo1 = new Veiculo(marca, modelo, ano, chassi, origem, matricula);
                                    clientes.adicionarVeiculo(veiculo1);
                                }

                                System.out.println("----VEÍCULO CADASTRADO COM SUCESSO----");

                                break;
                            case 2:
                                System.out.println();
                                System.out.println("----- CAMPANHAS -----");
                                System.out.println();
                                //1ª campanha
                                // criar uma campanha com o nome campanha1 e atribuindo valores de seguida dar print aos valores fazendo o mesmo para as outras campanhas
                                Campanhas campanha1 = new Campanhas("Campanha nº1","Veiculos ligeiros", 200, "2 anos");
                                System.out.println("-----"+ campanha1.getIdCampanhas()+ "-----");
                                System.out.println("Dedicada a: "+ campanha1.getVeiculo());
                                System.out.println("Com um preço de "+ campanha1.getPreco()+ "€");
                                System.out.println("Tendo uma duração de: "+ campanha1.getDuracao());
                                
                                //2ª campanha
                                Campanhas campanha2 = new Campanhas("Campanha nº2","Veiculos Pesados", 400, "1,5 anos");
                                System.out.println("-----"+ campanha2.getIdCampanhas()+ "-----");
                                System.out.println("Dedicada a: "+ campanha2.getVeiculo());
                                System.out.println("Com um preço de "+ campanha2.getPreco()+ "€");
                                System.out.println("Tendo uma duração de: "+ campanha2.getDuracao());


                                //3ª campanha
                                Campanhas campanha3 = new Campanhas("Campanha nº3","Motociclos", 200, "1 anos");
                                System.out.println("-----"+ campanha3.getIdCampanhas()+ "-----");
                                System.out.println("Dedicada a: "+ campanha3.getVeiculo());
                                System.out.println("Com um preço de "+ campanha3.getPreco()+ "€");
                                System.out.println("Tendo uma duração de: "+ campanha3.getDuracao());

                                System.out.println("-----------------------");
                                System.out.println();

                                break;
                            case 3:
                                do{
                                    Scanner menu4 = new Scanner(System.in);
                                    System.out.println("----- DEFENIÇÕES DE USUÁRIO -----");
                                    System.out.println("[1] VISUALIZAR VEÍCULOS CADASTRADOS\n[2] REMOVER VEÍCULOS \n[3] OPÇÕES DE USUÁRIO");
                                    option = menu4.nextInt();
                                    switch (option) {
                                        case 1:
                                            //Dar print aos diferentes veiculos cadastrados pelo utilizador
                                            int o = 0;

                                            //Verificar se existe algum veiculo
                                            if(clientes.getVeiculos().size() == 0){
                                                System.out.println("---O(A) SENHOR(A) "+ clientes.getNome()+" NÃO TÊM NENHUM VEÍCULO ASSOCIADO---");
                                            }

                                            for(int i = 0; i < clientes.getVeiculos().size(); i++){
                                                o += 1;
                                                System.out.println("---"+ o +"º Veiculo---");
                                                System.out.println("Marca do veículo: "+clientes.getVeiculos().get(i).getMarca());
                                                System.out.println("Modelo do veículo: "+clientes.getVeiculos().get(i).getModelo());
                                                System.out.println("Ano do veículo: "+clientes.getVeiculos().get(i).getAno());
                                                System.out.println("Número de chassi: "+clientes.getVeiculos().get(i).getNumero_chassi());
                                                System.out.println("Matricula do veículo: "+clientes.getVeiculos().get(i).getMatricula());
                                                System.out.println("A origem do seu veículo: "+clientes.getVeiculos().get(i).getOrigem());
                                                System.out.println("------------------------");
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Que veiculo pretende excluir: ");
                                            int mais1 = scanners.nextInt();

                                            //Tendo em conta que index comeca com 0 tenho que tirar um ao mais1
                                            int excluir = mais1;
                                            excluir -= 1;
                                            
                                                if(0 == clientes.getVeiculos().size()){
                                                    System.out.println("---NÃO TÊM NENHUM VEICULO CADASTRADO---");
                                                }else if(mais1 > clientes.getVeiculos().size()){
                                                    System.out.println("---NÃO TÊM NENHUM VEICULO CADASTRADO NO "+mais1+"º lugar");
                                                }
                                                else{
                                                    
                                                    System.out.println("---"+ mais1 +"º Veiculo será excluido---");
                                                    System.out.println("Marca do veículo: "+clientes.getVeiculos().get(excluir).getMarca());
                                                    System.out.println("Modelo do veículo: "+clientes.getVeiculos().get(excluir).getModelo());
                                                    System.out.println("Ano do veículo: "+clientes.getVeiculos().get(excluir).getAno());
                                                    System.out.println("Número de chassi: "+clientes.getVeiculos().get(excluir).getNumero_chassi());
                                                    System.out.println("Matricula do veículo: "+clientes.getVeiculos().get(excluir).getMatricula());
                                                    System.out.println("A origem do seu veículo: "+clientes.getVeiculos().get(excluir).getOrigem());
                                                    System.out.println();

                                                    System.out.println("[1] EXCLUIR \n[2] NÃO EXCLUIR");
                                                    int exclusao = scanners.nextInt();
                                                    System.out.println();
                                            
                                                    if(exclusao == 1){
                                                        //Excluir veiculo 
                                                        clientes.getVeiculos().remove(excluir);
                                                        System.out.println("----VEICULO EXCLUIDO COM SUCESSO----");
                                                    }else{
                                                        System.out.println("----VEICULO NÃO FOI EXCLUIDO----");
                                                        break;
                                                    }
                                                }
                                            break;
                                        case 3:
                                            
                                            do{
                                                Scanner menu5 = new Scanner(System.in);
                                                System.out.println("----- DEFENIÇÕES DE USUÁRIO -----");
                                                System.out.println("[1] VISUALIZAR PERFIL \n[2] VOLTAR AO MENU");
                                                option = menu5.nextInt();
                                                switch(option){
                                                    case 1: 
                                                        System.out.println("-------- USUÁRIO --------");
                                                        System.out.println();

                                                        System.out.println("Nome do usuário:"+ clientes.getNome());
                                                        System.out.println("---------------------------------");

                                                        System.out.println("Data de nascimento: "+clientes.getDataNascimento());
                                                        System.out.println("---------------------------------");

                                                        System.out.println("Morada: "+ clientes.getMorada());
                                                        System.out.println("---------------------------------");

                                                        System.out.println("Numero de identificação fiscal: "+ clientes.getNif());
                                                        System.out.println("---------------------------------");

                                                        System.out.println("Numero de cartão de cidadão: "+ clientes.getNumero_cc());
                                                        System.out.println("---------------------------------");

                                                        System.out.println("Salário do usuário: "+ clientes.getSalario());
                                                        System.out.println("---------------------------------");

                                                        break;
                                                    case 2:
                                                        break;
                                                    
                                                }
                                            break;
                                            }while (option != 0);

                                            break;
                                    }
                                    break;
                                }while(option != 0);
                    }

                    }while (option != 0);
                    break;
                
            //Se a opção for diferente que 0 o programa continua se for igual a 0 ele sai do loop
        } while (option != 0);
            
        }while (option != 0);
    }
}