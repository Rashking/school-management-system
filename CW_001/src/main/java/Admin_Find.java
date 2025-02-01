
import java.sql.*;
import javax.swing.*;


public class Admin_Find extends javax.swing.JFrame {
private Connection conn = null;

    public Admin_Find() {
        initComponents();
        databaseConnect();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Details = new javax.swing.JTextArea();
        btnCalSalary = new javax.swing.JButton();
        btn_Find = new javax.swing.JButton();
        btn_Add_Admin = new javax.swing.JButton();
        lbl_StudentID = new javax.swing.JLabel();
        txtAdminID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Details.setColumns(20);
        txt_Details.setRows(5);
        jScrollPane1.setViewportView(txt_Details);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCalSalary.setText(" cal salary");
        btnCalSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalSalaryActionPerformed(evt);
            }
        });

        btn_Find.setText("Find");
        btn_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FindActionPerformed(evt);
            }
        });

        btn_Add_Admin.setText("Add Admin");
        btn_Add_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add_AdminActionPerformed(evt);
            }
        });

        lbl_StudentID.setText("Admin ID");

        jLabel1.setText("Admin Details");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Find))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnCalSalary)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Add_Admin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StudentID)
                    .addComponent(txtAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Find))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add_Admin)
                    .addComponent(btnCalSalary)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Admin_a where A_ID=?");
            ps.setString(1,txtAdminID.getText());
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
            {   
                txt_Details.setText("");
                StringBuilder Details = new StringBuilder();
                Details.append("Name: ").append(rs.getString("A_Name")).append("\n");
                Details.append("Salary: ").append(rs.getString("A_B_Salary")).append("\n");
                Details.append("contacts: ").append(rs.getString("A_contacts")).append("\n");
                Details.append("Address: ").append(rs.getString("A_Address")).append("\n");
                
                txt_Details.setText(Details.toString());
            } 
            else { JOptionPane.showMessageDialog(rootPane, "No data found for the given ID!!"); }  
            
            } 
         
         catch (Exception e) { JOptionPane.showMessageDialog(rootPane, e.toString()); }
    }//GEN-LAST:event_btn_FindActionPerformed

    private void btn_Add_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add_AdminActionPerformed
                    
                    Admin t= new Admin();
                    t.setVisible(true);
                    this.hide();
    }//GEN-LAST:event_btn_Add_AdminActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAdminID.setText("");
        txt_Details.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCalSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalSalaryActionPerformed
            
        Admin_salary D = new Admin_salary(); 
        D.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnCalSalaryActionPerformed

      

	public void databaseConnect(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cw_001?useSSL=false","root","5533"); 
        }        
        catch(Exception ee) { JOptionPane.showMessageDialog(rootPane, ee.toString()); }
    }
    
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
            java.util.logging.Logger.getLogger(Admin_Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Find.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Find().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalSalary;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btn_Add_Admin;
    private javax.swing.JButton btn_Find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_StudentID;
    private javax.swing.JTextField txtAdminID;
    private javax.swing.JTextArea txt_Details;
    // End of variables declaration//GEN-END:variables
}
