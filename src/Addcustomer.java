
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.regex.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Addcustomer extends javax.swing.JInternalFrame {

    

    /**
     * Creates new form Addcustomer
     */
    
    
    
    
    public Addcustomer() {
        initComponents();
     
       // Connect();
         autoID();
        
    }
    
          Connection con;
          PreparedStatement pst;

         
        /* public void Connect()
       {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(usercreation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(usercreation.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
       }*/
          
          
          
          
          
          
          
          
          
          
          
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        fnlab = new javax.swing.JLabel();
        fnlab1 = new javax.swing.JLabel();
        fnlab2 = new javax.swing.JLabel();
        fnlab3 = new javax.swing.JLabel();
        phno = new javax.swing.JLabel();
        lnlab = new javax.swing.JLabel();
        fnlab4 = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        nyc = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 190, 50);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 80, 180, 50);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 140, 150, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NYC Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 260, 220, 40);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Passport ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 200, 190, 40);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 436, 160, 40);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 320, 110, 30);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact Number");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 489, 230, 40);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 3, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 370, 120, 40);

        txtfn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfnKeyReleased(evt);
            }
        });
        jPanel1.add(txtfn);
        txtfn.setBounds(324, 79, 310, 40);

        txtln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlnKeyReleased(evt);
            }
        });
        jPanel1.add(txtln);
        txtln.setBounds(324, 135, 310, 40);

        txtpid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpidKeyReleased(evt);
            }
        });
        jPanel1.add(txtpid);
        txtpid.setBounds(324, 196, 310, 40);

        txtnyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnycActionPerformed(evt);
            }
        });
        txtnyc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnycKeyReleased(evt);
            }
        });
        jPanel1.add(txtnyc);
        txtnyc.setBounds(324, 257, 310, 40);

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtageKeyReleased(evt);
            }
        });
        jPanel1.add(txtage);
        txtage.setBounds(324, 375, 310, 40);
        jPanel1.add(txtadd);
        txtadd.setBounds(324, 433, 310, 40);

        txtcont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontKeyReleased(evt);
            }
        });
        jPanel1.add(txtcont);
        txtcont.setBounds(324, 490, 310, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 560, 190, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(430, 560, 200, 50);

        r1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        r1.setText("    Male");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(324, 320, 126, 30);

        r2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        r2.setText("    Female");
        jPanel1.add(r2);
        r2.setBounds(512, 320, 121, 30);

        fnlab.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        fnlab.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(fnlab);
        fnlab.setBounds(660, 80, 560, 40);

        fnlab1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        fnlab1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(fnlab1);
        fnlab1.setBounds(680, 80, 560, 30);

        fnlab2.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        fnlab2.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(fnlab2);
        fnlab2.setBounds(680, 80, 560, 30);

        fnlab3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        fnlab3.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(fnlab3);
        fnlab3.setBounds(680, 80, 560, 30);

        phno.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        phno.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(phno);
        phno.setBounds(680, 490, 550, 40);

        lnlab.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        lnlab.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lnlab);
        lnlab.setBounds(660, 140, 550, 40);

        fnlab4.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        fnlab4.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(fnlab4);
        fnlab4.setBounds(680, 80, 560, 40);

        pass.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(pass);
        pass.setBounds(660, 200, 510, 40);

        nyc.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        nyc.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(nyc);
        nyc.setBounds(660, 250, 520, 40);

        age.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(age);
        age.setBounds(660, 374, 430, 40);

        txtid.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(txtid);
        txtid.setBounds(330, 20, 300, 40);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\wert.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, -10, 1330, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtnycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnycActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnycActionPerformed

    
   
    
    
    
    

      
   
    
    
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
//String gender = txtgender.getText();
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
       
        



