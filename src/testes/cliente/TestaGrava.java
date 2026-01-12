package testes.cliente;
import persistencia.ClienteDAO;

public class TestaGrava {

    public static void main(String[] args) throws Exception {
        
        System.out.println(ClienteDAO.grava(1, "Luis Gustavo", "111.111-11", "11111111", "luisgust11@gmail.com"));
        System.out.println(ClienteDAO.grava(2, "Samara Lima", "222.222-22", "22222222", "samaralima22@gmail.com"));
        System.out.println(ClienteDAO.grava(3, "Marcos Paulo", "333.333-33", "33333333", "marc.paulo33@hotmail.com"));
        System.out.println(ClienteDAO.grava(4, "Clodoaldo Antunes", "444.444-44", "44444444", "antunes.clodoaldo44@outlook.com"));
        System.out.println(ClienteDAO.grava(5, "Cristiano Messi da Silva", "555.555-55", "55555555", "cristianomelhorquemessi@gmail.com"));
        System.out.println(ClienteDAO.grava(6, "Antonio da Silva", "666.666-66", "66666666", "cristianomelhorquemessi@gmail.com"));
        System.out.println(ClienteDAO.grava(7, "Pedro Antonio", "777.777-77", "77777777", "cristianomelhorquemessi@gmail.com"));
        System.out.println(ClienteDAO.grava(8, "Jéssica Monteiro", "888.888-88", "88888888", "cristianomelhorquemessi@gmail.com"));
        System.out.println(ClienteDAO.grava(9, "Marcos Vinicius", "999.999-99", "99999999", "marc.vinni88@gmail.com"));
        System.out.println(ClienteDAO.grava(10, "Maria Luisa", "101.101-10", "10101010", "maryluisa102025@outlook.com"));
        System.out.println(ClienteDAO.grava(11, "Lindolfo Guedes", "111.111-11", "11111111", "lindoOlfo.gu3des@outlook.com"));
        System.out.println(ClienteDAO.grava(12, "Messias José", "121.121-121", "12121212", "josemessias12.conce@outlook.com"));
        System.out.println(ClienteDAO.grava(13, "Angelo Miguel", "131.131-13", "13131313", "migAngelo13@outlook.com"));
        System.out.println(ClienteDAO.grava(14, "Thiago Luis", "141.141-14", "14141414", "thiagoluis.14conce@outlook.com"));
        System.out.println(ClienteDAO.grava(15, "Silvia Pereira", "151.151-15", "15151515", "silviapereira151532@outlook.com"));
        System.out.println(ClienteDAO.grava(16, "Roberto Carlos Silva", "161.161-16", "16161616", "robertocarlos16@outlook.com"));
        System.out.println(ClienteDAO.grava(17, "Fernanda Costa Souza", "171.171-17", "17171717", "fercosta17@outlook.com"));
        
    }
    
}
