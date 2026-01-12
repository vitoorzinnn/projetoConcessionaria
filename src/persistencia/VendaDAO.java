package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Venda;
import persistencia.VendaDAO;
import teste.conexao.GerenteDeConexao;

public class VendaDAO {
    
    protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Venda> leTodos() throws Exception{

List<Venda> listVendas = new ArrayList<Venda>();

try {

String sql = "SELECT * FROM VENDA";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Venda v = new Venda();

v.setIdVenda(rs.getInt("idVenda"));

v.setDataVenda(rs.getString("dataVenda"));

v.setValorTotal(rs.getDouble("valorTotal"));

v.setCliente(ClienteDAO.leUm(rs.getInt("cliente_idCliente")));

v.setVendedor(VendedorDAO.leUm(rs.getInt("vendedor_idVendedor")));

int idCarro = rs.getInt("carro_idCarro");
if (idCarro > 0) v.setCarro(CarroDAO.leUm(idCarro));

int idMoto = rs.getInt("moto_idMoto");
if (idMoto > 0) v.setMoto(MotoDAO.leUm(idMoto));

int idCaminhao = rs.getInt("caminhao_idCaminhao");
if (idCaminhao > 0) v.setCaminhao(CaminhaoDAO.leUm(idCaminhao));

listVendas.add(v);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listVendas;

}

public static Venda leUm(int idVenda) throws Exception {

Venda venda = new Venda();

 try {

String sql = "SELECT * FROM Venda WHERE idVenda = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idVenda);

rs = st.executeQuery();

if (rs.next()) {

venda.setIdVenda(rs.getInt("idVenda"));

venda.setDataVenda(rs.getString("dataVenda"));

venda.setValorTotal(rs.getDouble("valorTotal"));

venda.setCliente(ClienteDAO.leUm(rs.getInt("cliente_idCliente")));

venda.setVendedor(VendedorDAO.leUm(rs.getInt("vendedor_idVendedor")));

int idCarro = rs.getInt("carro_idCarro");
if (idCarro > 0) venda.setCarro(CarroDAO.leUm(idCarro));

int idMoto = rs.getInt("moto_idMoto");
if (idMoto > 0) venda.setMoto(MotoDAO.leUm(idMoto));

int idCaminhao = rs.getInt("caminhao_idCaminhao");
if (idCaminhao > 0) venda.setCaminhao(CaminhaoDAO.leUm(idCaminhao));
}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return venda;

}

public static int grava(int idVenda, String dataVenda, double valorTotal, int idCliente, int idVendedor, int idCarro, int idMoto, int idCaminhao ) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Venda (idVenda,dataVenda,valorTotal,cliente_idCliente,vendedor_idVendedor,carro_idCarro,moto_idMoto,caminhao_idCaminhao) VALUES (?,?,?,?,?,?,?,?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idVenda);

st.setString(2, dataVenda);

st.setDouble(3, valorTotal);

st.setInt(4, idCliente);

st.setInt(5, idVendedor);

if (idCarro >0) {
    st.setInt(6, idCarro);
} else {
    st.setNull(6, java.sql.Types.INTEGER);
}

if (idMoto >0) {
    st.setInt(7, idMoto);
} else {
    st.setNull(7, java.sql.Types.INTEGER);
}

if (idCaminhao >0) {
    st.setInt(8, idCaminhao);
} else {
    st.setNull(8, java.sql.Types.INTEGER);
}

ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(int idVenda, String dataVenda, double valorTotal, int idCliente, int idVendedor, int idMoto, int idCarro, int idCaminhao) throws Exception {

int ret = 0;

try {

String sql = "UPDATE venda SET dataVenda = ?, valorTotal = ?, idCliente = ?, idVendedor = ?, idMoto = ?, idCarro = ?, idCaminhao = ? WHERE idVenda = ?";
connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, dataVenda);
st.setDouble(2, valorTotal); 
st.setInt(3, idCliente);    
st.setInt(4, idVendedor);   
st.setInt(5, idMoto);       
st.setInt(6, idCarro);      
st.setInt(7, idCaminhao);   
st.setInt(8, idVenda);      

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int aplicaDesconto(int idVenda, double valorDesconto) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE Venda SET valorTotal = valorTotal - ? "
                       + "WHERE idVenda = ?"; 

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setDouble(1, valorDesconto);
            st.setInt(2, idVenda); 

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }


public static int exclui(int idVenda) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM venda WHERE idVenda = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idVenda);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
    
    
    
}