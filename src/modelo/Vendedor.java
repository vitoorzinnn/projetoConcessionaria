package modelo;

public class Vendedor {
    
    private int idVendedor;
    private String nome;
    private String matricula;
    private double salario;
    private String telefone;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Vendedor(int idVendedor, String nome, String matricula, double salario, String telefone) {
        this.idVendedor = idVendedor;
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.telefone = telefone;
    }
    
    public Vendedor() {
        
    }
    
    public String toString() {
        return "\n Dados do Vendedor: " + 
                "\n ID de Cadastro: " + getIdVendedor() +
                "\n Nome: " + getNome() +
                "\n Matrícula: " + getMatricula() +
                "\n Salário R$: " + getSalario() +
                "\n Telefone: +55 " + getTelefone() +
                "\n ";
    }
    
}
