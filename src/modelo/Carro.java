package modelo;

public class Carro extends Veiculo {

    private int idCarro;
    private String modelo;
    private String marca;
    private int potenciaMotor;
    private String carroceria;

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
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

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public Carro(int ano, String chassi, String placa, String cor, int idCarro, String modelo, String marca, int potenciaMotor, String carroceria) {
        super(ano, chassi, placa, cor);
        this.idCarro = idCarro;
        this.modelo = modelo;
        this.marca = marca;
        this.potenciaMotor = potenciaMotor;
        this.carroceria = carroceria;
    }

    public Carro() {
    }

    public String toString() {
        return "\n Dados do Carro: "
                + "\n ID Carro: " + getIdCarro()
                + "\n Modelo: " + getModelo()
                + "\n Marca: " + getMarca()
                + "\n Ano: " + getAno()
                + "\n Cor: " + getCor()
                + "\n Carroceria: " + getCarroceria()
                + "\n Potência do Motor: " + getPotenciaMotor() + " Cavalos."
                + "\n Chassi: " + getChassi()
                + "\n Placa: " + getPlaca()
                + "\n ";
    }

}
