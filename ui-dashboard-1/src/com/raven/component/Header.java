package com.raven.component;

import DAO.EventoDAO;
import DTO.EventoDTO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.raven.form.*;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel1 = new javax.swing.JLabel();
        searchText1 = new com.raven.swing.PesquiseAqui();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        searchText1.setForeground(new java.awt.Color(51, 51, 51));
        searchText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
    }//GEN-END:initComponents

    private void searchText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyReleased

        String pesquisa = searchText1.getText();

        Pesquisar(pesquisa);        // TODO add your handling code here:
    }//GEN-LAST:event_searchText1KeyReleased

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(Color.WHITE);
        super.paintComponent(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.PesquiseAqui searchText1;
    // End of variables declaration//GEN-END:variables
private void Pesquisar(String pesquisa) {
        try {

            EventoDAO objEventoDAO = new EventoDAO();
            Form_1 objForm1 = Form_1.getInstance();
            DefaultTableModel model = (DefaultTableModel) objForm1.table1.getModel();
            model.setNumRows(0);

            ArrayList<EventoDTO> lista = objEventoDAO.pesquisar(pesquisa);
            
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    //lista.get(num).getID(),
                    lista.get(num).getCliente(),
                    lista.get(num).getNomeEvento(),
                    lista.get(num).getLocalEvento(),
                    lista.get(num).getDiaEvento(),
                    lista.get(num).getMesEvento(),});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro + "  listar Eventos do ano View");
        }
    }
    private String texto;

    public String getText() {
        this.texto = Form_1.headerPesquisaAno.getText();
        return this.texto;

    }
}
