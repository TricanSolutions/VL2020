/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.Messages;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static org.apache.commons.beanutils.WrapDynaClass.clear;

/**
 *
 * @author Lasitha Ranawaka
 */
public class expenses extends javax.swing.JDialog {

    /**
     * Creates new form template
     */
    public expenses(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadtabl();
        cmbexpenses.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbexpenses = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtdetails = new javax.swing.JTextField();
        txtdate = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Expenses");
        jLabel1.setOpaque(true);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Expense", "Details", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Details"));

        jLabel2.setText("ID");

        jLabel3.setText("Date");

        jLabel4.setText("Expenses Type");

        cmbexpenses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Withdrawal", "Stamp Fees", "TP/Current", "Tax", "VAT", "Diesel", "Repair" }));
        cmbexpenses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbexpensesKeyPressed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Details");

        txtdetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdetailsKeyPressed(evt);
            }
        });

        txtdate.setEditable(false);
        try {
            txtdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdate.setEnabled(false);
        txtdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdateKeyPressed(evt);
            }
        });

        jLabel6.setText("Amount");

        txtamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtamountKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbexpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cmbexpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(txtdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        submit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        if (evt.getClickCount() == 2) {
            txtid.setText((String) tbl.getValueAt(tbl.getSelectedRow(), 0));
            txtdate.setText((String) tbl.getValueAt(tbl.getSelectedRow(), 1));
            cmbexpenses.setSelectedItem((String) tbl.getValueAt(tbl.getSelectedRow(), 2));
            txtdetails.setText((String) tbl.getValueAt(tbl.getSelectedRow(), 3));
            txtamount.setText((String) tbl.getValueAt(tbl.getSelectedRow(), 4));
        }
    }//GEN-LAST:event_tblMouseClicked

    private void txtdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdateKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbexpenses.grabFocus();

        }
    }//GEN-LAST:event_txtdateKeyPressed

    private void cmbexpensesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbexpensesKeyPressed
        if (evt.getKeyCode() == 10) {
            txtdetails.grabFocus();

        }
    }//GEN-LAST:event_cmbexpensesKeyPressed

    private void txtdetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdetailsKeyPressed
        if (evt.getKeyCode() == 10) {
            txtamount.grabFocus();

        }
    }//GEN-LAST:event_txtdetailsKeyPressed

    private void txtamountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamountKeyPressed
        if (evt.getKeyCode() == 10) {
            submit();

        }
    }//GEN-LAST:event_txtamountKeyPressed

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
            java.util.logging.Logger.getLogger(expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                expenses dialog = new expenses(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbexpenses;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtamount;
    private javax.swing.JFormattedTextField txtdate;
    private javax.swing.JTextField txtdetails;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    private void submit() {
        if (txtdate.getText().isEmpty()) {
            Messages.errorjoption("Entetr Date!");
            txtdate.grabFocus();

        } else if (cmbexpenses.getSelectedIndex() == -1) {
            Messages.errorjoption("Select Expenses!");
            cmbexpenses.grabFocus();

        } else if (txtamount.getText().isEmpty()) {
            Messages.errorjoption("Enter Amount!");
            txtamount.grabFocus();

        } else {

            if (txtid.getText().isEmpty()) {
                try {
                    model.db.putData("INSERT INTO expenses (expensesname,amount,date,details)values('" + cmbexpenses.getSelectedItem() + "',"
                            + "'" + txtamount.getText() + "',NOW(),'" + txtdetails.getText() + "')");
                    Messages.normaljoption("Data Saved!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    model.db.putData("UPDATE expenses set expensesname='" + cmbexpenses.getSelectedItem() + "',amount='" + txtamount.getText() + "',"
                            + "details='" + txtdetails.getText() + "' where id='" + txtid.getText() + "' ");
                    Messages.normaljoption("Data Updated!");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            loadtabl();
            clr();
            cmbexpenses.grabFocus();

        }
    }

    private void loadtabl() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = model.db.getData("SELECT\n"
                    + "expenses.id,\n"
                    + "expenses.expensesname,\n"
                    + "expenses.amount,\n"
                    + "expenses.date,\n"
                    + "expenses.details\n"
                    + "FROM\n"
                    + "expenses ORDER BY\n"
                    + "expenses.id DESC");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String amount = rs.getString(3);
                String date = rs.getString(4);
                String details = rs.getString(5);

                Object arr[] = {id, date, name, details, amount};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clr() {
        txtdate.setText("");
        txtamount.setText("");
        txtdetails.setText("");
        txtid.setText("");
        cmbexpenses.setSelectedIndex(0);
    }
}
