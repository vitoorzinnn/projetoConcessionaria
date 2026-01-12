package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Vendedor;
import teste.conexao.GerenteDeConexao;

public class VendedorDAO {
    
    protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Vendedor> leTodos() throws Exception{

List<Vendedor> listVendedores = new ArrayList<Vendedor>();

try {

String sql = "SELECT * FROM VENDEDOR";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Vendedor v = new Vendedor();

v.setIdVendedor(rs.getInt("idVendedor"));

v.setNome(rs.getString("nome"));

v.setMatricula(rs.getString("matricula"));

v.setSalario(rs.getDouble("salario"));

v.setTelefone(rs.getString("telefone"));


listVendedores.add(v);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listVendedores;

}

public static Vendedor leUm(int idVendedor) throws Exception {

Vendedor vendedor = new Vendedor();

 try {

String sql = "SELECT * FROM Vendedor WHERE idVendedor = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idVendedor);

rs = st.executeQuery();

if (rs.next()) {

vendedor.setIdVendedor(rs.getInt("idVendedor"));

vendedor.setNome(rs.getString("nome"));

vendedor.setMatricula(rs.getString("matricula"));

vendedor.setSalario(rs.getDouble("salario"));

vendedor.setTelefone(rs.getString("telefone"));
}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return vendedor;

}

public static int grava(int idVendedor, String nome, String matricula, double salario, String telefone) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Vendedor (idVendedor,nome,matricula,salario,telefone) VALUES (?, ?, ?, ?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idVendedor);

st.setString(2, nome);

st.setString(3, matricula);

st.setDouble(4, salario);

st.setString(5, telefone);

ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(String novoNome,int idVendedor, String novaMatricula, double novoSalario, String novoTelefone) throws Exception {

    int ret = 0;

    try {

        String sql = "UPDATE vendedor SET nome = ?, matricula = ?, salario = ?, telefone = ? WHERE idVendedor = ?";

        connection = GerenteDeConexao.getConnection();
        st = connection.prepareStatement(sql);

        st.setString(1, novoNome);     
        st.setString(2, novaMatricula); 
        st.setDouble(3, novoSalario);   
        st.setString(4, novoTelefone);  
        st.setInt(5, idVendedor);       

        ret = st.executeUpdate();

        st.close();

    } catch (SQLException e) {

        System.out.println(e.getMessage());

    }

    return ret;

}
    public static int alteraSalario(int idVendedor, double novoSalario) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE Vendedor SET salario = ? WHERE idVendedor = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setDouble(1, novoSalario);
            
            st.setInt(2, idVendedor);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }
    
        public static int alteraMatricula(int idVendedor, String novaMatricula) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE Vendedor SET matricula = ? WHERE idVendedor = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, novaMatricula);
            
            st.setInt(2, idVendedor);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }
    

public static int exclui(int idVendedor) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM vendedor WHERE idVendedor = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idVendedor);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
    
    
    
}