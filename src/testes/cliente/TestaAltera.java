package testes.cliente;
import persistencia.ClienteDAO;

public class TestaAltera {

    public static void main(String[] args) throws Exception {
        
        System.out.println(ClienteDAO.altera("Marco Túlio", 1, "111.111-11", "11111111", "marquinTulio11@gmail.com"));

    }
    
}
