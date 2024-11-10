/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author rezen
 */
public class ConexaoDAO {
    public Connection conectaBD(){
        Connection conn = null;
        try {
            String url="jdbc:mysql://localhost:3306/organiza++?user=root&password=";
              conn =DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro.getMessage()+"ConexãoDAO");
        }
        return conn;
    }
}