if(firstname.equals(""))
     {
         JOptionPane.showMessageDialog(null,"First Name is Mandatory!!");
     
     }
     
     else if(passport.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Passport ID Is Mandatory!!");
     }

     
     else if(nyc.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Nyc Number Is Mandatory!!");
     }

     else if(gender.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Gender Is Mandatory!!");
     }
     
     
     else if(age.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Age Is Mandatory!!");
     }


     
     
     else if(address.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Address Is Mandatory!!");
     }

     
     else if(contact.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Contact Number Is Mandatory!!");
     }
     
    
     
     else
     {
         JOptionPane.showMessageDialog(null,"Validation Success!!");
     }
     
     
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
              pst = con.prepareStatement("insert into customer(id,firstname,lastname,passport,nyc,gender,age,address,contact)values(?,?,?,?,?,?,?,?,?)");
              pst.setString(1,id);
              pst.setString(2,firstname);
              pst.setString(3,lastname);
             
              pst.setString(4,passport);
              
              pst.setString(5,nyc);
              
              pst.setString(6,gender);
              
              pst.setString(7,age);
              
              pst.setString(8,address);
              pst.setString(9,contact);
              
              pst.executeUpdate();
              
              
              
              
              JOptionPane.showMessageDialog(null,"Registration Created Successfully!!!");
              
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

    
    
    
    
    
    
    
    
    public void autoID()
    {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
               Statement s = con.createStatement();
             ResultSet rs = s.executeQuery("select MAX(id) from customer");
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

    
    
    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void txtfnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnKeyReleased
        // TODO add your handling code here:
        
        
        String PATTERN ="^[A-Za-z]{0,15}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtfn.getText());
        if(!match.matches())
        {
            fnlab.setText("Naming Is Incorrect !! Plz use only alphabets !!");
            
        }
        else 
        {
                        fnlab.setText(null);

        }
    }//GEN-LAST:event_txtfnKeyReleased

    private void txtcontKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontKeyReleased
        // TODO add your handling code here:
        
         String PATTERN ="^[0-9]{0,10}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtcont.getText());
        if(!match.matches())
        {
            phno.setText("Phone Number Is Incorrect !! Plz use only Numbers !!");
            
        }
        else 
        {
                        phno.setText(null);

        }
        
        
    }//GEN-LAST:event_txtcontKeyReleased

    private void txtlnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnKeyReleased
        // TODO add your handling code here:
        
         
        String PATTERN ="^[A-Za-z]{0,15}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtln.getText());
        if(!match.matches())
        {
            lnlab.setText("Naming Is Incorrect !! Plz use only alphabets !!");
            
        }
        else 
        {
                        lnlab.setText(null);

        }
        
        
        
        
    }//GEN-LAST:event_txtlnKeyReleased

    private void txtpidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpidKeyReleased
        // TODO add your handling code here:
         String PATTERN ="^[0-9]{0,10}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtpid.getText());
        if(!match.matches())
        {
            pass.setText("Passport Number Is Incorrect !! Plz use only Numbers !!");
            
        }
        else 
        {
                        pass.setText(null);

        }
        
        
        
    }//GEN-LAST:event_txtpidKeyReleased

    private void txtnycKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnycKeyReleased
        // TODO add your handling code here:
        
        
         String PATTERN ="^[0-9]{0,10}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtnyc.getText());
        if(!match.matches())
        {
            nyc.setText("NYC Number Is Incorrect !! Plz use only Numbers !!");
            
        }
        else 
        {
                        nyc.setText(null);

        }
        
    }//GEN-LAST:event_txtnycKeyReleased

    private void txtageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyReleased
        // TODO add your handling code here:
        
         String PATTERN ="^[0-9]{0,3}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtage.getText());
        if(!match.matches())
        {
            age.setText("Age Is Incorrect !! Plz use only Numbers !!");
            
        }
        else 
        {
                        age.setText(null);

        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_txtageKeyReleased

    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel fnlab;
    private javax.swing.JLabel fnlab1;
    private javax.swing.JLabel fnlab2;
    private javax.swing.JLabel fnlab3;
    private javax.swing.JLabel fnlab4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lnlab;
    private javax.swing.JLabel nyc;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel phno;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcont;
    private javax.swing.JTextField txtfn;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtnyc;
    private javax.swing.JTextField txtpid;
    // End of variables declaration//GEN-END:variables















}















