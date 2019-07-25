
package hospital.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class AddDoctor2 extends JFrame {

    private static String name1, name2, title1, des1, user1, pass1, day1, month1, year1, gen1, email1, phone1, address1, mobile1, id;
    private static String first, last, d_title, d_des, d_sex, d_date, d_month, d_year, d_ID, d_address, d_phone, d_email, d_mobile, d_dept;
    
    public AddDoctor2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        no1 = new javax.swing.JRadioButton();
        date1 = new javax.swing.JTextField();
        speciality1 = new javax.swing.JComboBox<>();
        yes1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spe1 = new javax.swing.JTextField();
        taken1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        no2 = new javax.swing.JRadioButton();
        date2 = new javax.swing.JTextField();
        speciality2 = new javax.swing.JComboBox<>();
        yes2 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        spe2 = new javax.swing.JTextField();
        taken2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        license = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        issued = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        gra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        completed = new javax.swing.JTextField();
        attended = new javax.swing.JTextField();
        position = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        agree = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ADD DOCTOR (STEP 2)");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SMART HOSPITAL MANAGEMENT SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Neo Sans Std", 1, 18))); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROFESSIONAL INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        no1.setText("No");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });

        speciality1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anesthesiologists", "Cardiologists‎", "Coroners", "Dentists‎", "Dermatologists‎", "Diabetologists‎", "Emergency physicians‎", "Endocrinologists‎", "Gastroenterologists‎", "Gynaecologists‎", "Hematologists‎", "Hygienists‎", "Immunologists‎", "Leprologists‎", "Nephrologists", "Neurologists‎", "Neurosurgeons‎", "Nuclear medicine physicians‎", "Obstetricians‎", "Oncologists‎", "Ophthalmologists", "Orthopaedists", "Osteopathic physicians", "Otolaryngologists‎", "Parasitologists", "Pathologists", "Pediatricians", "Phthisiatrists", "Podiatrists", "Pulmonologists", "Radiologists", "Rheumatologists", "Serologists", "Surgeons", "Team physicians", "Toxicologists‎", "Traumatologists", "Tropical physicians", "Urologists", "Venereologists", "Virologists", "Other..." }));
        speciality1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speciality1ActionPerformed(evt);
            }
        });

        yes1.setText("Yes");
        yes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Speciality:");

        jLabel6.setText("Board Certification:");

        jLabel8.setText("Date:");

        spe1.setText("IF OTHER OPTION IS SELECTED");
        spe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spe1ActionPerformed(evt);
            }
        });

        jLabel4.setText("*Speciality:");

        jLabel7.setText("Where taken:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yes1)
                    .addComponent(no1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(speciality1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spe1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(taken1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(date1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(taken1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yes1)
                            .addComponent(jLabel3)
                            .addComponent(speciality1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no1)
                            .addComponent(jLabel4)
                            .addComponent(spe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        no2.setText("No");
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });

        speciality2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anesthesiologists", "Cardiologists‎", "Coroners", "Dentists‎", "Dermatologists‎", "Diabetologists‎", "Emergency physicians‎", "Endocrinologists‎", "Gastroenterologists‎", "Gynaecologists‎", "Hematologists‎", "Hygienists‎", "Immunologists‎", "Leprologists‎", "Nephrologists", "Neurologists‎", "Neurosurgeons‎", "Nuclear medicine physicians‎", "Obstetricians‎", "Oncologists‎", "Ophthalmologists", "Orthopaedists", "Osteopathic physicians", "Otolaryngologists‎", "Parasitologists", "Pathologists", "Pediatricians", "Phthisiatrists", "Podiatrists", "Pulmonologists", "Radiologists", "Rheumatologists", "Serologists", "Surgeons", "Team physicians", "Toxicologists‎", "Traumatologists", "Tropical physicians", "Urologists", "Venereologists", "Virologists", "Other..." }));
        speciality2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speciality2ActionPerformed(evt);
            }
        });

        yes2.setText("Yes");
        yes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes2ActionPerformed(evt);
            }
        });

        jLabel17.setText("Speciality:");

        jLabel18.setText("Board Eligible:");

        jLabel19.setText("Date:");

        spe2.setText("IF OTHER OPTION IS SELECTED");
        spe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spe2ActionPerformed(evt);
            }
        });

        jLabel20.setText("*Speciality:");

        jLabel21.setText("Where taken:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yes2)
                    .addComponent(no2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(speciality2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spe2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(taken2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(date2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(taken2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yes2)
                            .addComponent(jLabel17)
                            .addComponent(speciality2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no2)
                            .addComponent(jLabel20)
                            .addComponent(spe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel22.setText("Current Medical License Number:");

        jLabel23.setText("Date issued:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(license)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(issued, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(license, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(issued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUALIFICATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N

        jLabel2.setText("Dates Attended:");

        jLabel5.setText("Date Completed:");

        jLabel9.setText("Current Position:");

        jLabel1.setText("Graduation Institute:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gra)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(attended, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(completed, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(position)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {attended, completed});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(gra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(attended, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        agree.setText("I certify that the information on this application is true to the best of my knowledge.");
        agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/cancel_small_white.png"))); // NOI18N
        jButton1.setText("REJECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 153, 153));
        add.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(0, 51, 51));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add2.png"))); // NOI18N
        add.setText("ADD DOCTOR");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(agree)
                .addContainerGap(340, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agree)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(add)
                    .addComponent(back))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void speciality1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speciality1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speciality1ActionPerformed

    private void spe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spe1ActionPerformed

    private void speciality2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speciality2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speciality2ActionPerformed

    private void spe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spe2ActionPerformed
        
    }//GEN-LAST:event_spe2ActionPerformed

    private void agreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeActionPerformed
        
    }//GEN-LAST:event_agreeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        AddDoctor.doc(name1, name2, title1, des1, user1, pass1, day1, month1, year1, gen1, email1, phone1, address1, mobile1, first, last, d_title, d_des, d_sex, d_month, d_date, d_year, d_ID, d_address, d_phone, d_email, d_mobile, d_dept, id);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        String res1 = null, special1, res2 = null, special2;
        
        if (yes1.isSelected() != no1.isSelected()) {
            if (yes1.isSelected())
                res1 = "Yes";
            else
                res1 = "No";
        }
        
        if (speciality1.getSelectedItem() == "Other...")
            special1 = spe1.getText();
        else
            special1 = (String) speciality1.getSelectedItem();
        
        if (yes2.isSelected() != no2.isSelected()) {
            if (yes2.isSelected())
                res2 = "Yes";
            else
                res2 = "No";
        }
        
        if (speciality2.getSelectedItem() == "Other...")
            special2 = spe2.getText();
        else
            special2 = (String) speciality2.getSelectedItem();
        
        if ((yes1.isSelected() != no1.isSelected()) && (yes2.isSelected() != no2.isSelected()) && agree.isSelected()) {
            
            try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                String query = "INSERT INTO DOCTOR (FIRST_NAME, TITLE, DESIGNATION, SEX, MONTH, DATE, B_YEAR, ID, ADDRESS, PHONE, EMAIL, MOBILE, INSTITUTE, DATE_ATTENDED, DATE_COMPLETED, CURRENT_POS, BOARD_CERTIFICATION, SPECIALITY, CERTIFICATION_TAKEN, DATE1, BOARD_ELIGIBLE, SPECIALITY2, INSTITUTION2, DATE2, LICENSE, DATE_ISSUED, DEPARTMENT) VALUES ('"+first + " " + last+"', '"+d_title+"', '"+d_des+"', '"+d_sex+"', '"+d_month+"', '"+d_date+"', '"+d_year+"', '"+d_ID+"', '"+d_address+"', '"+d_phone+"', '"+d_email+"', '"+d_mobile+"', '"+gra.getText()+"', '"+attended.getText()+"', '"+completed.getText()+"', '"+position.getText()+"', '"+res1+"', '"+special1+"', '"+taken1.getText()+"', '"+date1.getText()+"', '"+res2+"', '"+special2+"', '"+taken2.getText()+"', '"+date2.getText()+"', '"+license.getText()+"', '"+issued.getText()+"', '"+d_dept+"')";

                stat.execute (query);

                JOptionPane.showMessageDialog (null, "Successfully Added!");
                
                Management.man (name1, name2, title1, des1, user1, pass1, day1, month1, year1, gen1, email1, phone1, address1, mobile1, id);
                setVisible(false);


            }

           catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.toString());
           }
            
        }
        
        else {
            JOptionPane.showMessageDialog(null, "CHECK YOUR FORM AGAIN\nYOU MUST AGREE THE TERMS AND CONDITIONS OF THE HOSPITAL AND SELECT YES OR NO OPTION!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Management.man (name1, name2, title1, des1, user1, pass1, day1, month1, year1, gen1, email1, phone1, address1, mobile1, id);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes1ActionPerformed
        no1.setSelected(false);
    }//GEN-LAST:event_yes1ActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        yes1.setSelected(false);
    }//GEN-LAST:event_no1ActionPerformed

    private void yes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes2ActionPerformed
        no2.setSelected(false);
    }//GEN-LAST:event_yes2ActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        yes2.setSelected(false);
    }//GEN-LAST:event_no2ActionPerformed

    
    public static void doc2(String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, String n9, String n10, String n11, String n12, String n13, String n14, String n15, String n16, String n17, String n18, String n19, String n20, String n21, String n22, String n23, String n24, String n25, String n26, String n27, String n28, String n29) {
        
        first = n1;
        last = n2;
        d_title = n3;
        d_des = n4;
        d_sex = n5;
        d_month = n6;
        d_date = n7;
        d_year = n8;
        d_ID = n9;
        d_address = n10;
        d_phone = n11;
        d_email = n12;
        d_mobile = n13;
        
        name1 = n14;
        name2 = n15;
        title1 = n16;
        des1 = n17;
        user1 = n18;
        pass1 = n19;
        day1 = n20;
        month1 = n21;
        year1 = n22;
        gen1 = n23;
        email1 = n24;
        phone1 = n25;
        address1 = n26;
        mobile1 = n27;
        
        d_dept = n28;
        
        id = n29;
        
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
            java.util.logging.Logger.getLogger(AddDoctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JCheckBox agree;
    private javax.swing.JTextField attended;
    private javax.swing.JButton back;
    private javax.swing.JTextField completed;
    private javax.swing.JTextField date1;
    private javax.swing.JTextField date2;
    private javax.swing.JTextField gra;
    private javax.swing.JTextField issued;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField license;
    private javax.swing.JRadioButton no1;
    private javax.swing.JRadioButton no2;
    private javax.swing.JTextField position;
    private javax.swing.JTextField spe1;
    private javax.swing.JTextField spe2;
    private javax.swing.JComboBox<String> speciality1;
    private javax.swing.JComboBox<String> speciality2;
    private javax.swing.JTextField taken1;
    private javax.swing.JTextField taken2;
    private javax.swing.JRadioButton yes1;
    private javax.swing.JRadioButton yes2;
    // End of variables declaration//GEN-END:variables
}
