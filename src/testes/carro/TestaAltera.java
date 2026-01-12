package testes.carro;
import persistencia.CarroDAO;

public class TestaAltera {
    
    public static void main(String[] args) throws Exception {

        System.out.println(CarroDAO.altera(5, "Honda", "HR-V EXL", 2024, "BRACHKW1", "Cinza Grafite", "HN24HRL0006H", "SUV Compacto", 121));

    }
    
}
