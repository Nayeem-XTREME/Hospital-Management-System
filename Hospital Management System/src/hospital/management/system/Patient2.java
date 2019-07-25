
package hospital.management.system;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.*;

public class Patient2 extends JFrame {

    private static String name1, name2, title, des, user, pass, day, month, year, gen, email1, phone1, address1, mobile1, id, s, t;
    private static String name4, age4, sex4, height4, weight4, blood4, address4, cont4, rel4, cont_add4, cont_phn, cont_mob, des4, des_on4, des_diag4, sym4, sym_on4, sym_diag4, rep, rep_ID;
    
    
    private static void ID()
    {
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
            
                Connection con = DriverManager.getConnection(url, username, password);
                 Statement stat = con.createStatement();
                 String query = "SELECT * FROM RANDOM";
                 ResultSet rs = stat.executeQuery(query);
                 
                 int count = 0;
                 
                 while (rs.next()) {
                     t = rs.getString(1);
                     s = rs.getString(2);
                     count++;
                     if (count == 1)
                         break;
                 }
                 
                 query = "DELETE FROM RANDOM WHERE SERIAL = '"+t+"' ";
                 stat.execute(query);
            }

           catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.toString());
           }
    }
    
    
    public Patient2() {
        initComponents();
        ID();
        IDtext.setText(s);
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        accept = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        charge = new javax.swing.JTextField();
        room = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bed = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IDtext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        admit = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Step 2");
        setResizable(false);

        accept.setText("I agree with the terms and conditions of the Hospital as a patient");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SMART HOSPITAL MANAGEMENT SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Neo Sans Std", 1, 18), new java.awt.Color(0, 102, 153))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ROOM INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N

        room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROOM NO..." }));
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });

        jLabel4.setText("Catagory:");

        bed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT BED NO..." }));

        jLabel1.setText("Admission Charge:");

        jLabel5.setText("Room No.:");

        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROOM TYPE...", "Normal", "Medium", "VIP" }));
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        jLabel6.setText("Bed No.:");

        jLabel7.setText("TK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(room, 0, 270, Short.MAX_VALUE)
                        .addComponent(bed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(charge)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)))
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(charge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IDENTIFICATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N

        IDtext.setEditable(false);
        IDtext.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        IDtext.setForeground(new java.awt.Color(255, 0, 0));
        IDtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDtextActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(IDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel3);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/cancel_small_white.png"))); // NOI18N
        jButton1.setText("REJECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        admit.setBackground(new java.awt.Color(0, 153, 153));
        admit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        admit.setForeground(new java.awt.Color(0, 51, 51));
        admit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add2.png"))); // NOI18N
        admit.setText("ADMIT");
        admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/back1.png"))); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(admit)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(accept)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {admit, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(accept)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(admit)
                    .addComponent(back))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        
        room.removeAllItems();
        room.addItem("SELECT ROOM NO...");
        
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();

                if (cat.getSelectedItem() == "Normal") {
                    
                    String query = "SELECT * FROM NORMAL";
                    ResultSet rs = stat.executeQuery(query);
                    
                    while (rs.next()) {
                        room.addItem(rs.getString(1));
                    }
                    
                    charge.setText("1500");
                }
        
                else if (cat.getSelectedItem() == "Medium") {
                        String query = "SELECT * FROM MEDIUM";
                        ResultSet rs = stat.executeQuery(query);

                        while (rs.next()) {
                            room.addItem(rs.getString(1));
                        }
                        
                        charge.setText("2000");
                }
        
                else if (cat.getSelectedItem() == "VIP") {
                        String query = "SELECT * FROM VIP";
                        ResultSet rs = stat.executeQuery(query);

                        while (rs.next()) {
                            room.addItem(rs.getString(1));
                        }
                        
                        charge.setText("3000");
                }
                
        }

        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
    }//GEN-LAST:event_catActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        Patient1.exe1(name1, name2, title, des, user, pass, day, month, year, gen, email1, phone1, address1, mobile1, name4, age4, sex4, height4, weight4, blood4, address4, cont4, rel4, cont_add4, cont_phn, cont_mob, des4, des_on4, des_diag4, sym4, sym_on4, sym_diag4, rep, rep_ID, id);
        
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void IDtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDtextActionPerformed
        
    }//GEN-LAST:event_IDtextActionPerformed

    private void admitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitActionPerformed

        
        Calendar cal = new GregorianCalendar();
        
        int day1 = cal.get(Calendar.DAY_OF_MONTH);
        int month1 = cal.get(Calendar.MONTH);
        int year1 = cal.get(Calendar.YEAR);

        int sec1 = cal.get(Calendar.SECOND);
        int min1 = cal.get(Calendar.MINUTE);
        int hour1 = cal.get(Calendar.HOUR);

        if (accept.isSelected() && cat.getSelectedItem() != "SELECT ROOM TYPE..." && room.getSelectedItem() != "SELECT ROOM NO..." && bed.getSelectedItem() != "SELECT BED NO...") {
            
            try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                String query = "INSERT INTO PATIENT (NAME, AGE, SEX, HEIGHT, WEIGHT, BLOOD, ADDRESS, CONTACT_NAME, RELATION, CONTACT_ADDRESS, CONTACT_PHONE, CONTACT_MOBILE, DESEASE, DESEASE_ONSET, DESEASE_DIAGNOSIS, SYMPTOM, SYMPTOM_ONSET, SYMPTOM_DIAGNOSIS, REPORTER_NAME, REPORTER_ID, ROOM, CATAGORY, BED, ID, DATE, MONTH, ADMIT_YEAR, BILL) VALUES ('"+name4+"', '"+age4+"', '"+sex4+"', '"+height4+"', '"+weight4+"', '"+blood4+"', '"+address4+"', '"+cont4+"', '"+rel4+"', '"+cont_add4+"', '"+cont_phn+"', '"+cont_mob+"', '"+des4+"', '"+des_on4+"', '"+des_diag4+"', '"+sym4+"', '"+sym_on4+"', '"+sym_diag4+"', '"+rep+"', '"+rep_ID+"', '"+room.getSelectedItem()+"', '"+cat.getSelectedItem()+"', '"+bed.getSelectedItem()+"', '"+IDtext.getText()+"', '"+Integer.toString(day1)+"', '"+Integer.toString(month1)+"', '"+Integer.toString(year1)+"', '"+charge.getText()+"')";

                stat.execute(query);
                
                JOptionPane.showMessageDialog(null, "Successfully Admitted!");
                
                if (cat.getSelectedItem() == "Normal") {
                    
                    String s = null, b = (String) bed.getSelectedItem();
                    String all = "", nw = "";
                    int i;
                    
                    query = "SELECT * FROM NORMAL WHERE NORMAL = '"+room.getSelectedItem()+"' ";
                    ResultSet rs = stat.executeQuery(query);
                    
                    while (rs.next()) {
                        s = rs.getString(3);
                        all = rs.getString(4);
                    }
                    
                    i = Integer.parseInt(s);
                    s = Integer.toString(i - 1);
                    
                    for (i = 0; i < all.length(); i++) {
                        if (all.charAt(i) != b.charAt(0)) {
                            nw = nw + all.charAt(i);
                        }
                    }
                    
                    query = "UPDATE NORMAL SET CURRENT_NORMAL_SIT = '"+s+"', ALL_SIT = '"+nw+"' WHERE NORMAL = '"+room.getSelectedItem()+"' ";
                    stat.execute(query);
                    
                }
                
                else if (cat.getSelectedItem() == "Medium") {
                    
                    String s = null, b = (String) bed.getSelectedItem();
                    String all = "", nw = "";
                    int i;
                    
                    query = "SELECT * FROM MEDIUM WHERE MEDIUM = '"+room.getSelectedItem()+"' ";
                    ResultSet rs = stat.executeQuery(query);
                    
                    while (rs.next()) {
                        s = rs.getString(3);
                        all = rs.getString(4);
                    }
                    
                    i = Integer.parseInt(s);
                    s = Integer.toString(i - 1);
                    
                    for (i = 0; i < all.length(); i++) {
                        if (all.charAt(i) != b.charAt(0)) {
                            nw = nw + all.charAt(i);
                        }
                    }
                    
                    query = "UPDATE MEDIUM SET CURRENT_MEDIUM_SIT = '"+s+"', ALL_SIT = '"+nw+"' WHERE MEDIUM = '"+room.getSelectedItem()+"' ";
                    stat.execute(query);
                    
                }
                
                else if (cat.getSelectedItem() == "VIP") {
                    
                    String s = null, b = (String) bed.getSelectedItem();
                    String all = "", nw = "";
                    int i;
                    
                    query = "SELECT * FROM VIP WHERE VIP = '"+room.getSelectedItem()+"' ";
                    ResultSet rs = stat.executeQuery(query);
                    
                    while (rs.next()) {
                        s = rs.getString(3);
                        all = rs.getString(4);
                    }
                    
                    i = Integer.parseInt(s);
                    s = Integer.toString(i - 1);
                    
                    for (i = 0; i < all.length(); i++) {
                        if (all.charAt(i) != b.charAt(0)) {
                            nw = nw + all.charAt(i);
                        }
                    }
                    
                    query = "UPDATE VIP SET CURRENT_VIP_SIT = '"+s+"', ALL_SIT = '"+nw+"' WHERE VIP = '"+room.getSelectedItem()+"' ";
                    stat.execute(query);
                    
                }
                
                Management.man(name1, name2, title, des, user, pass, day, month, year, gen, email1, phone1, address1, mobile1, id);
                setVisible(false);


            }

           catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.toString());
           }
            
        }
        
        else {
            JOptionPane.showMessageDialog(null, "You must accept the license terms or Check your form again!");
        }
        
        
        
    }//GEN-LAST:event_admitActionPerformed

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed

        
        bed.removeAllItems();
        bed.addItem("SELECT BED NO...");
        
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                
                String bed_no = null;

                
                    
                    String query = "SELECT * FROM NORMAL WHERE NORMAL = '"+room.getSelectedItem()+"' ";
                    ResultSet rs = stat.executeQuery(query);

                    int count = 0;

                    while (rs.next()) {
                        bed_no = rs.getString(4);
                        count++;
                    }

                    if (count == 1) {
                        for (int i = 0; i < bed_no.length(); i++) {
                        char a = bed_no.charAt(i);
                        if (a >= 'A' && a <= 'Z')
                            bed.addItem(Character.toString(a));    
                        }
                    }
                    
                    query = "SELECT * FROM MEDIUM WHERE MEDIUM = '"+room.getSelectedItem()+"' ";
                    rs = stat.executeQuery(query);
                    
                    count = 0;
                    
                    while (rs.next()) {
                        bed_no = rs.getString(4);
                        count++;
                    }
                    
                    if (count == 1) {
                        for (int i = 0; i < bed_no.length(); i++) {
                        char a = bed_no.charAt(i);
                        if (a >= 'A' && a <= 'Z')
                            bed.addItem(Character.toString(a));    
                        }
                    } 
                    
                    
                    query = "SELECT * FROM VIP WHERE VIP = '"+room.getSelectedItem()+"' ";
                    rs = stat.executeQuery(query);
                    
                    count = 0;
                    
                    while (rs.next()) {
                        bed_no = rs.getString(4);
                        count++;
                    }
                    
                    if (count == 1) {
                        for (int i = 0; i < bed_no.length(); i++) {
                        char a = bed_no.charAt(i);
                        if (a >= 'A' && a <= 'Z')
                            bed.addItem(Character.toString(a));    
                        }
                    }
                
        }

        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_roomActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        
    }//GEN-LAST:event_acceptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void exe2(String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, String n9, String n10, String n12, String n13, String n14, String n15, String n16, String n17, String n18, String n19, String n20, String n21, String n22, String n23, String n24, String n25, String n26, String n27, String n28, String n29, String n30, String n31, String n32, String n33, String n34, String n35, String n36) {
        
        name1 = n1;
        name2 = n2;
        title = n3;
        des = n4;
        user = n5;
        pass = n6;
        day = n7;
        month = n8;
        year = n9;
        gen = n10;
        email1 = n12;
        phone1 = n13;
        address1 = n14;
        mobile1 = n15;
        
        name4 = n16;
        age4 = n17;
        sex4 = n18;
        height4 = n19;
        weight4 = n20;
        blood4 = n21;
        address4 = n22;
        cont4 = n23;
        rel4 = n24;
        cont_add4 = n25;
        cont_phn = n26;
        cont_mob = n27;
        des4 = n28;
        des_on4 =n29;
        des_diag4 = n30;
        sym4 = n31;
        sym_on4 = n32;
        sym_diag4 = n33;
        rep = n34;
        rep_ID = n35;
        
        id = n36;
        
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
            java.util.logging.Logger.getLogger(Patient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField IDtext;
    private javax.swing.JCheckBox accept;
    private javax.swing.JButton admit;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> bed;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JTextField charge;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> room;
    // End of variables declaration//GEN-END:variables
}
