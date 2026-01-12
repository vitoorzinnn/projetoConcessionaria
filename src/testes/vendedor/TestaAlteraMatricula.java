package testes.vendedor;
import persistencia.VendedorDAO;

public class TestaAlteraMatricula {

    public static void main(String[] args) throws Exception {
        
        System.out.println(VendedorDAO.alteraMatricula(1, "Teste"));
    }
    
}
