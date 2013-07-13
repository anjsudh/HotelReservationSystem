/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * checkin.java
 *
 * Created on Apr 5, 2012, 7:49:13 PM
 */

package miniproj;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Anjana
 */
public class checkin extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
    /** Creates new form checkin */
    public checkin() {
        initComponents();
         try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            JOptionPane.showMessageDialog(this, "Driver Loaded Succesfully!");
        }
        catch(ClassNotFoundException E)
        {
                JOptionPane.showMessageDialog(this, "Driver Not Loaded");
        }
        try
        {
            con=DriverManager.getConnection("jdbc:odbc:dsn","system","orcl");
            JOptionPane.showMessageDialog(this, "Connection Established!");
        }
        catch(SQLException E)
        {
            JOptionPane.showMessageDialog(this, "Connection Not Established");
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cReserveroom = new javax.swing.JButton();
        corderfood = new javax.swing.JButton();
        cuseservice = new javax.swing.JButton();
        cgeneratebill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Hotel Green Park!!!");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        cReserveroom.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cReserveroom.setForeground(new java.awt.Color(0, 153, 204));
        cReserveroom.setText("RESERVE ROOM");
        cReserveroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cReserveroomActionPerformed(evt);
            }
        });

        corderfood.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        corderfood.setForeground(new java.awt.Color(0, 153, 204));
        corderfood.setText("ORDER FOOD");
        corderfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corderfoodActionPerformed(evt);
            }
        });

        cuseservice.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        cuseservice.setForeground(new java.awt.Color(0, 153, 204));
        cuseservice.setText("USE SERVICE");
        cuseservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuseserviceActionPerformed(evt);
            }
        });

        cgeneratebill.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cgeneratebill.setForeground(new java.awt.Color(0, 153, 204));
        cgeneratebill.setText("GENERATE BILL");
        cgeneratebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgeneratebillActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTEL GREEN PARK");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cexit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cexit.setForeground(new java.awt.Color(0, 153, 204));
        cexit.setText("EXIT");
        cexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cexitActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, cexit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, cgeneratebill, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, cuseservice, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, corderfood, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, cReserveroom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cReserveroom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(corderfood, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cuseservice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cgeneratebill, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cexit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cReserveroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cReserveroomActionPerformed
        // TODO add your handling code here:
        GuestInfo g = new GuestInfo();
        g.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cReserveroomActionPerformed

    private void cuseserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuseserviceActionPerformed
        // TODO add your handling code here:
        OrderServices r = new OrderServices();
        r.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cuseserviceActionPerformed

    private void corderfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corderfoodActionPerformed
        // TODO add your handling code here:
        FoodOrder o = new FoodOrder();
        o.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_corderfoodActionPerformed

    private void cgeneratebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgeneratebillActionPerformed
        // TODO add your handling code here:
        BILL b = new BILL();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cgeneratebillActionPerformed

    private void cexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cexitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cReserveroom;
    private javax.swing.JButton cexit;
    private javax.swing.JButton cgeneratebill;
    private javax.swing.JButton corderfood;
    private javax.swing.JButton cuseservice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
