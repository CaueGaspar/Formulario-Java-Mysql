/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBd {

    public Connection conn;
    public Statement stm;
    public ResultSet rs;
    private String serverName = "localhost";
    private String mydatabase = "testevalemobi";
    private String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useSSL=false"; // a JDBC url
    private String username = "root";
    private String password = "sucesso";
// Criando a conexão com o Banco de Dados

    public void conexao() {

        try {
            conn = DriverManager.getConnection(url, username, password);
            //se ok ele manda essa msg
            //System.out.println("Conectado!");
            // Carregando o JDBC Driver
            String driverName = "com.mysql.jdbc.Driver"; // MySQL MM JDBC driver
            Class.forName(driverName);

        } catch (ClassNotFoundException ex) {
            //Driver não encontrado
            System.out.println("O driver expecificado não foi encontrado.");

        } catch (SQLException ex) {
            //Não está conseguindo se conectar ao banco 
            System.out.println("Não foi possível conectar ao Banco de Dados" + ex);
        }
    }

    public void executaSql(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Erro ao executar consulta Sql /n" + ex);
        }
    }

   /* public void executaInsert(String sql) {
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println("Erro ao executar consulta Sql /n" + ex);
        }
    }*/

    public void desconecta() {
        try {
            conn.close();
            //System.out.println("Desconectado com sucesso");
        } catch (SQLException ex) {
            //System.out.println("Erro ao desconectar");
        }
    }
}
