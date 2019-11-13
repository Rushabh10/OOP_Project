
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushi
 */
public class TravelPage extends javax.swing.JFrame {
        int time_left = 10; //keep duration here
        int time_done = 0;
    /**
     * Creates new form TravelPage
     */
    Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\rushi\\Documents\\NetBeansProjects\\gradleproject1\\map_bg1.jpg");
//    public TravelPage() {
//             this.setContentPane(new JPanel()
//                {
//                    @Override
//                    public void paintComponent(Graphics g)
//                {
//                    super.paintComponent(g);
//                    g.drawImage(img, 0, 0, 700, 560, this);
//                }
//                });
//        setResizable(false);
//        initComponents();
//        
//        time_el_in.setFont(new Font("Serif", Font.PLAIN, 22));
//        time_rem_in.setFont(new Font("Serif", Font.PLAIN, 22));
//        Timer timer = new Timer();
//        TimerTask task = new TimerTask()
//        {
//            public void run()
//            {
//                time_el_in.setText(""+time_done);
//                time_done++;
//                time_rem_in.setText(""+time_left);
//                time_left--;
//                if(time_left == -1)
//                {
//                    dispose();
//                    RideReview ride_review = new RideReview(start, drop, dri_name, duration, fare);
//                    ride_review.setVisible(true);
//                }
//            }
//        };
//        timer.scheduleAtFixedRate(task, 0, 1000);
//        
//        
//    }
     String user_id;
     public TravelPage(String user_id, String start, String drop, String dri_name, int duration, int fare) {
        
        
                     this.setContentPane(new JPanel()
                {
                    @Override
                    public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                    g.drawImage(img, 0, 0, 700, 560, this);
                }
                });
                     
                     
                     
                System.out.println("Reached...1");     
        setResizable(false);
        initComponents();
        
        from_in.setText(start);
        time_left=duration;
        to_in.setText(drop);
        
        
        time_el_in.setFont(new Font("Serif", Font.PLAIN, 22));
        time_rem_in.setFont(new Font("Serif", Font.PLAIN, 22));
        Timer timer = new Timer();
        System.out.println("Reached...2");
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                time_el_in.setText(""+time_done);
                time_done++;
                time_rem_in.setText(""+time_left);
                time_left--;
                if(time_left == -1)
                {
                    dispose();
                    RideReview ride_review = new RideReview(user_id, start, drop, dri_name, duration, fare);
                    ride_review.setVisible(true);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ongoing_ride_label = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        time_elap = new javax.swing.JLabel();
        time_rem = new javax.swing.JLabel();
        from_in = new javax.swing.JLabel();
        to_in = new javax.swing.JLabel();
        time_el_in = new javax.swing.JLabel();
        time_rem_in = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ongoing_ride_label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ongoing_ride_label.setText("Ongoing Ride");

        from.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        from.setText("From:");

        to.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        to.setText("To:");

        time_elap.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        time_elap.setText("Time Elapsed:");

        time_rem.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        time_rem.setText("Time Remaining:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ongoing_ride_label)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(time_elap, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(time_el_in, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(time_rem)
                                .addGap(61, 61, 61)))
                        .addComponent(time_rem_in, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(from))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(from_in, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(to_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ongoing_ride_label)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(from)
                    .addComponent(from_in, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(to)
                    .addComponent(to_in, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(time_rem)
                        .addComponent(time_elap))
                    .addComponent(time_rem_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_el_in, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelPage().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel from;
    private javax.swing.JLabel from_in;
    private javax.swing.JLabel ongoing_ride_label;
    private javax.swing.JLabel time_el_in;
    private javax.swing.JLabel time_elap;
    private javax.swing.JLabel time_rem;
    private javax.swing.JLabel time_rem_in;
    private javax.swing.JLabel to;
    private javax.swing.JLabel to_in;
    // End of variables declaration//GEN-END:variables
}
