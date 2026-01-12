package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Moto;
import teste.conexao.GerenteDeConexao;

public class MotoDAO {
    
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Moto> leTodos() throws Exception {

        List<Moto> listMotos = new ArrayList<Moto>();

        try {

            String sql = "SELECT * FROM MOTO";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Moto m = new Moto();

                m.setIdMoto(rs.getInt("idMoto"));
                m.setChassi(rs.getString("chassi"));
                m.setPlaca(rs.getString("placa"));
                m.setCor(rs.getString("cor"));
                m.setModelo(rs.getString("modelo"));
                m.setMarca(rs.getString("marca"));
                m.setCilindrada(rs.getInt("cilindrada"));
                m.setAno(rs.getInt("ano"));

                listMotos.add(m);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listMotos;
    }
    
    public static List<Moto> leTodosPorMarca(String marca) throws Exception {

        List<Moto> listMotos = new ArrayList<Moto>();

        try {
            String sql = "SELECT * FROM MOTO WHERE marca LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, "%" + marca + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Moto m = new Moto();

                m.setIdMoto(rs.getInt("idMoto"));
                m.setChassi(rs.getString("chassi"));
                m.setPlaca(rs.getString("placa"));
                m.setCor(rs.getString("cor"));
                m.setModelo(rs.getString("modelo"));
                m.setMarca(rs.getString("marca"));
                m.setCilindrada(rs.getInt("cilindrada"));
                m.setAno(rs.getInt("ano"));

                listMotos.add(m);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listMotos;
    }

    
        public static List<Moto> leTodosPorAno(int anoInicio, int anoFim) throws Exception {

        List<Moto> listMotos = new ArrayList<Moto>();

        try {

            String sql = "SELECT * FROM MOTO WHERE ano BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, anoInicio);
            st.setInt(2, anoFim);

            rs = st.executeQuery();

            while (rs.next()) {

                Moto m = new Moto();

                m.setIdMoto(rs.getInt("idMoto"));
                m.setChassi(rs.getString("chassi"));
                m.setPlaca(rs.getString("placa"));
                m.setCor(rs.getString("cor"));
                m.setModelo(rs.getString("modelo"));
                m.setMarca(rs.getString("marca"));
                m.setCilindrada(rs.getInt("cilindrada"));
                m.setAno(rs.getInt("ano"));

                listMotos.add(m);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listMotos;
    }

    public static Moto leUm(int idMoto) throws Exception {

        Moto moto = new Moto();

        try {

            String sql = "SELECT * FROM Moto WHERE idMoto = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idMoto);

            rs = st.executeQuery();

            if (rs.next()) {

                moto.setIdMoto(rs.getInt("idMoto"));
                moto.setChassi(rs.getString("chassi"));
                moto.setPlaca(rs.getString("placa"));
                moto.setCor(rs.getString("cor"));
                moto.setModelo(rs.getString("modelo"));
                moto.setMarca(rs.getString("marca"));
                moto.setCilindrada(rs.getInt("cilindrada"));
                moto.setAno(rs.getInt("ano"));
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return moto;
    }


    public static int grava(int idMoto, String marca, String modelo, int ano, String placa, String cor, String chassi, int cilindrada) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO Moto (idMoto,marca,modelo,ano,placa,cor,chassi,cilindrada) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idMoto);
            st.setString(2, marca);
            st.setString(3, modelo);
            st.setInt(4, ano);
            st.setString(5, placa);
            st.setString(6, cor);
            st.setString(7, chassi);
            st.setInt(8, cilindrada);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }


    public static int altera(int idMoto, String novaMarca, String novoModelo, int ano, String placa, String cor, String chassi, int cilindrada) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE moto SET marca = ?, modelo = ?, ano = ?, placa = ?, chassi = ?, cilindrada = ? WHERE idMoto = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, novaMarca);
            st.setString(2, novoModelo);
            st.setInt(3, ano);
            st.setString(4, placa);
            st.setString(5, chassi);
            st.setInt(6, cilindrada);
            st.setInt(7, idMoto);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }


    public static int exclui(int idMoto) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM moto WHERE idMoto = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idMoto);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return ret;
    }
}
