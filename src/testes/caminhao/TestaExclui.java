package testes.caminhao;
import persistencia.CaminhaoDAO;

public class TestaExclui {

    public static void main(String[] args) throws Exception {
        
        System.out.println(CaminhaoDAO.exclui(5));
    }
    
}
