/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import static userInterface.WelcomeFr.p;

/**
 *
 * @author enriquetunon
 */
public class SharpBordersFr extends javax.swing.JFrame {

    /**
     * Creates new form SharpBordersFr
     */
    public SharpBordersFr() {
        initComponents();
        this.setSize(new Dimension(700,413));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        Yes_Sharp = new javax.swing.JRadioButton();
        No_Sharp = new javax.swing.JRadioButton();
        Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel.setText("Does it have sharp borders?");

        Yes_Sharp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Sharp.setText("Yes");
        Yes_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_SharpActionPerformed(evt);
            }
        });

        No_Sharp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Sharp.setText("No");
        No_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_SharpActionPerformed(evt);
            }
        });

        Next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Yes_Sharp)
                        .addGap(185, 185, 185)
                        .addComponent(No_Sharp)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Next)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No_Sharp)
                    .addComponent(Yes_Sharp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(Next)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Yes_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_SharpActionPerformed
        String sharp_borders = (String) Yes_Sharp.getActionCommand();
        WelcomeFr.p.setSharp_borders(sharp_borders);
    }//GEN-LAST:event_Yes_SharpActionPerformed

    private void No_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_SharpActionPerformed
        String sharp_borders = (String) No_Sharp.getActionCommand();
        WelcomeFr.p.setSharp_borders(sharp_borders);
    }//GEN-LAST:event_No_SharpActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        if(Yes_Sharp.isSelected()==false && No_Sharp.isSelected()==false){
            jLabel.setBorder(new LineBorder(Color.red, 2));
            JOptionPane.showMessageDialog(null, "No option was selected for sharp borders. Please check again.");
        }
        else{
            System.out.println("\n Sharp borders: " + p.getSharp_borders());
            this.setVisible(false);
            DiameterFr diameterFr = new DiameterFr();
            diameterFr.setVisible(true);
        }
    }//GEN-LAST:event_NextActionPerformed

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
            java.util.logging.Logger.getLogger(SharpBordersFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SharpBordersFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SharpBordersFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SharpBordersFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SharpBordersFr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JRadioButton No_Sharp;
    private javax.swing.JRadioButton Yes_Sharp;
    private javax.swing.JLabel jLabel;
    // End of variables declaration//GEN-END:variables
}
