public class MotoEntregador extends Entregador {

    public MotoEntregador(String nome) {
        super(nome);
    }

    @Override
    public double calcularTempoEntrega(double distancia) {
        return distancia / 60; // moto mais rápida
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Entrega realizada de moto por " + nome);
    }
}