package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Caminhao;
import modelo.Carro;
import static persistencia.CarroDAO.connection;
import static persistencia.CarroDAO.rs;
import static persistencia.CarroDAO.st;
import teste.conexao.GerenteDeConexao;

public class CaminhaoDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Caminhao> leTodos() throws Exception {

        List<Caminhao> listCaminhoes = new ArrayList<Caminhao>();

        try {

            String sql = "SELECT * FROM Caminhao";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {

                Caminhao ca = new Caminhao();

                ca.setIdCaminhao(rs.getInt("idCaminhao"));
                ca.setChassi(rs.getString("chassi"));
                ca.setPlaca(rs.getString("placa"));
                ca.setCor(rs.getString("cor"));
                ca.setModelo(rs.getString("modelo"));
                ca.setMarca(rs.getString("marca"));
                ca.setCargaMaxima(rs.getInt("cargaMaxima"));
                ca.setAno(rs.getInt("ano"));

                listCaminhoes.add(ca);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listCaminhoes;
    }

    public static List<Caminhao> leTodosPorMarca(String marca) throws Exception {

        List<Caminhao> listCaminhoes = new ArrayList<>();

        try {

            String sql = "SELECT * FROM Caminhao WHERE marca = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, marca);

            rs = st.executeQuery();

            while (rs.next()) {

                Caminhao ca = new Caminhao();

                ca.setIdCaminhao(rs.getInt("idCaminhao"));
                ca.setChassi(rs.getString("chassi"));
                ca.setPlaca(rs.getString("placa"));
                ca.setCor(rs.getString("cor"));
                ca.setModelo(rs.getString("modelo"));
                ca.setMarca(rs.getString("marca"));
                ca.setCargaMaxima(rs.getInt("cargaMaxima"));
                ca.setAno(rs.getInt("ano"));

                listCaminhoes.add(ca);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listCaminhoes;
    }
    
        public static List<Caminhao> leTodosPorAno(int anoInicio, int anoFim) throws Exception {

        List<Caminhao> listCaminhoes = new ArrayList<Caminhao>();

        try {

            String sql = "SELECT * FROM CAMINHAO WHERE ano BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, anoInicio);
            st.setInt(2, anoFim);

            rs = st.executeQuery();

            while (rs.next()) {

                Caminhao ca = new Caminhao();

                ca.setIdCaminhao(rs.getInt("idCaminhao"));
                ca.setChassi(rs.getString("chassi"));
                ca.setPlaca(rs.getString("placa"));
                ca.setCor(rs.getString("cor"));
                ca.setModelo(rs.getString("modelo"));
                ca.setMarca(rs.getString("marca"));
                ca.setCargaMaxima(rs.getInt("cargaMaxima"));
                ca.setAno(rs.getInt("ano"));

                listCaminhoes.add(ca);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listCaminhoes;
    }

    public static Caminhao leUm(int idCaminhao) throws Exception {

        Caminhao caminhao = new Caminhao();

        try {

            String sql = "SELECT * FROM Caminhao WHERE idCaminhao = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idCaminhao);
            rs = st.executeQuery();

            if (rs.next()) {

                caminhao.setIdCaminhao(rs.getInt("idCaminhao"));
                caminhao.setChassi(rs.getString("chassi"));
                caminhao.setPlaca(rs.getString("placa"));
                caminhao.setCor(rs.getString("cor"));
                caminhao.setModelo(rs.getString("modelo"));
                caminhao.setMarca(rs.getString("marca"));
                caminhao.setCargaMaxima(rs.getInt("cargaMaxima"));
                caminhao.setAno(rs.getInt("ano"));
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return caminhao;
    }

    public static int grava(int idCaminhao, String marca, String modelo, int ano,
                            String placa, String cor, String chassi, int cargaMaxima) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO Caminhao (idCaminhao, marca, modelo, ano, placa, cor, chassi, cargaMaxima) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, idCaminhao);
            st.setString(2, marca);
            st.setString(3, modelo);
            st.setInt(4, ano);
            st.setString(5, placa);
            st.setString(6, cor);
            st.setString(7, chassi);
            st.setInt(8, cargaMaxima);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int altera(int idCaminhao, String novaMarca, String novoModelo, int ano,
                             String placa, String cor, String chassi, int cargaMaxima) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE Caminhao SET marca = ?, modelo = ?, ano = ?, placa = ?, cor = ?, chassi = ?, cargaMaxima = ? "
                       + "WHERE idCaminhao = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, novaMarca);
            st.setString(2, novoModelo);
            st.setInt(3, ano);
            st.setString(4, placa);
            st.setString(5, cor);
            st.setString(6, chassi);
            st.setInt(7, cargaMaxima);
            st.setInt(8, idCaminhao);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int exclui(int idCaminhao) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM Caminhao WHERE idCaminhao = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idCaminhao);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

}
