package modelo;

public abstract class Veiculo {

    private int ano;
    private String chassi;
    private String placa;
    private String cor;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Veiculo(int ano, String chassi, String placa, String cor) {
        this.ano = ano;
        this.chassi = chassi;
        this.placa = placa;
        this.cor = cor;
    }

    public Veiculo() {
    }

    public String toString() {
        return "\n Dados do Veículo:"
                + "\n Ano: " + getAno()
                + "\n Chassi: " + getChassi()
                + "\n Placa: " + getPlaca()
                + "\n Cor: " + getCor()
                + "\n ";
    }

}
