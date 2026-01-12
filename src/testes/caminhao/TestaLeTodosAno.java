package testes.caminhao;
import persistencia.CaminhaoDAO;

public class TestaLeTodosAno {

    public static void main(String[] args) throws Exception {
        
        System.out.println(CaminhaoDAO.leTodosPorAno(2018, 2023));
        
    }
    
}
