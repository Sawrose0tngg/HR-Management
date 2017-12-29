
package advertisement;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class advertisement extends javax.swing.JFrame {
 Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String posi;
     DefaultTableModel dtm;
    
    public advertisement() {
        initComponents();
            clear();
            showTableData();
    
   
    }
    
    
    //function to view table
    public void showTableData(){
        
           dtm = (DefaultTableModel)jTable1.getModel();
        con=jobconnection.ConnectDB();
        try {
            st= con.createStatement();
            String msg = "select * from advertisement";
            dtm.setRowCount(0);
            
            ResultSet rs= st.executeQuery(msg);
            while(rs.next()){
                  dtm.addRow(new Object[]{rs.getString("companyname"),rs.getString("officeno"),rs.getString("mobno"),rs.getString("emailid"),rs.getString("startdate"),rs.getString("enddate"),rs.getString("position"),rs.getString("totalamount")});
            }
            con.close();
            jTable1.setAutoCreateRowSorter(true);
        } catch (Exception e) {
            System.out.println("not"+e);
        }
    }
    
    
    //Clear all the input fields
    public void clear(){
        txtoff.setText(null);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        txtcompany.setText("");
        buttonGroup1.clearSelection();
        txtcoll.setText("");
        lblimage.setIcon(null);
        txtgov.setText(null);
        txtmob.setText(null);
        txtemail.setText(null);
        
        
        
        
        
        
        
    }
     String ImgPath = null;
 
 
 //to Check email validation
  public boolean checkEmail() {
        if (!(Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", txtemail.getText()))) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email address", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }

    }
  
  //to check input fields
  public boolean checkInput(){
      if(txtcompany.getText()==null 
              ||txtgov.getText()==null
              ||txtoff.getText()==null
              ||txtemail.getText()==null
              ||txtcoll.getText()==null
              ||jDateChooser1.getDate()==null
              ||jDateChooser2.getDate()==null
              ||buttonGroup1.isSelected(null)
              
              )
              ;
     return false;
      
  }

  //Function for image
  public ImageIcon ResizeImage(String imagepath, byte[] pic) {
        ImageIcon myImage;
        if (imagepath != null) {
            myImage = new ImageIcon(imagepath);
        } else {
            myImage = new ImageIcon(pic);

        }
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        btnsubmit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcoll = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        btnAttachFile = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtgov = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtoff = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmob = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(0, 191, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel11.setText("Advertisement");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(255, 255, 255)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Starting Date :");

        jLabel2.setText("Ending Date :");
        jLabel2.setPreferredSize(new java.awt.Dimension(68, 15));

        jLabel3.setText("Position :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Top");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Bottom");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Right");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Left");

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Amount :");

        lblimage.setBackground(new java.awt.Color(255, 255, 255));
        lblimage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblimage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblimage.setOpaque(true);

        btnAttachFile.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAttachFile.setText("Attach Banner");
        btnAttachFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachFileActionPerformed(evt);
            }
        });

        jLabel6.setText("Company Name :");

        jLabel8.setText("Gov. License No. :");

        jLabel9.setText("Office No. :");

        txtoff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtoffKeyTyped(evt);
            }
        });

        jLabel4.setText("Mobile No. :");

        txtmob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmobKeyTyped(evt);
            }
        });

        jLabel10.setText("Email Id :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Office No.", "Mobile No.", "Email Id", "Starting Date", "Ending Date", "Position", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtgov, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtoff, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtmob, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(7, 7, 7)
                        .addComponent(jRadioButton2)
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton3)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtcoll, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnAttachFile))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgov, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtoff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnAttachFile)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsubmit)
                            .addComponent(jButton2)
                            .addComponent(btnupdate))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnclear)
                            .addComponent(btncancel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //function for clear button
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clear();
        
        
    }//GEN-LAST:event_btnclearActionPerformed

    //function for attach button
    private void btnAttachFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachFileActionPerformed
        // Image File Chooser:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.img", "*.png", "*.jpg");
        file.addChoosableFileFilter(filter);

        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lblimage.setIcon(ResizeImage(path, null));
            ImgPath = path;
           
            
        } else {
            JOptionPane.showMessageDialog(null, "No file Selected");
        }
    }//GEN-LAST:event_btnAttachFileActionPerformed

    //function for submit button
    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        con = jobconnection.ConnectDB();
        try {
             InputStream imgg = new FileInputStream(new File(ImgPath));
           String msg ="insert into advertisement (companyname,govno,officeno,mobno,emailid,startdate,enddate,position,totalamount,photo) values (?,?,?,?,?,?,?,?,?,?)";
           pst=con.prepareStatement(msg);
           
               pst.setString(1,txtcompany.getText());
               pst.setString(2,txtgov.getText());
               pst.setString(3,txtoff.getText());
               pst.setString(4,txtmob.getText());
               pst.setString(5,txtemail.getText());
            
           SimpleDateFormat obj  = new SimpleDateFormat("yyyy/MM/dd");
           String da = obj.format(jDateChooser1.getDate());
           pst.setString(6,da);
            
           SimpleDateFormat obj2  = new SimpleDateFormat("yyyy/MM/dd");
           String dte = obj2.format(jDateChooser2.getDate());
           pst.setString(7,dte);
           
           
           if(jRadioButton1.isSelected()){
               posi="top";
               pst.setString(8,posi);
           }
           if (jRadioButton2.isSelected()){
               posi="bottom";
                pst.setString(8,posi);
           }
           if(jRadioButton3.isSelected()){
               posi="right";
                pst.setString(8,posi);
           }
           if(jRadioButton4.isSelected()){
               posi="left";
                pst.setString(8,posi);
           }
           
        
           pst.setString(9,txtcoll.getText());
           
         
            pst.setBlob(10,imgg);
            
            
           
           pst.execute();
        JOptionPane.showMessageDialog(this,"Inserted","Successfully inserted",JOptionPane.INFORMATION_MESSAGE);
           
           clear();
           showTableData();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Please fill all the areas");
          //  System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    //function for cancel button
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
            this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    //function to take number only
    private void txtoffKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoffKeyTyped
       char c = evt.getKeyChar();
       if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
           getToolkit().beep();
           evt.consume();
           
           
       }
    }//GEN-LAST:event_txtoffKeyTyped

    //function to take number only
    private void txtmobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobKeyTyped
       char c = evt.getKeyChar();
       if(!Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE){
           getToolkit().beep();
           evt.consume();
           
       }
    }//GEN-LAST:event_txtmobKeyTyped

    //function for delete data
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=jobconnection.ConnectDB();
                String sql= "delete from advertisement where companyname= '" + txtcompany.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
          clear();
          showTableData();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }      
    }//GEN-LAST:event_jButton2ActionPerformed

    //select data from table
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
     try {
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         int i= jTable1.getSelectedRow();
         TableModel objm = jTable1.getModel();
         txtcompany.setText(objm.getValueAt(i,0).toString());
         txtoff.setText(objm.getValueAt(i,1).toString());
         txtmob.setText(objm.getValueAt(i,2).toString());
         txtemail.setText(objm.getValueAt(i,3).toString());
         Date date = new SimpleDateFormat("yyyy/MM/dd").parse((String)model.getValueAt(i,4));
         jDateChooser1.setDate(date);
          Date ddate = new SimpleDateFormat("yyyy/MM/dd").parse((String)model.getValueAt(i,5));
         jDateChooser2.setDate(ddate);
         
                      
           
           
         
         
     }
     
         catch(Exception e){
              
         }         
    }//GEN-LAST:event_jTable1MouseClicked

    //function for update
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        
        con=jobconnection.ConnectDB();
                
            
           SimpleDateFormat obj  = new SimpleDateFormat("yyyy/MM/dd");
           String da = obj.format(jDateChooser1.getDate());
            SimpleDateFormat objd  = new SimpleDateFormat("yyyy/MM/dd");
           String date = objd.format(jDateChooser2.getDate());
           
           if(jRadioButton1.isSelected()){
               posi="top";
               
           }
           if (jRadioButton2.isSelected()){
               posi="bottom";
               
           }
           if(jRadioButton3.isSelected()){
               posi="right";
               
           }
           if(jRadioButton4.isSelected()){
               posi="left";
               
           }
                try {
                  
                  
            String msg="update advertisement set startdate='"+da+"',enddate='"+date+"',position='"+posi+"',totalamount='"+txtcoll.getText()+"' where companyname='"+txtcompany.getText()+"'";
            
            pst=con.prepareStatement(msg);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Updated","Record",JOptionPane.INFORMATION_MESSAGE);
            
           
           clear();
           showTableData();
          
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnupdateActionPerformed
    
    
   
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
            java.util.logging.Logger.getLogger(advertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(advertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(advertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(advertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new advertisement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttachFile;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField txtcoll;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgov;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtoff;
    // End of variables declaration//GEN-END:variables
}
