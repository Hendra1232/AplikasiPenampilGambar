/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Diskominfotik
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        BTPanel = new javax.swing.JPanel();
        messiBT = new javax.swing.JButton();
        ronaldoBT = new javax.swing.JButton();
        salahBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imgPanel = new javax.swing.JPanel();
        messiLB = new javax.swing.JLabel();
        ronaldoLB = new javax.swing.JLabel();
        salahLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        messiBT.setText("Messi");
        messiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messiBTActionPerformed(evt);
            }
        });
        BTPanel.add(messiBT);

        ronaldoBT.setText("C. Ronaldo");
        ronaldoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ronaldoBTActionPerformed(evt);
            }
        });
        BTPanel.add(ronaldoBT);

        salahBT.setText("M. Salah");
        salahBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salahBTActionPerformed(evt);
            }
        });
        BTPanel.add(salahBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        BTPanel.add(exitBT);

        getContentPane().add(BTPanel, java.awt.BorderLayout.PAGE_START);

        imgPanel.setLayout(new java.awt.CardLayout());

        messiLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/messi.jpg"))); // NOI18N
        imgPanel.add(messiLB, "0");

        ronaldoLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/ronaldo.jpg"))); // NOI18N
        imgPanel.add(ronaldoLB, "1");

        salahLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/salah.jpg"))); // NOI18N
        imgPanel.add(salahLB, "2");

        getContentPane().add(imgPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    private void messiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messiBTActionPerformed
        CardLayout cl = (CardLayout)(imgPanel.getLayout());
        cl.show(imgPanel, "0");
    }//GEN-LAST:event_messiBTActionPerformed

    private void ronaldoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ronaldoBTActionPerformed
        CardLayout cl = (CardLayout)(imgPanel.getLayout());
        cl.show(imgPanel, "1");
    }//GEN-LAST:event_ronaldoBTActionPerformed

    private void salahBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salahBTActionPerformed
        CardLayout cl = (CardLayout)(imgPanel.getLayout());
        cl.show(imgPanel, "2");
    }//GEN-LAST:event_salahBTActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTPanel;
    private javax.swing.JButton exitBT;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JButton messiBT;
    private javax.swing.JLabel messiLB;
    private javax.swing.JButton ronaldoBT;
    private javax.swing.JLabel ronaldoLB;
    private javax.swing.JButton salahBT;
    private javax.swing.JLabel salahLB;
    // End of variables declaration//GEN-END:variables
}
