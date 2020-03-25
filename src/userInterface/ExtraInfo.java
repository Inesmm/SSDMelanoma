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
        jPanel1 = new javax.swing.JPanel();
        jLabel_moles = new javax.swing.JLabel();
        More_Moles = new javax.swing.JRadioButton();
        Less_Moles = new javax.swing.JRadioButton();
        jLabel_tone = new javax.swing.JLabel();
        SkinTone = new javax.swing.JComboBox<>();
        jLabel_family = new javax.swing.JLabel();
        Yes_Family = new javax.swing.JRadioButton();
        No_Family = new javax.swing.JRadioButton();
        NextButton = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel_moles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_moles.setText("Do you have more or less than 50 moles?");

        More_Moles.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_number_moles.add(More_Moles);
        More_Moles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        More_Moles.setText("More");
        More_Moles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                More_MolesActionPerformed(evt);
            }
        });

        Less_Moles.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup_number_moles.add(Less_Moles);
        Less_Moles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Less_Moles.setText("Less");
        Less_Moles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Less_MolesActionPerformed(evt);
            }
        });

        jLabel_tone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_tone.setText("What is your skin tone?");

        SkinTone.setBackground(new java.awt.Color(204, 255, 255));
        SkinTone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SkinTone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select option-", "Fair", "Light brown", "Dark brown" }));
        SkinTone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkinToneActionPerformed(evt);
            }
        });

        jLabel_family.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_family.setText("Are there any cases of melanoma in your family?");

        Yes_Family.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(Yes_Family);
        Yes_Family.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes_Family.setText("Yes");
        Yes_Family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_FamilyActionPerformed(evt);
            }
        });

        No_Family.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(No_Family);
        No_Family.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No_Family.setText("No");
        No_Family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_FamilyActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        Back_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Back_button.setText("Back");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(More_Moles)
                        .addGap(81, 81, 81)
                        .addComponent(Less_Moles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(Yes_Family)
                        .addGap(97, 97, 97)
                        .addComponent(No_Family))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_tone)
                                .addGap(37, 37, 37)
                                .addComponent(SkinTone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_moles)
                            .addComponent(jLabel_family))))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(Back_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextButton)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel_moles)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Less_Moles)
                    .addComponent(More_Moles))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tone)
                    .addComponent(SkinTone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jLabel_family)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Family)
                    .addComponent(No_Family))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton)
                    .addComponent(Back_button))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                jLabel_moles.setBorder(new LineBorder(Color.red, 2));
                JOptionPane.showMessageDialog(null, "No option was selected for number of moles. Please check again.");
            }
            else{
                if(SkinTone.getSelectedItem() == "-Select option-"){
                    jLabel_tone.setBorder(new LineBorder(Color.red, 2));
                    JOptionPane.showMessageDialog(null, "No option was selected for skin tone. Please check again.");
                }
                else{
                    if(Yes_Family.isSelected()==false && No_Family.isSelected()==false){
                        jLabel_family.setBorder(new LineBorder(Color.red, 2));
                        JOptionPane.showMessageDialog(null, "No option was selected for family history. Please check again.");
                    }
                    else{
                        System.out.println(WelcomeFr.p.getNumber_moles()+ WelcomeFr.p.getSkin_tone()+ WelcomeFr.p.getFamily_history()); //SOLO PARA COMPROBAR QUE LO GUARDA BIEN
                        this.setVisible(false);
                        DiagnosisFr diagnoseFr= new DiagnosisFr();
                        diagnoseFr.setVisible(true);
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

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        this.setVisible(false);
        Feelings feelingsFr = new Feelings();
        feelingsFr.setVisible(true);
    }//GEN-LAST:event_Back_buttonActionPerformed

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
    private javax.swing.JButton Back_button;
    private javax.swing.JRadioButton Less_Moles;
    private javax.swing.JRadioButton More_Moles;
    private javax.swing.JButton NextButton;
    private javax.swing.JRadioButton No_Family;
    private javax.swing.JComboBox<String> SkinTone;
    private javax.swing.JRadioButton Yes_Family;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup_number_moles;
    private javax.swing.JLabel jLabel_family;
    private javax.swing.JLabel jLabel_moles;
    private javax.swing.JLabel jLabel_tone;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
