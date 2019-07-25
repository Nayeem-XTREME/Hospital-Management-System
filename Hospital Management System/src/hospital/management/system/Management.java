
package hospital.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Management extends JFrame {

    private static String name1, name2, title, des, user, pass, day, month, year, gen, email, phone, address, mobile, id;
    private static String name4 = null, age4 = null, sex4 = "Male", height4 = null, weight4 = null, blood4 = "A+", address4 = null, cont4 = null, rel4 = null, cont_add4 = null, cont_phn = null, cont_mob = null, des4 = null, des_on4 = null, des_diag4 = null, sym4 = null, sym_on4 = null, sym_diag4 = null, rep = null, rep_ID = null;
    private static String first = null, last = null, d_title = "Mr.", d_des = null, d_sex = "Male", d_date = "Date", d_month = "Month", d_year = "Year", d_ID, d_address = null, d_phone = null, d_email = null, d_mobile = null, d_dept = "SELECT DEPARTMENT...", s, t;
    
    GridBagLayout layout = new GridBagLayout();
    Patient_inf i;
    Patient_rel r;
    
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
    
    public void clock()
    {
        
        Thread clock = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    
                    while (true) {
                        
                        String day1 = null, month1 = null, sec1 = null, min1 = null, hour1 = null;
                        
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);

                        int sec = cal.get(Calendar.SECOND);
                        int min = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);
                        
                        if (hour == 0)
                            hour1 = Integer.toString(hour + 12);
                        else if (hour < 10)
                            hour1 = "0"+hour;
                        else
                            hour1 = Integer.toString(hour);
                        
                        if (min < 10)
                            min1 = "0" + min;
                        else
                            min1 = Integer.toString(min);
                        
                        if (sec < 10)
                            sec1 = "0" + sec;
                        else
                            sec1 = Integer.toString(sec);
                        
                        if (day < 10)
                            day1 = "0" + day;
                        else
                            day1 = Integer.toString(day);
                        
                        if (month < 10)
                            month1 = "0" + month;
                        else
                            month1 = Integer.toString(month);

                        time.setText("System Time: "+hour1+":"+min1+":"+sec1+" Date: "+day1+"/"+month1+"/"+year);
                        sleep(1000);
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(FirstScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };   
        
        
        clock.start();
        
    }
    
    public Management() {
            
        initComponents();
        clock();
        
        ProfileName.setText("Login as: " + name1 + " " + name2);
        i = new Patient_inf();
        r = new Patient_rel();
        TabbedPan2.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        TabbedPan2.add(i, c);
        TabbedPan2.add(r, c);
        i.setVisible(false);
        r.setVisible(false);
        validate();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        nurse = new javax.swing.JButton();
        addDoc = new javax.swing.JButton();
        PatientButton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        inf = new javax.swing.JButton();
        roomInf = new javax.swing.JButton();
        rel = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        TabName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ProfileName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TabbedPan2 = new javax.swing.JPanel();
        PhotoLabel = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        jButton9.setText("Remove a Doctor");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management");
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton5.setText("Staff Information");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton12.setBackground(new java.awt.Color(51, 153, 255));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Doctor's Information");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton13.setBackground(new java.awt.Color(51, 153, 255));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Nurse Information");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        nurse.setBackground(new java.awt.Color(0, 153, 153));
        nurse.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        nurse.setForeground(new java.awt.Color(0, 102, 102));
        nurse.setText("Add New Nurse");
        nurse.setFocusable(false);
        nurse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nurse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nurseActionPerformed(evt);
            }
        });

        addDoc.setBackground(new java.awt.Color(0, 153, 153));
        addDoc.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        addDoc.setForeground(new java.awt.Color(0, 102, 102));
        addDoc.setText("Add New Doctor");
        addDoc.setFocusable(false);
        addDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addDoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocActionPerformed(evt);
            }
        });

        PatientButton.setBackground(new java.awt.Color(0, 153, 153));
        PatientButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        PatientButton.setForeground(new java.awt.Color(0, 102, 102));
        PatientButton.setText("Add Patient");
        PatientButton.setFocusable(false);
        PatientButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PatientButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 102, 102));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Remove a Nurse");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        inf.setBackground(new java.awt.Color(51, 153, 255));
        inf.setForeground(new java.awt.Color(255, 255, 255));
        inf.setText("Patient Information");
        inf.setFocusable(false);
        inf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infActionPerformed(evt);
            }
        });

        roomInf.setText("Room Information");
        roomInf.setFocusable(false);
        roomInf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomInf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        roomInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomInfActionPerformed(evt);
            }
        });

        rel.setBackground(new java.awt.Color(255, 102, 102));
        rel.setForeground(new java.awt.Color(255, 255, 255));
        rel.setText("Release Patient");
        rel.setFocusable(false);
        rel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 102, 102));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Remove a Doctor");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Edit.setBackground(new java.awt.Color(0, 153, 153));
        Edit.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("User Information");
        Edit.setFocusable(false);
        Edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Edit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nurse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Edit, PatientButton, addDoc, inf, jButton11, jButton12, jButton13, jButton5, jButton8, nurse, rel, roomInf});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rel)
                .addGap(43, 43, 43)
                .addComponent(addDoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(42, 42, 42)
                .addComponent(nurse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roomInf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit)
                .addContainerGap())
        );

        TabName.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        TabName.setText(" Welcome to the hospital");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        ProfileName.setFont(new java.awt.Font("CG Omega", 0, 20)); // NOI18N
        ProfileName.setText("Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProfileName)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfileName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Neo Sans Std", 1, 20)); // NOI18N
        jLabel1.setText("SMART HOSPITAL MANAGEMENT SYSTEM");

        Logout.setBackground(new java.awt.Color(255, 102, 102));
        Logout.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/logout12.png"))); // NOI18N
        Logout.setText("LOG OUT");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TabbedPan2.setBorder(null);
        TabbedPan2.setPreferredSize(new java.awt.Dimension(750, 530));

        PhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/Hospital.png"))); // NOI18N

        javax.swing.GroupLayout TabbedPan2Layout = new javax.swing.GroupLayout(TabbedPan2);
        TabbedPan2.setLayout(TabbedPan2Layout);
        TabbedPan2Layout.setHorizontalGroup(
            TabbedPan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabbedPan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PhotoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabbedPan2Layout.setVerticalGroup(
            TabbedPan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabbedPan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TabbedPan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TabbedPan2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        time.setBackground(new java.awt.Color(0, 102, 102));
        time.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 102, 102));
        time.setText("Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TabName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TabName)
                            .addComponent(time))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonActionPerformed
        
        Patient1.exe1 (name1, name2, title, des, user, pass, day, month, year, gen, email, phone, address, mobile, name4, age4, sex4, height4, weight4, blood4, address4, cont4, rel4, cont_add4, cont_phn, cont_mob, des4, des_on4, des_diag4, sym4, sym_on4, sym_diag4, rep, rep_ID, id);
        
        setVisible(false);
    }//GEN-LAST:event_PatientButtonActionPerformed

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        TabName.setText("PATIENT INFORMATION");
        i.setVisible(true);
        r.setVisible(false);
        PhotoLabel.setVisible(false);
    }//GEN-LAST:event_infActionPerformed

    private void relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relActionPerformed
        TabName.setText("RELEASE PATIENT");
        r.setVisible(true);
        i.setVisible(false);
        PhotoLabel.setVisible(false);
    }//GEN-LAST:event_relActionPerformed

    private void roomInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomInfActionPerformed
        ROOM_INF.room(name1, name2, title, des, user, pass, day, month, year, gen, email, phone, address, mobile, id);
        setVisible(false);
    }//GEN-LAST:event_roomInfActionPerformed

    private void addDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocActionPerformed
        
        ID();
        d_ID = s;
        
        AddDoctor.doc(name1, name2, title, des, user, pass, day, month, year, gen, email, phone, address, mobile, first, last, d_title, d_des, d_sex, d_month, d_date, d_year, d_ID, d_address, d_phone, d_email, d_mobile, d_dept, id);
        setVisible(false);
    }//GEN-LAST:event_addDocActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "You will go to home screen!\nDo you want to log out now?", "Log out" , JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            FirstScreen.firstScreen();
            setVisible(false);
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Edit_Profile.edit(name1, name2, title, des, user, pass, day, month, year, gen, email, phone, address, mobile, id);
        setVisible(false);
    }//GEN-LAST:event_EditActionPerformed

    private void nurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nurseActionPerformed
        ID();
        d_ID = s;
        
        Nurse1.nur1(name1, name2, title, des, user, pass, day, month, year, gen, email, phone, address, mobile, first, last, d_title, d_des, d_sex, d_month, d_date, d_year, d_ID, d_address, d_phone, d_email, d_mobile, id);
        setVisible(false);
    }//GEN-LAST:event_nurseActionPerformed

    
    public static void man(String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, String n9, String n10, String n12, String n13, String n14, String n15, String n16) {
        
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
        email = n12;
        phone = n13;
        address = n14;
        mobile = n15;
        id = n16;        
        
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
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management().setVisible(true);
            }
        });
    }
    
    public static void main(String args[]) {
        
        //name1 = n1;
        //name2 = n2;
        
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
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton Logout;
    private javax.swing.JButton PatientButton;
    private javax.swing.JLabel PhotoLabel;
    private javax.swing.JLabel ProfileName;
    private javax.swing.JLabel TabName;
    private javax.swing.JPanel TabbedPan2;
    private javax.swing.JButton addDoc;
    private javax.swing.JButton inf;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton nurse;
    private javax.swing.JButton rel;
    private javax.swing.JButton roomInf;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
