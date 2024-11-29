package com.raven.form;

import DAO.CartaoDAO;
import DAO.EventoDAO;
import DTO.EventoDTO;
import DTO.CartaoDTO;
import com.raven.model.Model_Card;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import com.*;
public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        Card1();
        Card1();
        Card1();
        ListarEventosDoMes();
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        panel = new javax.swing.JLayeredPane();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        headerHome1 = new com.raven.component.HeaderHome();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(11, 232, 184));
        card1.setColor2(new java.awt.Color(7, 201, 160));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(226, 15, 124));
        card2.setColor2(new java.awt.Color(198, 10, 109));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Eventos do mês");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Evento", "Local", "Dia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        headerHome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                headerHome1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(headerHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addComponent(headerHome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eventos Próximos");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }//GEN-END:initComponents

    private void headerHome1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_headerHome1KeyReleased
        String pesquisa =headerHome1.getText();
        PesquisarEventoDoMes(pesquisa);
    }//GEN-LAST:event_headerHome1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    public static com.raven.component.HeaderHome headerHome1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane panel;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    public static com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
 private void ListarEventosDoMes() {
        try {
            EventoDAO objEventoDAO = new EventoDAO();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setNumRows(0);
            
            ArrayList<EventoDTO> lista = objEventoDAO.listarEventosDoMes();
            
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
            JOptionPane.showMessageDialog(null, erro + "listar Eventos do mes View");
        }
    }

    private void Card1() {
        try {
            CartaoDAO objCartaoDAO = new CartaoDAO();
            

            ArrayList<CartaoDTO> lista = objCartaoDAO.card();

                    
                
                    String tipoEvento = lista.get(0).getTipoEvento();
                    String cliente = lista.get(0).getCliente();
                    //String nomeEvento = lista.get(1).getNomeEvento();
                    String localEvento = lista.get(0).getLocalEvento();
                    String diaEvento =String.valueOf( lista.get(0).getDiaEvento());
                    String notas =tipoEvento+cliente+localEvento+diaEvento;
                  
                   /*
                    lista.get(0).getCliente();
                    lista.get(0).getTipoEvento();
                    lista.get(0).getLocalEvento();
                    lista.get(0).getDiaEvento();
                   */
                   card1.setData(new Model_Card(diaEvento, cliente,tipoEvento ,localEvento));
                    tipoEvento = lista.get(1).getTipoEvento();
                     cliente = lista.get(1).getCliente();
                    //String nomeEvento = lista.get(1).getNomeEvento();
                     localEvento = lista.get(1).getLocalEvento();
                     diaEvento =String.valueOf( lista.get(1).getDiaEvento());
                     notas =tipoEvento+cliente+localEvento+diaEvento;
                  
                   /*
                    lista.get(0).getCliente();
                    lista.get(0).getTipoEvento();
                    lista.get(0).getLocalEvento();
                    lista.get(0).getDiaEvento();
                   */
                   card2.setData(new Model_Card(diaEvento, cliente,tipoEvento ,localEvento));tipoEvento = lista.get(1).getTipoEvento();
                     cliente = lista.get(2).getCliente();
                    //String nomeEvento = lista.get(1).getNomeEvento();
                     localEvento = lista.get(2).getLocalEvento();
                     diaEvento =String.valueOf( lista.get(2).getDiaEvento());
                     notas =tipoEvento+cliente+localEvento+diaEvento;
                  
                   /*
                    lista.get(0).getCliente();
                    lista.get(0).getTipoEvento();
                    lista.get(0).getLocalEvento();
                    lista.get(0).getDiaEvento();
                   */
                   card3.setData(new Model_Card(diaEvento, cliente,tipoEvento ,localEvento));
                   
                   

        } catch (Exception erro) {

        }

    }
private void PesquisarEventoDoMes(String pesquisa) {
        try {
            EventoDAO objEventoDAO = new EventoDAO();
            DefaultTableModel model = (DefaultTableModel) Form_Home.table.getModel();
            model.setNumRows(0);
            
            ArrayList<EventoDTO> lista = objEventoDAO.pesquisarEventosDoMes(pesquisa);
            
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
            JOptionPane.showMessageDialog(null, erro + "Pesquiasr Eventos do mes View");
        }
    }
}
