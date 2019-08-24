/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jai
 */
public class HomeEmployee extends javax.swing.JFrame {

    /**
     * Creates new form HomeEmployee
     */
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
   AddProject ap=new AddProject();
   ProjectDetail pd=new ProjectDetail();
   SalaryPanel sp=new SalaryPanel();
   LoginEmployee le=new LoginEmployee();
    public HomeEmployee() {
        initComponents();
        conn=MyConnect.connectDatabase();
        this.setLocationRelativeTo(null);
    }
    
    private void processAddProject(){
        try{
        String sql="INSERT INTO projectdetails (projectname, dos, doe, projecthead, numberofemployee, description) "
                + "VALUES (?,?,?,?,?,?)";
        ps=conn.prepareStatement(sql);
        ps.setString(1,ap.getEmployeeProjectName());
            System.out.println("1");
        ps.setString(4,ap.getEmployeeProjectHead());
        System.out.println("2");
        ps.setString(5,ap.getNumberofEmployee());
        
        System.out.println("3");
        ps.setString(6,ap.getProjectDescription());
        System.out.println("4");
        java.util.Date utilProjectDOS = ap.getProjectDOS();
            System.out.println(utilProjectDOS);
        SimpleDateFormat dateProjectFormat = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(dateProjectFormat);
        String stringProjectDOS = dateProjectFormat.format(utilProjectDOS);
        
        java.sql.Date sqlDate=  java.sql.Date.valueOf(stringProjectDOS);
            
        ps.setDate(2,sqlDate);
        
        java.util.Date utilProjectDOE = ap.getProjectDOE();
        
        SimpleDateFormat dateProjectFormatDOE = new SimpleDateFormat("yyyy-MM-dd");
        String stringProjectDOE= dateProjectFormatDOE.format(utilProjectDOE);
        
        java.sql.Date sqlDate1=  java.sql.Date.valueOf(stringProjectDOE);
        
        ps.setDate(3,sqlDate1);
        //return sqlDate;
        
        ps.execute();
            System.out.println("11");
        JOptionPane.showMessageDialog(null,"Successs to manager Add Project" ,"HomeAdmin",JOptionPane.INFORMATION_MESSAGE );
        
        }
    
        catch(SQLException e){
            
        JOptionPane.showMessageDialog(null,"issue" + e.getMessage() );
        
        }
    }
    public static HomeEmployee getHomeEmployee()
    {
        return homeemployee;
    }
     
      public void saveAddProject(){
       processAddProject();
   }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jPanel2_base = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6Min = new javax.swing.JLabel();
        jLabel5Cut = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlAddProject = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAddProject = new javax.swing.JLabel();
        pnlProjectDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblProjectDetails = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblSalaryDeails = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 627));
        setResizable(false);

        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        pnlMain.setOpaque(false);

        jPanel2_base.setBackground(new java.awt.Color(188, 124, 156));
        jPanel2_base.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(122, 89, 128));

        jLabel6Min.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6Min.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6Min.setText("-");
        jLabel6Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MinMouseClicked(evt);
            }
        });

        jLabel5Cut.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5Cut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5Cut.setText("X");
        jLabel5Cut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5Cut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5CutMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Office Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)
                .addComponent(jLabel6Min, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5Cut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5Cut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6Min)
                .addComponent(jLabel5))
        );

        jPanel3.setBackground(new java.awt.Color(122, 89, 128));

        pnlAddProject.setBackground(new java.awt.Color(188, 124, 156));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office/photo/add project.png"))); // NOI18N

        lblAddProject.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblAddProject.setForeground(new java.awt.Color(255, 255, 255));
        lblAddProject.setText("Add Project");
        lblAddProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddProjectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAddProjectLayout = new javax.swing.GroupLayout(pnlAddProject);
        pnlAddProject.setLayout(pnlAddProjectLayout);
        pnlAddProjectLayout.setHorizontalGroup(
            pnlAddProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddProject, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAddProjectLayout.setVerticalGroup(
            pnlAddProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(lblAddProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlProjectDetails.setBackground(new java.awt.Color(188, 124, 156));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office/photo/projecdetails.png"))); // NOI18N

        lblProjectDetails.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblProjectDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblProjectDetails.setText("Project Details");
        lblProjectDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProjectDetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlProjectDetailsLayout = new javax.swing.GroupLayout(pnlProjectDetails);
        pnlProjectDetails.setLayout(pnlProjectDetailsLayout);
        pnlProjectDetailsLayout.setHorizontalGroup(
            pnlProjectDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProjectDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblProjectDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProjectDetailsLayout.setVerticalGroup(
            pnlProjectDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(lblProjectDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office/photo/2.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(188, 124, 156));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office/photo/salarydetails.png"))); // NOI18N

        lblSalaryDeails.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSalaryDeails.setForeground(new java.awt.Color(255, 255, 255));
        lblSalaryDeails.setText("Salary Details");
        lblSalaryDeails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalaryDeailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblSalaryDeails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(lblSalaryDeails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(188, 124, 156));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office/photo/Logout Rounded Up_30px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Logout");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(90, 90, 90))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAddProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProjectDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(pnlAddProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(pnlProjectDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MinMouseClicked

    private void jLabel5CutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5CutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5CutMouseClicked

    private void lblAddProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddProjectMouseClicked
        // TODO add your handling code here:
        jPanel2_base.removeAll();
        //ap.setVisible(true);
        jPanel2_base.add(ap);
        jPanel2_base.repaint();
        jPanel2_base.validate();
        pack();
    }//GEN-LAST:event_lblAddProjectMouseClicked

    private void lblProjectDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProjectDetailsMouseClicked
        // TODO add your handling code here:
        jPanel2_base.removeAll();
        //ap.setVisible(true);
        jPanel2_base.add(pd);
        jPanel2_base.repaint();
        jPanel2_base.validate();
        pack();
    }//GEN-LAST:event_lblProjectDetailsMouseClicked

    private void lblSalaryDeailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalaryDeailsMouseClicked
        // TODO add your handling code here:
        jPanel2_base.removeAll();
        //ap.setVisible(true);
        jPanel2_base.add(sp);
        jPanel2_base.repaint();
        jPanel2_base.validate();
        pack();
    }//GEN-LAST:event_lblSalaryDeailsMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.dispose();
        le.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                homeemployee = new HomeEmployee();
                homeemployee.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5Cut;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6Min;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel2_base;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAddProject;
    private javax.swing.JLabel lblProjectDetails;
    private javax.swing.JLabel lblSalaryDeails;
    private javax.swing.JPanel pnlAddProject;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlProjectDetails;
    // End of variables declaration//GEN-END:variables
private static HomeEmployee homeemployee;
}