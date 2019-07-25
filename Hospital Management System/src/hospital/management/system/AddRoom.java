
package hospital.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;


public class AddRoom extends JPanel {

    
    public AddRoom() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        catagory = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        roomNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bedNo = new javax.swing.JTextField();
        addRoom = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 221));

        jLabel1.setText("Select Room Type:");

        catagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROOM CATAGORY...", "Normal", "Medium", "VIP" }));
        catagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter Room No.:");

        jLabel2.setText("Enter Total Bed No.:");

        addRoom.setBackground(new java.awt.Color(0, 153, 153));
        addRoom.setForeground(new java.awt.Color(0, 51, 51));
        addRoom.setText("ADD ROOM");
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bedNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomNo)
                            .addComponent(catagory, 0, 401, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addRoom)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(catagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bedNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(addRoom)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void catagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryActionPerformed
      
    }//GEN-LAST:event_catagoryActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                
                String query;
                ResultSet rs;
                
                
                if (catagory.getSelectedItem() == "Normal") {
                    
                    String a = roomNo.getText();
                    String b = bedNo.getText();
                    int count = 0;
                    
                    int y = Integer.parseInt(b);
                    
                    query = "SELECT * FROM NORMAL WHERE NORMAL = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    query = "SELECT * FROM MEDIUM WHERE MEDIUM = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    query = "SELECT * FROM VIP WHERE VIP = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    if (count == 0) {
                        
                        String s = "";

                        int cnt = 0;
                        for (char c = 'A'; cnt != y; c++) {
                            s = s + c;
                            cnt++;
                        }
                        
                        query = "INSERT INTO NORMAL (NORMAL, NORMAL_SIT, CURRENT_NORMAL_SIT, ALL_SIT) VALUES ('"+a+"', '"+b+"', '"+b+"', '"+s+"')";
                        stat.execute(query);
                        JOptionPane.showMessageDialog(null, "Room added Successfully!");
                        
                    }
                    
                    else
                        JOptionPane.showMessageDialog(null, "Room already exist!");
                }
                
                else if (catagory.getSelectedItem() == "Medium") {
                    
                    String a = roomNo.getText();
                    String b = bedNo.getText();
                    int count = 0;
                    
                    int y = Integer.parseInt(b);
                    
                    query = "SELECT * FROM NORMAL WHERE NORMAL = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    query = "SELECT * FROM MEDIUM WHERE MEDIUM = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    query = "SELECT * FROM VIP WHERE VIP = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    if (count == 0) {
                        
                        String s = "";

                        int cnt = 0;
                        for (char c = 'A'; cnt != y; c++) {
                            s = s + c;
                            cnt++;
                        }
                        
                        query = "INSERT INTO MEDIUM (MEDIUM, MEDIUM_SIT, CURRENT_MEDIUM_SIT, ALL_SIT) VALUES ('"+a+"', '"+b+"', '"+b+"', '"+s+"')";
                        stat.execute(query);
                        JOptionPane.showMessageDialog(null, "Room added Successfully!");
                        
                    }
                    
                    else
                        JOptionPane.showMessageDialog(null, "Room already exist!");
                }
                
                else if (catagory.getSelectedItem() == "VIP") {
                    
                    String a = roomNo.getText();
                    String b = bedNo.getText();
                    int count = 0;
                    
                    int y = Integer.parseInt(b);
                    
                    query = "SELECT * FROM NORMAL WHERE NORMAL = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    query = "SELECT * FROM MEDIUM WHERE MEDIUM = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    query = "SELECT * FROM VIP WHERE VIP = '"+a+"' ";
                    rs = stat.executeQuery(query);
                    
                    while (rs.next()) {  // for duplicate room no. find
                        count++;
                    }
                    
                    if (count == 0) {
                        
                        String s = "";

                        int cnt = 0;
                        for (char c = 'A'; cnt != y; c++) {
                            s = s + c;
                            cnt++;
                        }
                        
                        query = "INSERT INTO VIP (VIP, VIP_SIT, CURRENT_VIP_SIT, ALL_SIT) VALUES ('"+a+"', '"+b+"', '"+b+"', '"+s+"')";
                        stat.execute(query);
                        JOptionPane.showMessageDialog(null, "Room added Successfully!");
                        
                    }
                    
                    else
                        JOptionPane.showMessageDialog(null, "Room already exist!");
                }
                  
                else {
                    JOptionPane.showMessageDialog(null, "PLEASE SELECT ROOM TYPE FIRST!");
                }
                
                catagory.setSelectedIndex(0);
                roomNo.setText(null);
                bedNo.setText(null);


            }

           catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.toString());
           }
    }//GEN-LAST:event_addRoomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoom;
    private javax.swing.JTextField bedNo;
    private javax.swing.JComboBox<String> catagory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField roomNo;
    // End of variables declaration//GEN-END:variables
}
