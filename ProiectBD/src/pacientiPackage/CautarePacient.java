/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacientiPackage;

/**
 *
 * @author Calancea Bianca
 */
public class CautarePacient extends javax.swing.JFrame {

    /**
     * Creates new form CautarePacient
     */
    public CautarePacient() {
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
        cautareDupaNume = new javax.swing.JButton();
        medicLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        footerLabel = new javax.swing.JLabel();
        cautareDupaSimptom = new javax.swing.JButton();
        cautareAvansata = new javax.swing.JButton();
        paginaPrincipala = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
            .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE)
        );

        cautareDupaNume.setBackground(new java.awt.Color(0, 153, 153));
        cautareDupaNume.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        cautareDupaNume.setForeground(new java.awt.Color(255, 255, 255));
        cautareDupaNume.setText("Cautare dupa nume");
        cautareDupaNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cautareDupaNumeActionPerformed(evt);
            }
        });

        medicLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        medicLabel.setText("Bun venit in sectiunea de cautare a pacinetilor!");

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

        cautareDupaSimptom.setBackground(new java.awt.Color(0, 153, 153));
        cautareDupaSimptom.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        cautareDupaSimptom.setForeground(new java.awt.Color(255, 255, 255));
        cautareDupaSimptom.setText("Cautare Dupa ID");
        cautareDupaSimptom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cautareDupaSimptomActionPerformed(evt);
            }
        });

        cautareAvansata.setBackground(new java.awt.Color(0, 153, 153));
        cautareAvansata.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        cautareAvansata.setForeground(new java.awt.Color(255, 255, 255));
        cautareAvansata.setText("Cautare Avansata");
        cautareAvansata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cautareAvansataActionPerformed(evt);
            }
        });

        paginaPrincipala.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        paginaPrincipala.setForeground(new java.awt.Color(255, 255, 255));
        paginaPrincipala.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calancea Bianca\\Desktop\\img sgbd\\back.jpg")); // NOI18N
        paginaPrincipala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaPrincipalaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calancea Bianca\\Desktop\\img sgbd\\pacient.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paginaPrincipala, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(medicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cautareDupaSimptom, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cautareDupaNume, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cautareAvansata, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(paginaPrincipala, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cautareDupaNume, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(cautareDupaSimptom, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cautareAvansata, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(medicLabel)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cautareDupaNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cautareDupaNumeActionPerformed
        new CautarePacientDupaNume().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cautareDupaNumeActionPerformed

    private void cautareAvansataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cautareAvansataActionPerformed
        new CautarePacientAvansata().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cautareAvansataActionPerformed

    private void paginaPrincipalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaPrincipalaActionPerformed
        new PacientiFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_paginaPrincipalaActionPerformed

    private void cautareDupaSimptomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cautareDupaSimptomActionPerformed
        new CautarePacientDupaId().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cautareDupaSimptomActionPerformed

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
            java.util.logging.Logger.getLogger(CautarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CautarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CautarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CautarePacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CautarePacient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cautareAvansata;
    private javax.swing.JButton cautareDupaNume;
    private javax.swing.JButton cautareDupaSimptom;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel medicLabel;
    private javax.swing.JButton paginaPrincipala;
    // End of variables declaration//GEN-END:variables
}