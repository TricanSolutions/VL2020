/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.Messages;
import com.userstatus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lasitha Ranawaka
 */
public class writtenExamDetails extends javax.swing.JDialog {

    /**
     * Creates new form template
     */
    public writtenExamDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadtabl();
        txtadmissiono.grabFocus();
        txtadmissiono.selectAll();

    }

    writtenExamDetails(String adno, String name, int id, boolean b) {
        initComponents();
        txtadmissiono.grabFocus();
        txtadmissiono.selectAll();
        txtadmissiono.setText(adno);
        txtname.setText(name);
        cusid = id;
        System.out.println(cusid);
        loadtabl();

    }
    int cusid;
    int writtenexamid;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtadmissiono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_findByDMTBarcode = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtexamdate = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtresult = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbpassorfail = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Written Exam Details");
        jLabel1.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("By Admission No");

        txtadmissiono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtadmissiono.setForeground(new java.awt.Color(0, 0, 204));
        txtadmissiono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadmissionoActionPerformed(evt);
            }
        });
        txtadmissiono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadmissionoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Name");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 0, 204));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("By DMT Barcode");

        txt_findByDMTBarcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_findByDMTBarcode.setForeground(new java.awt.Color(0, 0, 204));
        txt_findByDMTBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_findByDMTBarcodeKeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtadmissiono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txt_findByDMTBarcode)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtadmissiono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_findByDMTBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tbl.setForeground(new java.awt.Color(0, 0, 153));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Result", "Pass or Fail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.getTableHeader().setReorderingAllowed(false);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Details"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("ID");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 0, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Exam Date");

        txtexamdate.setForeground(new java.awt.Color(0, 0, 204));
        try {
            txtexamdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtexamdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtexamdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtexamdateKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("Result");

        txtresult.setBackground(new java.awt.Color(255, 255, 51));
        txtresult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtresult.setForeground(new java.awt.Color(204, 0, 0));
        txtresult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtresultKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Pass or Fail");

        cmbpassorfail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbpassorfail.setForeground(new java.awt.Color(204, 0, 204));
        cmbpassorfail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Waiting", "Pass", "Fail", "Absent", "Cancel" }));
        cmbpassorfail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbpassorfailKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Barcode");

        txtBarcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBarcode.setForeground(new java.awt.Color(0, 0, 204));
        txtBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtexamdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(cmbpassorfail, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtexamdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmbpassorfail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        submit();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadtabl();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        writtenexamid = Integer.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 0).toString());

        txtid.setText(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 0)));
        txtexamdate.setText(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 1)));
        txtresult.setText(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 2)));
        cmbpassorfail.setSelectedItem(String.valueOf(dtm.getValueAt(tbl.getSelectedRow(), 3)));
    }//GEN-LAST:event_tblMouseClicked

    private void txtadmissionoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadmissionoActionPerformed

    }//GEN-LAST:event_txtadmissionoActionPerformed

    private void txtadmissionoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadmissionoKeyPressed
        if (evt.getKeyCode() == 10) {
            loadtabl();

        }
    }//GEN-LAST:event_txtadmissionoKeyPressed

    private void txtexamdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexamdateKeyPressed
        if (evt.getKeyCode() == 10) {
            txtresult.grabFocus();

        }
    }//GEN-LAST:event_txtexamdateKeyPressed

    private void txtresultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresultKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbpassorfail.grabFocus();

        }
    }//GEN-LAST:event_txtresultKeyPressed

    private void cmbpassorfailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbpassorfailKeyPressed
        if (evt.getKeyCode() == 10) {
            submit();
            txtadmissiono.grabFocus();

        }
    }//GEN-LAST:event_cmbpassorfailKeyPressed

    private void txtBarcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyPressed
        if (evt.getKeyCode() == 10) {
            txtexamdate.grabFocus();
        }
    }//GEN-LAST:event_txtBarcodeKeyPressed

    private void txt_findByDMTBarcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_findByDMTBarcodeKeyPressed
        if (evt.getKeyCode() == 10) {
            findByDMTBarcode();

        }
    }//GEN-LAST:event_txt_findByDMTBarcodeKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        findByDMTBarcode();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(writtenExamDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                writtenExamDetails dialog = new writtenExamDetails(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbpassorfail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txt_findByDMTBarcode;
    private javax.swing.JTextField txtadmissiono;
    private javax.swing.JFormattedTextField txtexamdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtresult;
    // End of variables declaration//GEN-END:variables

    private void loadtabl() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "writtenexamresult.id,\n"
                    + "writtenexamresult.customer_register_id,\n"
                    + "writtenexamresult.examDate,\n"
                    + "writtenexamresult.writtenResult,\n"
                    + "writtenexamresult.passOrFail,\n"
                    + "uniquecustomerdetails.namewithinitial\n"
                    + "FROM\n"
                    + "writtenexamresult ,\n"
                    + "customer_register ,\n"
                    + "uniquecustomerdetails\n"
                    + "WHERE\n"
                    + "writtenexamresult.customer_register_id = customer_register.id AND\n"
                    + "customer_register.admission_no = '" + txtadmissiono.getText() + "' AND\n"
                    + "customer_register.nic = uniquecustomerdetails.nic");
            while (rs.next()) {
                txtname.setText(rs.getString(6));
                int id = rs.getInt(1);
                String date = rs.getString(3);
                String result = rs.getString(4);
                String pass = rs.getString(5);
                Object o[] = {id, date, result, pass};
                dtm.addRow(o);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "customer_register.id,\n"
                    + "uniquecustomerdetails.namewithinitial\n"
                    + "FROM\n"
                    + "customer_register\n"
                    + "INNER JOIN uniquecustomerdetails ON customer_register.uniqueCustomerDetails_id = uniquecustomerdetails.id\n"
                    + "WHERE\n"
                    + "customer_register.admission_no = '" + txtadmissiono.getText().trim() + "'");
            while (rs.next()) {
                txtname.setText(rs.getString(2));
                cusid = rs.getInt(1);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        //  txtexamdate.grabFocus();
    }

    private void clear() {
        txtid.setText("");
        // txtexamdate.setText("");
        txtresult.setText("");
        cmbpassorfail.setSelectedIndex(0);
        txtBarcode.setText("");
    }

    private void submit() {

        save();

    }

    private boolean isNotIDAlreadyExistInDB() {
        boolean bol = true;

        try {

            ResultSet rs = model.db.getData("SELECT\n"
                    + "customer_register.barcode\n"
                    + "FROM\n"
                    + "customer_register\n"
                    + "WHERE\n"
                    + "customer_register.admission_no = '" + txtadmissiono.getText().trim() + "'");
            if (rs.next()) {
                bol = false;
                Messages.warningjoption("Barcode Already exist! ");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bol;
    }

    private boolean isDateExist() {

        boolean bol = false;
        String selectDate = txtexamdate.getText();

        for (int i = 0; i < tbl.getRowCount(); i++) {

            String tblDate = tbl.getValueAt(i, 1).toString();

            if (selectDate.equals(tblDate)) {
                //System.out.println("ok "+tblDate);
                bol = true;
                break;
            }

        }

        return bol;

    }

    private void save() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
//        boolean bol = true;

        if (cmbpassorfail.getSelectedIndex() == 0) {
            com.Messages.errorjoption("Select Pass or Fail!");
            cmbpassorfail.grabFocus();

        } else {
            if (txtid.getText().isEmpty()) {

                if (!isDateExist()) {

                    try {
                        model.db.putData("INSERT INTO writtenexamresult(customer_register_id,examDate,writtenResult,passOrFail)"
                                + "values('" + cusid + "','" + txtexamdate.getText() + "','" + txtresult.getText() + "','" + cmbpassorfail.getSelectedItem() + "')");

                        if (!txtBarcode.getText().isEmpty()) {
                            model.db.putData("UPDATE customer_register set barcode='" + txtBarcode.getText().trim() + "' where id='" + cusid + "'  ");
                            System.out.println("barcode id " + cusid);

                        } else {
                            com.Messages.warningjoption("Barcode is already exist");

                        }

                        model.db.putData("INSERT INTO log(date,description,username)values(NOW(),'" + "written exam add" + "',"
                                + "'" + userstatus.LodUser + "')");
                        com.Messages.normaljoption("Data Saved!");
                        loadtabl();
                         sendsms();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    com.Messages.errorjoption("Date is already exist");

                }

            } else {
                try {
                    model.db.putData("UPDATE writtenexamresult set examDate='" + txtexamdate.getText() + "',"
                            + "writtenResult='" + txtresult.getText() + "',passOrFail='" + cmbpassorfail.getSelectedItem() + "' "
                            + "WHERE id='" + txtid.getText() + "' ");

                    model.db.putData("INSERT INTO log(date,description,username)values(NOW(),'" + "written exam updated" + "',"
                            + "'" + userstatus.LodUser + "')");
                    com.Messages.normaljoption("Data Updated!");
                    loadtabl();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }

        }
       

        clear();
    }

    private void findByDMTBarcode() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "writtenexamresult.id,\n"
                    + "writtenexamresult.customer_register_id,\n"
                    + "writtenexamresult.examDate,\n"
                    + "writtenexamresult.writtenResult,\n"
                    + "writtenexamresult.passOrFail,\n"
                    + "uniquecustomerdetails.`name`,\n"
                    + "customer_register.admission_no\n"
                    + "FROM\n"
                    + "writtenexamresult ,\n"
                    + "customer_register ,\n"
                    + "uniquecustomerdetails\n"
                    + "WHERE\n"
                    + "writtenexamresult.customer_register_id = customer_register.id AND\n"
                    + "customer_register.barcode = '" + txt_findByDMTBarcode.getText() + "' AND\n"
                    + "customer_register.nic = uniquecustomerdetails.nic");
            while (rs.next()) {
                txtname.setText(rs.getString(6));
                txtadmissiono.setText(rs.getString(7));
                int id = rs.getInt(1);
                String date = rs.getString(3);
                String result = rs.getString(4);
                String pass = rs.getString(5);
                Object o[] = {id, date, result, pass};
                dtm.addRow(o);
                //14244799

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "customer_register.id,\n"
                    + "uniquecustomerdetails.namewithinitial\n"
                    + "FROM\n"
                    + "customer_register\n"
                    + "INNER JOIN uniquecustomerdetails ON customer_register.uniqueCustomerDetails_id = uniquecustomerdetails.id\n"
                    + "WHERE\n"
                    + "customer_register.barcode = '" + txt_findByDMTBarcode.getText().trim() + "'");
            while (rs.next()) {
                txtname.setText(rs.getString(2));
                cusid = rs.getInt(1);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private void sendsms() {
        String tp = null;
        String datew = txtexamdate.getText();
        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "customer_register.tp1\n"
                    + "FROM\n"
                    + "customer_register\n"
                    + "WHERE\n"
                    + "customer_register.admission_no = '"+txtadmissiono.getText()+"'");

            if (rs.next()) {
                tp = rs.getString(1);
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String originalString = tp;
        originalString = originalString.substring(1);
        originalString = originalString.replaceAll("[-+.^:,]", "");
        String neworiginalString = "0094" + originalString;

        System.out.println(neworiginalString);

        try {
            // Construct data
            String apiKey = "apikey=" + "TRSJWOBd7x8-R02dI4i1Q6uuoZVkg4zRGCihxtBQH5";
            String message = "&message=" + "Please do not consider about this msg. -Your Written Test date for Driving Licence is " + datew + " .Please be attend ontime. More info 0372223969. vijayalearners.com";
            String sender = "&sender=" + "Viajaya Learners";
            String numbers = "&numbers=" + neworiginalString;

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                //stringBuffer.append(line);
                // JOptionPane.showMessageDialog(null, "message" + line);
            }
            rd.close();

            //return stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("Error SMS " + e);
            //return "Error "+e;
            //  JOptionPane.showMessageDialog(null, e);
        }
    }
}
