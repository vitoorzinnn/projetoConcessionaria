package testes.vendedor;
import persistencia.VendedorDAO;

public class TestaAlteraSalario {

    public static void main(String[] args) throws Exception {
        
        System.out.println(VendedorDAO.alteraSalario(1, 7000.0));
        
    }
    
} 
