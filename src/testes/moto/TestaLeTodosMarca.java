package testes.moto;
import persistencia.MotoDAO;

public class TestaLeTodosMarca {

    public static void main(String[] args) throws Exception {
        
        System.out.println(MotoDAO.leTodosPorMarca("Honda"));

    }
    
}
