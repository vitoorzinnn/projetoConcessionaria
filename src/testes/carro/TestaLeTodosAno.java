package testes.carro;
import persistencia.CarroDAO;

public class TestaLeTodosAno  {

    public static void main(String[] args) throws Exception {
        
        System.out.println(CarroDAO.leTodosPorAno(2024, 2025));
        
    }
    
}
