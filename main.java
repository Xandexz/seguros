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
            System.out.println("[1] Registar utilizador" );
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
                    System.out.println(clientes);

                    break;
            }
            break;
            //Se a opção for diferente que 0 o programa continua se for igual a 0 ele sai do loop
        } while (option != 0);
        if(option != 0){
            do {
                Scanner menu2 = new Scanner(System.in);
                Scanner scanner = new Scanner(System.in);
                System.out.println("----- MENU -----");
                System.out.println("[1] Cadastrar veiculo \n[2] Vizualizar campanhas \n[3] Defeniçoes de usuário");
                option = menu2.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Marca do veiculo: ");
                        String marca = " ";
                        marca = scanner.next();

                        System.out.println("Modelo: ");
                        String modelo = scanner.next();

                        System.out.println("Ano do seu veiculo: ");
                        int ano = scanner.nextInt();

                        System.out.println("Número de chassi: ");
                        int chassi = scanner.nextInt();

                        System.out.println("Nome da sua matricula: ");
                        String matricula = scanner.next();

                        System.out.println("----ORIGEM DO SEU VEICULO---- \n[1] Nacional \n[2] Importado ");
                        int org = scanner.nextInt();

                        if(org == 1){
                            Origem origem = Origem.NACIONAL;
                            Veiculo veiculo1 = new Veiculo(marca, modelo, ano, chassi, origem, matricula);
                            Cliente.veiculos.add(veiculo1);
                            System.out.println(veiculo1);
                        }else{
                            Origem origem = Origem.IMPORTADO;
                            Veiculo veiculo1 = new Veiculo(marca, modelo, ano, chassi, origem, matricula);
                            Cliente.veiculos.add(veiculo1);
                            System.out.println(veiculo1);
                        }

                        System.out.println("----Veículo cadastrado com sucesso----");

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
                        //System.out.println(Cliente.veiculos.);
                        do{
                            Scanner menu3 = new Scanner(System.in);
                            System.out.println("----- MENU -----");
                            System.out.println("[1] Vizualizar veiculos cadastrados \n[2] Remover Veiculos \n[3] ");
                            option = menu2.nextInt();
                            switch (option) {
                                case 1:
                                    //Dar print aos diferentes veiculos cadastrados pelo utilizador
                                    int o = 0;
                                    for(int i = 0; i < Cliente.veiculos.size(); i++){
                                        o += 1;
                                        System.out.println("---"+ o +"º Veiculo---");
                                        System.out.println(Cliente.veiculos.get(i));
                                        System.out.println("------------------------");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Que veiculo pretende excluir: ");
                                    int mais1 = scanner.nextInt();

                                    //Tendo em conta que index comeca com 0 tenho que tirar um ao mais1
                                    int excluir = mais1;
                                    excluir -= 1;

                                    if(0 == Cliente.veiculos.size()){
                                        System.out.println("NÃO TÊM NENHUM VEICULO CADASTRADO");
                                    }else{
                                        System.out.println("---"+ mais1 +"º Veiculo será excluido---");
                                        System.out.println(Cliente.veiculos.get(excluir));
                                        System.out.println();

                                        System.out.println("[1] EXCLUIR \n[2] NÃO EXCLUIR");
                                        int exclusao = scanner.nextInt();
                                        System.out.println();
                            
                                        if(exclusao == 1){
                                            //Excluir veiculo 
                                            Cliente.veiculos.remove(excluir);
                                            System.out.println("----VEICULO EXCLUIDO COM SUCESSO----");
                                        }else{
                                            System.out.println("----VEICULO NÃO FOI EXCLUIDO----");
                                        }
                                    }
                            }
                            break;
                        }while(option != 0);
                }

                }while (option != 0);
            }
        }
    
    // ligar o input a classe
    // public static boolean addCiente(String nome, String email, String
    // nascimento){
    // Cliente utilizador = new Cliemte();
    // for (int i = 0; i < utilizadores.size(); i++) {
    // if(utilizador.getNome().equals(utilizadores.get(i).getNome())) {
    // return false;
    // }
    // }
    // return utilizadores.add(utilizador);
    // }
}

