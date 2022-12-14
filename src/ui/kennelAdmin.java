/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.databaseConnection;

/**
 *
 * @author babsybabu
 */
public class kennelAdmin extends javax.swing.JPanel {

    /**
     * Creates new form kennelAdmin
     */
    databaseConnection databaseConnection;

    public kennelAdmin(databaseConnection databaseConnection) {
        initComponents();
        this.databaseConnection = databaseConnection;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kennelAdminSplitPane = new javax.swing.JSplitPane();
        kennelAdminControlArea = new javax.swing.JPanel();
        btnUpdatePricePerDay = new javax.swing.JButton();
        kennelAdminWorkArea = new javax.swing.JPanel();

        btnUpdatePricePerDay.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdatePricePerDay.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdatePricePerDay.setText("Update Price");
        btnUpdatePricePerDay.setPreferredSize(new java.awt.Dimension(140, 30));
        btnUpdatePricePerDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePricePerDayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kennelAdminControlAreaLayout = new javax.swing.GroupLayout(kennelAdminControlArea);
        kennelAdminControlArea.setLayout(kennelAdminControlAreaLayout);
        kennelAdminControlAreaLayout.setHorizontalGroup(
            kennelAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kennelAdminControlAreaLayout.createSequentialGroup()
                .addComponent(btnUpdatePricePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        kennelAdminControlAreaLayout.setVerticalGroup(
            kennelAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kennelAdminControlAreaLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnUpdatePricePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        kennelAdminSplitPane.setLeftComponent(kennelAdminControlArea);

        javax.swing.GroupLayout kennelAdminWorkAreaLayout = new javax.swing.GroupLayout(kennelAdminWorkArea);
        kennelAdminWorkArea.setLayout(kennelAdminWorkAreaLayout);
        kennelAdminWorkAreaLayout.setHorizontalGroup(
            kennelAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        kennelAdminWorkAreaLayout.setVerticalGroup(
            kennelAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        kennelAdminSplitPane.setRightComponent(kennelAdminWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kennelAdminSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kennelAdminSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdatePricePerDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePricePerDayActionPerformed
        // TODO add your handling code here:
        kennelAdminUpdatePrice petFoodUpdatePrice = new kennelAdminUpdatePrice(databaseConnection);
        kennelAdminSplitPane.setRightComponent(petFoodUpdatePrice);
    }//GEN-LAST:event_btnUpdatePricePerDayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdatePricePerDay;
    private javax.swing.JPanel kennelAdminControlArea;
    private javax.swing.JSplitPane kennelAdminSplitPane;
    private javax.swing.JPanel kennelAdminWorkArea;
    // End of variables declaration//GEN-END:variables
}
