package modelo;

public class Venda {

    private int idVenda;
    private double valorTotal;
    private String dataVenda;
    private Cliente cliente;
    private Vendedor vendedor;
    private Carro carro;
    private Moto moto;
    private Caminhao caminhao;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public Venda(int idVenda, double valorTotal, String dataVenda, Cliente cliente, Vendedor vendedor, Carro carro, Moto moto, Caminhao caminhao) {
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carro = carro;
        this.moto = moto;
        this.caminhao = caminhao;
    }

    public Venda() {
    }

    public String toString() {
        String dados = "\n Nota Fiscal: "
                + "\n Número da Nota Fiscal: " + getIdVenda()
                + "\n Data da Venda: " + getDataVenda()
                + "\n Valor Total R$: " + getValorTotal()
                + "\n " + getCliente()
                + "\n " + getVendedor()
                + "\n ";

        if (carro != null) {
            dados += "\n " + carro;
        }
        if (moto != null) {
            dados += "\n " + moto;
        }
        if (caminhao != null) {
            dados += "\n " + caminhao;
        }

        return dados;
    }

}
