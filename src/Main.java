import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Entregador moto = new MotoEntregador("Carlos");
        Entregador bike = new BikeEntregador("Ana");

        Entrega entrega = new Entrega(1, "Av. Paulista, 1000");

        int opcao;

        do {
            System.out.println("\n1 - Atribuir entrega (moto)");
            System.out.println("2 - Atribuir entrega (bike)");
            System.out.println("3 - Mostrar entrega");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    entrega.atualizarStatus("EM ROTA", moto);
                    moto.realizarEntrega();
                    break;
                case 2:
                    entrega.atualizarStatus("EM ROTA", bike);
                    bike.realizarEntrega();
                    break;
                case 3:
                    entrega.mostrarEntrega();
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}