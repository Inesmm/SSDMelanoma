/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import dssmoles.Patient;
import static userInterface.Welcome.p;

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

        jLabel1 = new javax.swing.JLabel();
        Yes_Bleed = new javax.swing.JButton();
        No_Bleed = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Yes_Pain = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        No_Pain = new javax.swing.JButton();
        Yes_Itch = new javax.swing.JButton();
        No_Itch = new javax.swing.JButton();
        Yes_Bulky = new javax.swing.JButton();
        No_Bulky = new javax.swing.JButton();
        Next3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Does your mole bleed?");

        Yes_Bleed.setText("Yes");
        Yes_Bleed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_BleedActionPerformed(evt);
            }
        });

        No_Bleed.setText("No");
        No_Bleed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_BleedActionPerformed(evt);
            }
        });

        jLabel2.setText("Do you have pain?");

        Yes_Pain.setText("Yes");
        Yes_Pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_PainActionPerformed(evt);
            }
        });

        jLabel3.setText("Does the mole itch?");

        jLabel4.setText("Is your mole bulky");

        No_Pain.setText("No");
        No_Pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_PainActionPerformed(evt);
            }
        });

        Yes_Itch.setText("Yes");
        Yes_Itch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_ItchActionPerformed(evt);
            }
        });

        No_Itch.setText("No");
        No_Itch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_ItchActionPerformed(evt);
            }
        });

        Yes_Bulky.setText("Yes");
        Yes_Bulky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_BulkyActionPerformed(evt);
            }
        });

        No_Bulky.setText("No");
        No_Bulky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_BulkyActionPerformed(evt);
            }
        });

        Next3.setText("Next");
        Next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Next3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Yes_Bulky)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(No_Bulky, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Yes_Itch)
                                    .addGap(18, 18, 18)
                                    .addComponent(No_Itch, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Yes_Pain)
                                    .addGap(18, 18, 18)
                                    .addComponent(No_Pain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Yes_Bleed)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(No_Bleed, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Bleed)
                    .addComponent(No_Bleed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Pain)
                    .addComponent(No_Pain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Itch)
                    .addComponent(No_Itch))
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Bulky)
                    .addComponent(No_Bulky)
                    .addComponent(Next3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Yes_BleedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_BleedActionPerformed
        String bleeding = (String) Yes_Bleed.getActionCommand();
        Welcome.p.setBleeding(bleeding);
    }//GEN-LAST:event_Yes_BleedActionPerformed

    private void No_BleedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_BleedActionPerformed
        String bleeding = (String) No_Bleed.getActionCommand();
        Welcome.p.setBleeding(bleeding);
    }//GEN-LAST:event_No_BleedActionPerformed

    private void Yes_PainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_PainActionPerformed
        String pain = (String) Yes_Pain.getActionCommand();
        Welcome.p.setPain(pain);
    }//GEN-LAST:event_Yes_PainActionPerformed

    private void No_PainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_PainActionPerformed
        String pain = (String) No_Pain.getActionCommand();
        Welcome.p.setPain(pain);
    }//GEN-LAST:event_No_PainActionPerformed

    private void Yes_ItchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_ItchActionPerformed
        String itchiness = (String) Yes_Itch.getActionCommand();
        Welcome.p.setItchiness(itchiness);
    }//GEN-LAST:event_Yes_ItchActionPerformed

    private void No_ItchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_ItchActionPerformed
        String itchiness = (String) No_Itch.getActionCommand();
        Welcome.p.setItchiness(itchiness);
    }//GEN-LAST:event_No_ItchActionPerformed

    private void Yes_BulkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_BulkyActionPerformed
        String bulky = (String) Yes_Bulky.getActionCommand();
        Welcome.p.setBulky(bulky);
    }//GEN-LAST:event_Yes_BulkyActionPerformed

    private void No_BulkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_BulkyActionPerformed
        String bulky = (String) No_Bulky.getActionCommand();
        Welcome.p.setBulky(bulky);
    }//GEN-LAST:event_No_BulkyActionPerformed

    private void Next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next3ActionPerformed
        System.out.println("Bleeding: "+ p.getBleeding() + "\n Pain: " +p.getPain()+ "\n Itchiness: " +p.getItchiness() +"\n Bulky: "+p.getBulky() + " Nombre: " +p.getName()); //SOLO PARA COMPROBAR QUE GUARDA
        this.setVisible(false);
        ExtraInfo extraInfoFr = new ExtraInfo();
        extraInfoFr.setVisible(true);
        
    }//GEN-LAST:event_Next3ActionPerformed
                               

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
    private javax.swing.JButton Next3;
    private javax.swing.JButton No_Bleed;
    private javax.swing.JButton No_Bulky;
    private javax.swing.JButton No_Itch;
    private javax.swing.JButton No_Pain;
    private javax.swing.JButton Yes_Bleed;
    private javax.swing.JButton Yes_Bulky;
    private javax.swing.JButton Yes_Itch;
    private javax.swing.JButton Yes_Pain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
