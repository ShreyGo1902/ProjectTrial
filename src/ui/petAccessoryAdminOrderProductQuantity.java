/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.databaseConnection;

/**
 *
 * @author shrey
 */
public class petAccessoryAdminOrderProductQuantity extends javax.swing.JPanel {

    /**
     * Creates new form petFoodAdminUpdatePrice
     */
    databaseConnection databaseConnection;
    
    public petAccessoryAdminOrderProductQuantity(databaseConnection databaseConnection) {
        initComponents();
        this.databaseConnection = databaseConnection;
        txtAccessoryName.setEditable(false);
        populateTable();
    }
    
    private void populateTable()
    {
        try {
            ResultSet result = databaseConnection.executeSelect("SELECT * FROM petaccessories");
            DefaultTableModel model = (DefaultTableModel) tablePetAccessory.getModel();
            model.setRowCount(0);
            while(result.next())
            {
                Object[] row = new Object[4];
                row[0] = result.getInt("id");
                row[1] = result.getString("accessory_name");
                row[2] = result.getInt("accessory_price");
                row[3] = result.getInt("available_quantity");
                model.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(petAccessoryAdminOrderProductQuantity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablePetAccessory = new javax.swing.JTable();
        lblAccessoryOrder = new javax.swing.JLabel();
        lblAccessoryName = new javax.swing.JLabel();
        txtAccessoryName = new javax.swing.JTextField();
        lblAccessoryOrderQuantity = new javax.swing.JLabel();
        txtAccessoryOrderQuantity = new javax.swing.JTextField();
        btnPlaceOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        tablePetAccessory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Product Price", "Quantity Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePetAccessory.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePetAccessory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePetAccessoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePetAccessory);

        lblAccessoryOrder.setBackground(new java.awt.Color(255, 255, 255));
        lblAccessoryOrder.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAccessoryOrder.setForeground(new java.awt.Color(255, 0, 0));
        lblAccessoryOrder.setText("                                                                 Select a Product to Place Order");

        lblAccessoryName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAccessoryName.setText("Product Name :");

        txtAccessoryName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtAccessoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccessoryNameActionPerformed(evt);
            }
        });

        lblAccessoryOrderQuantity.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAccessoryOrderQuantity.setText("Order Quantity :");

        txtAccessoryOrderQuantity.setPreferredSize(new java.awt.Dimension(71, 30));
        txtAccessoryOrderQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccessoryOrderQuantityActionPerformed(evt);
            }
        });

        btnPlaceOrder.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 0, 0));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setPreferredSize(new java.awt.Dimension(76, 30));
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAccessoryOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAccessoryOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtAccessoryOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAccessoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtAccessoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(246, 246, 246))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblAccessoryOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccessoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccessoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccessoryOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccessoryOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccessoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccessoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccessoryNameActionPerformed

    private void txtAccessoryOrderQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccessoryOrderQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccessoryOrderQuantityActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) tablePetAccessory.getModel();
            int selectedRowIndex = tablePetAccessory.getSelectedRow();
            int product_id = (int) model.getValueAt(selectedRowIndex, 0);
            int order_quantity = Integer.parseInt(txtAccessoryOrderQuantity.getText());
            
            databaseConnection.insertOpenOrdersAccessory(product_id, order_quantity);
   
            JOptionPane.showMessageDialog(this, "Product Ordered Successfully!");
            txtAccessoryName.setText("");
            txtAccessoryOrderQuantity.setText("");
            populateTable();
        } catch (Exception ex) {
            Logger.getLogger(petAccessoryAdminOrderProductQuantity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void tablePetAccessoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePetAccessoryMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablePetAccessory.getModel();
        int selectedRowIndex = tablePetAccessory.getSelectedRow();
        String productName = (String) model.getValueAt(selectedRowIndex, 1);
        txtAccessoryName.setText(productName);
    }//GEN-LAST:event_tablePetAccessoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAccessoryName;
    private javax.swing.JLabel lblAccessoryOrder;
    private javax.swing.JLabel lblAccessoryOrderQuantity;
    private javax.swing.JTable tablePetAccessory;
    private javax.swing.JTextField txtAccessoryName;
    private javax.swing.JTextField txtAccessoryOrderQuantity;
    // End of variables declaration//GEN-END:variables
}
