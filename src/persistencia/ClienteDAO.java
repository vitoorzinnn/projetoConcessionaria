package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import teste.conexao.GerenteDeConexao;

public class ClienteDAO {
    
    protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Cliente> leTodos() throws Exception{

List<Cliente> listClientes = new ArrayList<Cliente>();

try {

String sql = "SELECT * FROM CLIENTE";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Cliente c = new Cliente();

c.setIdCliente(rs.getInt("idCliente"));

c.setNome(rs.getString("nome"));

c.setCpf(rs.getString("cpf"));

c.setTelefone(rs.getString("telefone"));

c.setEmail(rs.getString("email"));


listClientes.add(c);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listClientes;

}

public static Cliente leUm(int idCliente) throws Exception {

Cliente cliente = new Cliente();

 try {

String sql = "SELECT * FROM Cliente WHERE idCliente = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idCliente);

rs = st.executeQuery();

if (rs.next()) {

cliente.setIdCliente(rs.getInt("idCliente"));

cliente.setNome(rs.getString("nome"));

cliente.setCpf(rs.getString("cpf"));

cliente.setTelefone(rs.getString("telefone"));

cliente.setEmail(rs.getString("email"));
}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return cliente;

}

public static int grava(int idCliente, String nome, String cpf, String telefone, String email) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Cliente (idCliente,nome,cpf,telefone,email) VALUES (?, ?, ?, ?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idCliente);

st.setString(2, nome);

st.setString(3, cpf);

st.setString(4, telefone);

st.setString(5, email);

ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(String novoNome,int idCliente, String novoCpf, String novoTelefone, String novoEmail) throws Exception {

int ret = 0;

try {

String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ? WHERE idCliente = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, novoNome);

st.setString(2,novoCpf);

st.setString(3,novoTelefone);

st.setString(4,novoEmail);

st.setInt(5,idCliente);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(int idCliente) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM cliente WHERE idCliente = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idCliente);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
    
    
    
}