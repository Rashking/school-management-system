import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
 private Connection conn = null;
    public Login() {
        initComponents();
        databaseConnect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnResetPassword = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tglStudent = new javax.swing.JRadioButton();
        tglTeacher = new javax.swing.JRadioButton();
        tglAdmin = new javax.swing.JRadioButton();
        txtusername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel2.setText("Password");

        txtpassword.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnResetPassword.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btnResetPassword.setText("Reset password");
        btnResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPasswordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel3.setText("School Mengemnt System");

        tglStudent.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        tglStudent.setText("Student");
        tglStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglStudentActionPerformed(evt);
            }
        });

        tglTeacher.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        tglTeacher.setText("Teacher");
        tglTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglTeacherActionPerformed(evt);
            }
        });

        tglAdmin.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        tglAdmin.setText("Admin");
        tglAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tglTeacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglAdmin)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglTeacher)
                    .addComponent(tglStudent)
                    .addComponent(tglAdmin))
                .addContainerGap())
        );

        txtusername.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetPassword)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         try 
        {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM Login WHERE LoginUserName=? AND LoginPassword=? ");
            ps.setString(1, txtusername.getText());
            ps.setString(2, txtpassword.getText());
            
            ResultSet Rs= ps.executeQuery();
              
              if(Rs.next())
              { 
                  
                  if(tglTeacher.isSelected()){
                    
                     Teacher t= new Teacher();
                     t.setVisible(true);
                     this.hide();
                     
                  }
                  else if(tglStudent.isSelected()){
                   
                     Student_Details t= new Student_Details();
                     t.setVisible(true);
                     this.hide();
                  
                  }
                  else if(tglAdmin.isSelected()){
                
                     Admin_Find t= new Admin_Find();
                     t.setVisible(true);
                     this.hide();
                     
                  }
                  else{
                         JOptionPane.showMessageDialog(rootPane, "Select the category");
                  }
              } 
              else {
                  JOptionPane.showMessageDialog(rootPane, "Something went wrong. Try again!!");
              }

        }
        catch(Exception ee) 
            {JOptionPane.showMessageDialog(rootPane, ee.toString());}              
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswordActionPerformed
        
    }//GEN-LAST:event_btnResetPasswordActionPerformed

    private void tglTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglTeacherActionPerformed
    tglTeacher.setSelected(true);
     tglStudent.setSelected(false);
     tglAdmin.setSelected(false);
    }//GEN-LAST:event_tglTeacherActionPerformed

    private void tglStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglStudentActionPerformed
     tglTeacher.setSelected(false);
     tglStudent.setSelected(true);
     tglAdmin.setSelected(false);
    }//GEN-LAST:event_tglStudentActionPerformed

    private void tglAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglAdminActionPerformed
     tglTeacher.setSelected(false);
     tglStudent.setSelected(false);
     tglAdmin.setSelected(true);
    }//GEN-LAST:event_tglAdminActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

   
    
    public void databaseConnect(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cw_001?useSSL=false","root","5533"); 
        }        
        catch(Exception ee) { JOptionPane.showMessageDialog(rootPane, ee.toString()); }
    }
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnResetPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton tglAdmin;
    private javax.swing.JRadioButton tglStudent;
    private javax.swing.JRadioButton tglTeacher;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
