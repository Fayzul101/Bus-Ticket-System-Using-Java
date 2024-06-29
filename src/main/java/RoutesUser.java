
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class RoutesUser extends javax.swing.JFrame {
     Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form Customers
     */
    public RoutesUser() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        conn = javaConnect.ConnectDB();
        showDestForDhaka();
        showDestForChittagong();
        showDestForBarishal();
        showDestForRajshahi();
       /* DefaultTableModel mod1 = (DefaultTableModel)jTable1.getModel();
        jTable1.setRowHeight(jTable1.getRowHeight() + 21);
         Object data[] ={"Barishal", 500};
         mod1.addRow(data);
         Object data1[] ={"Rajshahi", 730};
         mod1.addRow(data1);
         Object data2[] ={"Chittagong", 670};
         mod1.addRow(data2);
         
         DefaultTableModel mod2 = (DefaultTableModel)jTable2.getModel();
        jTable2.setRowHeight(jTable2.getRowHeight() + 21);
         Object data3[] ={"Dhaka", 500};
         mod2.addRow(data3);
         Object data4[] ={"Rajshahi", 1300};
         mod2.addRow(data4);
         Object data5[] ={"Chittagong", 1200};
         mod2.addRow(data5);
         
         DefaultTableModel mod3 = (DefaultTableModel)jTable3.getModel();
        jTable3.setRowHeight(jTable3.getRowHeight() + 21);
         Object data6[] ={"Dhaka", 730};
         mod3.addRow(data6);
         Object data7[] ={"Barishal", 1300};
         mod3.addRow(data7);
         Object data8[] ={"Chittagong", 1400};
         mod3.addRow(data8);
         
         DefaultTableModel mod4 = (DefaultTableModel)jTable4.getModel();
        jTable4.setRowHeight(jTable4.getRowHeight() + 21);
         Object data9[] ={"Dhaka", 670};
         mod4.addRow(data9);
         Object data10[] ={"Barishal", 1200};
         mod4.addRow(data10);
         Object data11[] ={"Rajshahi", 1400};
         mod4.addRow(data11);
        */
 
    }

    
    private void showDestForDhaka(){
        String sql = "Select * from location where source = 'Dhaka'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel tModel = (DefaultTableModel)jTable1.getModel();
            jTable1.setRowHeight(jTable1.getRowHeight() + 21);
            while(rs.next()){
                String dest = rs.getString(2);
                String price = String.valueOf(rs.getString(3));
                String tData[] = {dest, price};
                tModel.addRow(tData);
            }
           
        }  catch(Exception e){
                    
                    }
        
    }
     private void showDestForChittagong(){
        String sql = "Select * from location where source = 'Chittagong'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel tModel = (DefaultTableModel)jTable4.getModel();
            jTable4.setRowHeight(jTable4.getRowHeight() + 21);
            while(rs.next()){
                String dest = rs.getString(2);
                String price = String.valueOf(rs.getString(3));
                String tData[] = {dest, price};
                tModel.addRow(tData);
            }
           
        }  catch(Exception e){
                    
                    }
     }
         private void showDestForBarishal(){
        String sql = "Select * from location where source = 'Barishal'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel tModel = (DefaultTableModel)jTable2.getModel();
            jTable2.setRowHeight(jTable2.getRowHeight() + 21);
            while(rs.next()){
                String dest = rs.getString(2);
                String price = String.valueOf(rs.getString(3));
                String tData[] = {dest, price};
                tModel.addRow(tData);
            }
           
        }  catch(Exception e){
                    
                    }
         }
         private void showDestForRajshahi(){
        String sql = "Select * from location where source = 'Rajshahi'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel tModel = (DefaultTableModel)jTable3.getModel();
            jTable3.setRowHeight(jTable3.getRowHeight() + 21);
            while(rs.next()){
                String dest = rs.getString(2);
                String price = String.valueOf(rs.getString(3));
                String tData[] = {dest, price};
                tModel.addRow(tData);
            }
           
        }  catch(Exception e){
                    
                    }
         }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/alohomora/Downloads/routBAN.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setBackground(new java.awt.Color(50, 50, 64));
        jTable1.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(210, 200, 238));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 140));

        jTable2.setBackground(new java.awt.Color(50, 50, 64));
        jTable2.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jTable2.setForeground(new java.awt.Color(210, 200, 238));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 200, 140));

        jTable3.setBackground(new java.awt.Color(50, 50, 64));
        jTable3.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jTable3.setForeground(new java.awt.Color(210, 200, 238));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 200, 140));

        jTable4.setBackground(new java.awt.Color(50, 50, 64));
        jTable4.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jTable4.setForeground(new java.awt.Color(210, 200, 238));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 140));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Departure : Rajshahi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Departure : Dhaka");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Departure : Chittagong");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Departure : Barishal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new RoutesUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
