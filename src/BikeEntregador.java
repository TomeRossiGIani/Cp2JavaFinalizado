public class BikeEntregador extends Entregador {

    public BikeEntregador(String nome) {
        super(nome);
    }

    @Override
    public double calcularTempoEntrega(double distancia) {
        return distancia / 30; // bike mais lenta
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega realizada de bicicleta por " + nome);
    }
}