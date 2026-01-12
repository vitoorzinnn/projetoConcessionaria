package testes.moto;
import persistencia.MotoDAO;

public class TestaAltera {

    public static void main(String[] args) throws Exception {
        
        System.out.println(MotoDAO.altera(5, "Triumph", "Tiger 900 Rally Pro", 2024, "TRM-4J91", "Azul", "SMTE55734R0001516", 886));
    }
    
}
