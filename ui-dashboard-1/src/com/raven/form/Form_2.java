package com.raven.form;

import DAO.EventoDAO;
import DTO.EventoDTO;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Form_2 extends javax.swing.JPanel {

    public Form_2() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        Fundo = new com.raven.component.Back();
        txtNomeCliente = new com.raven.component.Camp();
        Orcamento = new javax.swing.JLabel();
        searchText11 = new com.raven.component.Tipo();
        txtNomeEvento = new com.raven.component.OS();
        txtValorEvento = new com.raven.component.VL();
        txtLocalEvento = new com.raven.component.Local();
        txtDescricao = new com.raven.component.Descricao();
        button1 = new com.raven.swing.ButtonAdd();
        buttonClean1 = new com.raven.swing.ButtonClean();
        txtDiaEvento = new com.raven.component.Dia();
        txtMesEvento = new com.raven.component.Mes();
        Orcamento1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        Orcamento.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        Orcamento.setForeground(new java.awt.Color(255, 255, 255));
        Orcamento.setText("Orçamento");

        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Adicionar");
        button1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        button1.setRadius(15);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        buttonClean1.setForeground(new java.awt.Color(255, 255, 255));
        buttonClean1.setText("Limpar");
        buttonClean1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        buttonClean1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClean1ActionPerformed(evt);
            }
        });

        Orcamento1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        Orcamento1.setForeground(new java.awt.Color(255, 255, 255));
        Orcamento1.setText("Data do evento:");

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Orcamento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FundoLayout.createSequentialGroup()
                            .addComponent(Orcamento1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDiaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtValorEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FundoLayout.createSequentialGroup()
                            .addComponent(searchText11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FundoLayout.createSequentialGroup()
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonClean1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addComponent(txtLocalEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Orcamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchText11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtValorEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Orcamento1)))
                .addGap(12, 12, 12)
                .addComponent(txtLocalEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonClean1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        String nomeEvento, tipoEvento, localEvento, cliente;
        Integer diaEvento, mesEvento;
        nomeEvento = txtNomeEvento.getText();
        tipoEvento = searchText11.getText();
        diaEvento = Integer.valueOf(txtDiaEvento.getText());
        mesEvento = Integer.valueOf(txtMesEvento.getText());
        localEvento = txtLocalEvento.getText();
        cliente = txtNomeCliente.getText();

        EventoDTO objEventoDTO = new EventoDTO();
        objEventoDTO.setNomeEvento(nomeEvento);
        objEventoDTO.setTipoEvento(tipoEvento);
        objEventoDTO.setDiaEvento(diaEvento);
        objEventoDTO.setMesEvento(mesEvento);
        objEventoDTO.setCliente(cliente);
        objEventoDTO.setLocalEvento(localEvento);

        EventoDAO objEventoDAO = new EventoDAO();
        objEventoDAO.cadastrarEvento(objEventoDTO);
    }//GEN-LAST:event_button1ActionPerformed

    private void buttonClean1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClean1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClean1ActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Back Fundo;
    private javax.swing.JLabel Orcamento;
    private javax.swing.JLabel Orcamento1;
    private com.raven.swing.ButtonAdd button1;
    private com.raven.swing.ButtonClean buttonClean1;
    private com.raven.component.Tipo searchText11;
    private com.raven.component.Descricao txtDescricao;
    private com.raven.component.Dia txtDiaEvento;
    private com.raven.component.Local txtLocalEvento;
    private com.raven.component.Mes txtMesEvento;
    private com.raven.component.Camp txtNomeCliente;
    private com.raven.component.OS txtNomeEvento;
    private com.raven.component.VL txtValorEvento;
    // End of variables declaration//GEN-END:variables
}
