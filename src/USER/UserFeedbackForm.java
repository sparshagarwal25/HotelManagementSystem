/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER;

import OTHER.DBConnect;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author SPARSH
 */
public class UserFeedbackForm extends javax.swing.JFrame {

    int starRating = 0;
    String username;

    /**
     * Creates new form UserFeedbackForm
     */
    public UserFeedbackForm() {
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

        jPanel1 = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackForm = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        star1 = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star3 = new javax.swing.JLabel();
        star4 = new javax.swing.JLabel();
        star5 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("FEEDBACK | HOTEL MANAGEMENT SYSTEM");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLabel.setBackground(new java.awt.Color(111, 63, 220));
        mainLabel.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(111, 63, 220));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Hotel Management System");
        jPanel1.add(mainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        jSeparator1.setBackground(new java.awt.Color(111, 63, 220));
        jSeparator1.setForeground(new java.awt.Color(111, 63, 220));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 610, 20));

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please tell us about your Stay:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 320, 40));

        feedbackForm.setColumns(20);
        feedbackForm.setLineWrap(true);
        feedbackForm.setRows(5);
        feedbackForm.setWrapStyleWord(true);
        jScrollPane1.setViewportView(feedbackForm);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 470, 270));

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel2.setText("How Would you rate your experience:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 220, 30));

        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png"))); // NOI18N
        star1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star1MouseEntered(evt);
            }
        });
        jPanel1.add(star1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, 30));

        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png"))); // NOI18N
        star2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star2MouseEntered(evt);
            }
        });
        jPanel1.add(star2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, 30));

        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png"))); // NOI18N
        star3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star3MouseEntered(evt);
            }
        });
        jPanel1.add(star3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, 30));

        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png"))); // NOI18N
        star4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star4MouseEntered(evt);
            }
        });
        jPanel1.add(star4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, 30));

        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png"))); // NOI18N
        star5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star5MouseEntered(evt);
            }
        });
        jPanel1.add(star5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, 30));

        submitBtn.setBackground(new java.awt.Color(204, 0, 204));
        submitBtn.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 381, 110, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Hotel - 2edited.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 450);

        setSize(new java.awt.Dimension(814, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void star1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star1MouseEntered
        // TODO add your handling code here:
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
//        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        starRating = 1;
    }//GEN-LAST:event_star1MouseEntered

    private void star2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star2MouseEntered
        // TODO add your handling code here:
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        starRating = 2;
    }//GEN-LAST:event_star2MouseEntered

    private void star3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star3MouseEntered
        // TODO add your handling code here:
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        starRating = 3;
    }//GEN-LAST:event_star3MouseEntered

    private void star4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star4MouseEntered
        // TODO add your handling code here:
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingDull.png")));
        starRating = 4;
    }//GEN-LAST:event_star4MouseEntered

    private void star5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star5MouseEntered
        // TODO add your handling code here:
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/StarRatingBright.png")));
        starRating = 5;
    }//GEN-LAST:event_star5MouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        FileWriter File = null;
        String feedback = feedbackForm.getText();

        try {
            File = new FileWriter("src/ADMIN/Feedback.txt", true);
            File.write("\n");
            File.write("Username: "+username+"\n");
            File.write("Rating: "+starRating+" Stars\n\n");
            for (int i = 0; i < feedback.length(); i++) {
                File.write(feedback.charAt(i));
            }
            File.write("\n------------------------------------------------\n");
            File.close();
            System.out.println("Written succesfully.");

        } catch (IOException ex) {
            Logger.getLogger(UserFeedbackForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new DBConnect().setCurrentUser("");
        dispose();
        DBConnect.initialization();

    }//GEN-LAST:event_submitBtnActionPerformed

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
                if ("FlatLightLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserFeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFeedbackForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextArea feedbackForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel star4;
    private javax.swing.JLabel star5;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}