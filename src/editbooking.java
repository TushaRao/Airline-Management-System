


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class editbooking extends javax.swing.JInternalFrame {

    /**
     * Creates new form addflight
     */
    public editbooking() {
        initComponents();
        
       // autoID();
        
    }
    
    Connection con;
     PreparedStatement pst;
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        dateChooserPanel2 = new datechooser.beans.DateChooserPanel();
        txtdat = new datechooser.beans.DateChooserPanel();
        cusid = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        seat = new javax.swing.JTextField();
        dat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        prc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cid = new javax.swing.JTextField();
        txtcls = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        cusid.setBackground(new java.awt.Color(204, 255, 255));
        cusid.setEnabled(false);
        cusid.setPreferredSize(new java.awt.Dimension(648, 666));
        cusid.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel1.setText("Ticket ID");
        cusid.add(jLabel1);
        jLabel1.setBounds(40, 26, 190, 43);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel3.setText("Flight ID");
        cusid.add(jLabel3);
        jLabel3.setBounds(40, 95, 230, 36);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel4.setText("Customer ID");
        cusid.add(jLabel4);
        jLabel4.setBounds(40, 162, 220, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel5.setText("Class");
        cusid.add(jLabel5);
        jLabel5.setBounds(40, 227, 230, 40);

        fid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fidActionPerformed(evt);
            }
        });
        cusid.add(fid);
        fid.setBounds(289, 94, 290, 37);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel6.setText("Price");
        cusid.add(jLabel6);
        jLabel6.setBounds(40, 296, 230, 40);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel7.setText("Seats");
        cusid.add(jLabel7);
        jLabel7.setBounds(40, 363, 220, 37);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel8.setText("Date");
        cusid.add(jLabel8);
        jLabel8.setBounds(40, 425, 220, 37);

        seat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatActionPerformed(evt);
            }
        });
        cusid.add(seat);
        seat.setBounds(289, 363, 290, 37);

        dat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        dat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datActionPerformed(evt);
            }
        });
        cusid.add(dat);
        dat.setBounds(289, 425, 290, 37);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cusid.add(jButton1);
        jButton1.setBounds(91, 522, 167, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        cusid.add(jButton2);
        jButton2.setBounds(605, 523, 153, 49);

        tid.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        cusid.add(tid);
        tid.setBounds(289, 26, 134, 43);

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        cusid.add(jButton3);
        jButton3.setBounds(488, 26, 155, 43);

        prc.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cusid.add(prc);
        prc.setBounds(289, 298, 290, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        cusid.add(jButton4);
        jButton4.setBounds(351, 522, 172, 50);

        cid.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cusid.add(cid);
        cid.setBounds(289, 161, 290, 38);

        txtcls.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtcls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Economy", " " }));
        cusid.add(txtcls);
        txtcls.setBounds(289, 227, 220, 44);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 28)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\emiriiiii.jpg")); // NOI18N
        cusid.add(jLabel2);
        jLabel2.setBounds(0, -30, 1340, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cusid, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cusid, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = tid.getText();
  
       
       
         try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
              pst = con.prepareStatement("delete from tickets where id=?");
              
            
              pst.setString(1,id);
             // pst.setString(5,password);
              
              
              pst.executeUpdate();
         
              
              
            JOptionPane.showMessageDialog(null,"Booking details Deleted Successfully!!!");
            tid.setText("");

             fid.setText("");
            
              cid.setText("");
        

            txtcls.setSelectedIndex(0);
           

            prc.setText("");

        
            seat.setText("");
            dat.setText("");
            tid.requestFocus();
            

            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(searchflight.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = tid.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
            pst = con.prepareStatement("select * from tickets where id = ?");
            pst.setString(1,id);
            ResultSet rs = pst.executeQuery();
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this,"Record Not Found!!!");
            }
            else
            {
                String flid=rs.getString("flid");
                String custid =rs.getString("custid");

                String clas=rs.getString("class");

                String price =rs.getString("price");
                String seats =rs.getString("seats");
                String date =rs.getString("date");
               

                fid.setText(flid.trim());
        
               cid.setText(custid.trim());

                // Object selected1=txtsrc.getSelectedItem();
                /* if(selected!=null)
                {
                    setText(selected.toString());
                }*/

                   txtcls.setSelectedItem(clas.trim());//wow!!!!!!!!!!!!!!!!!!!
                //Object selected2=txtdst.getSelectedItem();
                prc.setText(price.trim());
                seat.setText(seats.trim());
                dat.setText(date.trim());
              

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(searchflight.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String id = tid.getText();
        String flid = fid.getText();
        String custid = cid.getText();
        String clas = txtcls.getSelectedItem().toString();

        //String destination =txtdst.getSelectedItem().toString();

        //DateFormat da= new SimpleDateFormat("yyyy-MM-dd");
        //String date= da.format(txtdate.getDate());
        //see this;;
        String price= prc.getText();

        String seats= seat.getText();
        String date= dat.getText();
     

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
            pst = con.prepareStatement("update tickets set flid=?,custid=?,class=?,price=?,seats=?,date=? where id=?");

            pst.setString(1,flid);
            pst.setString(2,custid);

            pst.setString(3,clas);

            pst.setString(4,price);

            pst.setString(5,seats);

            pst.setString(6,date);

          
            pst.setString(7,id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Booking details updated Successfully!!!");
            tid.setText("");
            
            fid.setText("");
            
              cid.setText("");
        

            txtcls.setSelectedIndex(0);
           

            prc.setText("");

        
            seat.setText("");
            dat.setText("");
      
           

        }

        catch (ClassNotFoundException ex) {
            Logger.getLogger(addflight.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datActionPerformed

    private void seatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatActionPerformed

    private void fidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fidActionPerformed

 
 
     
   
     
    /* public static void main(String arg[])
    {
    }

    */
     public void autoID()
    {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
            java.sql.Statement s = con.createStatement();
             ResultSet rs = s.executeQuery("select MAX(id) from tickets ");
             rs.next();
             rs.getString("MAX(id)");
             if(rs.getString("MAX(id)") == null)
             {
             tid.setText("TK001");
                 
             }
             
             else 
             {
               long id = Long.parseLong(rs.getString("MAX(id)").substring(2,rs.getString("MAX(id)").length()));
               id++;
               tid.setText("TK" + String.format("%03d", id));
             }
             
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
   
    
  
   
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cid;
    private javax.swing.JPanel cusid;
    private javax.swing.JTextField dat;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private datechooser.beans.DateChooserPanel dateChooserPanel2;
    private javax.swing.JTextField fid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField prc;
    private javax.swing.JTextField seat;
    private javax.swing.JTextField tid;
    private javax.swing.JComboBox<String> txtcls;
    private datechooser.beans.DateChooserPanel txtdat;
    // End of variables declaration//GEN-END:variables
}