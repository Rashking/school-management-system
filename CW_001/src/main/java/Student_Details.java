import java.sql.*;
import javax.swing.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import java.io.File;
import net.sf.jasperreports.view.JasperViewer;





public class Student_Details extends javax.swing.JFrame {
    private Connection conn = null;

    public Student_Details() {
        databaseConnect();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClear = new javax.swing.JButton();
        lbl_StudentID = new javax.swing.JLabel();
        txt_StudentID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Details = new javax.swing.JTextArea();
        btn_Find = new javax.swing.JButton();
        btn_Add_Student = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();

        btnClear.setText("Clear");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_StudentID.setText("Student ID");

        jLabel1.setText("Find Student");

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

        btn_Find.setText("Find");
        btn_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FindActionPerformed(evt);
            }
        });

        btn_Add_Student.setText("Add Student");
        btn_Add_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add_StudentActionPerformed(evt);
            }
        });

        jButton1.setText("Student Marks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generator Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Add_Student)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Find)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StudentID)
                    .addComponent(txt_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Find))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add_Student)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnClear1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Add_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add_StudentActionPerformed
               Student NF =new Student();
               NF.setVisible(true);
               this.hide();
    }//GEN-LAST:event_btn_Add_StudentActionPerformed

    private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed
      try {
            PreparedStatement ps = conn.prepareStatement("select * from Student where S_ID=?");
            ps.setString(1,txt_StudentID.getText());
             
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
            {   
//                String gread = rs.getString("S_Brithday");  
                StringBuilder Details = new StringBuilder();
                Details.append("First Name: ").append(rs.getString("S_FName")).append("\n");
                Details.append("Last Name: ").append(rs.getString("S_LName")).append("\n");
                Details.append("Brithday: ").append(rs.getString("S_Brithday")).append("\n");
                Details.append("Address: ").append(rs.getString("S_Address")).append("\n");
                Details.append("Parent Number: ").append(rs.getString("S_P_Number")).append("\n");
                
                txt_Details.setText(Details.toString());

            } 
            else { JOptionPane.showMessageDialog(rootPane, "No data found for the given ID!!"); }  
            
            } 
         
         catch (Exception e) { JOptionPane.showMessageDialog(rootPane, e.toString()); }
        
    }//GEN-LAST:event_btn_FindActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Student_Marks NF=new Student_Marks();
      NF.setVisible(true);
      this.hide();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        txt_StudentID.setText("");
        txt_Details.setText("");
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Cw_001?useSSL=false", 
                "root", 
                "5533"
            );
          String reportPath = "C:\\Users\\veesh\\Documents\\NetBeansProjects\\CW_001\\src\\main\\cw_002.jrxml";
          JasperReport jr = JasperCompileManager.compileReport(reportPath);
          JasperPrint jp = JasperFillManager.fillReport(jr,null,connection);
          JasperViewer.viewReport(jp);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
                new Student_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btn_Add_Student;
    private javax.swing.JButton btn_Find;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_StudentID;
    private javax.swing.JTextArea txt_Details;
    private javax.swing.JTextField txt_StudentID;
    // End of variables declaration//GEN-END:variables
}
