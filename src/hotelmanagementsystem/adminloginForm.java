/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author DADDY
 */
public class adminloginForm extends javax.swing.JFrame {

    /**
     * Creates new form adminloginForm
     */
    public adminloginForm() {
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
        logins = new javax.swing.JSeparator();
        loginl = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        unames = new javax.swing.JSeparator();
        passw = new javax.swing.JPasswordField();
        passs = new javax.swing.JSeparator();
        loginadmin = new javax.swing.JButton();
        labela = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        userloginl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 255));
        setMaximumSize(new java.awt.Dimension(890, 2147483647));
        setPreferredSize(new java.awt.Dimension(830, 450));
        setSize(new java.awt.Dimension(450, 600));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logins, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 10));

        loginl.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        loginl.setForeground(new java.awt.Color(255, 255, 255));
        loginl.setText("LOGIN");
        jPanel1.add(loginl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 110, 50));

        uname.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setText("USERNAME");
        uname.setBorder(null);
        uname.setOpaque(false);
        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameFocusGained(evt);
            }
        });
        uname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unameMouseExited(evt);
            }
        });
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unameKeyPressed(evt);
            }
        });
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 50));
        jPanel1.add(unames, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, -1));

        passw.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        passw.setForeground(new java.awt.Color(255, 255, 255));
        passw.setText("*********");
        passw.setBorder(null);
        passw.setOpaque(false);
        passw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwFocusGained(evt);
            }
        });
        passw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwMouseExited(evt);
            }
        });
        passw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwActionPerformed(evt);
            }
        });
        passw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwKeyPressed(evt);
            }
        });
        jPanel1.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 180, -1));
        jPanel1.add(passs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 262, 170, 10));

        loginadmin.setBackground(new java.awt.Color(255, 0, 51));
        loginadmin.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        loginadmin.setForeground(new java.awt.Color(255, 255, 255));
        loginadmin.setText("LOG IN");
        loginadmin.setBorder(null);
        loginadmin.setOpaque(false);
        loginadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginadminActionPerformed(evt);
            }
        });
        jPanel1.add(loginadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 80, 20));

        labela.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        labela.setForeground(new java.awt.Color(255, 255, 255));
        labela.setText("Admin login only.");
        jPanel1.add(labela, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 50, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 170, 40));

        userloginl.setBackground(new java.awt.Color(255, 0, 0));
        userloginl.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        userloginl.setForeground(new java.awt.Color(255, 255, 255));
        userloginl.setText("For user login,Click here...");
        userloginl.setBorder(null);
        userloginl.setOpaque(false);
        userloginl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userloginlActionPerformed(evt);
            }
        });
        jPanel1.add(userloginl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DADDY\\Downloads\\signuphotel.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_unameFocusGained

    private void passwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwFocusGained
        if(passw.getText().equals("*********")){
            passw.setText("");
            
        }
    
    }//GEN-LAST:event_passwFocusGained

    private void passwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwActionPerformed

    private void passwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwMouseEntered
        if(passw.getText().equals("*********")){
            passw.setText("");
        }
    }//GEN-LAST:event_passwMouseEntered

    private void passwMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwMouseExited
        if(passw.getText().equals("")){
            passw.setText("*********");
        }
    }//GEN-LAST:event_passwMouseExited

    private void unameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameMouseEntered
        if(uname.getText().equals("USERNAME")){
            uname.setText("");
        }
    }//GEN-LAST:event_unameMouseEntered

    private void unameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameMouseExited
        if(uname.getText().equals("")){
            uname.setText("USERNAME");
        }
    }//GEN-LAST:event_unameMouseExited

    private void unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameKeyPressed

    private void passwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwKeyPressed

    private void loginadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginadminActionPerformed
        String userid=uname.getText();
        String passd=passw.getText();
        if(userid.isBlank()){
            JOptionPane.showMessageDialog(this,"Username not entered");
            
        }
        if(passd.isBlank()){
            JOptionPane.showMessageDialog(this,"Password not entered");
        }
        else{
            try{
                Connection con=new DBConnect().DBCon();
                String two="SELECT * FROM USER01.ADMINDB WHERE USERID = '"+userid+"'";
                Statement stmt =con.createStatement();
                ResultSet rs =stmt.executeQuery(two);
                if(rs.next()){
                    if(rs.getString("PASSWORD").equals(passd)){
                        JOptionPane.showMessageDialog(this,"Login Successful...");
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Incorrect Password...");
                        
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this,"Login Un-Successful. \nUser Not Found...");
                    
                }
                stmt.close();
                con.close();
                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_loginadminActionPerformed

    private void userloginlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userloginlActionPerformed
        new userLoginForm().setVisible(true);
    }//GEN-LAST:event_userloginlActionPerformed

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
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminloginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminloginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labela;
    private javax.swing.JButton loginadmin;
    private javax.swing.JLabel loginl;
    private javax.swing.JSeparator logins;
    private javax.swing.JSeparator passs;
    private javax.swing.JPasswordField passw;
    private javax.swing.JTextField uname;
    private javax.swing.JSeparator unames;
    private javax.swing.JButton userloginl;
    // End of variables declaration//GEN-END:variables
}