/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacientiPackage;

import databaseConnection.Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proiectbd.HospitalFrame;

/**
 *
 * @author Calancea Bianca
 */
public class AdaugarePacient extends javax.swing.JFrame {

    /**
     * Creates new form AdaugarePacient
     */
    public AdaugarePacient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        footerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        prenumeLabel = new javax.swing.JLabel();
        varstaLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        inaltimeLabel = new javax.swing.JLabel();
        greutateLabel = new javax.swing.JLabel();
        telefonLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numeTextField = new javax.swing.JTextField();
        prenumeTextField = new javax.swing.JTextField();
        varstaSpinner = new javax.swing.JSpinner();
        femininButton = new javax.swing.JRadioButton();
        MasculinButton = new javax.swing.JRadioButton();
        inaltimeSpinner = new javax.swing.JSpinner();
        greutateSpinner = new javax.swing.JSpinner();
        telefonTextField = new javax.swing.JTextField();
        simptomTextField = new javax.swing.JTextField();
        adaugaButton = new javax.swing.JButton();
        paginaPrincipala = new javax.swing.JButton();
        rehreshButton = new javax.swing.JButton();
        area = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        headerLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calancea Bianca\\Desktop\\img sgbd\\icon.jpg")); // NOI18N
        headerLabel.setText("Sistem de gestiune medicala");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        footerLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        footerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footerLabel.setText("Copyright Calancea Bianca & Andronic Andra");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(footerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Adaugati un pacient in baza noastra de date");

        nameLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        nameLabel.setText("Nume:");

        prenumeLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        prenumeLabel.setText("Prenume:");

        varstaLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        varstaLabel.setText("Varsta:");

        sexLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        sexLabel.setText("Sex:");

        inaltimeLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        inaltimeLabel.setText("Inaltime:");

        greutateLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        greutateLabel.setText("Greutate:");

        telefonLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        telefonLabel.setText("Telefon:");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setText("Simptom:");

        femininButton.setText("Feminin");

        MasculinButton.setText("Masculin");

        simptomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simptomTextFieldActionPerformed(evt);
            }
        });

        adaugaButton.setBackground(new java.awt.Color(0, 153, 153));
        adaugaButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        adaugaButton.setForeground(new java.awt.Color(255, 255, 255));
        adaugaButton.setText("Adauga");
        adaugaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaugaButtonActionPerformed(evt);
            }
        });

        paginaPrincipala.setBackground(new java.awt.Color(0, 153, 153));
        paginaPrincipala.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        paginaPrincipala.setForeground(new java.awt.Color(255, 255, 255));
        paginaPrincipala.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calancea Bianca\\Desktop\\img sgbd\\back.jpg")); // NOI18N
        paginaPrincipala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaPrincipalaActionPerformed(evt);
            }
        });

        rehreshButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calancea Bianca\\Desktop\\img sgbd\\refresh.png")); // NOI18N
        rehreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rehreshButtonActionPerformed(evt);
            }
        });

        area.setBackground(new java.awt.Color(240, 240, 240));
        area.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        area.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(varstaLabel)
                            .addComponent(prenumeLabel)
                            .addComponent(sexLabel)
                            .addComponent(inaltimeLabel)
                            .addComponent(greutateLabel)
                            .addComponent(telefonLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenumeTextField)
                            .addComponent(telefonTextField)
                            .addComponent(simptomTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(femininButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(MasculinButton))
                                    .addComponent(varstaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(greutateSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(inaltimeSpinner, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(paginaPrincipala, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeTextField))
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addComponent(rehreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(adaugaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(area)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rehreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numeTextField)
                                        .addGap(1, 1, 1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(paginaPrincipala, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prenumeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prenumeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varstaLabel)
                    .addComponent(varstaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel)
                    .addComponent(femininButton)
                    .addComponent(MasculinButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inaltimeLabel)
                    .addComponent(inaltimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greutateLabel)
                    .addComponent(greutateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefonLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telefonTextField)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(simptomTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adaugaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simptomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simptomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simptomTextFieldActionPerformed

    private void adaugaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaugaButtonActionPerformed
        
        
        String nume=numeTextField.getText().trim();
        String prenume=prenumeTextField.getText().trim();
        int varsta=(Integer) varstaSpinner.getValue();
        String sex="Feminin";
            if(!femininButton.getText().isEmpty())
                    {
                        sex= femininButton.getText();
                    }
       
        int inaltime=(Integer) inaltimeSpinner.getValue();
        int greutate=(Integer) greutateSpinner.getValue();
        String telefon=telefonTextField.getText().trim();
        String simptom=simptomTextField.getText().trim();
        if(nume.isEmpty() || prenume.isEmpty() || varsta==0 || inaltime==0 || greutate==0 || telefon.isEmpty() || simptom.isEmpty())
        {  area.setText("Va rugam introduceti toate campurile!");}
        Connection con = Database.getConnection();
        String call= "{call management_spital.adaugare_pacient(?,?,?,?,?,?,?,?)}";
        CallableStatement  stmt ;
        try {
            stmt = con.prepareCall(call);
            stmt.setString(1, nume);
            stmt.setString(2, prenume);
            stmt.setInt(3, varsta);
            stmt.setString(4, sex);
            stmt.setInt(5, inaltime);
            stmt.setInt(6, greutate);
            stmt.setString(7, telefon);
            stmt.setString(8, simptom);
            stmt.execute();
            String msg="Pacientul ";
            msg=msg + nume + " " + prenume + " a fost adaugat cu succes";
            area.setText(msg);
            } catch (SQLException ex) {
           Logger.getLogger(AdaugarePacient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adaugaButtonActionPerformed

    private void paginaPrincipalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaPrincipalaActionPerformed
        new PacientiFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_paginaPrincipalaActionPerformed

    private void rehreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rehreshButtonActionPerformed
        this.setVisible(false);
        new AdaugarePacient().setVisible(true);
    }//GEN-LAST:event_rehreshButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdaugarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdaugarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdaugarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdaugarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdaugarePacient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MasculinButton;
    private javax.swing.JButton adaugaButton;
    private javax.swing.JTextField area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton femininButton;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JLabel greutateLabel;
    private javax.swing.JSpinner greutateSpinner;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel inaltimeLabel;
    private javax.swing.JSpinner inaltimeSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numeTextField;
    private javax.swing.JButton paginaPrincipala;
    private javax.swing.JLabel prenumeLabel;
    private javax.swing.JTextField prenumeTextField;
    private javax.swing.JButton rehreshButton;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField simptomTextField;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JTextField telefonTextField;
    private javax.swing.JLabel varstaLabel;
    private javax.swing.JSpinner varstaSpinner;
    // End of variables declaration//GEN-END:variables
}