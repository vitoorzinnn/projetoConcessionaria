package testes.vendedor;
import persistencia.VendedorDAO;

public class TestaAltera {

    public static void main(String[] args) throws Exception {
        
        System.out.println(VendedorDAO.altera("Sérgio Lucas", 1, "224667-1", 2100, "619722-731"));
        
    }
    
}
