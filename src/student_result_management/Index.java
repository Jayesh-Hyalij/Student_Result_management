/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management;

/**
 *
 * @author dell
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
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

        label1 = new java.awt.Label();
        studentBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        studentLogin = new javax.swing.JLabel();
        staffLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentBtn.setBackground(java.awt.Color.darkGray);
        studentBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentBtn.setForeground(new java.awt.Color(255, 255, 255));
        studentBtn.setText("CLICK HERE  ->");
        studentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(studentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 140, 40));

        adminBtn.setBackground(java.awt.Color.darkGray);
        adminBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminBtn.setText("CLICK HERE  ->");
        adminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 140, 40));

        studentLogin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        studentLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management/assets/studentBtn.png"))); // NOI18N
        studentLogin.setLabelFor(studentBtn);
        studentLogin.setText("Student Login");
        studentLogin.setToolTipText("");
        studentLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        studentLogin.setFocusTraversalPolicyProvider(true);
        studentLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        studentLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(studentLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        staffLogin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        staffLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management/assets/adminBtn.png"))); // NOI18N
        staffLogin.setLabelFor(adminBtn);
        staffLogin.setText("Staff Login");
        staffLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        staffLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(staffLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management/assets/bg.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentIndex().setVisible(true);
    }//GEN-LAST:event_studentBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_adminBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private javax.swing.JLabel staffLogin;
    private javax.swing.JButton studentBtn;
    private javax.swing.JLabel studentLogin;
    // End of variables declaration//GEN-END:variables
}
