package employee.payroll.management.system;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();  
       //this is another process to set the frame size and display it in centre
        setSize(1032,530);
        
        setLocationRelativeTo(null);
        
     //  MainMenu f=new MainMenu();
       // f.setSize(1038, 550);
        
        lbl_emp.setText(String.valueOf(EMP.empId).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        btn_emp_manager = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_allowance = new javax.swing.JButton();
        btn_update_salary = new javax.swing.JButton();
        btn_deduction = new javax.swing.JButton();
        btn_payment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Logged In As ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 470, 66, 14);

        lbl_emp.setText("emp");
        getContentPane().add(lbl_emp);
        lbl_emp.setBounds(100, 470, 20, 14);

        btn_emp_manager.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_emp_manager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/Add_Employee.png"))); // NOI18N
        btn_emp_manager.setText("Employee Manager");
        btn_emp_manager.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_emp_manager.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_emp_manager.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_emp_manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emp_managerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_emp_manager);
        btn_emp_manager.setBounds(640, 190, 141, 77);

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/logout.png"))); // NOI18N
        btn_close.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_close.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_close.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close);
        btn_close.setBounds(953, 10, 40, 30);

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/Search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_search.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_search.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search);
        btn_search.setBounds(830, 190, 140, 77);

        btn_allowance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_allowance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/Allowance.png"))); // NOI18N
        btn_allowance.setText("Allowance");
        btn_allowance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_allowance.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_allowance.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_allowanceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_allowance);
        btn_allowance.setBounds(640, 290, 140, 77);

        btn_update_salary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_update_salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/Update.png"))); // NOI18N
        btn_update_salary.setText("Update Salary");
        btn_update_salary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_update_salary.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_update_salary.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_update_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update_salary);
        btn_update_salary.setBounds(830, 290, 140, 77);

        btn_deduction.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_deduction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/Deduction.png"))); // NOI18N
        btn_deduction.setText("Deduction");
        btn_deduction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_deduction.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_deduction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deductionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_deduction);
        btn_deduction.setBounds(640, 390, 140, 77);

        btn_payment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/Payment.png"))); // NOI18N
        btn_payment.setText("Payment");
        btn_payment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_payment.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_payment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_payment);
        btn_payment.setBounds(830, 390, 140, 77);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/management/system/Images/bk2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 500);

        jMenu2.setText("Employee");

        jMenu6.setText("Employee Registration");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu6MousePressed(evt);
            }
        });
        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Report");

        jMenu7.setText("Employees RP");
        jMenu3.add(jMenu7);

        jMenu8.setText("Employees Total Allowance RP");
        jMenu3.add(jMenu8);

        jMenu9.setText("Employees Total Deduction RP");
        jMenu3.add(jMenu9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Audit");

        jMenu10.setText("Add User");
        jMenu4.add(jMenu10);

        jMenu11.setText("Audit Trail");
        jMenu4.add(jMenu11);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("About");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        Login1 x = new Login1();
        x.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_emp_managerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emp_managerActionPerformed
        // TODO add your handling code here:
        
        AddEmployee e = new AddEmployee();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_emp_managerActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        
        search s  = new search();
        
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_allowanceActionPerformed
        // TODO add your handling code here:
        allowance a = new allowance();
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_allowanceActionPerformed

    private void btn_update_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_salaryActionPerformed
        // TODO add your handling code here:
        UpdateSalary up = new UpdateSalary();
        up.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_update_salaryActionPerformed

    private void btn_deductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deductionActionPerformed
        // TODO add your handling code here:
        Deduction de = new Deduction();
        de.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_deductionActionPerformed

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paymentActionPerformed

    private void jMenu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MousePressed
        // TODO add your handling code here:
        
        
        AddEmployee e= new AddEmployee();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu6MousePressed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MainMenu().setVisible(true);
                
                 // MainMenu f = new MainMenu();
                  //f.setSize(1038, 550);
                  //f.setLocationRelativeTo(null);
                  //f.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_allowance;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_deduction;
    private javax.swing.JButton btn_emp_manager;
    private javax.swing.JButton btn_payment;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update_salary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_emp;
    // End of variables declaration//GEN-END:variables
}
