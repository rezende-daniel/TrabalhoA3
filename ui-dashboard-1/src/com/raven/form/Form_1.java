/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import DAO.EventoDAO;
import DTO.EventoDTO;
import com.raven.main.Main;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAVEN
 */
public class Form_1 extends javax.swing.JPanel {

    private static Form_1 instance;

    /**
     * Creates new form Form_1
     */
    public Form_1() {
        instance = this;
        initComponents();
        ListarEventos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel7 = new javax.swing.JLabel();
        headerPesquisaAno = new com.raven.component.Header();
        back1 = new com.raven.component.Back();
        spTable3 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.Table();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agenda");

        spTable3.setBorder(null);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Evento", "Local", "Dia", "Mês"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table1MouseReleased(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        spTable3.setViewportView(table1);

        javax.swing.GroupLayout back1Layout = new javax.swing.GroupLayout(back1);
        back1.setLayout(back1Layout);
        back1Layout.setHorizontalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(spTable3, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        back1Layout.setVerticalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(spTable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(headerPesquisaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(headerPesquisaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );
    }//GEN-END:initComponents

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
        
        // TODO add your handling code here:
    }//GEN-LAST:event_table1KeyReleased

    private void table1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseReleased
        abrirEvento();
        // TODO add your handling code here:
    }//GEN-LAST:event_table1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Back back1;
    public static com.raven.component.Header headerPesquisaAno;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane spTable3;
    public com.raven.swing.Table table1;
    // End of variables declaration//GEN-END:variables
private void ListarEventos() {
        try {
            EventoDAO objEventoDAO = new EventoDAO();
            //Form_1 objForm1 = Form_1.getInstance();
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setNumRows(0);

            ArrayList<EventoDTO> lista = objEventoDAO.listarEventos();

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
            JOptionPane.showMessageDialog(null, erro + " listar Eventos do ano View");
        }
    }

    private void abrirEvento() {
        Main objMain = Main.getInstance();

        int linha = table1.getSelectedRow();
        String cliente = String.valueOf(table1.getModel().getValueAt(linha, 0));
        String evento = String.valueOf(table1.getModel().getValueAt(linha, 1));
        String local = String.valueOf(table1.getModel().getValueAt(linha, 2));
        String dia = String.valueOf(table1.getModel().getValueAt(linha, 3));

        try {
            objMain.tela3();
            EventoDAO objEventoDAO = new EventoDAO();
            ArrayList<EventoDTO> lista = objEventoDAO.abrirEvento(cliente, evento, local, dia);
            Form_3.txtNomeCliente.setText(lista.get(0).getCliente());
            Form_3.txtNomeEvento.setText(lista.get(0).getNomeEvento());
            Form_3.txtLocal.setText(lista.get(0).getLocalEvento());
            Form_3.TxtDescricao.setText(lista.get(0).getDescricao());
            Form_3.txtOS.setText(String.valueOf(lista.get(0).getID()));
            Form_3.txtData.setText(String.valueOf(lista.get(0).getDiaEvento() + "/" + lista.get(0).getMesEvento()));
            Form_3.txtValor.setText(String.valueOf(lista.get(0).getValor()));

        } catch (Exception e) {
        }
    }

    public static Form_1 getInstance() {
        return instance;
    }
}
