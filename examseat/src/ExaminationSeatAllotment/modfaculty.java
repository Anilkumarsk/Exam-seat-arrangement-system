/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExaminationSeatAllotment;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anilkumar S K
 */
public class modfaculty extends javax.swing.JFrame {

    /**
     * Creates new form modfaculty
     */
    public modfaculty() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JToggleButton();
        clear = new javax.swing.JToggleButton();
        txtfname = new javax.swing.JTextField();
        txtfid = new javax.swing.JTextField();
        txtbid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        facultylabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("FACULTY NAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 220, 138, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("FACULTY_ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 140, 114, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("BRANCH _ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 290, 116, 30);

        update.setBackground(new java.awt.Color(51, 51, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(300, 370, 105, 31);

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(610, 330, 91, 31);

        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnameKeyPressed(evt);
            }
        });
        jPanel1.add(txtfname);
        txtfname.setBounds(500, 220, 150, 30);

        txtfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfidActionPerformed(evt);
            }
        });
        txtfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfidKeyPressed(evt);
            }
        });
        jPanel1.add(txtfid);
        txtfid.setBounds(500, 140, 150, 30);
        jPanel1.add(txtbid);
        txtbid.setBounds(500, 290, 150, 30);

        back.setBackground(new java.awt.Color(51, 51, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(370, 470, 120, 31);

        delete.setBackground(new java.awt.Color(51, 51, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(470, 370, 101, 31);

        facultylabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        facultylabel.setForeground(new java.awt.Color(255, 0, 0));
        facultylabel.setText("MODIFY FACULTY DETAILS");
        jPanel1.add(facultylabel);
        facultylabel.setBounds(290, 40, 327, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customblue.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -40, 930, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
       
  try
{
   Class.forName("com.mysql.jdbc.Driver");  
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examseat","root","");
   Statement st=con.createStatement();
   String q,f,n,b;
   f=txtfid.getText();
   n=txtfname.getText();
   b=txtbid.getText();
   q="update faculty set faculty_name='"+n+"',branch_id='"+b+"' where faculty_id='"+f+"';";
   st.execute(q);
   JOptionPane.showMessageDialog(this,"faculty details updated successfully");
          
}
catch(SQLException e)
{
              JOptionPane.showMessageDialog(null,e);
 txtfname.setText("");
  txtfid.setText("");
   txtbid.setText("");
} 
  catch (ClassNotFoundException ex) {
            Logger.getLogger(modfaculty.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        txtfname.setText("");
        txtfid.setText("");
        txtbid.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
        mainscreen m=new mainscreen();
        m.setVisible(true);

    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
       
  try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examseat","root","");
            Statement st=con.createStatement();
            String q,u;
            u=txtfid.getText();
            q="delete from faculty where faculty_id='"+u+"' ";
            st.execute(q);
            JOptionPane.showMessageDialog(this,"Branch details deleted");

        }
        catch(SQLException e)
        {
   
        JOptionPane.showMessageDialog(null,e);
 txtfname.setText("");
  txtfid.setText("");
   txtbid.setText("");
        }
  catch (ClassNotFoundException ex) {
            Logger.getLogger(modfaculty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void txtfnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtfnameKeyPressed

    private void txtfidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfidKeyPressed
        // TODO add your handling code here:
         try{
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examseat","root","");
        String u;
         u=txtfid.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ 
        
         String display="select * from faculty where faculty_id='"+u+"';";
          
         PreparedStatement pst=con.prepareStatement(display);
         ResultSet rs=pst.executeQuery(display);
         rs.next();
         txtfname.setText(rs.getString("faculty_name"));
         txtbid.setText(rs.getString("branch_id"));
         }
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(modstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtfidKeyPressed

    private void txtfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfidActionPerformed

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
            java.util.logging.Logger.getLogger(modfaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modfaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modfaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modfaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modfaculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JToggleButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel facultylabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtfid;
    private javax.swing.JTextField txtfname;
    private javax.swing.JToggleButton update;
    // End of variables declaration//GEN-END:variables
}