package testes.vendedor;

import persistencia.VendedorDAO;

public class TestaGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(VendedorDAO.grava(1, "Paulo Vítor", "371289-1", 2000.0, "619838-121"));
        System.out.println(VendedorDAO.grava(2, "João Pedro", "278901-5", 2000.0, "619821-821"));
        System.out.println(VendedorDAO.grava(3, "Maria Antonieta", "789722-6", 2000.0, "619892-281"));
        System.out.println(VendedorDAO.grava(4, "Carla Fabricia", "097992-3", 2000.0, "619549-872"));
        System.out.println(VendedorDAO.grava(5, "Mauricio Nunes", "323558-9", 2000.0, "619983-523"));
        System.out.println(VendedorDAO.grava(6, "Ana Carolina Silva", "323559-0", 2000.0, "619983-524"));
        System.out.println(VendedorDAO.grava(7, "Bruno Costa Ferreira", "323560-1", 2000.0, "619983-525"));
        System.out.println(VendedorDAO.grava(8, "Carla Almeida Santos", "323561-2", 2000.0, "619983-526"));
        System.out.println(VendedorDAO.grava(9, "Daniel Pereira Lima", "323562-3", 2000.0, "619983-527"));
        System.out.println(VendedorDAO.grava(10, "Eliane Rocha Oliveira", "323563-4", 2000.0, "619983-528"));
        System.out.println(VendedorDAO.grava(11, "Felipe Souza Mendes", "323564-5", 2000.0, "619983-529"));
        System.out.println(VendedorDAO.grava(12, "Giovana Barbosa Teles", "323565-6", 2000.0, "619983-530"));
        System.out.println(VendedorDAO.grava(13, "Henrique Martins Castro", "323566-7", 2000.0, "619983-531"));
        System.out.println(VendedorDAO.grava(14, "Isabela Gomes Freire", "323567-8", 2000.0, "619983-532"));
        System.out.println(VendedorDAO.grava(15, "João Victor Ribeiro", "323568-9", 2000.0, "619983-533"));
        System.out.println(VendedorDAO.grava(16, "Lucas Gabriel Alves", "323569-0", 2000.0, "619983-534"));
        System.out.println(VendedorDAO.grava(17, "Mariana Dantas Pires", "323570-1", 2000.0, "619983-535"));
       

    }

}
