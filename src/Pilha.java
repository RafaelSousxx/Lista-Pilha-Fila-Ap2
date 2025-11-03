public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha() {
        elementos = new int[5];
        topo = -1;
    }

    public void empilhar(int valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
            System.out.println("Valor empilhado!");
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public void desempilhar() {
        if (topo >= 0) {
            System.out.println("Valor desempilhado: " + elementos[topo]);
            topo--;
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public void mostrar() {
        if (topo == -1) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("Pilha: ");
            for (int i = topo; i >= 0; i--) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
