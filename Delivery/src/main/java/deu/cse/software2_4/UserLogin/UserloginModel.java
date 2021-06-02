/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.UserLogin;

import deu.cse.software2_4.Order.Chienese_restaurant_info;
import deu.cse.software2_4.Order.Japanese_restaurant_info;
import deu.cse.software2_4.Order.Korean_restaurant_info;
import deu.cse.software2_4.Order.Western_restaurant_info;


/**
 *
 * @author 이창희
 */
public class UserloginModel extends javax.swing.JFrame {
    /**
     * Creates new form UserloginModel
     */
    public UserloginModel() {
        initComponents();
        setSize(420, 600);
        setLocationRelativeTo(null);
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
        jButton_Korean = new javax.swing.JButton();
        jButton_Chienese = new javax.swing.JButton();
        jButton_Western = new javax.swing.JButton();
        jButton_Japanese = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel1.setText("메뉴/주소 선택");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_Korean.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton_Korean.setText("한식");
        jButton_Korean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KoreanActionPerformed(evt);
            }
        });

        jButton_Chienese.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton_Chienese.setText("중식");
        jButton_Chienese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChieneseActionPerformed(evt);
            }
        });

        jButton_Western.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton_Western.setText("양식");
        jButton_Western.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WesternActionPerformed(evt);
            }
        });

        jButton_Japanese.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton_Japanese.setText("일식");
        jButton_Japanese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JapaneseActionPerformed(evt);
            }
        });

        jButton_Back.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton_Back.setText("뒤로 가기");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Korean, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Japanese, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(56, 56, 56)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Western, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Chienese, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Back))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Korean, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Chienese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Japanese, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Western, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163)
                .addComponent(jButton_Back))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ChieneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChieneseActionPerformed
    
    Chienese_restaurant_info object = new Chienese_restaurant_info();
    object.setVisible(true);
    }//GEN-LAST:event_jButton_ChieneseActionPerformed

    private void jButton_KoreanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KoreanActionPerformed
    Korean_restaurant_info object = new Korean_restaurant_info();
    object.setVisible(true);
    }//GEN-LAST:event_jButton_KoreanActionPerformed

    private void jButton_JapaneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JapaneseActionPerformed
    
    Japanese_restaurant_info object = new Japanese_restaurant_info();
    object.setVisible(true); 
    }//GEN-LAST:event_jButton_JapaneseActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
    dispose();
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_WesternActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WesternActionPerformed
    
    Western_restaurant_info object = new Western_restaurant_info();
    object.setVisible(true); 
    }//GEN-LAST:event_jButton_WesternActionPerformed

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
            java.util.logging.Logger.getLogger(UserloginModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserloginModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserloginModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserloginModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserloginModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Chienese;
    private javax.swing.JButton jButton_Japanese;
    private javax.swing.JButton jButton_Korean;
    private javax.swing.JButton jButton_Western;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
