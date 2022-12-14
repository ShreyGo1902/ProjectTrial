/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.databaseConnection;

/**
 *
 * @author shrey
 */
public class productSupplier extends javax.swing.JPanel {

    /**
     * Creates new form petFoodAdmin
     */
    databaseConnection databaseConnection;
    
    public productSupplier(databaseConnection databaseConnection) {
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

        productSupplierAdminSplitPane = new javax.swing.JSplitPane();
        productSupplierAdminControlArea = new javax.swing.JPanel();
        btnOpenOrders = new javax.swing.JButton();
        btnClosedOrders = new javax.swing.JButton();
        productSupplierAdminWorkArea = new javax.swing.JPanel();

        productSupplierAdminSplitPane.setDividerLocation(120);

        productSupplierAdminControlArea.setBackground(new java.awt.Color(102, 255, 102));

        btnOpenOrders.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnOpenOrders.setForeground(new java.awt.Color(255, 0, 0));
        btnOpenOrders.setText("Open Orders");
        btnOpenOrders.setPreferredSize(new java.awt.Dimension(76, 30));
        btnOpenOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenOrdersActionPerformed(evt);
            }
        });

        btnClosedOrders.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClosedOrders.setForeground(new java.awt.Color(255, 0, 0));
        btnClosedOrders.setText("Closed Orders");
        btnClosedOrders.setPreferredSize(new java.awt.Dimension(76, 30));
        btnClosedOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosedOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productSupplierAdminControlAreaLayout = new javax.swing.GroupLayout(productSupplierAdminControlArea);
        productSupplierAdminControlArea.setLayout(productSupplierAdminControlAreaLayout);
        productSupplierAdminControlAreaLayout.setHorizontalGroup(
            productSupplierAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productSupplierAdminControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpenOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(productSupplierAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productSupplierAdminControlAreaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnClosedOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        productSupplierAdminControlAreaLayout.setVerticalGroup(
            productSupplierAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productSupplierAdminControlAreaLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnOpenOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
            .addGroup(productSupplierAdminControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productSupplierAdminControlAreaLayout.createSequentialGroup()
                    .addContainerGap(305, Short.MAX_VALUE)
                    .addComponent(btnClosedOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(289, 289, 289)))
        );

        productSupplierAdminSplitPane.setLeftComponent(productSupplierAdminControlArea);

        productSupplierAdminWorkArea.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout productSupplierAdminWorkAreaLayout = new javax.swing.GroupLayout(productSupplierAdminWorkArea);
        productSupplierAdminWorkArea.setLayout(productSupplierAdminWorkAreaLayout);
        productSupplierAdminWorkAreaLayout.setHorizontalGroup(
            productSupplierAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        productSupplierAdminWorkAreaLayout.setVerticalGroup(
            productSupplierAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        productSupplierAdminSplitPane.setRightComponent(productSupplierAdminWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productSupplierAdminSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productSupplierAdminSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenOrdersActionPerformed
        // TODO add your handling code here:
        productSupplierAdminOpenOrders supplyOpenOrders = new productSupplierAdminOpenOrders(databaseConnection);
        productSupplierAdminSplitPane.setRightComponent(supplyOpenOrders);
    }//GEN-LAST:event_btnOpenOrdersActionPerformed

    private void btnClosedOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosedOrdersActionPerformed
        // TODO add your handling code here:
        productSupplierClosedOrders supplierClosedOrders = new productSupplierClosedOrders(databaseConnection);
        productSupplierAdminSplitPane.setRightComponent(supplierClosedOrders);
    }//GEN-LAST:event_btnClosedOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClosedOrders;
    private javax.swing.JButton btnOpenOrders;
    private javax.swing.JPanel productSupplierAdminControlArea;
    private javax.swing.JSplitPane productSupplierAdminSplitPane;
    private javax.swing.JPanel productSupplierAdminWorkArea;
    // End of variables declaration//GEN-END:variables
}
