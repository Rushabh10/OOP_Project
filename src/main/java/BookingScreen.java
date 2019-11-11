/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
/**
 *
 * @author rushi
 */
public class BookingScreen extends javax.swing.JFrame {

    /**
     * Creates new form BookingScreen
     */
    
    Image img = Toolkit.getDefaultToolkit().getImage("F:\\map.jpg");
    
    public BookingScreen() {
        this.setContentPane(new JPanel()
                {
                    @Override
                    public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                    g.drawImage(img, 0, 0, 758, 510, this);
                }
                });
        setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dest_butt_group = new javax.swing.ButtonGroup();
        jRadioButton12 = new javax.swing.JRadioButton();
        loc_butt_group = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        coupon_code_label = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        book_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loc_a_pick = new javax.swing.JRadioButton();
        loc_b_pick = new javax.swing.JRadioButton();
        loc_c_pick = new javax.swing.JRadioButton();
        loc_d_pick = new javax.swing.JRadioButton();
        loc_e_pick = new javax.swing.JRadioButton();
        loc_f_pick = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        loc_a_drop = new javax.swing.JRadioButton();
        loc_b_drop = new javax.swing.JRadioButton();
        loc_c_drop = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loc_d_drop = new javax.swing.JRadioButton();
        loc_e_drop = new javax.swing.JRadioButton();
        loc_f_drop = new javax.swing.JRadioButton();

        jRadioButton12.setText("Location F");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Book Your Ride");

        coupon_code_label.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        coupon_code_label.setText("Coupon Code ");

        book_button.setText("Book Now");
        book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Pick-Up Location");

        loc_butt_group.add(loc_a_pick);
        loc_a_pick.setText("Location A");

        loc_butt_group.add(loc_b_pick);
        loc_b_pick.setText("Location B");
        loc_b_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_b_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_c_pick);
        loc_c_pick.setText("Location C");

        loc_butt_group.add(loc_d_pick);
        loc_d_pick.setText("Location D");

        loc_butt_group.add(loc_e_pick);
        loc_e_pick.setText("Location E");
        loc_e_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_e_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_f_pick);
        loc_f_pick.setText("Location F");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Drop Location");

        dest_butt_group.add(loc_a_drop);
        loc_a_drop.setText("Location A");

        dest_butt_group.add(loc_b_drop);
        loc_b_drop.setText("Location B");

        dest_butt_group.add(loc_c_drop);
        loc_c_drop.setText("Location C");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Ride Type");

        jRadioButton13.setText("Mini");

        jRadioButton14.setText("SUV");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estimated Fare:");

        dest_butt_group.add(loc_d_drop);
        loc_d_drop.setText("Location D");

        dest_butt_group.add(loc_e_drop);
        loc_e_drop.setText("Location E");

        dest_butt_group.add(loc_f_drop);
        loc_f_drop.setText("Location F");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(511, 511, 511)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(loc_a_pick)
                                            .addComponent(loc_b_pick)
                                            .addComponent(loc_c_pick))
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loc_c_drop)
                                            .addComponent(loc_b_drop)
                                            .addComponent(loc_a_drop)
                                            .addComponent(jLabel3)
                                            .addComponent(loc_d_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loc_e_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loc_f_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(coupon_code_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(loc_d_pick)
                            .addComponent(loc_e_pick)
                            .addComponent(loc_f_pick)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(book_button)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_a_pick)
                    .addComponent(loc_a_drop)
                    .addComponent(jRadioButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_b_pick)
                    .addComponent(loc_b_drop)
                    .addComponent(jRadioButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_c_pick)
                    .addComponent(loc_c_drop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_d_pick)
                    .addComponent(loc_d_drop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_e_pick)
                    .addComponent(loc_e_drop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_f_pick)
                    .addComponent(loc_f_drop))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coupon_code_label)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(book_button)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_buttonActionPerformed

    private void loc_b_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_b_pickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loc_b_pickActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void loc_e_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_e_pickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loc_e_pickActionPerformed

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
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book_button;
    private javax.swing.JLabel coupon_code_label;
    private javax.swing.ButtonGroup dest_butt_group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton loc_a_drop;
    private javax.swing.JRadioButton loc_a_pick;
    private javax.swing.JRadioButton loc_b_drop;
    private javax.swing.JRadioButton loc_b_pick;
    private javax.swing.ButtonGroup loc_butt_group;
    private javax.swing.JRadioButton loc_c_drop;
    private javax.swing.JRadioButton loc_c_pick;
    private javax.swing.JRadioButton loc_d_drop;
    private javax.swing.JRadioButton loc_d_pick;
    private javax.swing.JRadioButton loc_e_drop;
    private javax.swing.JRadioButton loc_e_pick;
    private javax.swing.JRadioButton loc_f_drop;
    private javax.swing.JRadioButton loc_f_pick;
    // End of variables declaration//GEN-END:variables
}
