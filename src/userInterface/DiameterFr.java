/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.Dimension;
import javax.swing.JOptionPane;


/**
 *
 * @author inesu
 */
public class DiameterFr extends javax.swing.JFrame {

    /**
     * Creates new form DiameterFr
     */
    public DiameterFr() {
        initComponents();
        this.setSize(new Dimension(677, 414));
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
        jLabel1 = new javax.swing.JLabel();
        Next_Diameter = new javax.swing.JButton();
        Yes_Diameter = new javax.swing.JRadioButton();
        No_Diameter = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(750, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Is the diameter greater than 6mm?");

        Next_Diameter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Next_Diameter.setText("Next");
        Next_Diameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_DiameterActionPerformed(evt);
            }
        });

        buttonGroup1.add(Yes_Diameter);
        Yes_Diameter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Diameter.setText("Yes");
        Yes_Diameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_DiameterActionPerformed(evt);
            }
        });

        buttonGroup1.add(No_Diameter);
        No_Diameter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Diameter.setText("No");
        No_Diameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_DiameterActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diameter_.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(Yes_Diameter)
                        .addContainerGap(199, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Next_Diameter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(No_Diameter)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Diameter)
                    .addComponent(No_Diameter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Next_Diameter)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next_DiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_DiameterActionPerformed
        if(Yes_Diameter.isSelected() == false && No_Diameter.isSelected()== false){
        JOptionPane.showMessageDialog(null, "No option was selected for diameter. Please check again.");
        
        }else {
        this.setVisible(false);
        PolychromeFr polychromeFr = new PolychromeFr();
        polychromeFr.setVisible(true);
        
        }
    }//GEN-LAST:event_Next_DiameterActionPerformed

    private void Yes_DiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_DiameterActionPerformed
        String diameter = (String) Yes_Diameter.getActionCommand();
        WelcomeFr.p.setDiameter(diameter);
    }//GEN-LAST:event_Yes_DiameterActionPerformed

    private void No_DiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_DiameterActionPerformed
        String diameter = (String) No_Diameter.getActionCommand();
        WelcomeFr.p.setDiameter(diameter);
    }//GEN-LAST:event_No_DiameterActionPerformed

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
            java.util.logging.Logger.getLogger(DiameterFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiameterFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiameterFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiameterFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiameterFr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next_Diameter;
    private javax.swing.JRadioButton No_Diameter;
    private javax.swing.JRadioButton Yes_Diameter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
