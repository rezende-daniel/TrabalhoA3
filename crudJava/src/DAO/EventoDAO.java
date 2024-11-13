package DAO;

import DTO.EventoDTO;
import java.sql.*;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rezen
 */
public class EventoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarEvento(EventoDTO objEventoDTO){
        String sql="insert into evento (dia_evento,mes_evento,nome_evento,tipo_evento) values (?,?,?,?)";
        
        conn =new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,String.valueOf(objEventoDTO.getDiaEvento()));
            pstm.setString(2, String.valueOf(objEventoDTO.getMesEvento()));
            pstm.setString(3,objEventoDTO.getNomeEvento());
            pstm.setString(4, objEventoDTO.getTipoEvento());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro+"eventoDAO");
        }
    }
    
    
}
