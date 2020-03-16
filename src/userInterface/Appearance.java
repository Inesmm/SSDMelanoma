/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javax.swing.JOptionPane;
import static userInterface.WelcomeFr.p;

/**
 *
 * @author enriquetunon
 */
public class Appearance extends javax.swing.JFrame {

    /**
     * Creates new form Appearance
     */
    public Appearance() {
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

        buttonGroup_Symmetry = new javax.swing.ButtonGroup();
        buttonGroup_Sharp_Borders = new javax.swing.ButtonGroup();
        buttonGroup_Diameter = new javax.swing.ButtonGroup();
        buttonGroup_Polychrome = new javax.swing.ButtonGroup();
        buttonGroup_Texture = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        Yes_Symmetry = new javax.swing.JRadioButton();
        No_Symmetry = new javax.swing.JRadioButton();
        Yes_Sharp = new javax.swing.JRadioButton();
        No_Sharp = new javax.swing.JRadioButton();
        Yes_Diameter = new javax.swing.JRadioButton();
        No_Diameter = new javax.swing.JRadioButton();
        Yes_Polychrome = new javax.swing.JRadioButton();
        No_Polychrome = new javax.swing.JRadioButton();
        Yes_Soft = new javax.swing.JRadioButton();
        No_Soft = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Is it symmetric?");

        jLabel2.setText("Does it have sharp borders?");

        jLabel3.setText("Is the diameter greater than 6?");

        jLabel4.setText("Is it symmetric?");

        jLabel5.setText("Does it have more than one color?");

        jLabel6.setText("Is it soft to the touch?");

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        buttonGroup_Symmetry.add(Yes_Symmetry);
        Yes_Symmetry.setText("Yes");
        Yes_Symmetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_SymmetryActionPerformed(evt);
            }
        });

        buttonGroup_Symmetry.add(No_Symmetry);
        No_Symmetry.setText("No");
        No_Symmetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_SymmetryActionPerformed(evt);
            }
        });

        buttonGroup_Sharp_Borders.add(Yes_Sharp);
        Yes_Sharp.setText("Yes");
        Yes_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_SharpActionPerformed(evt);
            }
        });

        buttonGroup_Sharp_Borders.add(No_Sharp);
        No_Sharp.setText("No");
        No_Sharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_SharpActionPerformed(evt);
            }
        });

        buttonGroup_Diameter.add(Yes_Diameter);
        Yes_Diameter.setText("Yes");
        Yes_Diameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_DiameterActionPerformed(evt);
            }
        });

        buttonGroup_Diameter.add(No_Diameter);
        No_Diameter.setText("No");
        No_Diameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_DiameterActionPerformed(evt);
            }
        });

        buttonGroup_Polychrome.add(Yes_Polychrome);
        Yes_Polychrome.setText("Yes");
        Yes_Polychrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_PolychromeActionPerformed(evt);
            }
        });

        buttonGroup_Polychrome.add(No_Polychrome);
        No_Polychrome.setText("No");
        No_Polychrome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_PolychromeActionPerformed(evt);
            }
        });

        buttonGroup_Texture.add(Yes_Soft);
        Yes_Soft.setText("Yes");
        Yes_Soft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_SoftActionPerformed(evt);
            }
        });

        buttonGroup_Texture.add(No_Soft);
        No_Soft.setText("No");
        No_Soft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_SoftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(Yes_Sharp)
                .addGap(18, 18, 18)
                .addComponent(No_Sharp)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Yes_Soft)
                                    .addGap(18, 18, 18)
                                    .addComponent(No_Soft))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(Yes_Polychrome)
                                    .addGap(18, 18, 18)
                                    .addComponent(No_Polychrome)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Yes_Diameter)
                        .addGap(18, 18, 18)
                        .addComponent(No_Diameter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(Yes_Symmetry)
                        .addGap(18, 18, 18)
                        .addComponent(No_Symmetry)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Next)
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(jLabel4)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Symmetry)
                    .addComponent(No_Symmetry))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Sharp)
                    .addComponent(No_Sharp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Diameter)
                    .addComponent(No_Diameter))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No_Polychrome)
                    .addComponent(Yes_Polychrome))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yes_Soft)
                    .addComponent(No_Soft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Next)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(316, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
       // TODO add your handling code here:
        if(Yes_Symmetry.isSelected()==false && No_Symmetry.isSelected()==false){
            JOptionPane.showMessageDialog(null, "No option was selected for symmetry. Please check again.");
        }
        else{
            if(Yes_Sharp.isSelected()==false && No_Sharp.isSelected()==false){
                JOptionPane.showMessageDialog(null, "No option was selected for sharp borders. Please check again.");
            }
            else{
                if(Yes_Diameter.isSelected()==false && No_Diameter.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "No option was selected for diameter. Please check again.");
                }
                else{
                    if(Yes_Polychrome.isSelected()==false && No_Polychrome.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "No option was selected for polychrome. Please check again.");
                    }
                        else{
                            if(Yes_Soft.isSelected()==false && No_Soft.isSelected()==false){
                            JOptionPane.showMessageDialog(null, "No option was selected for softness. Please check again.");
                            }
                        else{
                            System.out.println("Symmetry: " + p.getSymmetry() + "\n Sharp borders: " +p.getSharp_borders()+ "\n Diameter: " +p.getDiameter()+ "\n Polychrome: " +p.getPolychrome()+ " Softness: " +p.getSoft_texture()); //SOLO PARA COMPROBAR QUE GUARDA
                            this.setVisible(false);
                            Feelings feelingsFr = new Feelings();
                            feelingsFr.setVisible(true);
                        }
                    }
                }
            }
        }   
    }//GEN-LAST:event_NextActionPerformed

    private void Yes_SymmetryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_SymmetryActionPerformed
        String symmetric = (String) Yes_Symmetry.getActionCommand();
        WelcomeFr.p.setSymmetry(symmetric);
    }//GEN-LAST:event_Yes_SymmetryActionPerformed

    private void No_SymmetryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_SymmetryActionPerformed
        String symmetric = (String) No_Symmetry.getActionCommand();
        WelcomeFr.p.setSymmetry(symmetric);
    }//GEN-LAST:event_No_SymmetryActionPerformed

    private void Yes_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_SharpActionPerformed
        String sharp_borders = (String) Yes_Sharp.getActionCommand();
        WelcomeFr.p.setSharp_borders(sharp_borders);
    }//GEN-LAST:event_Yes_SharpActionPerformed

    private void No_SharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_SharpActionPerformed
        String sharp_borders = (String) No_Sharp.getActionCommand();
        WelcomeFr.p.setSharp_borders(sharp_borders);
    }//GEN-LAST:event_No_SharpActionPerformed

    private void Yes_DiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_DiameterActionPerformed
       String diameter = (String) Yes_Diameter.getActionCommand();
        WelcomeFr.p.setDiameter(diameter);
    }//GEN-LAST:event_Yes_DiameterActionPerformed

    private void No_DiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_DiameterActionPerformed
        String diameter = (String) No_Diameter.getActionCommand();
        WelcomeFr.p.setDiameter(diameter);
    }//GEN-LAST:event_No_DiameterActionPerformed

    private void Yes_PolychromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_PolychromeActionPerformed
        String polychrome = (String) Yes_Polychrome.getActionCommand();
        WelcomeFr.p.setPolychrome(polychrome);
    }//GEN-LAST:event_Yes_PolychromeActionPerformed

    private void No_PolychromeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_PolychromeActionPerformed
        String polychrome = (String) No_Polychrome.getActionCommand();
        WelcomeFr.p.setPolychrome(polychrome);
    }//GEN-LAST:event_No_PolychromeActionPerformed

    private void Yes_SoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_SoftActionPerformed
        String soft_texture = (String) Yes_Soft.getActionCommand();
        WelcomeFr.p.setSoft_texture(soft_texture);
    }//GEN-LAST:event_Yes_SoftActionPerformed

    private void No_SoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_SoftActionPerformed
        String soft_texture = (String) No_Soft.getActionCommand();
        WelcomeFr.p.setSoft_texture(soft_texture);
    }//GEN-LAST:event_No_SoftActionPerformed

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
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appearance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appearance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JRadioButton No_Diameter;
    private javax.swing.JRadioButton No_Polychrome;
    private javax.swing.JRadioButton No_Sharp;
    private javax.swing.JRadioButton No_Soft;
    private javax.swing.JRadioButton No_Symmetry;
    private javax.swing.JRadioButton Yes_Diameter;
    private javax.swing.JRadioButton Yes_Polychrome;
    private javax.swing.JRadioButton Yes_Sharp;
    private javax.swing.JRadioButton Yes_Soft;
    private javax.swing.JRadioButton Yes_Symmetry;
    private javax.swing.ButtonGroup buttonGroup_Diameter;
    private javax.swing.ButtonGroup buttonGroup_Polychrome;
    private javax.swing.ButtonGroup buttonGroup_Sharp_Borders;
    private javax.swing.ButtonGroup buttonGroup_Symmetry;
    private javax.swing.ButtonGroup buttonGroup_Texture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
