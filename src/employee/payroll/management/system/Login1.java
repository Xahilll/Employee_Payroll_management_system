package employee.payroll.management.system;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Login1 extends javax.swing.JFrame {

   Connection myConn=null;
    ResultSet myRs=null;
    PreparedStatement myPst = null;
    public Login1() {
        initComponents();
        //this is for to show the frame in the middle of the screen 
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        
        
        
        
        
        
        
         myConn = Database.java_db();
         currentdate();
        
    }
    
    public void currentdate(){
    Calendar cal=new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
    int year=cal.get(Calendar.YEAR);
    int day=cal.get(Calendar.DAY_OF_MONTH);
    
    
    
    lbl_date.setText(day+"/"+(month+1)+"/"+year);
    
    
    int second=cal.get(Calendar.SECOND);
    int minute=cal.get(Calendar.MINUTE);
    int hour = cal.get(Calendar.HOUR);
    
    lbl_time.setText(hour+":" +(minute)+":"+second);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("   Please Enter Your UserName And Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 120, 300, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("UserName");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 160, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("PassWord");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 200, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Select Division");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 240, 90, 30);

        txt_username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txt_username);
        txt_username.setBounds(150, 160, 170, 30);

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txt_password);
        txt_password.setBounds(150, 200, 170, 30);

        txt_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Sales", " " }));
        jPanel1.add(txt_combo);
        txt_combo.setBounds(150, 240, 170, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 290, 90, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/payroll.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -10, 1020, 520);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        lbl_date.setText("Date");
        jMenuBar2.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar2.add(lbl_time);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String sql="select id,username,password,division from users where(username=? and password=? and division=?)" ;
        try {
            int count = 0;

            myPst=myConn.prepareStatement(sql);

            myPst.setString(1, txt_username.getText());
            myPst.setString(2, txt_password.getText());
            myPst.setString(3, txt_combo.getSelectedItem().toString());

            myRs=myPst.executeQuery();
            while (myRs.next()){
                int id=myRs.getInt(1);
                EMP.empId=id;
                count=count+1;

            }
            String access = (txt_combo.getSelectedItem().toString());
            if(access=="Admin"){
                if(count==1){
                    JOptionPane.showMessageDialog(null,"Success");
                    MainMenu j = new MainMenu();
                    j.setVisible(true);
                    this.dispose();

                }
                else{
                    JOptionPane.showMessageDialog(null,"UserName and Password are Wrong");
                }
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        finally{
            try {
                myRs.close();
                myPst.close();

            } catch (Exception e) {

            }

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JComboBox<String> txt_combo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
