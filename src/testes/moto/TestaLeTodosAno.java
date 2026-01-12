package testes.moto;
import persistencia.MotoDAO;

public class TestaLeTodosAno {

    public static void main(String[] args) throws Exception {
        
        System.out.println(MotoDAO.leTodosPorAno(2020, 2023));
    }
    
}
