/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediciPackage;

import databaseConnection.Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.GarziModel;
import models.MediciModel;

/**
 *
 * @author Calancea Bianca
 */
public class CautareMedicAvansata extends javax.swing.JFrame {

    /**
     * Creates new form CautareMedicAvansata
     */
    public CautareMedicAvansata() {
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

        rehreshButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        garziButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        footerLabel = new javax.swing.JLabel();
        numeTextField = new javax.swing.JTextField();
        paginaPrincipala = new javax.swing.JButton();
        prenumeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        prenumeLabel = new javax.swing.JLabel();
        varstaLabel = new javax.swing.JLabel();
        specializare = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        cautaButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        garzi = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rehreshButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calancea Bianca\\Desktop\\img sgbd\\refresh.png")); // NOI18N
        rehreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rehreshButtonActionPerformed(evt);
            }
        });

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

        garziButton.setBackground(new java.awt.Color(0, 153, 153));
        garziButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        garziButton.setForeground(new java.awt.Color(255, 255, 255));
        garziButton.setText("Vezi GARZI");
        garziButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garziButtonActionPerformed(evt);
            }
        });

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

        numeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeTextFieldActionPerformed(evt);
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

        prenumeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenumeTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Aici poti cauta un medic in baza noastra de date");

        nameLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        nameLabel.setText("Nume:");

        prenumeLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        prenumeLabel.setText("Prenume:");

        varstaLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        varstaLabel.setText("Specilaizare:");

        specializare.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        specializare.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cardiologie", "Chirurgie", "Dermatologie", "Endocrionologie", "Gastroenterologie", "Nefrologie", "Neonatologie", "Neurochirurgie", "Neurologie", "Obstretica-Ginelologie", "Oftalmologie", "Oncologie", "Ortopedie", "Patologie", "Pediatrie", "Reumatologie", "Urologie", "Pneumologie" }));
        specializare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializareActionPerformed(evt);
            }
        });

        area.setBackground(new java.awt.Color(240, 240, 240));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        cautaButton.setBackground(new java.awt.Color(0, 153, 153));
        cautaButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        cautaButton.setForeground(new java.awt.Color(255, 255, 255));
        cautaButton.setText("Cauta");
        cautaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cautaButtonActionPerformed(evt);
            }
        });

        garzi.setBackground(new java.awt.Color(240, 240, 240));
        garzi.setColumns(20);
        garzi.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        garzi.setRows(5);
        jScrollPane2.setViewportView(garzi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prenumeLabel)
                            .addComponent(varstaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(specializare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prenumeTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cautaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(garziButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paginaPrincipala, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rehreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rehreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(numeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paginaPrincipala)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(prenumeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prenumeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varstaLabel)
                    .addComponent(specializare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cautaButton)
                    .addComponent(garziButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rehreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rehreshButtonActionPerformed
        this.setVisible(false);
        new CautareMedicAvansata().setVisible(true);
    }//GEN-LAST:event_rehreshButtonActionPerformed

    private void garziButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garziButtonActionPerformed
        ArrayList<MediciModel> mediciList=new ArrayList<>();
        ArrayList<GarziModel> garziList=new ArrayList<>();
        String nume=numeTextField.getText().trim();
        String prenume=prenumeTextField.getText().trim();
        String sectie= specializare.getSelectedItem().toString();
        String query="select *  from medici where specializare=? and prenume=? and nume=?";
        Connection con = Database.getConnection();
        PreparedStatement searchCommand;
        try {
            searchCommand = con.prepareStatement(query);
            searchCommand.setString(1, sectie);
            searchCommand.setString(2, prenume);
            searchCommand.setString(3, nume);
            searchCommand.executeUpdate();
            ResultSet set=searchCommand.executeQuery();
            MediciModel medic;
            if(!set.next()) 
            {
                
            }
           do
            {
                medic=new MediciModel(set.getInt("ID"),set.getString("specializare"),set.getString("nume"),set.getString("prenume"),set.getInt("varsta"),set.getString("telefon"));
                mediciList.add(medic);
                String call= "{call management_spital.generare_garzi(?)}";
                CallableStatement  stmt ;
                try {
                    stmt = con.prepareCall(call);
                    stmt.setInt(1, medic.getId());
                    stmt.execute();
                    String query1="select *  from garzi where id_medic=?";
                    PreparedStatement stmt1;
                    try {
                        stmt1 = con.prepareStatement(query1);
                        stmt1.setInt(1, medic.getId());
                        stmt1.executeUpdate();
                        ResultSet set1=stmt1.executeQuery();
                        GarziModel garda;
                        if(!set1.next()) 
                        {
                            
                        }
                         String mesaj1="Il puteti gasi de garda \n la urmatoarele date: \n";
                    do
                    {     garda=new GarziModel(set1.getInt("ID"),set1.getInt("id_medic"),set1.getInt("id_sectie"),set1.getDate("data_garda"));
                          garziList.add(garda);
                          mesaj1+=garda.getDataGarda().toString()+"\n";
                          garzi.setText(mesaj1);
                      }while(set1.next());
                    
                      } catch (SQLException ex) {
                     Logger.getLogger(CautareMedicDupaNume.class.getName()).log(Level.SEVERE, null, ex); 
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CautareMedicDupaNume.class.getName()).log(Level.SEVERE, null, ex);
                }     
            }while(set.next());
            } catch (SQLException ex) {
                    Logger.getLogger(CautareMedicDupaNume.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }//GEN-LAST:event_garziButtonActionPerformed

    private void paginaPrincipalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaPrincipalaActionPerformed
        new CautareMedic().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_paginaPrincipalaActionPerformed

    private void specializareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specializareActionPerformed

    private void numeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeTextFieldActionPerformed

    private void prenumeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenumeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenumeTextFieldActionPerformed

    private void cautaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cautaButtonActionPerformed
       ArrayList<MediciModel> mediciList=new ArrayList<>();
        
        String nume=numeTextField.getText().trim();
        String prenume=prenumeTextField.getText().trim();
        String sectie= specializare.getSelectedItem().toString();
        String query="select *  from medici where specializare=? and prenume=? and nume=?";
        Connection con = Database.getConnection();
        PreparedStatement searchCommand;
        try {
            
            searchCommand = con.prepareStatement(query);
            searchCommand.setString(1, sectie);
            searchCommand.setString(2, prenume);
            searchCommand.setString(3, nume);
            searchCommand.executeUpdate();
            ResultSet set=searchCommand.executeQuery();
            MediciModel medic;
            if(!set.next()) 
            {String mesaj="Medicul nu a fost gasit in baza de date!\n";
            area.setText(mesaj);return;}
           do
            {
                medic=new MediciModel(set.getInt("ID"),set.getString("specializare"),set.getString("nume"),set.getString("prenume"),set.getInt("varsta"),set.getString("telefon"));
                mediciList.add(medic);
                String mesaj="Medicul pe care l-ati cautat va sta\n la dispozitie cu urmatoarele \ninformatii: \n";
                mesaj+= "Nume: "+medic.getNume()+"\n";
                mesaj+="Prenume: "+ medic.getPrenume()+"\n";
                mesaj+="Varsta: "+ medic.getVarsta()+"\n";
                mesaj+="Telefon: "+ medic.getTelefon()+"\n";
                mesaj+="Specializare: "+ medic.getSpecializare()+"\n";
                mesaj+="Varsta: "+ medic.getVarsta()+"\n";
                area.setText(mesaj);
            }while(set.next());
      }catch (SQLException ex) {
            Logger.getLogger(CautareMedicDupaNume.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cautaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CautareMedicAvansata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CautareMedicAvansata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CautareMedicAvansata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CautareMedicAvansata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CautareMedicAvansata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton cautaButton;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JTextArea garzi;
    private javax.swing.JButton garziButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numeTextField;
    private javax.swing.JButton paginaPrincipala;
    private javax.swing.JLabel prenumeLabel;
    private javax.swing.JTextField prenumeTextField;
    private javax.swing.JButton rehreshButton;
    private javax.swing.JComboBox specializare;
    private javax.swing.JLabel varstaLabel;
    // End of variables declaration//GEN-END:variables
}
