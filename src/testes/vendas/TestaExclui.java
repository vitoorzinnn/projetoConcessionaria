package testes.vendas;

import persistencia.VendaDAO;

public class TestaExclui {

    public static void main(String[] args) throws Exception {

        System.out.println(VendaDAO.exclui(1));
    }

}
