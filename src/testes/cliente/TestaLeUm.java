package testes.cliente;
import persistencia.ClienteDAO;

public class TestaLeUm {

    public static void main(String[] args) throws Exception {
        
        System.out.println(ClienteDAO.leUm(1));
    }
    
}
