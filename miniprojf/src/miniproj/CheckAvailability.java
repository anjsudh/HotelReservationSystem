/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RservationForm.java
 *
 * Created on Apr 5, 2012, 7:22:33 PM
 */
package miniproj;
import java.sql.*;
import javax.swing.JOptionPane;
import miniproj.checkin;

/**
 *
 * @author Anjana
 */
public class CheckAvailability extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
    /** Creates new form RservationForm */
    public CheckAvailability() {
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
        ccheckindate = new javax.swing.JTextField();
        ccheckoutdate = new javax.swing.JTextField();
        cnoofrooms = new javax.swing.JTextField();
        cchkavailability = new javax.swing.JButton();
        rclear = new javax.swing.JButton();
        rreturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cguestid = new javax.swing.JTextField();
        ctype = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CheckAvailability");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK FOR AVAILABILITY");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Check-In Date");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check-Out Date");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. of Rooms");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room Type");

        ccheckindate.setForeground(new java.awt.Color(0, 153, 255));

        ccheckoutdate.setForeground(new java.awt.Color(0, 153, 255));

        cnoofrooms.setForeground(new java.awt.Color(0, 153, 255));

        cchkavailability.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cchkavailability.setForeground(new java.awt.Color(0, 153, 204));
        cchkavailability.setText("CHECK AVAILABILITY");
        cchkavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cchkavailabilityActionPerformed(evt);
            }
        });

        rclear.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        rclear.setForeground(new java.awt.Color(0, 153, 204));
        rclear.setText("CLEAR");
        rclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rclearActionPerformed(evt);
            }
        });

        rreturn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        rreturn.setForeground(new java.awt.Color(0, 153, 204));
        rreturn.setText("RETURN TO CHECK IN");
        rreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rreturnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GUEST ID");

        cguestid.setForeground(new java.awt.Color(0, 153, 255));
        cguestid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cguestidActionPerformed(evt);
            }
        });

        ctype.setForeground(new java.awt.Color(0, 153, 255));
        ctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A/C Suite(Single)", "A/C Suite(Double)", "A/C Premium(Single)", "A/C Premium(Double)", "A/C Deluxe(Single)", "A/C Deluxe(Double)", "Non A/C(Single)", "Non A/C(Double)" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rclear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rreturn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jLabel5))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cguestid)
                            .addComponent(ccheckindate)
                            .addComponent(ccheckoutdate)
                            .addComponent(cnoofrooms)
                            .addComponent(ctype, 0, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(cchkavailability, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cguestid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccheckindate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ccheckoutdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cnoofrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cchkavailability)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rclear)
                    .addComponent(rreturn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cchkavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cchkavailabilityActionPerformed
        // TODO add your handling code here:
        try
            {
                try
                {
                    String sql=("begin check_availability("+cguestid.getText()+",'"+ctype.getSelectedItem()+"','"+ccheckindate.getText()+"','"+ccheckoutdate.getText()
                            +"',"+cnoofrooms.getText()+"); end;");
                    PreparedStatement pstmt=con.prepareCall(sql);
                    //JOptionPane.showMessageDialog(this,sql);
                    pstmt.execute();
                    //clear();
                    //JOptionPane.showMessageDialog(this,"Procedure called Successfully!!");
          
                } 
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }
                String str=null;
                int [] rno;
                rno=new int[10];
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                rs=stmt.executeQuery("select * from temp");
                rs.first();
                int n=Integer.parseInt(cnoofrooms.getText());int i;
                for(i=0;i<n;i++)
                {
                str=rs.getString(1);
                rno[i]=Integer.parseInt(str);
                rs.next();
                }
                if(i==n)
                {
                    int x=JOptionPane.showConfirmDialog(this,"Required rooms are availlable!!\nDo You want to reserve rooms??", "Reserve Room", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);

                    if(x==JOptionPane.YES_OPTION)
                    {
                        for(i=0;i<n;i++)
                        {
                        try
                        {

                            String sql=("insert into allotted values(?,?,?,?)");
                            PreparedStatement pstmt=con.prepareStatement(sql);
                            pstmt.setString(1,String.valueOf(rno[i]));
                            pstmt.setString(2,cguestid.getText());
                            pstmt.setString(3,ccheckindate.getText());
                            pstmt.setString(4,ccheckoutdate.getText());
                            pstmt.executeUpdate();
                           // JOptionPane.showMessageDialog(this, "Room Allotment Details INSERTED Successfully!!");
                            try
                            {
                                String sqll=("update room set status='occupied' where roomno="+rno[i]+"");
                                PreparedStatement pstmtt=con.prepareStatement(sqll);
                                pstmtt.executeUpdate();
                               // JOptionPane.showMessageDialog(this, "Room Details UPDATED" +
                                 //       " Successfully!!");
                            } 
                            catch(SQLException ex)
                            {
                                JOptionPane.showMessageDialog(this, ex.getMessage());
                            }
                        } 
                        catch(SQLException ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage());
                        }
                        }
                        if(i==n)
                        {
                            String num =null;
                         try
                          {
                             stmt =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                               rs=stmt.executeQuery("select max(billno)+1 from bill");
                                rs.first();
                                if(rs.getString(1)!=null)
                                     num=rs.getString(1);
                                else 
                                    num=new String("1");
                               
                           }
                           catch(SQLException ex)
                            {
                                JOptionPane.showMessageDialog(this,ex.getMessage());
                            }
                         try
                        {

                            String sql=("insert into bill values(?,?,?,?,?,?)");
                            PreparedStatement pstmt=con.prepareStatement(sql);
                            pstmt.setString(1,num);
                            pstmt.setString(2,cguestid.getText());
                            pstmt.setString(3,cnoofrooms.getText());
                            pstmt.setString(4,null);
                            pstmt.setString(5,null);
                            pstmt.setString(6,null);
                            pstmt.executeUpdate();
                         //   JOptionPane.showMessageDialog(this, "Bill CREATED Successfully!!");
                        } 
                        catch(SQLException ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage());
                        }
                          
                            int ii=1;
                            for(ii=1;ii<=5;ii++)
                            {
                                try
                        {
                                String sql=("insert into orders values(?,?,?,?)");
                            PreparedStatement pstmt=con.prepareStatement(sql);
                            pstmt.setString(1,cguestid.getText());
                            pstmt.setString(2,String.valueOf(ii));
                            pstmt.setString(3,String.valueOf(0));
                            pstmt.setString(4,String.valueOf(0));
                            pstmt.executeUpdate();
                           // JOptionPane.showMessageDialog(this, "ORDER initialised successfully Successfully!!");
             
                        } 
                        catch(SQLException ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage());
                        }
                        } 
                            for(ii=1;ii<=10;ii++)
                            {
                                try
                        {
                                String sql=("insert into uses values(?,?,?,?)");
                            PreparedStatement pstmt=con.prepareStatement(sql);
                            pstmt.setString(1,cguestid.getText());
                            pstmt.setString(2,String.valueOf(ii));
                            pstmt.setString(3,String.valueOf(0));
                            pstmt.setString(4,String.valueOf(0));
                            pstmt.executeUpdate();
                           // JOptionPane.showMessageDialog(this, "USES initialised successfully Successfully!!");
             
                        } 
                        catch(SQLException ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage());
                        }
                        }
                          JOptionPane.showMessageDialog(this, "Rooms Reserved!!");  
                        }
                        
                    }
                     else
                    {
                        JOptionPane.showMessageDialog(this, "Room not Reserved!!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No Free Rooms!");
                }
            }
            catch(SQLException ex)
            {
            JOptionPane.showMessageDialog(this,"No Free Rooms!");
            }
    }//GEN-LAST:event_cchkavailabilityActionPerformed

    private void rclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rclearActionPerformed
        // TODO add your handling code here:
        cguestid.setText("");
        ccheckindate.setText("");
        ccheckoutdate.setText("");
        cnoofrooms.setText("");
        
    }//GEN-LAST:event_rclearActionPerformed

    private void rreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rreturnActionPerformed
        // TODO add your handling code here:
        checkin c = new checkin();
        c.setVisible(true);
        setVisible(false);
}//GEN-LAST:event_rreturnActionPerformed

    private void cguestidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cguestidActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cguestidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CheckAvailability().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ccheckindate;
    private javax.swing.JTextField ccheckoutdate;
    private javax.swing.JButton cchkavailability;
    private javax.swing.JTextField cguestid;
    private javax.swing.JTextField cnoofrooms;
    private javax.swing.JComboBox ctype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rclear;
    private javax.swing.JButton rreturn;
    // End of variables declaration//GEN-END:variables
}
