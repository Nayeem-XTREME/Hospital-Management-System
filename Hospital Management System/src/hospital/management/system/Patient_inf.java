
package hospital.management.system;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Position;

public class Patient_inf extends JPanel {
    
    final void fillList()
    {
        try {
                
                String url = "jdbc:derby://localhost:1527/Hospital";
                String username = "admin1";
                String password = "admin1";
                
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stat = con.createStatement();
                
                String query = "SELECT * FROM PATIENT";
                ResultSet rs = stat.executeQuery(query);
                
                DefaultListModel DLM = new DefaultListModel();
                
                while (rs.next()) {
                    DLM.addElement(rs.getString(1));
                }
                
                List.setModel(DLM);
        }
         catch(SQLException e) {
                 JOptionPane.showMessageDialog(null, e.toString());
         }
         
    }
    
    public Patient_inf() {
        initComponents();
        
        fillList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        viewInf = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        catagory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bed = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setForeground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(750, 523));

        jLabel2.setText("PATIENT NAME:");

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        viewInf.setBackground(new java.awt.Color(0, 153, 153));
        viewInf.setForeground(new java.awt.Color(255, 255, 255));
        viewInf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/view2.png"))); // NOI18N
        viewInf.setText("VIEW INFORMATION");
        viewInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInfActionPerformed(evt);
            }
        });

        List.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        jLabel1.setText("NAME:");

        jLabel3.setText("ROOM NO:");

        jLabel4.setText("CATAGORY:");

        jLabel5.setText("BED NO:");

        jLabel6.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catagory)
                                    .addComponent(name)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(room)
                                    .addComponent(bed)
                                    .addComponent(id)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewInf)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addComponent(viewInf)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        int res = List.getNextMatch(Search.getText(), 0, Position.Bias.Forward);
        List.setSelectedIndex(res);
    }//GEN-LAST:event_searchActionPerformed

    private void viewInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInfActionPerformed
        Patient_Information.information(id.getText());
    }//GEN-LAST:event_viewInfActionPerformed

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        try {

            String url = "jdbc:derby://localhost:1527/Hospital";
            String username = "admin1";
            String password = "admin1";

            Connection con = DriverManager.getConnection(url, username, password);
            Statement stat = con.createStatement();

            String query = "SELECT * FROM PATIENT WHERE NAME = '"+List.getSelectedValue()+"'";
            ResultSet rs = stat.executeQuery(query);

            while (rs.next()) {
                name.setText(rs.getString(1));
                catagory.setText(rs.getString(21));
                bed.setText(rs.getString(25));
                room.setText(rs.getString(24));
                id.setText(rs.getString(22));

                Search.setText(rs.getString(1));
            }

        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_ListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField bed;
    private javax.swing.JTextField catagory;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField name;
    private javax.swing.JTextField room;
    private javax.swing.JButton search;
    private javax.swing.JButton viewInf;
    // End of variables declaration//GEN-END:variables
}
