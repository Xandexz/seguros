import java.util.Scanner;

public class main {
    private Gerir gerir = new Gerir();
    public static void main(String[] args) {
        int option = 0;
        // escrever aqui o codigo onde ele cadastra o cliente e o veiculo fora do ciclo
        Scanner menu = new Scanner(System.in);
        do {
            Scanner menu2 = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            System.out.println("[1] Registar utilizador \n[2] Logar utilizador");
            option = menu2.nextInt();
            switch (option) {
                case 1:
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

                    Cliente cliente = new Cliente(nome, dataNascimento, morada, nif, numero_cc, salario);
                    Gerir.clientes.add(cliente);
                    System.out.println(cliente);

                case 2:
                    System.out.println("Nome: ");
                    String name = scanner.nextLine();


            }
        } while (option != 0);

    }

    public void menuPrincipal(){
        int option = 0;
        // escrever aqui o codigo onde ele cadastra o cliente e o veiculo fora do ciclo
        Scanner menu = new Scanner(System.in);
        do {
            Scanner menu2 = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            System.out.println("[1] Registar utilizador \n[2] Logar utilizador");
            option = menu2.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();


                case 2:


            }
        } while (option != 0);
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

    // ver codigo do samu
}
