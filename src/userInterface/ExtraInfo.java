/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import dssmoles.Patient;
import java.awt.Color;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import net.sf.clipsrules.jni.CLIPSLoadException;
import userInterface.WelcomeFr;

/**
 *
 * @author ainhoarey
 */
public class ExtraInfo extends javax.swing.JFrame {

    /**
     * Creates new form ExtraInfo
     */
    public ExtraInfo() {
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

        buttonGroup_number_moles = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SkinTone = new javax.swing.JComboBox<>();
        NextButton = new javax.swing.JButton();
        More_Moles = new javax.swing.JRadioButton();
        Less_Moles = new javax.swing.JRadioButton();
        Yes_Family = new javax.swing.JRadioButton();
        No_Family = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Do you have more or less than 50 moles?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("What is your skin tone?");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Are there any cases of melanoma in your family?");

        SkinTone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SkinTone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select option-", "Fair", "Light brown", "Dark brown" }));
        SkinTone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkinToneActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        buttonGroup_number_moles.add(More_Moles);
        More_Moles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        More_Moles.setText("More");
        More_Moles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                More_MolesActionPerformed(evt);
            }
        });

        buttonGroup_number_moles.add(Less_Moles);
        Less_Moles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Less_Moles.setText("Less");
        Less_Moles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Less_MolesActionPerformed(evt);
            }
        });

        buttonGroup1.add(Yes_Family);
        Yes_Family.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Family.setText("Yes");
        Yes_Family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_FamilyActionPerformed(evt);
            }
        });

        buttonGroup1.add(No_Family);
        No_Family.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Family.setText("No");
        No_Family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_FamilyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(More_Moles)
                                .addGap(39, 39, 39)
                                .addComponent(Less_Moles))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(Yes_Family)
                                .addGap(44, 44, 44)
                                .addComponent(No_Family))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(SkinTone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NextButton)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(More_Moles)
                    .addComponent(Less_Moles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(SkinTone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No_Family)
                    .addComponent(Yes_Family))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NextButton)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkinToneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkinToneActionPerformed
        // TODO add your handling code here:
        String skin_tone = (String) SkinTone.getSelectedItem();
        WelcomeFr.p.setSkin_tone(skin_tone);
    }//GEN-LAST:event_SkinToneActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        try {
            // TODO add your handling code here:
            if (More_Moles.isSelected()==false && Less_Moles.isSelected()==false){
                JOptionPane.showMessageDialog(null, "No option was selected for number of moles. Please check again.");
            }
            else{
                if(SkinTone.getSelectedItem() == "-Select option-"){
                    JOptionPane.showMessageDialog(null, "No option was selected for skin tone. Please check again.");
                }
                else{
                    if(Yes_Family.isSelected()==false && No_Family.isSelected()==false){
                        JOptionPane.showMessageDialog(null, "No option was selected for family history. Please check again.");
                    }
                    else{
                        System.out.println(WelcomeFr.p.getNumber_moles()+ WelcomeFr.p.getSkin_tone()+ WelcomeFr.p.getFamily_history()); //SOLO PARA COMPROBAR QUE LO GUARDA BIEN
                        this.setVisible(false);
                        DiagnosisFr diagnosisFr= new DiagnosisFr();
                        diagnosisFr.setVisible(true);
                    }
                }
            }
        } catch (CLIPSLoadException ex) {
            Logger.getLogger(ExtraInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void More_MolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_More_MolesActionPerformed
        String number_moles = (String) More_Moles.getActionCommand();
        WelcomeFr.p.setNumber_moles(number_moles);
    }//GEN-LAST:event_More_MolesActionPerformed

    private void Less_MolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Less_MolesActionPerformed
        String number_moles = (String) Less_Moles.getActionCommand();
        WelcomeFr.p.setNumber_moles(number_moles);
    }//GEN-LAST:event_Less_MolesActionPerformed

    private void Yes_FamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_FamilyActionPerformed
        String family_history = (String) Yes_Family.getActionCommand();
        WelcomeFr.p.setFamily_history(family_history);
    }//GEN-LAST:event_Yes_FamilyActionPerformed

    private void No_FamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_FamilyActionPerformed
         String family_history = (String) No_Family.getActionCommand();
        WelcomeFr.p.setFamily_history(family_history);
    }//GEN-LAST:event_No_FamilyActionPerformed

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
            java.util.logging.Logger.getLogger(ExtraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExtraInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Less_Moles;
    private javax.swing.JRadioButton More_Moles;
    private javax.swing.JButton NextButton;
    private javax.swing.JRadioButton No_Family;
    private javax.swing.JComboBox<String> SkinTone;
    private javax.swing.JRadioButton Yes_Family;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup_number_moles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
