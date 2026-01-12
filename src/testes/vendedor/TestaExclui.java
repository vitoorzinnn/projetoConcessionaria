package testes.vendedor;
import persistencia.VendedorDAO;

public class TestaExclui {

    public static void main(String[] args) throws Exception {
        
        System.out.println(VendedorDAO.exclui(1));
    }
    
}
