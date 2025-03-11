import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        boolean sair = false;
        while (sair == false) {
            System.out.println(
                    " 1- Criar um produto\n 2- Alterar dados de um produto\n 3- Excluir um produto\n 4- Listar todos os produtos\n 5- Sair");
            int opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("case 3");
                    break;
                case 4:
                    System.out.println("case 4");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}