public class Lista {
    private int[] elementos;
    private int tamanho;

    public Lista() {
        elementos = new int[5];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
            System.out.println("Valor inserido na lista!");
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
        } else {
            System.out.print("Lista: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
