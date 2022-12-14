/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.databaseConnection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrey
 */
public class createVitalSigns extends javax.swing.JPanel {

    /**
     * Creates new form createVitalSigns
     */
    databaseConnection databaseConnection;
    String fullName;
    
    public createVitalSigns(databaseConnection databaseConnection, String fullName) {
        initComponents();
        this.databaseConnection = databaseConnection;
        this.fullName = fullName;
        txtEncounterID.setEditable(false);
        populateEncounterTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateEncounterTable()
    {
        try {
            ResultSet result = databaseConnection.getDoctorEncounters(fullName);
            DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                Object[] row = new Object[4];
                row[0] = result.getInt("id");
                row[1] = result.getString("encounter_date");
                row[2] = result.getString("hospital_name");
                row[3] = result.getString("symptoms");
                model.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(createVitalSigns.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectEncounter = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        lblEncounterID = new javax.swing.JLabel();
        txtEncounterID = new javax.swing.JTextField();
        lblBodyTemperature = new javax.swing.JLabel();
        txtBodyTemperature = new javax.swing.JTextField();
        lblRespirationRate = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        lblHeartRate = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        selectEncounter.setBackground(new java.awt.Color(255, 255, 255));
        selectEncounter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectEncounter.setForeground(new java.awt.Color(255, 0, 0));
        selectEncounter.setText("                                                                           Select an Encounter to create Vital Signs");

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Encounter ID", "Encounter Date", "Hospital Name", "Symptoms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEncounters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEncounters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEncountersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEncounters);

        lblEncounterID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEncounterID.setText("Encounter ID :");

        txtEncounterID.setPreferredSize(new java.awt.Dimension(72, 22));

        lblBodyTemperature.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblBodyTemperature.setText("Body Temperature :");

        txtBodyTemperature.setPreferredSize(new java.awt.Dimension(72, 22));
        txtBodyTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTemperatureActionPerformed(evt);
            }
        });

        lblRespirationRate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRespirationRate.setText("Respiration Rate :");

        txtRespirationRate.setPreferredSize(new java.awt.Dimension(72, 22));

        lblHeartRate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHeartRate.setText("Heart Rate :");

        txtHeartRate.setPreferredSize(new java.awt.Dimension(72, 22));
        txtHeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeartRateActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 0, 0));
        btnCreate.setText("Create");
        btnCreate.setPreferredSize(new java.awt.Dimension(104, 30));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblRespirationRate)
                        .addComponent(lblEncounterID)
                        .addComponent(lblBodyTemperature)
                        .addComponent(lblHeartRate))
                    .addGap(99, 99, 99)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(331, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(168, 168, 168)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblEncountersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncountersMouseClicked
        // TODO add your handling code here:
        int encounterID = (int)tblEncounters.getValueAt(tblEncounters.getSelectedRow(), 0);
        txtEncounterID.setText(String.valueOf(encounterID));
    }//GEN-LAST:event_tblEncountersMouseClicked

    private void txtBodyTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTemperatureActionPerformed

    private void txtHeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeartRateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        String validate = validationCheck();
        if(!validate.isEmpty())
        {
            JOptionPane.showMessageDialog(this, validate);
        }
        else
        {
            try {
                int selectedRowIndex = tblEncounters.getSelectedRow();
                if(selectedRowIndex < 0)
                {
                    JOptionPane.showMessageDialog(this, "Please Select an encounter to create Vital Signs");
                }
                
                DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
                int encounterID = (int) model.getValueAt(selectedRowIndex, 0);
                String encounterDate = model.getValueAt(selectedRowIndex, 1).toString();
                String symptoms = model.getValueAt(selectedRowIndex, 3).toString();
                int userID = databaseConnection.getUserID(encounterID);
                int bodyTemp = Integer.parseInt(txtBodyTemperature.getText());
                int respirationRate = Integer.parseInt(txtRespirationRate.getText());
                int heartRate = Integer.parseInt(txtHeartRate.getText());
                databaseConnection.insertVitalSigns(encounterID, encounterDate, symptoms, userID, bodyTemp, respirationRate, heartRate);
                JOptionPane.showMessageDialog(this, "Vital Signs Added!");
                clearFormText();
            } catch (Exception ex) {
                Logger.getLogger(createVitalSigns.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed
    
    private void clearFormText()
    {
        txtEncounterID.setText("");
        txtHeartRate.setText("");
        txtBodyTemperature.setText("");
        txtRespirationRate.setText("");
    }
    
    private String validationCheck()
    {
        if(txtHeartRate.getText().isEmpty() || txtRespirationRate.getText().isEmpty() || txtBodyTemperature.getText().isEmpty())
        {
            return "Please fill all fields!";
        }
        try
        {
            int heartRate = Integer.parseInt(txtHeartRate.getText());
        }
        catch(NumberFormatException ex)
        {
            return "Heart Rate has to be a Number!";
        }
        try
        {
            int respirationRate = Integer.parseInt(txtRespirationRate.getText());
        }
        catch(NumberFormatException ex)
        {
            return "Respiration Rate has to be a Number!";
        }
        try
        {
            int bodyTemp = Integer.parseInt(txtBodyTemperature.getText());
        }
        catch(NumberFormatException ex)
        {
            return "Body Temperature has to be a Number!";
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBodyTemperature;
    private javax.swing.JLabel lblEncounterID;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblRespirationRate;
    private javax.swing.JLabel selectEncounter;
    private javax.swing.JTable tblEncounters;
    private javax.swing.JTextField txtBodyTemperature;
    private javax.swing.JTextField txtEncounterID;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtRespirationRate;
    // End of variables declaration//GEN-END:variables
}
