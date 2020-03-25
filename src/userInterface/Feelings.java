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
 * @author inesu
 */
public class Feelings extends javax.swing.JFrame {
  
    /**
     * Creates new form Feelings
     */
    public Feelings() {
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

        buttonGroup_Bleeding = new javax.swing.ButtonGroup();
        buttonGroup_Pain = new javax.swing.ButtonGroup();
        buttonGroup_Itchiness = new javax.swing.ButtonGroup();
        buttonGroup_Soft = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Yes_Bleed = new javax.swing.JRadioButton();
        No_Bleed = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Yes_Pain = new javax.swing.JRadioButton();
        No_Pain = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Yes_Itch = new javax.swing.JRadioButton();
        No_Itch = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Yes_Soft = new javax.swing.JRadioButton();
        No_Soft = new javax.swing.JRadioButton();
        Next3 = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Does your mole bleed?");

        Yes_Bleed.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Bleeding.add(Yes_Bleed);
        Yes_Bleed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Bleed.setText("Yes");
        Yes_Bleed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_BleedActionPerformed(evt);
            }
        });

        No_Bleed.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Bleeding.add(No_Bleed);
        No_Bleed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Bleed.setText("No");
        No_Bleed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_BleedActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Do you have pain?");

        Yes_Pain.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Pain.add(Yes_Pain);
        Yes_Pain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Pain.setText("Yes");
        Yes_Pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_PainActionPerformed(evt);
            }
        });

        No_Pain.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Pain.add(No_Pain);
        No_Pain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Pain.setText("No");
        No_Pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_PainActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Does the mole itch?");

        Yes_Itch.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Itchiness.add(Yes_Itch);
        Yes_Itch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Itch.setText("Yes");
        Yes_Itch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_ItchActionPerformed(evt);
            }
        });

        No_Itch.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Itchiness.add(No_Itch);
        No_Itch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Itch.setText("No");
        No_Itch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_ItchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Is your mole soft to the touch?");

        Yes_Soft.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Soft.add(Yes_Soft);
        Yes_Soft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Soft.setText("Yes");
        Yes_Soft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_SoftActionPerformed(evt);
            }
        });

        No_Soft.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_Soft.add(No_Soft);
        No_Soft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Soft.setText("No");
        No_Soft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_SoftActionPerformed(evt);
            }
        });

        Next3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Next3.setText("Next");
        Next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next3ActionPerformed(evt);
            }
        });

        Back_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Next3)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Yes_Pain)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(No_Pain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Yes_Bleed)
                                        .addGap(49, 49, 49)
                                        .addComponent(No_Bleed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Yes_Itch)
                                .addGap(50, 50, 50)
                                .addComponent(No_Itch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Yes_Soft)
                                .addGap(61, 61, 61)
                                .addComponent(No_Soft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Bleed)
                    .addComponent(No_Bleed)
                    .addComponent(Yes_Itch)
                    .addComponent(No_Itch))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Pain)
                    .addComponent(No_Pain)
                    .addComponent(Yes_Soft)
                    .addComponent(No_Soft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next3)
                    .addComponent(Back_Button))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next3ActionPerformed
        if(Yes_Bleed.isSelected()==false && No_Bleed.isSelected()==false){
            jLabel1.setBorder(new LineBorder(Color.red, 2));
            JOptionPane.showMessageDialog(null, "No option was selected for bleeding. Please check again.");
        }
        else{
            if(Yes_Pain.isSelected()==false && No_Pain.isSelected()==false){
                jLabel2.setBorder(new LineBorder(Color.red, 2));
                JOptionPane.showMessageDialog(null, "No option was selected for pain. Please check again.");
            }
            else{
                if(Yes_Itch.isSelected()==false && No_Itch.isSelected()==false){
                    jLabel3.setBorder(new LineBorder(Color.red, 2));
                    JOptionPane.showMessageDialog(null, "No option was selected for itchiness. Please check again.");
                }
                else{
                    if(Yes_Soft.isSelected()==false && No_Soft.isSelected()==false){
                        jLabel4.setBorder(new LineBorder(Color.red, 2));
                    JOptionPane.showMessageDialog(null, "No option was selected for softness. Please check again.");
                    }
                    else{
                        System.out.println("Bleeding: "+ p.getBleeding() + "\n Pain: " +p.getPain()+ "\n Itchiness: " +p.getItchiness() +"\n Bulky: "+p.getSoft_texture() + " Nombre: " +p.getName()); //SOLO PARA COMPROBAR QUE GUARDA
                        this.setVisible(false);
                        ExtraInfo extraInfoFr = new ExtraInfo();
                        extraInfoFr.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_Next3ActionPerformed

    private void Yes_BleedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_BleedActionPerformed
       String bleeding = (String) Yes_Bleed.getActionCommand();
       WelcomeFr.p.setBleeding(bleeding);
    }//GEN-LAST:event_Yes_BleedActionPerformed

    private void No_BleedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_BleedActionPerformed
        String bleeding = (String) No_Bleed.getActionCommand();
        WelcomeFr.p.setBleeding(bleeding);
    }//GEN-LAST:event_No_BleedActionPerformed

    private void Yes_PainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_PainActionPerformed
        String pain = (String) Yes_Pain.getActionCommand();
        WelcomeFr.p.setPain(pain);
    }//GEN-LAST:event_Yes_PainActionPerformed

    private void No_PainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_PainActionPerformed
        String pain = (String) No_Pain.getActionCommand();
        WelcomeFr.p.setPain(pain);
    }//GEN-LAST:event_No_PainActionPerformed

    private void Yes_ItchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_ItchActionPerformed
        String itchiness = (String) Yes_Itch.getActionCommand();
        WelcomeFr.p.setItchiness(itchiness);
    }//GEN-LAST:event_Yes_ItchActionPerformed

    private void No_ItchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_ItchActionPerformed
        String itchiness = (String) No_Itch.getActionCommand();
        WelcomeFr.p.setItchiness(itchiness);
    }//GEN-LAST:event_No_ItchActionPerformed

    private void Yes_SoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_SoftActionPerformed
        String soft = (String) Yes_Soft.getActionCommand();
        WelcomeFr.p.setSoft_texture(soft);
    }//GEN-LAST:event_Yes_SoftActionPerformed

    private void No_SoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_SoftActionPerformed
        String soft = (String) No_Soft.getActionCommand();
        WelcomeFr.p.setSoft_texture(soft);
    }//GEN-LAST:event_No_SoftActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        this.setVisible(false);
        BulkyFr bulkyFr = new BulkyFr();
        bulkyFr.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed
                               

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
            java.util.logging.Logger.getLogger(Feelings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feelings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feelings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feelings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feelings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Next3;
    private javax.swing.JRadioButton No_Bleed;
    private javax.swing.JRadioButton No_Itch;
    private javax.swing.JRadioButton No_Pain;
    private javax.swing.JRadioButton No_Soft;
    private javax.swing.JRadioButton Yes_Bleed;
    private javax.swing.JRadioButton Yes_Itch;
    private javax.swing.JRadioButton Yes_Pain;
    private javax.swing.JRadioButton Yes_Soft;
    private javax.swing.ButtonGroup buttonGroup_Bleeding;
    private javax.swing.ButtonGroup buttonGroup_Itchiness;
    private javax.swing.ButtonGroup buttonGroup_Pain;
    private javax.swing.ButtonGroup buttonGroup_Soft;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
