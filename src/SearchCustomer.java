

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
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
public class SearchCustomer extends javax.swing.JInternalFrame {

    

    /**
     * Creates new form Addcustomer
     */
    
    
    
    
    public SearchCustomer() {
        initComponents();
        //autoID();
        
        
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

        txtfirstname = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfn = new javax.swing.JTextField();
        txtln = new javax.swing.JTextField();
        txtpid = new javax.swing.JTextField();
        txtnyc = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtcont = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        txtid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        txtfirstname.setBackground(new java.awt.Color(153, 255, 153));
        txtfirstname.setPreferredSize(new java.awt.Dimension(1366, 768));
        txtfirstname.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(123, 13, 76));
        jLabel1.setText("Customer ID");
        txtfirstname.add(jLabel1);
        jLabel1.setBounds(60, 18, 260, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(123, 13, 76));
        jLabel2.setText("First Name");
        txtfirstname.add(jLabel2);
        jLabel2.setBounds(70, 75, 220, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 13, 76));
        jLabel3.setText("Last Name");
        txtfirstname.add(jLabel3);
        jLabel3.setBounds(70, 135, 220, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(123, 13, 76));
        jLabel4.setText("NYC Number");
        txtfirstname.add(jLabel4);
        jLabel4.setBounds(70, 260, 240, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 13, 76));
        jLabel5.setText("Passport ID");
        txtfirstname.add(jLabel5);
        jLabel5.setBounds(70, 195, 220, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 13, 76));
        jLabel6.setText("Address");
        txtfirstname.add(jLabel6);
        jLabel6.setBounds(70, 440, 190, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(123, 13, 76));
        jLabel7.setText("Gender");
        txtfirstname.add(jLabel7);
        jLabel7.setBounds(70, 315, 180, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 13, 76));
        jLabel8.setText("Contact Number");
        txtfirstname.add(jLabel8);
        jLabel8.setBounds(60, 490, 230, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(123, 13, 76));
        jLabel9.setText("Age");
        txtfirstname.add(jLabel9);
        jLabel9.setBounds(70, 375, 160, 40);

        txtfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnActionPerformed(evt);
            }
        });
        txtfirstname.add(txtfn);
        txtfn.setBounds(324, 79, 310, 40);
        txtfirstname.add(txtln);
        txtln.setBounds(324, 135, 310, 40);
        txtfirstname.add(txtpid);
        txtpid.setBounds(324, 196, 310, 40);

        txtnyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnycActionPerformed(evt);
            }
        });
        txtfirstname.add(txtnyc);
        txtnyc.setBounds(324, 255, 310, 40);

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        txtfirstname.add(txtage);
        txtage.setBounds(324, 375, 310, 40);
        txtfirstname.add(txtadd);
        txtadd.setBounds(324, 433, 310, 40);
        txtfirstname.add(txtcont);
        txtcont.setBounds(324, 490, 310, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        txtfirstname.add(jButton1);
        jButton1.setBounds(110, 570, 170, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        txtfirstname.add(jButton2);
        jButton2.setBounds(650, 570, 180, 50);

        r1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        r1.setText("    Male");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        txtfirstname.add(r1);
        r1.setBounds(324, 320, 126, 30);

        r2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        r2.setText("    Female");
        txtfirstname.add(r2);
        r2.setBounds(512, 320, 121, 30);

        txtid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtfirstname.add(txtid);
        txtid.setBounds(324, 18, 130, 50);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        txtfirstname.add(jButton3);
        jButton3.setBounds(506, 20, 128, 41);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        txtfirstname.add(jButton4);
        jButton4.setBounds(370, 570, 180, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\emirates-airlines-dubai.jpg")); // NOI18N
        txtfirstname.add(jLabel10);
        jLabel10.setBounds(0, 0, 1330, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtnycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnycActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnycActionPerformed

    
    public static void main(String args[])
    {
        
    }
        
    
    
    
    

   public void autoID()
    {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
            java.sql.Statement s = con.createStatement();
             ResultSet rs = s.executeQuery("select MAX(id) from customer ");
             rs.next();
             rs.getString("MAX(id)");
             if(rs.getString("MAX(id)") == null)
             {
              txtid.setText("CS001");
                 
             }
             
             else 
             {
               long id = Long.parseLong(rs.getString("MAX(id)").substring(2,rs.getString("MAX(id)").length()));
               id++;
               txtid.setText("CS" + String.format("%03d", id));
             }
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
   
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String id = txtid.getText();
String firstname = txtfn.getText();
String lastname = txtln.getText();
String passport = txtpid.getText();
String nyc = txtnyc.getText();
 String gender;
if(r1.isSelected())
{
gender ="Male";

    }
    else
    {
    gender="Female";
    }
String age = txtage.getText();
String address= txtadd.getText();
String contact= txtcont.getText();






        try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
              pst = con.prepareStatement("update customer set firstname = ?,lastname = ?,passport =?,nyc =?,gender=?,age=?,address=?,contact=? where id=?");
              
            
              pst.setString(1,firstname);
              pst.setString(2,lastname);
             
              pst.setString(3,passport);
              
              pst.setString(4,nyc);
              
              pst.setString(5,gender);
              
              pst.setString(6,age);
              
              pst.setString(7,address);
              pst.setString(8,contact);
              pst.setString(9,id);
              pst.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Registration Updated Successfully!!!");
              txtid.setText("");
              txtfn.setText("");
               txtln.setText("");
               txtpid.setText("");
               txtnyc.setText("");
               r1.setSelected(false);
               r2.setSelected(false);
               
               
               txtage.setText("");
              txtadd.setText("");
              txtcont.setText("");
              autoID();
             
             
              
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
          













        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void txtfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
                  String id = txtid.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
             pst = con.prepareStatement("Select * from customer where id=?");
             pst.setString(1,id);
             ResultSet rs = pst.executeQuery();
              if(rs.next()==false)
              {
                  JOptionPane.showMessageDialog(this,"Record not found!!!");
                  
              }
             
             else
              {
                  String fname=rs.getString("firstname");
                    String lname=rs.getString("lastname");
                      String passport=rs.getString("passport");
                            String nyc = rs.getString("nyc");
                        String gender = rs.getString("gender");
                        
                        if(gender.equals("Female"))
                        {
                            r1.setSelected(false);
                            r2.setSelected(true);
                        }
                        else
                            {
                            r1.setSelected(true);
                            r2.setSelected(false);
                        }
                        
                          String age=rs.getString("age");
                            String address=rs.getString("address");
                              String contact=rs.getString("contact");
                        
                              
                              txtfn.setText(fname.trim());
                              
                                txtln.setText(lname.trim());
  txtpid.setText(passport.trim());
  txtnyc.setText(nyc.trim());
  txtage.setText(age.trim());
  txtadd.setText(address.trim());
    txtcont.setText(contact.trim());
              }
             
             
   
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
         String cid = txtid.getText();
       
        try {
            // TODO add your handling code here:
            
            
            
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
            
             
             java.sql.Statement s = (java.sql.Statement)con.createStatement();
             
            
             s.executeUpdate("DELETE  FROM customer WHERE id='"+cid+"'");
             
             
              JOptionPane.showMessageDialog(null,"Customer details Deleted Successfully!!!");
              txtid.setText("");
              txtfn.setText("");
               txtln.setText("");
               txtpid.setText("");
               txtnyc.setText("");
               r1.setSelected(false);
               r2.setSelected(false);
               
               
               txtage.setText("");
              txtadd.setText("");
              txtcont.setText("");
      
             
              
        
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

    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcont;
    private javax.swing.JPanel txtfirstname;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtnyc;
    private javax.swing.JTextField txtpid;
    // End of variables declaration//GEN-END:variables















}















