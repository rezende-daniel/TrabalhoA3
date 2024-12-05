
package com.raven.form;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;



public class Form_3 extends javax.swing.JPanel {


    /**
     * Creates new form Form_1
     */
    public Form_3() {
        initComponents();
        setOpaque(false);

    }
    

    
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jScrollPane1 = new com.raven.scroll.ScrollPaneWin11();
        panel1 = new com.raven.swing.Panel();
        back1 = new com.raven.component.Back();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeEvento = new javax.swing.JLabel();
        txtValor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        back5 = new com.raven.component.Back();
        txtData = new javax.swing.JLabel();
        back6 = new com.raven.component.Back();
        txtOS = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        back2 = new com.raven.component.Back();
        txtLocal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtDescricao = new javax.swing.JTextArea();
        txtNomeCliente = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        panel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Sem nome (100 x 100 px) (1).png"))); // NOI18N

        javax.swing.GroupLayout back1Layout = new javax.swing.GroupLayout(back1);
        back1.setLayout(back1Layout);
        back1Layout.setHorizontalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        back1Layout.setVerticalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Perfil do Cliente");

        txtNomeEvento.setFont(new java.awt.Font("SansSerif", 1, 33)); // NOI18N
        txtNomeEvento.setForeground(new java.awt.Color(0, 255, 200));
        txtNomeEvento.setText("Festa Infantil");

        txtValor.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setText("2000,00");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/$.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eventos");

        txtData.setFont(new java.awt.Font("SansSerif", 1, 33)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("25/03/2025");

        javax.swing.GroupLayout back5Layout = new javax.swing.GroupLayout(back5);
        back5.setLayout(back5Layout);
        back5Layout.setHorizontalGroup(
            back5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        back5Layout.setVerticalGroup(
            back5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, back5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtOS.setFont(new java.awt.Font("SansSerif", 1, 33)); // NOI18N
        txtOS.setForeground(new java.awt.Color(255, 255, 255));
        txtOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOS.setText("001");

        javax.swing.GroupLayout back6Layout = new javax.swing.GroupLayout(back6);
        back6.setLayout(back6Layout);
        back6Layout.setHorizontalGroup(
            back6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOS, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        back6Layout.setVerticalGroup(
            back6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data do evento");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ordem de Serviço");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descrição do evento");

        javax.swing.GroupLayout back2Layout = new javax.swing.GroupLayout(back2);
        back2.setLayout(back2Layout);
        back2Layout.setHorizontalGroup(
            back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        back2Layout.setVerticalGroup(
            back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        txtLocal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtLocal.setForeground(new java.awt.Color(255, 255, 255));
        txtLocal.setText("Local do evento: Espaço InFesta");

        TxtDescricao.setEditable(false);
        TxtDescricao.setBackground(new java.awt.Color(51, 51, 51));
        TxtDescricao.setColumns(10);
        TxtDescricao.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        TxtDescricao.setForeground(new java.awt.Color(255, 255, 255));
        TxtDescricao.setRows(5);
        TxtDescricao.setText("Festa de aniversário para o filho Noah, que adora a Patrulha Canina. A data do evento é 16/05/2025. \nA família toda é vegana e a mãe intolerante a lactose, além disso não gostam de granulado e preferem castanhas \ntrituradas.\nGostariam que os brigadeiros fossem azuis, pois é a cor favorita de Noah.\nA cliente pediu o bolo da referência que trouxe.\nAs trufas serão de Maracujá, Avelã e Frutas vermelhas.\nSerão 1500 trufas (500 de cada); 500 brigadeiros; 1500 salgados sortidos\nO evento acontecerá no espaço InFestas.\n\n\n\n\n");
        TxtDescricao.setBorder(null);
        jScrollPane3.setViewportView(TxtDescricao);

        txtNomeCliente.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeCliente.setText("Cliente: Eduarda Coelho ");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtValor))
                                .addComponent(txtNomeEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(back6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocal)))))
                .addGap(201, 201, 201))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCliente)
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeEvento)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLocal)
                                    .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtValor))
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, 0)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }//GEN-END:initComponents

    
    
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
    public static javax.swing.JTextArea TxtDescricao;
    private com.raven.component.Back back1;
    private com.raven.component.Back back2;
    private com.raven.component.Back back5;
    private com.raven.component.Back back6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.raven.swing.Panel panel1;
    public static javax.swing.JLabel txtData;
    public static javax.swing.JLabel txtLocal;
    public static javax.swing.JLabel txtNomeCliente;
    public static javax.swing.JLabel txtNomeEvento;
    public static javax.swing.JLabel txtOS;
    public static javax.swing.JLabel txtValor;
    // End of variables declaration//GEN-END:variables
}
