import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int opcao, qtd_discos = 0;
        System.out.println("### TORRE DE HANOI ###");
        System.out.println("Digite a quantidade de discos: ");
        qtd_discos = sc.nextInt();

        do {
            System.out.println("\n(1) - Mover disco");
            System.out.println("(2) - Mostrar torres");
            System.out.println("(3) - Reiniciar jogo");
            System.out.println("(4) - Sair\n");
            opcao = sc.nextInt();
            switch(opcao)
            {
                case 1:
                    //MOVER DISCO

                case 2:
                    //MOSTRAR TORRES

                case 3: 
                    //REINCIAR JOGO

                case 4:
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 4);
    System.out.println("\nSaindo...");
    sc.close();
    }

}
