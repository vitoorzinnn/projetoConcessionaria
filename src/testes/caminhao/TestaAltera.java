package testes.caminhao;
import persistencia.CaminhaoDAO;

public class TestaAltera {

    public static void main(String[] args) throws Exception {
        
        System.out.println(CaminhaoDAO.altera(5, "Ford", "Cargo 3133", 2023, "BRA2F36", "Vermelho", "3MW765432W700511", 74000));
    }
    
}
