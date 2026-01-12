package testes.vendas;

import persistencia.VendaDAO;

public class TestaGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(VendaDAO.grava(1, "27/11/2025", 149990, 2, 2, 2, 0, 0));
        System.out.println(VendaDAO.grava(2, "21/12/2025", 85990, 1, 1, 1, 0, 0));
        System.out.println(VendaDAO.grava(3, "10/09/2025", 269990, 3, 3, 3, 0, 0));
        System.out.println(VendaDAO.grava(4, "05/09/2025", 392590, 4, 4, 4, 0, 0));
        System.out.println(VendaDAO.grava(5, "02/03/2025", 150000, 5, 5, 5, 0, 0));
        System.out.println(VendaDAO.grava(6, "01/10/2025", 119900, 6, 6, 6, 0, 0));
        System.out.println(VendaDAO.grava(7, "20/11/2025", 1058000, 7, 7, 0, 0, 1));
        System.out.println(VendaDAO.grava(8, "27/11/2025", 829900, 8, 8, 0, 0, 2));
        System.out.println(VendaDAO.grava(9, "02/04/2025", 529000, 9, 9, 0, 0, 3));
        System.out.println(VendaDAO.grava(10, "26/11/2025", 782576, 10, 10, 0, 0, 4));
        System.out.println(VendaDAO.grava(11, "02/04/2025", 321342, 11, 11, 0, 0, 5));
        System.out.println(VendaDAO.grava(12, "31/12/2025", 18350, 12, 12, 0, 1, 0));
        System.out.println(VendaDAO.grava(13, "30/12/2025", 26500, 13, 13, 0, 2, 0));
        System.out.println(VendaDAO.grava(14, "27/12/2025", 39120, 14, 14, 0, 3, 0));
        System.out.println(VendaDAO.grava(15, "19/10/2025", 115000, 15, 15, 0, 4, 0));
        System.out.println(VendaDAO.grava(16, "05/10/2025", 85690, 16, 16, 0, 5, 0));
        System.out.println(VendaDAO.grava(17, "21/12/2025", 85690, 17, 17, 7, 0, 0));
    }
}
