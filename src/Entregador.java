public abstract class Entregador implements OperacaoEntrega {

    protected String nome;

    public Entregador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // método abstrato (cada um faz de um jeito)
    public abstract double calcularTempoEntrega(double distancia);
}