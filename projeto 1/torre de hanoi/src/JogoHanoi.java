import java.util.Scanner;

public class JogoHanoi {
    private Torre torre1;
    private Torre torre2;
    private Torre torre3;

    private int qtdDiscos;
    private int movimentos;

    Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        JogoHanoi jogo = new JogoHanoi();
        jogo.iniciarJogo();
        jogo.exibirMenu();
    }


    public void iniciarJogo() {
        System.out.print("Digite a quantidade de discos: ");
        qtdDiscos = scanner.nextInt();

        torre1 = new Torre(qtdDiscos);
        torre2 = new Torre(qtdDiscos);
        torre3 = new Torre(qtdDiscos);

        movimentos = 0;

        for (int i = qtdDiscos; i >= 1; i--) {
            torre1.empilhar(new Disco(i));
        }
    }


    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n----------Torre de Hanoi----------");
            System.out.println("1 - Mover disco");
            System.out.println("2 - Mostrar torres");
            System.out.println("3 - Reiniciar jogo");
            System.out.println("4 - Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarMovimento();
                    break;
                case 2:
                    mostrarTorres();
                    break;
                case 3:
                    iniciarJogo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 4);
    }


    private void realizarMovimento() {
        System.out.print("Torre de origem (1, 2 ou 3): ");
        int origem = scanner.nextInt();

        System.out.print("Torre de destino (1, 2 ou 3): ");
        int destino = scanner.nextInt();

        Torre tOrigem = getTorre(origem);
        Torre tDestino = getTorre(destino);

        if (tOrigem == null || tDestino == null) {
            System.out.println("Torres invalidas!");
            return;
        }

        if (!movimentoValido(tOrigem, tDestino)) {
            System.out.println("Movimento invalido!");
            return;
        }

        Disco d = tOrigem.desempilhar();
        tDestino.empilhar(d);

        movimentos++;

        if (verificarVitoria()) {
            System.out.println("Voce venceu!");
            System.out.println("Total de movimentos: " + movimentos);
        }
    }


    private boolean movimentoValido(Torre origem, Torre destino) {
        if (origem.estaVazia()) {
            return false;
        }

        if (destino.estaVazia()) {
            return true;
        }

        return origem.topo().tamanhoDisco() < destino.topo().tamanhoDisco();
    }


    private void mostrarTorres() {
        System.out.println("\n--- Estado das Torres ---");

        System.out.print("Torre 1: ");
        torre1.mostrar();

        System.out.print("Torre 2: ");
        torre2.mostrar();

        System.out.print("Torre 3: ");
        torre3.mostrar();
    }


    private boolean verificarVitoria() {
        return torre3.getQuantidade() == qtdDiscos;
    }


    private Torre getTorre(int numero) {
        switch (numero) {
            case 1:
                return torre1;
            case 2:
                return torre2;
            case 3:
                return torre3;
            default:
                return null;
        }
    }
}
