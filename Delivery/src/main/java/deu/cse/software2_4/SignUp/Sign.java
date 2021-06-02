/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.SignUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author tlatl
 */
public class Sign extends javax.swing.JFrame {

    ButtonGroup user_option = new ButtonGroup();

    /**
     * Creates new form Sign
     */
    public Sign() {
        initComponents();
        setSize(420, 600);
        setLocationRelativeTo(null);
        user_option.add(user);
        user_option.add(oner);
        onernum.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        residentnum = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        onernum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        user = new javax.swing.JRadioButton();
        oner = new javax.swing.JRadioButton();
        pwcheck = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("회원가입 완료");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 211, 30));

        name.setName(""); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 178, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 178, -1));
        getContentPane().add(residentnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 178, -1));
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 178, -1));

        address.setName(""); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 178, -1));
        getContentPane().add(onernum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 190, -1));

        jLabel1.setText("이름 : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 39, 20));

        jLabel2.setText("ID : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 39, 20));

        jLabel3.setText("PW 확인 : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, 20));

        jLabel4.setText("주민등록번호 : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 20));

        jLabel5.setText("전화번호 : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 70, 20));

        jLabel6.setText("주소 : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 50, 20));

        jLabel7.setText("사업자등록번호 : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 20));

        user.setSelected(true);
        user.setText("개인");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 70, -1));

        oner.setSelected(true);
        oner.setText("사업자");
        oner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onerActionPerformed(evt);
            }
        });
        getContentPane().add(oner, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        pwcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwcheckActionPerformed(evt);
            }
        });
        getContentPane().add(pwcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 180, -1));

        jButton3.setText("중복확인");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, -1));
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, -1));

        jLabel8.setText("PW : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 39, 20));

        jButton4.setText("뒤로가기");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String userinfo;
        String[] userArr;
        boolean userCheck = true;
        FileInputStream input;

        if (id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요");
        } else {
            try {

                input = new FileInputStream("C:\\Users\\tlatl\\Desktop\\Delivery2\\Delivery\\DB\\User.txt");
                InputStreamReader reader = new InputStreamReader(input, "UTF-8");
                BufferedReader in = new BufferedReader(reader);

                while ((userinfo = in.readLine()) != null) {
                    userArr = userinfo.split("/");
                    if ((id.getText()).equals(userArr[4])) {
                        userCheck = false;
                    }
                }

                if (userCheck == false) {
                    JOptionPane.showMessageDialog(null, "아이디가 이미 존재합니다.");
                    id.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "사용가능한 아이디 입니다.");
                    id.setEnabled(false);
                }
                in.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        User user;
        if(oner.isSelected()){
            
        user = new UserBuilder(EnumUserRole.OWNER)
                                    .buildAddress(address.getText())
                                    .buildID(id.getText())
                                    .buildName(name.getText())
                                    .buildPW(pw.getText())
                                    .buildPhone(phone.getText())
                                    .buildOnernum(onernum.getText())
                                    .buildResidentnum(residentnum.getText())
                                    .build();
        }else{
            user = new UserBuilder(EnumUserRole.USER)
                                    .buildAddress(address.getText())
                                    .buildID(id.getText())
                                    .buildName(name.getText())
                                    .buildPW(pw.getText())
                                    .buildPhone(phone.getText())
                                    .buildResidentnum(residentnum.getText())
                                    .build();
        }

        System.out.println(user);

        FileOutputStream output;
        try {

            output = new FileOutputStream("/Users/gyueop/Documents/문서 - JeongGyuEop의 MacBook Pro/GIT/Delivery/Delivery/DB/User.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
            BufferedWriter out = new BufferedWriter(writer);

            out.write(user.toString() + "\n");
            
            JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
            
            out.close();
            dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        if (user.isSelected()) {
            onernum.setEnabled(false);
        }
    }//GEN-LAST:event_userActionPerformed

    private void onerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onerActionPerformed
        // TODO add your handling code here:
        if (oner.isSelected()) {
            onernum.setEnabled(true);
        }
    }//GEN-LAST:event_onerActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void pwcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwcheckActionPerformed
        // TODO add your handling code here:
        if(pwcheck.equals(pw) != true){
             JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다. 다시 입력해 주세요.");
             pw.setText(null);
             pwcheck.setText(null);
        }
    }//GEN-LAST:event_pwcheckActionPerformed

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
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton oner;
    private javax.swing.JTextField onernum;
    private javax.swing.JTextField phone;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField pwcheck;
    private javax.swing.JTextField residentnum;
    private javax.swing.JRadioButton user;
    // End of variables declaration//GEN-END:variables
}
