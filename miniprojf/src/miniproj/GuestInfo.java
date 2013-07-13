/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GuestInfo.java
 *
 * Created on Apr 6, 2012, 4:11:59 PM
 */
package miniproj;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Anjana
 */
public class GuestInfo extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
    /** Creates new form GuestInfo */
    public GuestInfo() {
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
        {JOptionPane.showMessageDialog(this, "Connection Not Established");
        }
    
        try
      {
         stmt =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
           rs=stmt.executeQuery("select max(id)+1 from guest");
            rs.first();
            if(rs.getString(1)!=null)
                 st=rs.getString(1);
            else 
                st=new String("1");
           rguestid.setText(st);
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rguestid = new javax.swing.JTextField();
        rguestname = new javax.swing.JTextField();
        rphoneno = new javax.swing.JTextField();
        rnoofadults = new javax.swing.JTextField();
        rchkavailability = new javax.swing.JButton();
        rclear = new javax.swing.JButton();
        rreturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        raddress = new javax.swing.JTextField();
        rnoofchildren = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guest Info");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUEST INFO");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GUEST ID");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GUEST NAME");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADDRESS");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PHONE NO.");

        rguestid.setForeground(new java.awt.Color(0, 153, 255));
        rguestid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rguestidActionPerformed(evt);
            }
        });

        rguestname.setForeground(new java.awt.Color(0, 153, 255));

        rphoneno.setForeground(new java.awt.Color(0, 153, 255));

        rnoofadults.setForeground(new java.awt.Color(0, 153, 204));

        rchkavailability.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        rchkavailability.setForeground(new java.awt.Color(0, 153, 204));
        rchkavailability.setText("RESERVE ROOM");
        rchkavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rchkavailabilityActionPerformed(evt);
            }
        });

        rclear.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        rclear.setForeground(new java.awt.Color(0, 153, 204));
        rclear.setText("CLEAR");
        rclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rclearActionPerformed(evt);
            }
        });

        rreturn.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        rreturn.setForeground(new java.awt.Color(0, 153, 204));
        rreturn.setText("RETURN TO CHECK IN");
        rreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rreturnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NO OF ADULTS");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NO OF CHILDREN");

        raddress.setForeground(new java.awt.Color(0, 153, 255));
        raddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raddressActionPerformed(evt);
            }
        });

        rnoofchildren.setForeground(new java.awt.Color(0, 153, 204));
        rnoofchildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnoofchildrenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rreturn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(44, 44, 44)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(60, 60, 60)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(29, 29, 29))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(raddress, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(rguestname, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(rphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(rnoofchildren, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rnoofadults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                                        .addGap(28, 28, 28))
                                    .addComponent(rguestid, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(rchkavailability))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rguestid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rguestname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(raddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rnoofadults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rnoofchildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rchkavailability)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rclear)
                    .addComponent(rreturn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rchkavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rchkavailabilityActionPerformed
        // TODO add your handling code here:
        try
        {
            String sql=("insert into guest values(?,?,?,?,?,?)");
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, rguestid.getText());
            pstmt.setString(2, rguestname.getText());
            pstmt.setString(3,raddress.getText());
            pstmt.setString(4,rphoneno.getText());
            pstmt.setString(5,rnoofadults.getText());
            pstmt.setString(6,rnoofchildren.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Guest Details INSERTED Successfully!!");
        } 
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        CheckAvailability c = new CheckAvailability();
        c.setVisible(true);
        setVisible(false);
}//GEN-LAST:event_rchkavailabilityActionPerformed

    private void rclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rclearActionPerformed
        // TODO add your handling code here:
        rguestid.setText("");
        rguestname.setText("");
        raddress.setText("");
        rphoneno.setText("");
        rnoofadults.setText("");
        rnoofchildren.setText("");
}//GEN-LAST:event_rclearActionPerformed

    private void rreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rreturnActionPerformed
        // TODO add your handling code here:
        checkin c = new checkin();
        c.setVisible(true);
        setVisible(false);
}//GEN-LAST:event_rreturnActionPerformed

    private void raddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raddressActionPerformed

    private void rguestidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rguestidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rguestidActionPerformed

    private void rnoofchildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnoofchildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnoofchildrenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GuestInfo().setVisible(true);
            }
        });
    }
    String st=null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField raddress;
    private javax.swing.JButton rchkavailability;
    private javax.swing.JButton rclear;
    private javax.swing.JTextField rguestid;
    private javax.swing.JTextField rguestname;
    private javax.swing.JTextField rnoofadults;
    private javax.swing.JTextField rnoofchildren;
    private javax.swing.JTextField rphoneno;
    private javax.swing.JButton rreturn;
    // End of variables declaration//GEN-END:variables
}
