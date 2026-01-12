package modelo;

public class Caminhao extends Veiculo {
    
    private int idCaminhao;
    private String modelo;
    private String marca;
    private int cargaMaxima;

    public int getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(int idCaminhao) {
        this.idCaminhao = idCaminhao;
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

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
    public Caminhao(int ano, String chassi, String placa, String cor, int idCaminhao, String modelo, String marca, int cargaMaxima) {
        super(ano, chassi, placa, cor);
        this.idCaminhao = idCaminhao;
        this.modelo = modelo;
        this.marca = marca;
        this.cargaMaxima = cargaMaxima;
    }
    
    public Caminhao(){}
    
    public String toString() {
        return "\n Dados do Caminhão: " +
                "\n ID Caminhão: " + getIdCaminhao() +
                "\n Modelo: " + getModelo() +
                "\n Marca: " + getMarca() +
                "\n Ano: " + getAno() +
                "\n Carga Máxima: " + getCargaMaxima() + "KG." +
                "\n Placa: " + getPlaca() +
                "\n Chassi: " + getChassi() +
                "\n ";
                
    }
} 

