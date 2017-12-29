package login.user;
import javax.swing.JOptionPane;

public class adduser extends javax.swing.JFrame {

    public adduser() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ad1 = new javax.swing.JCheckBox();
        ad2 = new javax.swing.JCheckBox();
        ad3 = new javax.swing.JCheckBox();
        ad4 = new javax.swing.JCheckBox();
        txtun = new javax.swing.JTextField();
        mainad = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        show = new javax.swing.JCheckBox();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Password:");

        ad1.setText("Admin1");

        ad2.setText("Admin2");

        ad3.setText("Admin3");
        ad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad3ActionPerformed(evt);
            }
        });

        ad4.setText("Admin4");

        txtun.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        mainad.setText("Make admin");
        mainad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainadActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        txtpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtun, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(show))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ad1)
                                .addGap(18, 18, 18)
                                .addComponent(ad2)
                                .addGap(18, 18, 18)
                                .addComponent(ad3)
                                .addGap(18, 18, 18)
                                .addComponent(ad4)
                                .addGap(18, 18, 18)
                                .addComponent(mainad)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtun))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad1)
                    .addComponent(ad2)
                    .addComponent(ad3)
                    .addComponent(ad4)
                    .addComponent(mainad))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void reset(){
         txtpass.setText(null);
        txtun.setText(null);
        if(show.isSelected())
        {
            show.doClick();
        }
         if(mainad.isSelected())
        {
            mainad.doClick();
        }
         else{
        if(ad1.isSelected())
        {
            ad1.doClick();
        }
        if(ad2.isSelected())
        {
            ad2.doClick();
        }
        if(ad2.isSelected())
        {
            ad2.doClick();
        }
        if(ad3.isSelected())
        {
            ad3.doClick();
        }
        if(ad4.isSelected())
        {
            ad4.doClick();
        }
         }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
         if(show.isSelected()){
            txtpass.setEchoChar((char)0);
        }
        else{
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String uname = txtun.getText();
        String upass = txtpass.getText();
        if(uname.isEmpty() || upass.isEmpty() || (!ad1.isSelected() && !ad2.isSelected() && !ad3.isSelected() && !ad4.isSelected())){
            JOptionPane.showMessageDialog(this, "Empty field found","Error",JOptionPane.WARNING_MESSAGE);
            return;
        }
        String a1 = "0",a2 = "0",a3 = "0",a4 = "0";
        if(ad1.isSelected())
        {
            a1 = "1";
        }
        if(ad2.isSelected())
        {
            a2 = "1";
        }
        if(ad3.isSelected())
        {
            a3 = "1";
        }
        if(ad4.isSelected())
        {
            a4 = "1";
        }
        try {
            Dbhelper db = new Dbhelper();
            db.executeUpdate("Insert into jobchaiyousers (username,password,admin1,admin2,admin3,admin4) values ('"+uname+"','"+upass+"','"+a1+"','"+a2+"','"+a3+"','"+a4+"')");
            JOptionPane.showMessageDialog(this, "User added","Insert",JOptionPane.INFORMATION_MESSAGE);
            reset();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mainadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainadActionPerformed
        
        if(mainad.isSelected()){
             if(!ad1.isSelected())
        {
            ad1.doClick();
        }
        if(!ad2.isSelected())
        {
            ad2.doClick();
        }
        if(!ad2.isSelected())
        {
            ad2.doClick();
        }
        if(!ad3.isSelected())
        {
            ad3.doClick();
        }
        if(!ad4.isSelected())
        {
            ad4.doClick();
        }
        }
        else{
             if(ad1.isSelected())
        {
            ad1.doClick();
        }
        if(ad2.isSelected())
        {
            ad2.doClick();
        }
        if(ad2.isSelected())
        {
            ad2.doClick();
        }
        if(ad3.isSelected())
        {
            ad3.doClick();
        }
        if(ad4.isSelected())
        {
            ad4.doClick();
        }
        }
    }//GEN-LAST:event_mainadActionPerformed

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
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ad1;
    private javax.swing.JCheckBox ad2;
    private javax.swing.JCheckBox ad3;
    private javax.swing.JCheckBox ad4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox mainad;
    private javax.swing.JCheckBox show;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtun;
    // End of variables declaration//GEN-END:variables
}
