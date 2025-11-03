import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Operar Lista");
            System.out.println("2 - Operar Pilha");
            System.out.println("3 - Operar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    menuLista(sc, lista);
                    break;
                case 2:
                    menuPilha(sc, pilha);
                    break;
                case 3:
                    menuFila(sc, fila);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void menuLista(Scanner sc, Lista lista) {
        int op;
        do {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostrar");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor: ");
                    lista.inserir(sc.nextInt());
                    break;
                case 2:
                    lista.mostrar();
                    break;
            }
        } while (op != 0);
    }

    public static void menuPilha(Scanner sc, Pilha pilha) {
        int op;
        do {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Mostrar");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor: ");
                    pilha.empilhar(sc.nextInt());
                    break;
                case 2:
                    pilha.desempilhar();
                    break;
                case 3:
                    pilha.mostrar();
                    break;
            }
        } while (op != 0);
    }

    public static void menuFila(Scanner sc, Fila fila) {
        int op;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Enfileirar");
            System.out.println("2 - Desenfileirar");
            System.out.println("3 - Mostrar");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor: ");
                    fila.enfileirar(sc.nextInt());
                    break;
                case 2:
                    fila.desenfileirar();
                    break;
                case 3:
                    fila.mostrar();
                    break;
            }
        } while (op != 0);
    }
}
