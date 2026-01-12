package modelo;

public class Moto extends Veiculo {

    private int idMoto;
    private String modelo;
    private String marca;
    private int cilindrada;

    public int getIdMoto() {
        return idMoto;
    }

    public void setIdMoto(int idMoto) {
        this.idMoto = idMoto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(int ano, String chassi, String placa, String cor, int idMoto, String modelo, String marca, int cilindrada) {
        super(ano, chassi, placa, cor);
        this.idMoto = idMoto;
        this.modelo = modelo;
        this.cilindrada = cilindrada;

    }

    public Moto() {
    }

    public String toString() {
        return "\n Dados da Moto: "
                + "\n ID Moto: " + getIdMoto()
                + "\n Modelo: " + getModelo()
                + "\n Marca: " + getMarca()
                + "\n Ano: " + getAno()
                + "\n Cilindradas: " + getCilindrada()
                + "\n Placa: " + getPlaca()
                + "\n Chassi: " + getChassi()
                + "\n ";

    }
}
