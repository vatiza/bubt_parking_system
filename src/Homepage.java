/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rakib
 */
public class Homepage extends javax.swing.JFrame {
//    private static final String username="admin";
//    private static final String password="admin";
//            private static final String datacon="jdbc:mysql://localhost/bubtparking";
//    Connection sqlcon=null;
//    PreparedStatement pst=null;
//    ResultSet rs= null;

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        dt();
        times();
        showinfo();
        
    }
    public void dt(){
        Date d= new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
        String dd=sdf.format(d);
        date1.setText(dd);
        
    }
     Timer t;
        SimpleDateFormat st;
    public void times(){

        t= new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           Date dt =new Date();
           st=new SimpleDateFormat("hh:mm:ss a");
           String tt=st.format(dt);
           time1.setText(tt);    
        }  
    });
        t.start();
    }
  
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        desi1 = new javax.swing.JComboBox<>();
        dept1 = new javax.swing.JComboBox<>();
        int1 = new javax.swing.JTextField();
        id2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vtype1 = new javax.swing.JComboBox<>();
        vnum1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        time1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        tk1 = new javax.swing.JTextField();
        exit1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        searchbx = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        aboutb = new javax.swing.JButton();
        logout1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUBT Vechile Parking System");
        setBackground(new java.awt.Color(255, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Designation");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 216, 89, -1));

        jLabel2.setBackground(new java.awt.Color(0, 255, 0));
        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        jLabel2.setText("Please Infrom Us Your Information");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 122, 289, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Department");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 253, 89, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Intake");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 296, 50, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("ID");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 328, -1, -1));

        desi1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Faculty", "Office Worker" }));
        desi1.setBorder(null);
        getContentPane().add(desi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 214, -1, -1));

        dept1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "BBA", "ENG", " " }));
        getContentPane().add(dept1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 252, -1, -1));
        getContentPane().add(int1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 296, 91, -1));
        getContentPane().add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 328, 127, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Vehicle Type");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 366, 89, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Vehicle Number");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 404, 104, -1));

        vtype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motorcycle", "Bicycle", "Car", "Other", " " }));
        getContentPane().add(vtype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 366, -1, -1));
        getContentPane().add(vnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 404, 138, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Token Key");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 442, -1, -1));

        save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10617339661581068846-32.png"))); // NOI18N
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        getContentPane().add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 525, -1, -1));

        time1.setBackground(new java.awt.Color(0, 51, 255));
        time1.setFont(new java.awt.Font("FarCry", 1, 24)); // NOI18N
        time1.setForeground(new java.awt.Color(0, 0, 255));
        time1.setText("time");
        time1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        time1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                time1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 94, 148, 55));

        date1.setBackground(new java.awt.Color(0, 255, 0));
        date1.setFont(new java.awt.Font("FarCry", 1, 18)); // NOI18N
        date1.setText("date");
        date1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                date1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 160, 123, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Token_NO", "Vehicle Number", "Vehicle Type", "Id", "Designation", "Dept", "Entry Time", "Intake"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 156, 940, 300));

        tk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tk1ActionPerformed(evt);
            }
        });
        getContentPane().add(tk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 442, 78, -1));

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5352308321577437005-32.png"))); // NOI18N
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 525, -1, -1));

        jLabel11.setText("(last 3 digit)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 331, -1, -1));

        delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14974663671582988848-32.png"))); // NOI18N
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 525, -1, -1));

        reset2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reset-24.png"))); // NOI18N
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        getContentPane().add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 525, -1, 42));

        searchbx.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        searchbx.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 255, 51)));
        searchbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbxKeyReleased(evt);
            }
        });
        getContentPane().add(searchbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 487, 218, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/15028084081543238917-32.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 487, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bubt_logo.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 76));

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1386, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 589, 1386, -1));

        aboutb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/9185382391582988862-32.png"))); // NOI18N
        aboutb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbActionPerformed(evt);
            }
        });
        getContentPane().add(aboutb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1299, 525, 53, -1));

        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/325325621618134427-32.png"))); // NOI18N
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });
        getContentPane().add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void date1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_date1AncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_date1AncestorAdded

    private void time1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_time1AncestorAdded
        // TODO add your handling code her
        
    }//GEN-LAST:event_time1AncestorAdded
     private JFrame exitfr;
    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        // TODO add your handling code here:
       exitfr =new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(exitfr," Confirm if you want to exit","Vehicle Parking System",
               JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
           System.exit(0);
       }
        
    }//GEN-LAST:event_exit1ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
    
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bubtparking","admin","admin");
            System.out.println("Database Connected!");
            System.out.println("Designation : "+desi1.getSelectedItem());
            System.out.println("Department: "+ dept1.getSelectedItem());
            System.out.println("Intake : "+int1.getText());
            System.out.println("Id :"+id2.getText());
            System.out.println("Vehicle Type: "+vtype1.getSelectedItem());
            System.out.println("Vehicle Number: "+vnum1.getText());
            System.out.println("Token Number: "+tk1.getText());
            String sql;
            sql="INSERT INTO info VALUES (null,?, ?, ?, ?, ?, ?, ?, current_timestamp(), current_timestamp())";
             PreparedStatement stm=con.prepareStatement(sql);
         // ResultSet rs= stm.executeQuery(sql);
            String desi=desi1.getSelectedItem().toString();
            stm.setString(4, desi);
            String dept;
            dept=dept1.getSelectedItem().toString();
            stm.setString(5,dept);
            stm.setInt(6,Integer.parseInt(int1.getText()));
            stm.setInt(7,Integer.parseInt(id2.getText()));
            String vtyp=vtype1.getSelectedItem().toString();
            stm.setString(2, vtyp);
            stm.setInt(3,Integer.parseInt(vnum1.getText()));
            stm.setInt(1,Integer.parseInt(tk1.getText()));
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfull");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        showinfo();
    }//GEN-LAST:event_save1ActionPerformed

    public void showinfo(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bubtparking","admin","admin");
            System.out.println("Database Connected!");
            String sql;
            sql="SELECT *FROM info";
             PreparedStatement stm = con.prepareStatement(sql);
             ResultSet rs = stm.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception ex){
            System.out.println(ex);
            
        }
    }
    
    private void table1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table1AncestorAdded
        // TODO add your handling code here:
         
    }//GEN-LAST:event_table1AncestorAdded

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)table1.getModel();
        int SelectedRows=table1.getSelectedRow();
         try{
            int id=Integer.parseInt(dtm.getValueAt(SelectedRows,0).toString());
            int deleteItem=JOptionPane.showConfirmDialog(null, "Confrim if you want to delete Selected Data","Warning",JOptionPane.YES_NO_OPTION);
            if(deleteItem==JOptionPane.YES_OPTION){
                                
          Class.forName("com.mysql.cj.jdbc.Driver");
          
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bubtparking","admin","admin");
         
            String sql;
            sql="delete from info where No=?";
             PreparedStatement stm=con.prepareStatement(sql);
                   stm.setInt(1,id);
           stm.executeUpdate();
       
        id2.setText("");
        vnum1.setText("");
        tk1.setText("");
        desi1.setSelectedIndex(0);
        dept1.setSelectedIndex(0);
        vtype1.setSelectedIndex(0);
             JOptionPane.showMessageDialog(null, "Successfull");
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please Selecet Your Data");
            
        }
        showinfo();
    }//GEN-LAST:event_delete1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)table1.getModel();
        int SelectedRows=table1.getSelectedRow();
        tk1.setText(dtm.getValueAt(SelectedRows,1).toString());
        vtype1.setSelectedItem(dtm.getValueAt(SelectedRows, 2).toString());
        vnum1.setText(dtm.getValueAt(SelectedRows,3).toString());
        desi1.setSelectedItem(dtm.getValueAt(SelectedRows, 4).toString());
        dept1.setSelectedItem(dtm.getValueAt(SelectedRows, 5).toString());
        int1.setText(dtm.getValueAt(SelectedRows,6).toString());
        id2.setText(dtm.getValueAt(SelectedRows,7).toString());
    }//GEN-LAST:event_table1MouseClicked

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        // TODO add your handling code here:
        
        int1.setText("");
        id2.setText("");
        vnum1.setText("");
        tk1.setText("");
        desi1.setSelectedIndex(0);
        dept1.setSelectedIndex(0);
        vtype1.setSelectedIndex(0);
    }//GEN-LAST:event_reset2ActionPerformed

    private void searchbxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbxKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)table1.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        table1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchbx.getText().trim() ));
    }//GEN-LAST:event_searchbxKeyReleased

    private void tk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tk1ActionPerformed

    private void aboutbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbActionPerformed
        // TODO add your handling code here:
        aboutUs ab=new aboutUs();
        ab.show();
    }//GEN-LAST:event_aboutbActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.out.println("LogOut");
        LoginFrom lgf=new LoginFrom();
        lgf.show();
    }//GEN-LAST:event_logout1ActionPerformed
 
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutb;
    private javax.swing.JLabel date1;
    private javax.swing.JButton delete1;
    private javax.swing.JComboBox<String> dept1;
    private javax.swing.JComboBox<String> desi1;
    private javax.swing.JButton exit1;
    private javax.swing.JTextField id2;
    private javax.swing.JTextField int1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout1;
    private javax.swing.JButton reset2;
    private javax.swing.JButton save1;
    private javax.swing.JTextField searchbx;
    private javax.swing.JTable table1;
    private javax.swing.JLabel time1;
    private javax.swing.JTextField tk1;
    private javax.swing.JTextField vnum1;
    private javax.swing.JComboBox<String> vtype1;
    // End of variables declaration//GEN-END:variables

    void show(String fjal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
