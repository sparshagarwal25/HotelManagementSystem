/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.event.KeyEvent;

/**
 *
 * @author DADDY
 */
public class signupForm extends javax.swing.JFrame {
    

    /**
     * Creates new form signupForm
     */
    public signupForm() {
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

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SIGNUP = new javax.swing.JLabel();
        FIRSTNAME = new javax.swing.JLabel();
        NAMEIDX = new javax.swing.JTextField();
        LASTNAME = new javax.swing.JLabel();
        NAMEIDX2 = new javax.swing.JTextField();
        USERNAME = new javax.swing.JLabel();
        USERNAMEIDX = new javax.swing.JTextField();
        PASS = new javax.swing.JLabel();
        REPASS = new javax.swing.JLabel();
        EMAIL = new javax.swing.JLabel();
        EMAILIDX = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        IDOPTIONIDX = new javax.swing.JComboBox<>();
        ADDRESS = new javax.swing.JLabel();
        MOBILENUM = new javax.swing.JLabel();
        MOBILEIDX = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        CHECKBOX = new javax.swing.JCheckBox();
        REGISTERBUTTON = new javax.swing.JButton();
        EXITBUTTON = new javax.swing.JButton();
        LOGINLINK = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        PASSIDX = new javax.swing.JPasswordField();
        REPASSIDX = new javax.swing.JPasswordField();
        CARETLABEL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADDRESSIDX = new javax.swing.JTextArea();
        AGE = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        AGEIDX = new javax.swing.JTextField();
        GENDER = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        GENDERIDX = new javax.swing.JComboBox<>();
        ALREADYHERE = new javax.swing.JLabel();
        WALLPAER = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIGNUP.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        SIGNUP.setForeground(new java.awt.Color(255, 255, 255));
        SIGNUP.setText("SIGN UP");
        jPanel1.add(SIGNUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        FIRSTNAME.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        FIRSTNAME.setForeground(new java.awt.Color(255, 255, 255));
        FIRSTNAME.setText("FIRST NAME");
        jPanel1.add(FIRSTNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        NAMEIDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEIDXActionPerformed(evt);
            }
        });
        jPanel1.add(NAMEIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 30));

        LASTNAME.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        LASTNAME.setForeground(new java.awt.Color(255, 255, 255));
        LASTNAME.setText("LAST NAME");
        jPanel1.add(LASTNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 30));
        jPanel1.add(NAMEIDX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 160, 30));

        USERNAME.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        USERNAME.setForeground(new java.awt.Color(255, 255, 255));
        USERNAME.setText("USERNAME");
        jPanel1.add(USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 30));
        jPanel1.add(USERNAMEIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 30));

        PASS.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        PASS.setForeground(new java.awt.Color(255, 255, 255));
        PASS.setText("PASSWORD");
        jPanel1.add(PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 90, 30));

        REPASS.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        REPASS.setForeground(new java.awt.Color(255, 255, 255));
        REPASS.setText("RE-TYPE PASSWORD *");
        jPanel1.add(REPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        EMAIL.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        EMAIL.setForeground(new java.awt.Color(255, 255, 255));
        EMAIL.setText("E-MAIL ADDRESS ");
        jPanel1.add(EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 150, 30));

        EMAILIDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILIDXActionPerformed(evt);
            }
        });
        jPanel1.add(EMAILIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 200, 30));

        ID.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID-PROOF");
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        IDOPTIONIDX.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        IDOPTIONIDX.setMaximumRowCount(4);
        IDOPTIONIDX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DRIVING LICENCE", "PASSPORT", "AADHAR CARD", "VOTER ID" }));
        IDOPTIONIDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDOPTIONIDXActionPerformed(evt);
            }
        });
        jPanel1.add(IDOPTIONIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 200, 30));

        ADDRESS.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(255, 255, 255));
        ADDRESS.setText("ADDRESS ");
        jPanel1.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        MOBILENUM.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        MOBILENUM.setForeground(new java.awt.Color(255, 255, 255));
        MOBILENUM.setText("MOBILE NUMBER");
        jPanel1.add(MOBILENUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));
        jPanel1.add(MOBILEIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 160, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 120, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 20));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 120, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 10));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 160, 10));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 160, 20));

        CHECKBOX.setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        CHECKBOX.setForeground(new java.awt.Color(255, 255, 255));
        CHECKBOX.setText("I ACCEPT THE FOLLOWING TERMS AND CONDITION*");
        CHECKBOX.setBorder(null);
        CHECKBOX.setOpaque(false);
        jPanel1.add(CHECKBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 240, -1));

        REGISTERBUTTON.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        REGISTERBUTTON.setText("REGISTER");
        REGISTERBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTERBUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(REGISTERBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, -1, -1));

        EXITBUTTON.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        EXITBUTTON.setText("EXIT");
        EXITBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, -1, -1));

        LOGINLINK.setBackground(new java.awt.Color(255, 255, 255));
        LOGINLINK.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        LOGINLINK.setForeground(new java.awt.Color(255, 255, 0));
        LOGINLINK.setText("CLICK HERE TO LOGIN");
        LOGINLINK.setBorder(null);
        LOGINLINK.setBorderPainted(false);
        LOGINLINK.setOpaque(false);
        LOGINLINK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINLINKActionPerformed(evt);
            }
        });
        jPanel1.add(LOGINLINK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 150, 20));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 130, 10));

        PASSIDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSIDXActionPerformed(evt);
            }
        });
        jPanel1.add(PASSIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 200, 30));

        REPASSIDX.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                REPASSIDXCaretUpdate(evt);
            }
        });
        jPanel1.add(REPASSIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 200, 30));

        CARETLABEL.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        CARETLABEL.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(CARETLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 200, 20));

        ADDRESSIDX.setColumns(20);
        ADDRESSIDX.setRows(5);
        jScrollPane1.setViewportView(ADDRESSIDX);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 290, -1));

        AGE.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        AGE.setForeground(new java.awt.Color(255, 255, 255));
        AGE.setText("AGE");
        jPanel1.add(AGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 30));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 20));
        jPanel1.add(AGEIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, 30));

        GENDER.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        GENDER.setForeground(new java.awt.Color(255, 255, 255));
        GENDER.setText("GENDER");
        jPanel1.add(GENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 30));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 120, -1));

        GENDERIDX.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        GENDERIDX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        jPanel1.add(GENDERIDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 249, 160, 30));

        ALREADYHERE.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ALREADYHERE.setForeground(new java.awt.Color(204, 204, 0));
        ALREADYHERE.setText("(IF ALREADY REGISTERED)");
        jPanel1.add(ALREADYHERE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 160, -1));

        WALLPAER.setIcon(new javax.swing.ImageIcon("C:\\Users\\DADDY\\Downloads\\FHOTEL.png")); // NOI18N
        jPanel1.add(WALLPAER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 572, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NAMEIDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEIDXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEIDXActionPerformed

    private void IDOPTIONIDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDOPTIONIDXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDOPTIONIDXActionPerformed

    private void LOGINLINKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINLINKActionPerformed
        new userLoginForm().setVisible(true);
    }//GEN-LAST:event_LOGINLINKActionPerformed

    private void REGISTERBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTERBUTTONActionPerformed
       String email=EMAILIDX.getText();
       String fname=NAMEIDX.getText();
       String lname=NAMEIDX2.getText();
       String passw=PASSIDX.getText();
       String repassw=REPASSIDX.getText();
       String uname=USERNAMEIDX.getText();
       String mnum=MOBILEIDX.getText();
       String nuser=USERNAMEIDX.getText();
       String addres=ADDRESSIDX.getText();
       String idtype=IDOPTIONIDX.getSelectedItem().toString();
       String age=AGEIDX.getText();
       String gender=GENDERIDX.getSelectedItem().toString();
      
       if(email.isEmpty() || age.isEmpty() || fname.isEmpty() || lname.isEmpty() || passw.isEmpty() || uname.isEmpty() || mnum.isEmpty() || nuser.isEmpty() || addres.isEmpty() ){
           JOptionPane.showMessageDialog(this,"Details incomplete...\nFill all the boxes");   
       }
       if(mnum.length()!=10){
           JOptionPane.showMessageDialog(this,"Phone number is not valid");
       }
       if(CHECKBOX.isSelected()!=true){
           JOptionPane.showMessageDialog(this,"Accept the terms and condition");
    }
       
       if(passw.equals(repassw)){
       try{
       Connection con = new DBConnect().DBCon();
       String one ="insert into user01.userDB(FIRSTNAME,LASTNAME,EMAIL,PASSWORD,IDTYPE,AGE,MOBILENUMBER,ADDRESS,USERID,GENDER) values(?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement stmt =con.prepareStatement(one);
         
         stmt.setString(1,fname);
         stmt.setString(2,lname);
         stmt.setString(3,email);
         stmt.setString(4,passw);
         stmt.setString(5,idtype);
         stmt.setInt(6,Integer.parseInt(age));
         stmt.setString(7,mnum);
         stmt.setString(8,addres);
         stmt.setString(9,nuser);
         stmt.setString(10,gender);
       
          stmt.executeUpdate();
           
               
           
           JOptionPane.showMessageDialog(this,"Signup Successful...");
           stmt.close();
           con.close();
           dispose();
           new userLoginForm().setVisible(true);
           
      
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(this,"Signup Failed....");
           JOptionPane.showMessageDialog(null,ex.getMessage());
       }
       
       }
       else{
           JOptionPane.showMessageDialog(this,"Password did not match");
       }
      
      
    }//GEN-LAST:event_REGISTERBUTTONActionPerformed

    private void EXITBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBUTTONActionPerformed
        new adminloginForm().setVisible(true);
    }//GEN-LAST:event_EXITBUTTONActionPerformed

    private void EMAILIDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILIDXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILIDXActionPerformed

    private void PASSIDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSIDXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSIDXActionPerformed

    private void REPASSIDXCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_REPASSIDXCaretUpdate
      String passw=PASSIDX.getText();
      String repassw=REPASSIDX.getText();
      if(passw.equals(repassw)){
          CARETLABEL.setText("Password Match");
          
      }
      else{
          CARETLABEL.setText("Password Not Matched");
      }
    }//GEN-LAST:event_REPASSIDXCaretUpdate

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
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADDRESS;
    private javax.swing.JTextArea ADDRESSIDX;
    private javax.swing.JLabel AGE;
    private javax.swing.JTextField AGEIDX;
    private javax.swing.JLabel ALREADYHERE;
    private javax.swing.JLabel CARETLABEL;
    private javax.swing.JCheckBox CHECKBOX;
    private javax.swing.JLabel EMAIL;
    private javax.swing.JTextField EMAILIDX;
    private javax.swing.JButton EXITBUTTON;
    private javax.swing.JLabel FIRSTNAME;
    private javax.swing.JLabel GENDER;
    private javax.swing.JComboBox<String> GENDERIDX;
    private javax.swing.JLabel ID;
    private javax.swing.JComboBox<String> IDOPTIONIDX;
    private javax.swing.JLabel LASTNAME;
    private javax.swing.JButton LOGINLINK;
    private javax.swing.JTextField MOBILEIDX;
    private javax.swing.JLabel MOBILENUM;
    private javax.swing.JTextField NAMEIDX;
    private javax.swing.JTextField NAMEIDX2;
    private javax.swing.JLabel PASS;
    private javax.swing.JPasswordField PASSIDX;
    private javax.swing.JButton REGISTERBUTTON;
    private javax.swing.JLabel REPASS;
    private javax.swing.JPasswordField REPASSIDX;
    private javax.swing.JLabel SIGNUP;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JTextField USERNAMEIDX;
    private javax.swing.JLabel WALLPAER;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}