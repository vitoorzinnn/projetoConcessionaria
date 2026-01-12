package testes.carro;
import persistencia.CarroDAO;

public class TestaLeTodos {

    public static void main(String[] args) throws Exception {
        
        System.out.println(CarroDAO.leTodos());
    }
    
}
