package testes.moto;

import persistencia.MotoDAO;

public class TestaGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(MotoDAO.grava(1, "Honda", "CG 160 Fan", 2025, "BCN-5E24", "Preto", "9C2KA2611R00001234", 162));
        System.out.println(MotoDAO.grava(2, "Yamaha", "FZ25 Fazer", 2024, "YMH-9C08", "Preto", "9C6RN4800R0005678", 249));
        System.out.println(MotoDAO.grava(3, "Kawasaki", "Ninja 400", 2024, "KWK-1A19", "Verde", "JKALXFNA9R0009101", 399));
        System.out.println(MotoDAO.grava(4, "BMW", "R 1250 GS", 2025, "BMW-7D33", "Azul", "WB10F0306R0011124", 1254));
        System.out.println(MotoDAO.grava(5, "Royal Enfield", "Meteor 350", 2023, "ROY-3H77", "Branca", "MRLJD5A9XN0001314", 349));
        System.out.println(MotoDAO.grava(16, "Honda", "CB 300F Twister", 2025, "HND-2F91", "Vermelha", "9C2MC4010R0001456", 293));
        System.out.println(MotoDAO.grava(17, "Honda", "XRE 300", 2024, "HND-7G52", "Branca", "9C2ND0910R0002784", 291));
        System.out.println(MotoDAO.grava(18, "Honda", "Africa Twin 1100", 2024, "HND-4A77", "Azul", "JH2SD0440R0005678", 1084));
        System.out.println(MotoDAO.grava(19, "Honda", "CB 650R", 2023, "HND-8B66", "Cinza", "JH2RH0210P0008123", 649));
        System.out.println(MotoDAO.grava(20, "Triumph", "Tiger 900 Rally", 2025, "TRI-3C88", "Verde", "SMTL03DE5RAB23456", 888));
        System.out.println(MotoDAO.grava(21, "Triumph", "Street Triple RS", 2024, "TRI-6E11", "Preta", "SMTL14DE1RAB34567", 765));
        System.out.println(MotoDAO.grava(22, "Triumph", "Bonneville T120", 2023, "TRI-1H55", "Marrom", "SMTL120A3PAB45678", 1200));
        System.out.println(MotoDAO.grava(23, "BMW", "S 1000 RR", 2025, "BMW-9D33", "Branca", "WB10E1100R0016789", 999));
        System.out.println(MotoDAO.grava(24, "BMW", "G 310 R", 2024, "BMW-4B02", "Azul", "WB30G3100R0008934", 313));
        System.out.println(MotoDAO.grava(25, "BMW", "R Nine T", 2023, "BMW-0F71", "Preto", "WB10J230XP0012451", 1170));

    }

}
