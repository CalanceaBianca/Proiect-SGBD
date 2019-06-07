/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacientiPackage;
import javax.swing.*;

import databaseConnection.Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Calancea Bianca
 */
public class StergerePacient extends javax.swing.JFrame {

    /**
     * Creates new form StergerePacient
     */
    public StergerePacient() {
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

        jPanel2 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        footerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idPacient = new javax.swing.JLabel();
        idPacientTextField = new javax.swing.JTextField();
        StergeButton = new javax.swing.JButton();
        mesaj = new java.awt.TextField();
        paginaPrincipala = new javax.swing.JButton();
        rehreshButton = new javax.swing.JButton();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel1.setText("Doriti sa stergeti un pacient din baza de date?");

        idPacient.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        idPacient.setText("Id pacient:");

        idPacientTextField.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N

        StergeButton.setBackground(new java.awt.Color(0, 153, 153));
        StergeButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        StergeButton.setForeground(new java.awt.Color(255, 255, 255));
        StergeButton.setText("Sterge");
        StergeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StergeButtonActionPerformed(evt);
            }
        });

        mesaj.setBackground(new java.awt.Color(240, 240, 240));
        mesaj.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paginaPrincipala, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rehreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idPacient)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idPacientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StergeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idPacient)
                            .addComponent(idPacientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(StergeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(paginaPrincipala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rehreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StergeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StergeButtonActionPerformed
        if(idPacientTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Va rugam introduceti un id.");
        }
        String ID=idPacientTextField.getText().trim();
        Integer.parseInt(ID);
        
        Connection con = Database.getConnection();
        String call= "{call management_spital.sterge_pacient(?)}";
        CallableStatement  stmt ;
        if(idPacientTextField.getText().isEmpty())
            mesaj.setText("Va rugam introduceti toate campurile!");
        try {
            stmt = con.prepareCall(call);
            stmt.setString(1, ID);
            stmt.execute();
            String msg="Pacientul cu id-ul ";
            msg=msg + ID +" a fost sters";
            mesaj.setText(msg);
            } catch (SQLException ex) {
            Logger.getLogger(AdaugarePacient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_StergeButtonActionPerformed

    private void rehreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rehreshButtonActionPerformed
        this.setVisible(false);
        new StergerePacient().setVisible(true);
    }//GEN-LAST:event_rehreshButtonActionPerformed

    private void paginaPrincipalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaPrincipalaActionPerformed
        this.setVisible(false);
        new PacientiFrame().setVisible(true);
    }//GEN-LAST:event_paginaPrincipalaActionPerformed

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
            java.util.logging.Logger.getLogger(StergerePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StergerePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StergerePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StergerePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StergerePacient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StergeButton;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel idPacient;
    private javax.swing.JTextField idPacientTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.TextField mesaj;
    private javax.swing.JButton paginaPrincipala;
    private javax.swing.JButton rehreshButton;
    // End of variables declaration//GEN-END:variables
}
