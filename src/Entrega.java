public class Entrega {

    private int id;
    private String endereco;
    private String status;
    private Entregador entregador;

    public Entrega(int id, String endereco) {
        this.id = id;
        this.endereco = endereco;
        this.status = "PENDENTE";
    }

    // SOBRECARGA (mesmo método, parâmetros diferentes)
    public void atualizarStatus(String status) {
        this.status = status;
    }

    public void atualizarStatus(String status, Entregador entregador) {
        this.status = status;
        this.entregador = entregador;
    }

    public void mostrarEntrega() {
        System.out.println(
                "Entrega " + id +
                        " | Endereço: " + endereco +
                        " | Status: " + status +
                        " | Entregador: " +
                        (entregador != null ? entregador.getNome() : "Não atribuído")
        );
    }
}