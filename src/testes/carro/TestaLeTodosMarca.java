package testes.carro;
import persistencia.CarroDAO;

public class TestaLeTodosMarca {

    public static void main(String[] args) throws Exception {
        
        System.out.println(CarroDAO.leTodosPorMarca("Volkswagen"));
    }
    
}
