
package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class DoctorScreen extends javax.swing.JFrame {

    private static String ID;
    
    public DoctorScreen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        des = new javax.swing.JLabel();
        dept = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        spe = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dep = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DOCTORS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(750, 568));
        setSize(new java.awt.Dimension(750, 568));

        back.setBackground(new java.awt.Color(255, 102, 102));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/back2.png"))); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SMART HOSPITAL MANAGEMENT SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Neo Sans Std", 1, 24))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DOCTORS LIST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14))); // NOI18N

        des.setFont(new java.awt.Font("Continuum Light", 0, 20)); // NOI18N
        des.setForeground(new java.awt.Color(0, 102, 204));
        des.setText("DESIGNATION");

        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DEPARTMENT...", "ALL DEPARTMENT", "Anesthesiology", "Cardiology", "Cosmatic & Plastic Surgery", "Endocrinology", "Endoscopy", "Gastroenterology", "Hematology", "Immunology", "Nephrology", "Neurology", "Neurosurgery", "Oncology", "Ophthalmology", "Orthopedics", "Radiotherapy", "Urology" }));
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("El Messiri", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel5.setFont(new java.awt.Font("El Messiri", 0, 18)); // NOI18N
        jLabel5.setText("ID:");

        name.setFont(new java.awt.Font("Continuum Medium", 0, 20)); // NOI18N
        name.setForeground(new java.awt.Color(0, 102, 102));
        name.setText("NAME");

        jLabel2.setFont(new java.awt.Font("El Messiri", 0, 18)); // NOI18N
        jLabel2.setText("Department:");

        jLabel11.setText("Select Department:");

        id.setFont(new java.awt.Font("Continuum Medium", 0, 20)); // NOI18N
        id.setForeground(new java.awt.Color(255, 0, 51));
        id.setText("ID");

        spe.setFont(new java.awt.Font("Continuum Light", 0, 20)); // NOI18N
        spe.setForeground(new java.awt.Color(0, 102, 204));
        spe.setText("SPECIALITY");

        jLabel4.setFont(new java.awt.Font("El Messiri", 0, 18)); // NOI18N
        jLabel4.setText("Speciality:");

        jLabel3.setFont(new java.awt.Font("El Messiri", 0, 18)); // NOI18N
        jLabel3.setText("Designation:");

        dep.setFont(new java.awt.Font("Continuum Light", 0, 20)); // NOI18N
        dep.setForeground(new java.awt.Color(0, 102, 204));
        dep.setText("DEPARTMENT");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DESIGNATION", "DEPARTMENT", "SPECIALITY"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id)
                            .addComponent(spe)
                            .addComponent(dep)
                            .addComponent(name)
                            .addComponent(des))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(des))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dep))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spe))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(id))
                        .addGap(123, 123, 123))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                
                DefaultTableModel model=(DefaultTableModel)table.getModel();

                if (dept.getSelectedItem() == "ALL DEPARTMENT") {
                    String query = "SELECT * FROM DOCTOR";
                    ResultSet rs = stat.executeQuery(query);
                    
                    DefaultListModel DLM = new DefaultListModel();
                    
                    while (rs.next()) {
                        model.addRow(new Object[] {rs.getString(1), rs.getString(3), rs.getString(27), rs.getString(18)});
                        ID = rs.getString(8);
                    }

                    //List.setModel(DLM);
                }
                
                else {
                    String query = "SELECT * FROM DOCTOR WHERE DEPARTMENT = '"+dept.getSelectedItem()+"' ";
                    ResultSet rs = stat.executeQuery(query);
                    DefaultListModel DLM = new DefaultListModel();
                
                    while (rs.next()) {
                        model.addRow(new Object[] {rs.getString(1), rs.getString(3), rs.getString(27), rs.getString(18)});
                        ID = rs.getString(8);
                    }

                    //List.setModel(DLM);
                }

            }

           catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.toString());
           }
    }//GEN-LAST:event_deptActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        FirstScreen.firstScreen();
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        
        int i = table.getSelectedRow();
        TableModel model = table.getModel();
        name.setText(model.getValueAt(i, 0).toString());
        des.setText(model.getValueAt(i, 1).toString());
        dep.setText(model.getValueAt(i, 2).toString());
        spe.setText(model.getValueAt(i, 3).toString());
        
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                
                String query = "SELECT * FROM DOCTOR WHERE FIRST_NAME = '"+model.getValueAt(i, 0).toString()+"' AND DEPARTMENT = '"+model.getValueAt(i, 2).toString()+"'  ";
                ResultSet rs = stat.executeQuery(query);
                
                while (rs.next()) {
                    id.setText(rs.getString(8));
                }

            }

           catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.toString());
           }
        
    }//GEN-LAST:event_tableMouseClicked

    
    public static void screen() {
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
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel dep;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JLabel des;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel spe;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
