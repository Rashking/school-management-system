import java.sql.*;
import javax.swing.*;



public class Student_Marks extends javax.swing.JFrame {

  
private Connection conn = null;
  
    public Student_Marks() {
        initComponents();
          databaseConnect();
    
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
        jLabel2 = new javax.swing.JLabel();
        TXTStudentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHistory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMathematics = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtlanguage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtreligion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEnglish = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBucketsubjectI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBucketsubjectII = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSecience = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBucketsubjectIii = new javax.swing.JTextField();
        txtbtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TXTStudentID1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Marks");

        jLabel2.setText("Student ID");

        jLabel3.setText("History");

        jLabel4.setText("Mathematics");

        jLabel5.setText("language");

        jLabel6.setText("Religion");

        jLabel7.setText("English");

        jLabel8.setText("Bucket subject I");

        jLabel9.setText("Bucket subject II");

        jLabel10.setText("Science");

        jLabel11.setText("Bucket subject III");

        txtbtn.setText("Save");
        txtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtnActionPerformed(evt);
            }
        });

        jLabel12.setText("Year/s");

        TXTStudentID1.setText("/");

        jButton1.setText("back");
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
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtbtn)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(177, 177, 177))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTStudentID1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(TXTStudentID)
                    .addComponent(txtreligion)
                    .addComponent(txtHistory)
                    .addComponent(txtMathematics)
                    .addComponent(txtlanguage)
                    .addComponent(txtSecience)
                    .addComponent(txtEnglish)
                    .addComponent(txtBucketsubjectI)
                    .addComponent(txtBucketsubjectII)
                    .addComponent(txtBucketsubjectIii))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TXTStudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtreligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMathematics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtlanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSecience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBucketsubjectI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBucketsubjectII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBucketsubjectIii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtnActionPerformed
               try{
            PreparedStatement ps=conn.prepareStatement("insert into Student_Marks values (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, TXTStudentID.getText());
            ps.setString(2, TXTStudentID1.getText());
            ps.setString(3, txtreligion.getText());
            ps.setString(4, txtHistory.getText());
            ps.setString(5, txtMathematics.getText());
            ps.setString(6, txtlanguage.getText());
            ps.setString(7, txtSecience.getText());
            ps.setString(8, txtEnglish.getText());
            ps.setString(9, txtBucketsubjectI.getText());
            ps.setString(10, txtBucketsubjectII.getText());
            ps.setString(11, txtBucketsubjectIii.getText());
            int status = ps.executeUpdate();
              
              if(status == 1){ JOptionPane.showMessageDialog(rootPane, "Data saved!!"); }
              else { JOptionPane.showMessageDialog(rootPane, "Something went wrong. Try again!!"); }

        }
        catch(Exception ee) { 
                JOptionPane.showMessageDialog(rootPane, ee.toString()); }

        
    }//GEN-LAST:event_txtbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Student_Details t= new Student_Details();
                     t.setVisible(true);
                     this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

  


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
                new Student_Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTStudentID;
    private javax.swing.JTextField TXTStudentID1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBucketsubjectI;
    private javax.swing.JTextField txtBucketsubjectII;
    private javax.swing.JTextField txtBucketsubjectIii;
    private javax.swing.JTextField txtEnglish;
    private javax.swing.JTextField txtHistory;
    private javax.swing.JTextField txtMathematics;
    private javax.swing.JTextField txtSecience;
    private javax.swing.JButton txtbtn;
    private javax.swing.JTextField txtlanguage;
    private javax.swing.JTextField txtreligion;
    // End of variables declaration//GEN-END:variables
}
