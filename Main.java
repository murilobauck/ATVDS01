import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int escolha;
        do {
            System.out.println(" 1- Criar um produto\n 2- Alterar dados de um produto\n 3- Excluir um produto\n 4- Listar todos os produtos\n 5- Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    criarProduto();
                    break;
                case 2:
                    alterarProduto();
                    break;
                case 3:
                    excluirProduto();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
        
            }
        } while (escolha != 5);
    }
            private static void criarProduto() {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Preço: ");
                String preco = scanner.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();
        
                Produto produto = new Produto(id, nome, preco, quantidade, descricao);
                produtos.add(produto);
                System.out.println("Produto criado com sucesso!");
            }
        
            private static void alterarProduto() {
                System.out.print("Digite o ID do produto que deseja alterar: ");
                int id = scanner.nextInt();
                scanner.nextLine();
        
                for (Produto produto : produtos) {
                    if (produto.getId() == id) {
                        System.out.print("Novo nome: ");
                        produto.setNome(scanner.nextLine());
                        System.out.print("Novo preço: ");
                        produto.setPreco(scanner.nextLine());
                        System.out.print("Nova quantidade: ");
                        produto.setQuantidade(scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Nova descrição: ");
                        produto.setDescricao(scanner.nextLine());
                        System.out.println("Produto alterado com sucesso!");
                        return;
                    }
                }
                System.out.println("Produto não encontrado!");
            }
        
            private static void excluirProduto() {
                System.out.print("Digite o ID do produto que deseja excluir: ");
                int id = scanner.nextInt();
                scanner.nextLine();
        
                for (Produto produto : produtos) {
                    if (produto.getId() == id) {
                        produtos.remove(produto);
                        System.out.println("Produto excluído com sucesso!");
                        return;
                    }
                }
                System.out.println("Produto não encontrado!");
            }
        
            private static void listarProdutos() {
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado!");
                } else {
                    for (Produto produto : produtos) {
                        produto.exibirDetalhes();
                        System.out.println("-------------------");
                    }
        }
    }
}