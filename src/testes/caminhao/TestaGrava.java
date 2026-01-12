package testes.caminhao;

import persistencia.CaminhaoDAO;

public class TestaGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(CaminhaoDAO.grava(1, "Volvo", "FH 540", 2024, "BRA4C25", "Preto", "9BV12345N2001", 74000));
        System.out.println(CaminhaoDAO.grava(2, "Scania", "R 450", 2023, "BRA7H91", "Vermelho", "BAS789012P3005", 60000));
        System.out.println(CaminhaoDAO.grava(3, "DAF", "XF 530", 2024, "BRA3E60", "Cinza", "6BV987654R400112", 74000));
        System.out.println(CaminhaoDAO.grava(4, "Mercedes-Benz", "Actros 2651", 2025, "BRA5B88", "Azul", "9BM33322S5081", 60000));
        System.out.println(CaminhaoDAO.grava(5, "Iveco", "S-Way 540", 2023, "BRA1J77", "Preto", "4AV555444T600999", 740000));
        System.out.println(CaminhaoDAO.grava(6, "Volvo", "FMX 500", 2024, "BRA2K91", "Branco", "9BV55678R700221", 65000));
        System.out.println(CaminhaoDAO.grava(7, "Scania", "G 410", 2023, "BRA9C12", "Azul", "BAS332198Q9004", 56000));
        System.out.println(CaminhaoDAO.grava(8, "DAF", "CF 410", 2024, "BRA8L33", "Prata", "6BV128764R401212", 58000));
        System.out.println(CaminhaoDAO.grava(9, "Mercedes-Benz", "Arocs 3258", 2025, "BRA6D21", "Branco", "9BM48721T5099", 68000));
        System.out.println(CaminhaoDAO.grava(10, "Iveco", "Hi-Way 480", 2023, "BRA5T90", "Cinza", "4AV778345T602345", 62000));
        System.out.println(CaminhaoDAO.grava(11, "Volkswagen", "Constellation 33.460", 2024, "BRA4H55", "Prata", "9BW998812U140023", 55000));
        System.out.println(CaminhaoDAO.grava(12, "MAN", "TGX 29.510", 2024, "BRA7M22", "Azul", "WMA443217V0098812", 70000));
        System.out.println(CaminhaoDAO.grava(13, "Ford", "Cargo 3131", 2023, "BRA3S78", "Branco", "9BF291377X0023411", 31000));
        System.out.println(CaminhaoDAO.grava(14, "Renault Trucks", "T 480", 2024, "BRA8N10", "Vermelho", "VF6121300Y4432109", 65000));
        System.out.println(CaminhaoDAO.grava(15, "Foton", "Auman EST 430", 2025, "BRA1P66", "Preto", "LFG644821Z5678102", 58000));

    }

}
