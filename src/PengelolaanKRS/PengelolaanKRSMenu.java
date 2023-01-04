package PengelolaanKRS;

/**
 *
 * @author achma
 */
public class PengelolaanKRSMenu extends javax.swing.JFrame {

    /**
     * Creates new form PengelolaanKRSMenu
     */
    public PengelolaanKRSMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menumahasiswa = new javax.swing.JMenuItem();
        menuinputkrs = new javax.swing.JMenuItem();
        menumatkul = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("MAIN MENU");

        jMenu4.setText("File");

        jMenu3.setText("Aplikasi ");

        menumahasiswa.setText("Form Mahasiswa");
        menumahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumahasiswaActionPerformed(evt);
            }
        });
        jMenu3.add(menumahasiswa);

        menuinputkrs.setText("Input KRS");
        menuinputkrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuinputkrsActionPerformed(evt);
            }
        });
        jMenu3.add(menuinputkrs);

        menumatkul.setText("Form Mata Kuliah");
        menumatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumatkulActionPerformed(evt);
            }
        });
        jMenu3.add(menumatkul);

        jMenu4.add(jMenu3);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuinputkrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuinputkrsActionPerformed
        // TODO add your handling code here:
        InputKRSGUI VARIABEL;
        VARIABEL = new InputKRSGUI();
        VARIABEL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuinputkrsActionPerformed

    private void menumatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumatkulActionPerformed
        // TODO add your handling code here:
        FormMataKuliah var;
        var = new FormMataKuliah();
        var.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menumatkulActionPerformed

    private void menumahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumahasiswaActionPerformed
        // TODO add your handling code here:
        FormMahasiswa var;
        var = new FormMahasiswa();
        var.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menumahasiswaActionPerformed

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
            java.util.logging.Logger.getLogger(PengelolaanKRSMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKRSMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKRSMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKRSMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaanKRSMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem menuinputkrs;
    private javax.swing.JMenuItem menumahasiswa;
    private javax.swing.JMenuItem menumatkul;
    // End of variables declaration//GEN-END:variables
}
