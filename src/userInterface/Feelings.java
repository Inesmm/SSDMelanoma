/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javax.swing.JOptionPane;
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

        buttonGroup_Bleeding = new javax.swing.ButtonGroup();
        buttonGroup_Pain = new javax.swing.ButtonGroup();
        buttonGroup_Itchiness = new javax.swing.ButtonGroup();
        buttonGroup_Bulky = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Next3 = new javax.swing.JButton();
        Yes_Bleed = new javax.swing.JRadioButton();
        No_Bleed = new javax.swing.JRadioButton();
        Yes_Pain = new javax.swing.JRadioButton();
        No_Pain = new javax.swing.JRadioButton();
        Yes_Itch = new javax.swing.JRadioButton();
        No_Itch = new javax.swing.JRadioButton();
        Yes_Bulky = new javax.swing.JRadioButton();
        No_Bulky = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Does your mole bleed?");

        jLabel2.setText("Do you have pain?");

        jLabel3.setText("Does the mole itch?");

        jLabel4.setText("Is your mole bulky?");

        Next3.setText("Next");
        Next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next3ActionPerformed(evt);
            }
        });

        buttonGroup_Bleeding.add(Yes_Bleed);
        Yes_Bleed.setText("Yes");
        Yes_Bleed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_BleedActionPerformed(evt);
            }
        });

        buttonGroup_Bleeding.add(No_Bleed);
        No_Bleed.setText("No");
        No_Bleed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_BleedActionPerformed(evt);
            }
        });

        buttonGroup_Pain.add(Yes_Pain);
        Yes_Pain.setText("Yes");
        Yes_Pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_PainActionPerformed(evt);
            }
        });

        buttonGroup_Pain.add(No_Pain);
        No_Pain.setText("No");
        No_Pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_PainActionPerformed(evt);
            }
        });

        buttonGroup_Itchiness.add(Yes_Itch);
        Yes_Itch.setText("Yes");
        Yes_Itch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_ItchActionPerformed(evt);
            }
        });

        buttonGroup_Itchiness.add(No_Itch);
        No_Itch.setText("No");
        No_Itch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_ItchActionPerformed(evt);
            }
        });

        buttonGroup_Bulky.add(Yes_Bulky);
        Yes_Bulky.setText("Yes");
        Yes_Bulky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_BulkyActionPerformed(evt);
            }
        });

        buttonGroup_Bulky.add(No_Bulky);
        No_Bulky.setText("No");
        No_Bulky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_BulkyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Yes_Bulky)
                                    .addGap(18, 18, 18)
                                    .addComponent(No_Bulky, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Yes_Pain)
                                            .addGap(18, 18, 18)
                                            .addComponent(No_Pain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Yes_Bleed)
                                            .addGap(18, 18, 18)
                                            .addComponent(No_Bleed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Yes_Itch)
                                            .addGap(18, 18, 18)
                                            .addComponent(No_Itch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(164, 164, 164)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(jLabel2)
                    .addGap(172, 172, 172)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Next3)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Bleed)
                    .addComponent(No_Bleed))
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Pain)
                    .addComponent(No_Pain))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Itch)
                    .addComponent(No_Itch))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Bulky)
                    .addComponent(No_Bulky))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Next3)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next3ActionPerformed
        if(Yes_Bleed.isSelected()==false && No_Bleed.isSelected()==false){
            JOptionPane.showMessageDialog(null, "No option was selected for bleeding. Please check again.");
        }
        else{
            if(Yes_Pain.isSelected()==false && No_Pain.isSelected()==false){
                JOptionPane.showMessageDialog(null, "No option was selected for pain. Please check again.");
            }
            else{
                if(Yes_Itch.isSelected()==false && No_Itch.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "No option was selected for itchiness. Please check again.");
                }
                else{
                    if(Yes_Bulky.isSelected()==false && No_Bulky.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "No option was selected for bulky. Please check again.");
                    }
                    else{
                        System.out.println("Bleeding: "+ p.getBleeding() + "\n Pain: " +p.getPain()+ "\n Itchiness: " +p.getItchiness() +"\n Bulky: "+p.getBulky() + " Nombre: " +p.getName()); //SOLO PARA COMPROBAR QUE GUARDA
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
    private javax.swing.JRadioButton No_Bleed;
    private javax.swing.JRadioButton No_Bulky;
    private javax.swing.JRadioButton No_Itch;
    private javax.swing.JRadioButton No_Pain;
    private javax.swing.JRadioButton Yes_Bleed;
    private javax.swing.JRadioButton Yes_Bulky;
    private javax.swing.JRadioButton Yes_Itch;
    private javax.swing.JRadioButton Yes_Pain;
    private javax.swing.ButtonGroup buttonGroup_Bleeding;
    private javax.swing.ButtonGroup buttonGroup_Bulky;
    private javax.swing.ButtonGroup buttonGroup_Itchiness;
    private javax.swing.ButtonGroup buttonGroup_Pain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
