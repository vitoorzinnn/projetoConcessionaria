package testes.carro;
import persistencia.CarroDAO;

public class TestaExclui {

    public static void main(String[] args) throws Exception {
        
        System.out.println(CarroDAO.exclui(1));
        System.out.println(CarroDAO.exclui(2));
        System.out.println(CarroDAO.exclui(3));
        System.out.println(CarroDAO.exclui(4));
        System.out.println(CarroDAO.exclui(5));
        System.out.println(CarroDAO.exclui(6));
        System.out.println(CarroDAO.exclui(7));
        System.out.println(CarroDAO.exclui(8));
        System.out.println(CarroDAO.exclui(9));
        System.out.println(CarroDAO.exclui(10));
    }
    
}
