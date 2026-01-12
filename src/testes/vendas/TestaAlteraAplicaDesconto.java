package testes.vendas;
import persistencia.VendaDAO;

public class TestaAlteraAplicaDesconto {

    public static void main(String[] args) throws Exception {
        
        System.out.println(VendaDAO.aplicaDesconto(17, 80000));
        
    }
    
}
