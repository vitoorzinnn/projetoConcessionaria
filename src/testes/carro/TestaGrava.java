package testes.carro;

import persistencia.CarroDAO;

public class TestaGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(CarroDAO.grava(1, "Fiat", "Argo", 2024, "BRA98JM", "Vermelho", "FT24ARG1C003", "Hatchback Completo", 107));
        System.out.println(CarroDAO.grava(2, "BYD", "Dolphin", 2024, "BRA762LP", "Branco", "BY24DOPH7901", "Hatchback Elétrico", 95));
        System.out.println(CarroDAO.grava(3, "Volkswagen", "Jetta GLI", 2024, "BRAVWGL87", "Preto", "VW24JGL003E", "Sedan Esportivo", 231));
        System.out.println(CarroDAO.grava(4, "Chevrolet", "Trailblazer", 2025, "BRACHVT62", "Cinza", "GM24TRL0004F", "SUV Grande (7Lugares)", 200));
        System.out.println(CarroDAO.grava(5, "Toyota", "Corolla XEI", 2025, "BRATWXCR17", "Branco", "TY24CR5GLTW89", "Sedan Médio (Híbrido)", 122));
        System.out.println(CarroDAO.grava(6, "Volkswagen", "Nivus", 2024, "BRAVWNVS", "Azul", "9BWB900RN99", "SUV Coupé Compacto", 116));
        System.out.println(CarroDAO.grava(7, "Audi", "RS6 Avant", 2024, "BRAAUVNR6", "Cinza Nardo", "9BWB900RN9900000", "Perua Esportiva", 600));
        System.out.println(CarroDAO.grava(8, "Volkswagen", "Polo", 2023, "BRAVWPL3", "Prata", "9BWZZZ377VT123456", "Hatch Compacto", 116));
        System.out.println(CarroDAO.grava(9, "Volkswagen", "T-Cross", 2024, "BRAVWTC4", "Branco", "9BWZZZ5XZRT987654", "SUV Compacto", 150));
        System.out.println(CarroDAO.grava(10, "Volkswagen", "Virtus", 2022, "BRAVVTS2", "Cinza", "9BWZZZ4F2NS654321", "Sedã Compacto", 128));
        System.out.println(CarroDAO.grava(11, "BYD", "Yuan Plus", 2024, "BRABYD01", "Branco", "LNBZCBAE0RA123456", "SUV Compacto Elétrico", 204));
        System.out.println(CarroDAO.grava(12, "BYD", "Seal", 2024, "BRABYD02", "Azul", "LNBZCBDX1RA654321", "Sedã Médio Elétrico", 313));
        System.out.println(CarroDAO.grava(13, "Toyota", "Hilux", 2023, "BRATYT01", "Preto", "8AJKB8CD0P1234567", "Picape Média", 204));
        System.out.println(CarroDAO.grava(14, "Toyota", "Yaris", 2022, "BRATYT02", "Prata", "9BRKXYZL2N9876543", "Hatch Compacto", 110));
        System.out.println(CarroDAO.grava(15, "Fiat", "Cronos", 2023, "BRAFIA01", "Branco", "9BDZFAAE0P1234567", "Sedã Compacto", 109));
        System.out.println(CarroDAO.grava(16, "Fiat", "Pulse", 2024, "BRAFIA02", "Azul", "9BDZFAAEXR7654321", "SUV Compacto", 130));
        System.out.println(CarroDAO.grava(17, "Chevrolet", "Onix", 2023, "BRACHV01", "Vermelho", "9BGKR48U0MG123456", "Hatch Compacto", 116));
        System.out.println(CarroDAO.grava(18, "Chevrolet", "Equinox", 2024, "BRACHV02", "Cinza", "9BGKR57U9RG654321", "SUV Médio", 172));
        System.out.println(CarroDAO.grava(19, "Audi", "A3 Sedan", 2023, "BRAAUD01", "Preto", "WAUZZZ8V4PA123456", "Sedã Premium", 190));
        System.out.println(CarroDAO.grava(20, "Audi", "Q3", 2024, "BRAAUD02", "Branco", "WA1ZZZFS8R9876543", "SUV Premium", 180));

    }

}
