public class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila() {
        elementos = new int[5];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho < elementos.length) {
            elementos[fim] = valor;
            fim = (fim + 1) % elementos.length;
            tamanho++;
            System.out.println("Valor enfileirado!");
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public void desenfileirar() {
        if (tamanho > 0) {
            System.out.println("Valor desenfileirado: " + elementos[inicio]);
            inicio = (inicio + 1) % elementos.length;
            tamanho--;
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia.");
        } else {
            System.out.print("Fila: ");
            for (int i = 0; i < tamanho; i++) {
                int pos = (inicio + i) % elementos.length;
                System.out.print(elementos[pos] + " ");
            }
            System.out.println();
        }
    }
}
