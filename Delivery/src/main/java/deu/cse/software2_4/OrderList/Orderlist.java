/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.OrderList;

import deu.cse.software2_4.Purchase.Cash_Payment;
import deu.cse.software2_4.UserLogin.Login;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 이창희
 */
public class Orderlist extends javax.swing.JFrame {

    FileInputStream input;
    Login login = new Login();
    boolean checkpaystate = false;
    String paystate;
    String deliveryEnd = "";
    String[] order_arry;
    ArrayList<String> orderlist = new ArrayList<>();

    /**
     * Creates new form Orderlist
     */
    public Orderlist() {
        initComponents();
        setSize(420, 600);
        setLocationRelativeTo(null);

        orderList.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel) orderList.getModel();

        FileInputStream input;
        try {
            input = new FileInputStream("/Users/gyueop/Documents/JeongGyuEop_Document/GIT/Delivery/Delivery/DB/Order.txt");
            InputStreamReader reader = new InputStreamReader(input, "UTF-8");
            BufferedReader in = new BufferedReader(reader);

            Login login = new Login();
            while ((paystate = in.readLine()) != null) {
                order_arry = paystate.split("/");
                if ((login.getReturnid()).equals(order_arry[0])) {
                    model.addElement(order_arry[1]);
                    price.setText(order_arry[2]);
                    deliverystate.setText(order_arry[5]);
                    price.setEnabled(false);
                    deliverystate.setEnabled(false);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JList<>();
        jLabel_Orderlist = new javax.swing.JLabel();
        jLabel_price = new javax.swing.JLabel();
        jLabel_delivery = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        deliverystate = new javax.swing.JTextField();
        jButton_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(orderList);

        jLabel_Orderlist.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel_Orderlist.setText("  주문내역");
        jLabel_Orderlist.setAutoscrolls(true);
        jLabel_Orderlist.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel_price.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel_price.setText("가격");

        jLabel_delivery.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel_delivery.setText("배달 현황");

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jButton_Back.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jButton_Back.setText("뒤로 가기");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jLabel1.setText("배달이 완료되면 배달 완료를 선택해 주세요!");

        jButton1.setText("배달 완료");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Orderlist, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Back))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_delivery)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deliverystate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_price)
                                .addGap(33, 33, 33)
                                .addComponent(price))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Orderlist, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Back))
                .addGap(113, 113, 113)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_price)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_delivery)
                    .addComponent(deliverystate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        deliverystate.setText("배달 완료");
        JOptionPane.showMessageDialog(null, "배달이 완료되었습니다.");
        String order;
        String[] order_arry;
        Login login = new Login();
        FileInputStream input;

        try {
            input = new FileInputStream("/Users/gyueop/Documents/JeongGyuEop_Document/GIT/Delivery/Delivery/DB/Order.txt");
            InputStreamReader reader = new InputStreamReader(input, "UTF-8");
            BufferedReader in = new BufferedReader(reader);

            while ((order = in.readLine()) != null) {
                order_arry  = order.split("/");
                if (order_arry [0].equals(login.getReturnid())) {
                    order_arry [5] = "배달완료";
                    for (int i = 0; i < (order_arry .length)-1; i++) {
                        deliveryEnd += order_arry [i] + "/";
                    }
                    deliveryEnd += order_arry [5];
                } else {
                    orderlist.add(order);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileOutputStream output;
        FileOutputStream deliveryOutput;
        try {
            output = new FileOutputStream("/Users/gyueop/Documents/JeongGyuEop_Document/GIT/Delivery/Delivery/DB/Order.txt", false);
            OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
            BufferedWriter out = new BufferedWriter(writer);

            deliveryOutput = new FileOutputStream("/Users/gyueop/Documents/JeongGyuEop_Document/GIT/Delivery/Delivery/DB/DeliveryState.txt", true);
            OutputStreamWriter deliveryWriter = new OutputStreamWriter(deliveryOutput, "UTF-8");
            BufferedWriter deliveryout = new BufferedWriter(deliveryWriter);

            for (int j = 0; j < orderlist.size(); j++) {
                out.write(orderlist.get(j) + "\n");
            }

            deliveryout.write(deliveryEnd);

            out.close();
            deliveryout.close();
            dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Orderlist.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orderlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deliverystate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Orderlist;
    private javax.swing.JLabel jLabel_delivery;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> orderList;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables
}
