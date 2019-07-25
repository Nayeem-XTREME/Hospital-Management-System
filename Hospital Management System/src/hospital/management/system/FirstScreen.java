
package hospital.management.system;
import static java.lang.Thread.sleep;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class FirstScreen extends JFrame {

    private String totalSit, totalDoctor, totalNurse, bedEmpty, totalPatient;
    private int sum, filled_sit, total_doc, total_nurse;
    
    private void data()
    {
        
        sum = 0;
        filled_sit = 0;
        total_doc = 0;
        total_nurse = 0;
        
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                
                String query = "SELECT * FROM NORMAL";
                ResultSet rs = stat.executeQuery(query);
                
                while (rs.next()) {
                    String r1 = rs.getString(2);
                    String r2 = rs.getString(3);
                    int i = Integer.parseInt(r1);
                    int j = Integer.parseInt(r2);
                    sum = sum + i;
                    filled_sit = filled_sit + j;
                }
                
                query = "SELECT * FROM MEDIUM";
                rs = stat.executeQuery(query);
                
                while (rs.next()) {
                    String r1 = rs.getString(2);
                    String r2 = rs.getString(3);
                    int i = Integer.parseInt(r1);
                    int j = Integer.parseInt(r2);
                    sum = sum + i;
                    filled_sit = filled_sit + j;
                }
                
                query = "SELECT * FROM VIP";
                rs = stat.executeQuery(query);
                
                while (rs.next()) {
                    String r1 = rs.getString(2);
                    String r2 = rs.getString(3);
                    int i = Integer.parseInt(r1);
                    int j = Integer.parseInt(r2);
                    sum = sum + i;
                    filled_sit = filled_sit + j;
                }
                
                query = "SELECT * FROM DOCTOR";
                rs = stat.executeQuery(query);
                
                while (rs.next()) {
                    total_doc = total_doc + 1;
                }
                
                query = "SELECT * FROM NURSE";
                rs = stat.executeQuery(query);
                
                while (rs.next()) {
                    total_nurse = total_nurse + 1;
                }
                
                query = "UPDATE HOPITAL_INF SET TOTAL_SIT = '"+Integer.toString(sum)+"', REMAINING_SIT = '"+Integer.toString(filled_sit)+"', TOTAL_PATIENT = '"+Integer.toString(sum - filled_sit)+"', DOCTORS = '"+total_doc+"', NURSE = '"+total_nurse+"' WHERE FIND = '"+"1"+"' ";
                stat.execute(query);
                
            }

           catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.toString());
           }
        
    }
    
    public void database()
    {
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                String query = "SELECT * FROM HOPITAL_INF";
                ResultSet rs = stat.executeQuery(query);
                
                while (rs.next()) {
                    totalSit = rs.getString(1);
                    totalDoctor = rs.getString(10);
                    totalNurse = rs.getString(11);
                    bedEmpty = rs.getString(8);
                    totalPatient = rs.getString(9);
                }
                
                
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

                        Time.setText("System Time: "+hour1+":"+min1+":"+sec1+" Date: "+day1+"/"+month1+"/"+year);
                        sleep(1000);
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(FirstScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };   
        
        
        clock.start();
        
    }
    
    public FirstScreen() {
        initComponents();
        data();
        database();
        clock();
        BedNum.setText(totalSit);
        DocNum.setText(totalDoctor);
        NurNum.setText(totalNurse);
        BdEmptyNo.setText(bedEmpty);
        patient.setText(totalPatient);
        CuNurNum.setText(totalNurse);
        
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Main_Exit = new javax.swing.JButton();
        About_button = new javax.swing.JButton();
        BEmptyNo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Register_button = new javax.swing.JButton();
        Doctors_button = new javax.swing.JButton();
        Login_button_main = new javax.swing.JButton();
        Nurse_button1 = new javax.swing.JButton();
        Nurse_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NurNum = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CuNurNum = new javax.swing.JLabel();
        BedNum = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DocNum = new javax.swing.JLabel();
        BEmpty = new javax.swing.JLabel();
        patient = new javax.swing.JLabel();
        BdEmptyNo = new javax.swing.JLabel();
        CuDoc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CuNurse = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SMART HOSPITAL MANAGEMENT SYSTEM");
        setBackground(new java.awt.Color(77, 129, 185));
        setMinimumSize(new java.awt.Dimension(1087, 702));
        setResizable(false);

        Main_Exit.setBackground(new java.awt.Color(255, 102, 102));
        Main_Exit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Main_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Main_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/cancel_small_white.png"))); // NOI18N
        Main_Exit.setText("EXIT");
        Main_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_ExitActionPerformed(evt);
            }
        });

        About_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/about1.png"))); // NOI18N
        About_button.setText("About");
        About_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_buttonActionPerformed(evt);
            }
        });

        BEmptyNo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SMART HOSPITAL MANAGEMENT SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Neo Sans Std", 1, 18))); // NOI18N

        Register_button.setBackground(new java.awt.Color(0, 153, 153));
        Register_button.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Register_button.setForeground(new java.awt.Color(0, 102, 102));
        Register_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/reg2.png"))); // NOI18N
        Register_button.setText("REGISTER");
        Register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_buttonActionPerformed(evt);
            }
        });

        Doctors_button.setBackground(new java.awt.Color(0, 102, 255));
        Doctors_button.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Doctors_button.setForeground(new java.awt.Color(255, 255, 255));
        Doctors_button.setText("Doctors");
        Doctors_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doctors_buttonActionPerformed(evt);
            }
        });

        Login_button_main.setBackground(new java.awt.Color(0, 153, 153));
        Login_button_main.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Login_button_main.setForeground(new java.awt.Color(0, 102, 102));
        Login_button_main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/log2.png"))); // NOI18N
        Login_button_main.setText("LOGIN");
        Login_button_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_button_mainActionPerformed(evt);
            }
        });

        Nurse_button1.setBackground(new java.awt.Color(0, 102, 255));
        Nurse_button1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Nurse_button1.setForeground(new java.awt.Color(255, 255, 255));
        Nurse_button1.setText("Departments");
        Nurse_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nurse_button1ActionPerformed(evt);
            }
        });

        Nurse_button.setBackground(new java.awt.Color(0, 102, 255));
        Nurse_button.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Nurse_button.setForeground(new java.awt.Color(255, 255, 255));
        Nurse_button.setText("Nurse");
        Nurse_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nurse_buttonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/Building.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NurNum.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 20)); // NOI18N
        NurNum.setForeground(new java.awt.Color(255, 0, 51));
        NurNum.setText("10");

        jLabel5.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Total Nurse:");

        CuNurNum.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 20)); // NOI18N
        CuNurNum.setForeground(new java.awt.Color(255, 0, 51));
        CuNurNum.setText("10");

        BedNum.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 20)); // NOI18N
        BedNum.setForeground(new java.awt.Color(255, 0, 51));
        BedNum.setText("10");

        jLabel4.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Total Doctors:");

        DocNum.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 20)); // NOI18N
        DocNum.setForeground(new java.awt.Color(255, 0, 51));
        DocNum.setText("10");

        BEmpty.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 18)); // NOI18N
        BEmpty.setForeground(new java.awt.Color(0, 102, 102));
        BEmpty.setText("Bed Empty:");

        patient.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 20)); // NOI18N
        patient.setForeground(new java.awt.Color(255, 0, 51));
        patient.setText("10");

        BdEmptyNo.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 20)); // NOI18N
        BdEmptyNo.setForeground(new java.awt.Color(255, 0, 51));
        BdEmptyNo.setText("10");

        CuDoc.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 18)); // NOI18N
        CuDoc.setForeground(new java.awt.Color(0, 102, 102));
        CuDoc.setText("Total Patient:");

        jLabel3.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Total bed number:");

        CuNurse.setFont(new java.awt.Font("Abadi MT Condensed Light", 1, 18)); // NOI18N
        CuNurse.setForeground(new java.awt.Color(0, 102, 102));
        CuNurse.setText("Current Nurse No. :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BedNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BdEmptyNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DocNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuDoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NurNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuNurse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CuNurNum)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CuNurse)
                        .addComponent(CuNurNum))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(NurNum))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BEmpty)
                        .addComponent(BdEmptyNo))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(DocNum)
                        .addComponent(CuDoc)
                        .addComponent(patient))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(BedNum)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Doctors_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nurse_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nurse_button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Login_button_main, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Doctors_button, Nurse_button, Nurse_button1});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Login_button_main, Register_button});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nurse_button)
                            .addComponent(Nurse_button1)
                            .addComponent(Doctors_button)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Login_button_main, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Time.setFont(new java.awt.Font("Abadi MT Condensed Light", 0, 18)); // NOI18N
        Time.setText("System Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BEmptyNo))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(About_button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Main_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {About_button, Main_Exit});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(BEmptyNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(About_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Main_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time))
                .addGap(11, 11, 11))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {About_button, Main_Exit});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void About_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_buttonActionPerformed
        About.about();
    }//GEN-LAST:event_About_buttonActionPerformed

    private void Main_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_ExitActionPerformed
       
        int p = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO EXIT?", "EXIT" , JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            setVisible(false);
        }
    }//GEN-LAST:event_Main_ExitActionPerformed

    private void Register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_buttonActionPerformed
        Register_Screen.reg();
        setVisible(false);
    }//GEN-LAST:event_Register_buttonActionPerformed

    private void Login_button_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_button_mainActionPerformed
        Login_Screen.login();
        setVisible(false);  
        dispose();
    }//GEN-LAST:event_Login_button_mainActionPerformed

    private void Nurse_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nurse_buttonActionPerformed
        
    }//GEN-LAST:event_Nurse_buttonActionPerformed

    private void Nurse_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nurse_button1ActionPerformed
       
    }//GEN-LAST:event_Nurse_button1ActionPerformed

    private void Doctors_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doctors_buttonActionPerformed
        DoctorScreen.screen();
        setVisible(false);
    }//GEN-LAST:event_Doctors_buttonActionPerformed

    
    
    public static void firstScreen()
    {
         
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
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
    }
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_button;
    private javax.swing.JLabel BEmpty;
    private javax.swing.JLabel BEmptyNo;
    private javax.swing.JLabel BdEmptyNo;
    private javax.swing.JLabel BedNum;
    private javax.swing.JLabel CuDoc;
    private javax.swing.JLabel CuNurNum;
    private javax.swing.JLabel CuNurse;
    private javax.swing.JLabel DocNum;
    private javax.swing.JButton Doctors_button;
    private javax.swing.JButton Login_button_main;
    private javax.swing.JButton Main_Exit;
    private javax.swing.JLabel NurNum;
    private javax.swing.JButton Nurse_button;
    private javax.swing.JButton Nurse_button1;
    private javax.swing.JButton Register_button;
    private javax.swing.JLabel Time;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel patient;
    // End of variables declaration//GEN-END:variables

    
    
}
