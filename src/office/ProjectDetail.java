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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Jai
 */
public class ProjectDetail extends javax.swing.JPanel {

    /**
     * Creates new form ProjectDetail
     */
     Connection conn=null;
    public ProjectDetail() {
        initComponents();
        conn=MyConnect.connectDatabase();
        setTable();
        setSize(1334, 708);
    }
    
    public void setTable(){
        String sql5 = "SELECT * FROM projectdetails";
        System.out.println("1");
        try {
            PreparedStatement ps = conn.prepareStatement(sql5);
            System.out.println("2");
            ResultSet rs = ps.executeQuery();
            System.out.println("3");
            tblProjectDetail.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.println("4");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Issue: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjectDetail = new javax.swing.JTable();

        setBackground(new java.awt.Color(47, 52, 56));
        setOpaque(false);

        tblProjectDetail.setForeground(new java.awt.Color(51, 51, 51));
        tblProjectDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project Name", "Start Date", "End Date", "Project head", "No. of staff", "Description"
            }
        ));
        jScrollPane1.setViewportView(tblProjectDetail);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProjectDetail;
    // End of variables declaration//GEN-END:variables
   
}
