


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class addflight extends javax.swing.JInternalFrame {

    /**
     * Creates new form addflight
     */
    public addflight() {
        initComponents();
        
        autoID();
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtflight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdept = new javax.swing.JTextField();
        txtarr = new javax.swing.JTextField();
        txtfchrg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtdate = new javax.swing.JTextField();
        txtsrc = new javax.swing.JComboBox<>();
        txtdst = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(648, 666));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel1.setText(" Flight ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(26, 10, 140, 40);

        txtfid.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        txtfid.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(txtfid);
        txtfid.setBounds(280, 20, 170, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel3.setText("Flight Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 190, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel4.setText("Source");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 130, 180, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel5.setText("Destination");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 190, 40);

        txtflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtflightActionPerformed(evt);
            }
        });
        jPanel1.add(txtflight);
        txtflight.setBounds(270, 80, 310, 37);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 262, 190, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel7.setText("DepatureTime");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 320, 190, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel8.setText("Arrival Time");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 400, 190, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel9.setText("Flight Charge");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 470, 190, 40);

        txtdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeptActionPerformed(evt);
            }
        });
        jPanel1.add(txtdept);
        txtdept.setBounds(270, 320, 310, 40);

        txtarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtarrActionPerformed(evt);
            }
        });
        jPanel1.add(txtarr);
        txtarr.setBounds(270, 400, 310, 37);

        txtfchrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfchrgActionPerformed(evt);
            }
        });
        jPanel1.add(txtfchrg);
        txtfchrg.setBounds(270, 470, 310, 37);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(86, 564, 170, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 560, 170, 50);

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        jPanel1.add(txtdate);
        txtdate.setBounds(270, 260, 310, 40);

        txtsrc.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtsrc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Algeria", "Argentina", "Armenia", "Australia", "Bahrain", "Bangladesg", "Belgium", "Bhutan", "Brazil", "china", "denmark", "Egypt", "France", "India ", "Iran", "libya", "mauritius", "Oman", "Pakistan", "Qatar", "yemen", "Zambia", " " }));
        txtsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrcActionPerformed(evt);
            }
        });
        jPanel1.add(txtsrc);
        txtsrc.setBounds(270, 136, 310, 40);

        txtdst.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtdst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Algeria", "Argentina", "Armenia", "Australia", "Bahrain", "Bangladesg", "Belgium", "Bhutan", "Brazil", "china", "denmark", "Egypt", "France", "India ", "Iran", "libya", "mauritius", "Oman", "Pakistan", "Qatar", "yemen", "Zambia", " " }));
        jPanel1.add(txtdst);
        txtdst.setBounds(270, 200, 310, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\noneed.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1330, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtflightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtflightActionPerformed

    private void txtdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeptActionPerformed

 
 
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


String id = txtfid.getText();
String flightname = txtflight.getText();
String source = txtsrc.getSelectedItem().toString();
String destination = txtdst.getSelectedItem().toString();
//DateFormat da= new SimpleDateFormat("yyyy-MM-dd");
//String date= da.format(txtdate.getDate());
//see this;;
String date= txtdate.getText();

String deptime= txtdept.getText();
String arrivaltime= txtarr.getText();
String flicharge= txtfchrg.getText();



if(flightname.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Flight Name is Mandatory!!");
     
     }
     
     else if(source .equals(""))
     {
         JOptionPane.showMessageDialog(null,"Source Is Mandatory!!");
     }

     
     else if(destination.equals(""))
     {
         JOptionPane.showMessageDialog(null,"destination  Is Mandatory!!");
     }

     else if(date.equals(""))
     {
         JOptionPane.showMessageDialog(null,"date Is Mandatory!!");
     }
     
     
     else if(deptime.equals(""))
     {
         JOptionPane.showMessageDialog(null,"departure time Is Mandatory!!");
     }


     
     
     else if(arrivaltime.equals(""))
     {
         JOptionPane.showMessageDialog(null,"arrival time Is Mandatory!!");
     }

     
     else if(flicharge.equals(""))
     {
         JOptionPane.showMessageDialog(null,"flight charge Is Mandatory!!");
     }
     
    
     
     else
     {
         JOptionPane.showMessageDialog(null,"Validation Success!!");
     }
     

        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
              pst = con.prepareStatement("insert into flight(id,flightname,source,destination,date,arrivaltime,deptime,flicharge)values(?,?,?,?,?,?,?,?)");
              pst.setString(1,id);
              pst.setString(2,flightname);
              pst.setString(3,source);
             
              pst.setString(4,destination);
              
              pst.setString(5,date);
              
              pst.setString(6,arrivaltime);
              
              pst.setString(7,deptime);
              
              pst.setString(8,flicharge);
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Flight Created Successfully!!!");
              
              txtflight.setText("");
               
               txtsrc.setSelectedIndex(0);
               txtdst.setSelectedIndex(0);
               
               txtdate.setText("");
               
               
               txtdate.setText("");
              txtdept.setText("");
              txtarr.setText("");
              txtfchrg.setText("");
              autoID();
             
       
        }
        
            
            
            
         catch (ClassNotFoundException ex) {
            Logger.getLogger(addflight.class.getName()).log(Level.SEVERE, null, ex);
        }
              catch (SQLException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtarrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtarrActionPerformed

    private void txtfchrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfchrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfchrgActionPerformed

   
     
    /* public static void main(String arg[])
    {
    }

    */
     public void autoID()
    {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines","root","safahmi7.");
            Statement s = con.createStatement();
             ResultSet rs = s.executeQuery("select MAX(id) from flight ");
             rs.next();
             rs.getString("MAX(id)");
             if(rs.getString("MAX(id)") == null)
             {
              txtfid.setText("FL001");
                 
             }
             
             else 
             {
               long id = Long.parseLong(rs.getString("MAX(id)").substring(2,rs.getString("MAX(id)").length()));
               id++;
               txtfid.setText("FL" + String.format("%03d", id));
             }
             
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
   
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           
        
        this.hide();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcActionPerformed

    
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private datechooser.beans.DateChooserPanel dateChooserPanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtarr;
    private datechooser.beans.DateChooserPanel txtdat;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdept;
    private javax.swing.JComboBox<String> txtdst;
    private javax.swing.JTextField txtfchrg;
    private javax.swing.JLabel txtfid;
    private javax.swing.JTextField txtflight;
    private javax.swing.JComboBox<String> txtsrc;
    // End of variables declaration//GEN-END:variables
}
