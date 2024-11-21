/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rezen
 */
public class CartaoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<CartaoDTO> cartoes = new ArrayList<>();

    public ArrayList<CartaoDTO> card() {
        String sql = "select cliente,tipo_evento,dia_evento,local_evento from evento limit 3;";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareCall(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CartaoDTO objCartaoDTO = new CartaoDTO();
                objCartaoDTO.setCliente(rs.getString("Cliente"));
                objCartaoDTO.setDiaEvento(rs.getInt("dia_evento"));
                objCartaoDTO.setTipoEvento(rs.getString("tipo_evento"));
                objCartaoDTO.setLocalEvento(rs.getString("local_evento"));

                cartoes.add(objCartaoDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro + "card");
        }
        return cartoes;

    }

}
