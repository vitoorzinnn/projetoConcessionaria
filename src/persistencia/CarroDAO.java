package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Carro;
import teste.conexao.GerenteDeConexao;

public class CarroDAO {
    
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Carro> leTodos() throws Exception {

        List<Carro> listCarros = new ArrayList<Carro>();

        try {

            String sql = "SELECT * FROM CARRO";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {

                Carro c = new Carro();

                c.setIdCarro(rs.getInt("idCarro"));
                c.setChassi(rs.getString("chassi"));
                c.setPlaca(rs.getString("placa"));
                c.setCor(rs.getString("cor"));
                c.setModelo(rs.getString("modelo"));
                c.setMarca(rs.getString("marca"));
                c.setPotenciaMotor(rs.getInt("potenciaMotor"));
                c.setCarroceria(rs.getString("carroceria"));
                c.setAno(rs.getInt("ano"));

                listCarros.add(c);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listCarros;
    }

    public static List<Carro> leTodosPorMarca(String marca) throws Exception {

        List<Carro> listCarros = new ArrayList<Carro>();

        try {
            String sql = "SELECT * FROM CARRO WHERE marca LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, "%" + marca + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Carro c = new Carro();

                c.setIdCarro(rs.getInt("idCarro"));
                c.setChassi(rs.getString("chassi"));
                c.setPlaca(rs.getString("placa"));
                c.setCor(rs.getString("cor"));
                c.setModelo(rs.getString("modelo"));
                c.setMarca(rs.getString("marca"));
                c.setPotenciaMotor(rs.getInt("potenciaMotor"));
                c.setCarroceria(rs.getString("carroceria"));
                c.setAno(rs.getInt("ano"));

                listCarros.add(c);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listCarros;
    }

    public static List<Carro> leTodosPorAno(int anoInicio, int anoFim) throws Exception {

        List<Carro> listCarros = new ArrayList<Carro>();

        try {

            String sql = "SELECT * FROM CARRO WHERE ano BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, anoInicio);
            st.setInt(2, anoFim);

            rs = st.executeQuery();

            while (rs.next()) {

                Carro c = new Carro();

                c.setIdCarro(rs.getInt("idCarro"));
                c.setChassi(rs.getString("chassi"));
                c.setPlaca(rs.getString("placa"));
                c.setCor(rs.getString("cor"));
                c.setModelo(rs.getString("modelo"));
                c.setMarca(rs.getString("marca"));
                c.setPotenciaMotor(rs.getInt("potenciaMotor"));
                c.setCarroceria(rs.getString("carroceria"));
                c.setAno(rs.getInt("ano"));

                listCarros.add(c);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listCarros;
    }

    public static Carro leUm(int idCarro) throws Exception {

        Carro carro = new Carro();

        try {

            String sql = "SELECT * FROM Carro WHERE idCarro = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            st.setInt(1, idCarro);
            rs = st.executeQuery();

            if (rs.next()) {

                carro.setIdCarro(rs.getInt("idCarro"));
                carro.setChassi(rs.getString("chassi"));
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setModelo(rs.getString("modelo"));
                carro.setMarca(rs.getString("marca"));
                carro.setPotenciaMotor(rs.getInt("potenciaMotor"));
                carro.setCarroceria(rs.getString("carroceria"));
                carro.setAno(rs.getInt("ano"));
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return carro;
    }

    public static int grava(int idCarro, String marca, String modelo, int ano, String placa, String cor, String chassi, String carroceria, int potenciaMotor) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO Carro (idCarro,marca,modelo,ano,placa,cor,chassi,carroceria,potenciaMotor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idCarro);
            st.setString(2, marca);
            st.setString(3, modelo);
            st.setInt(4, ano);
            st.setString(5, placa);
            st.setString(6, cor);
            st.setString(7, chassi);
            st.setString(8, carroceria);
            st.setInt(9, potenciaMotor);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int altera(int idCarro, String novaMarca, String novoModelo, int ano, String placa, String cor, String chassi, String carroceria, int potenciaMotor) throws Exception {
        
        int ret = 0;
        
        try {
            String sql = "UPDATE carro SET marca = ?, modelo = ?, ano = ?, placa = ?, cor = ?, chassi = ?, carroceria = ?, potenciaMotor = ? WHERE idCarro = ?";
            
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, novaMarca);     
            st.setString(2, novoModelo);    
            st.setInt(3, ano);              
            st.setString(4, placa);         
            st.setString(5, cor);          
            st.setString(6, chassi);        
            st.setString(7, carroceria);    
            st.setInt(8, potenciaMotor);    
            st.setInt(9, idCarro);          
            
            ret = st.executeUpdate();
            
            st.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return ret;
    }

    public static int exclui(int idCarro) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM carro WHERE idCarro = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idCarro);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

}
