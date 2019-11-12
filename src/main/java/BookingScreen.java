/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import static com.mysql.cj.MysqlType.NULL;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
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
        try{
        loc_a_drop.setEnabled(false);
        loc_b_drop.setEnabled(false);
        loc_c_drop.setEnabled(false);
        loc_d_drop.setEnabled(false);
        loc_e_drop.setEnabled(false);
        loc_f_drop.setEnabled(false);
        loc_g_drop.setEnabled(false);
        loc_h_drop.setEnabled(false);
        }
        catch (Exception e){}
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dest_butt_group = new javax.swing.ButtonGroup();
        jRadioButton12 = new javax.swing.JRadioButton();
        loc_butt_group = new javax.swing.ButtonGroup();
        car_type_group = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
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
        car_sedan = new javax.swing.JRadioButton();
        car_suv = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        loc_d_drop = new javax.swing.JRadioButton();
        loc_e_drop = new javax.swing.JRadioButton();
        loc_f_drop = new javax.swing.JRadioButton();
        loc_g_pick = new javax.swing.JRadioButton();
        loc_h_pick = new javax.swing.JRadioButton();
        loc_g_drop = new javax.swing.JRadioButton();
        loc_h_drop = new javax.swing.JRadioButton();

        jRadioButton12.setText("Location F");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Book Your Ride");

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
        loc_a_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_a_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_b_pick);
        loc_b_pick.setText("Location B");
        loc_b_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_b_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_c_pick);
        loc_c_pick.setText("Location C");
        loc_c_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_c_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_d_pick);
        loc_d_pick.setText("Location D");
        loc_d_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_d_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_e_pick);
        loc_e_pick.setText("Location E");
        loc_e_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_e_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_f_pick);
        loc_f_pick.setText("Location F");
        loc_f_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_f_pickActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Drop Location");

        dest_butt_group.add(loc_a_drop);
        loc_a_drop.setText("Location A");
        loc_a_drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_a_dropActionPerformed(evt);
            }
        });

        dest_butt_group.add(loc_b_drop);
        loc_b_drop.setText("Location B");

        dest_butt_group.add(loc_c_drop);
        loc_c_drop.setText("Location C");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Ride Type");

        car_type_group.add(car_sedan);
        car_sedan.setText("Sedan");
        car_sedan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_sedanActionPerformed(evt);
            }
        });

        car_type_group.add(car_suv);
        car_suv.setText("SUV");

        dest_butt_group.add(loc_d_drop);
        loc_d_drop.setText("Location D");
        loc_d_drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_d_dropActionPerformed(evt);
            }
        });

        dest_butt_group.add(loc_e_drop);
        loc_e_drop.setText("Location E");

        dest_butt_group.add(loc_f_drop);
        loc_f_drop.setText("Location F");

        loc_butt_group.add(loc_g_pick);
        loc_g_pick.setText("Location G");
        loc_g_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_g_pickActionPerformed(evt);
            }
        });

        loc_butt_group.add(loc_h_pick);
        loc_h_pick.setText("Location H");
        loc_h_pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_h_pickActionPerformed(evt);
            }
        });

        dest_butt_group.add(loc_g_drop);
        loc_g_drop.setText("Location G");

        dest_butt_group.add(loc_h_drop);
        loc_h_drop.setText("Location H");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jLabel2)
                                    .addComponent(loc_a_pick)
                                    .addComponent(loc_b_pick)
                                    .addComponent(loc_c_pick)
                                    .addComponent(loc_g_pick)
                                    .addComponent(loc_h_pick))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loc_c_drop)
                                    .addComponent(loc_b_drop)
                                    .addComponent(loc_a_drop)
                                    .addComponent(jLabel3)
                                    .addComponent(loc_d_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loc_e_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loc_f_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loc_g_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loc_h_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(book_button))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(car_sedan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(car_suv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(loc_d_pick)
                            .addComponent(loc_e_pick)
                            .addComponent(loc_f_pick)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
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
                    .addComponent(car_sedan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_b_pick)
                    .addComponent(loc_b_drop)
                    .addComponent(car_suv))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_g_drop)
                    .addComponent(loc_g_pick))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_h_drop)
                    .addComponent(loc_h_pick))
                .addGap(42, 42, 42)
                .addComponent(book_button)
                .addGap(72, 72, 72)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loc_a_drop.setEnabled(false);
        loc_b_drop.setEnabled(false);
        loc_c_drop.setEnabled(false);
        loc_d_drop.setEnabled(false);
        loc_e_drop.setEnabled(false);
        loc_f_drop.setEnabled(false);
        loc_g_drop.setEnabled(false);
        loc_h_drop.setEnabled(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_buttonActionPerformed
        int pickupid = 0;
        if(loc_a_pick.isSelected()){
            pickupid = 1;
        }
        else if(loc_b_pick.isSelected()){
            pickupid = 2;
        }
        else if(loc_c_pick.isSelected()){
            pickupid = 3;
        }
        else if(loc_d_pick.isSelected()){
            pickupid = 4;
        }
        else if(loc_e_pick.isSelected()){
            pickupid = 5;
        }
        else if(loc_f_pick.isSelected()){
            pickupid = 6;
        }
        else if(loc_g_pick.isSelected()){
            pickupid = 7;
        }
        else if(loc_h_pick.isSelected()){
            pickupid = 8;
        }
        
        String pickup = "", drop = "", driver_name = "";
        int fare = 0;
        float driver_rating = 0;
        int dropid = 0;
        String drop_loc="";
        if(loc_a_drop.isSelected()){
            dropid = 1;
            drop_loc =  "dist1";
            drop = "Eriador";
        }
        else if(loc_b_drop.isSelected()){
            dropid = 2;
            drop_loc =  "dist2";
            drop = "Gondor";
        }
        else if(loc_c_drop.isSelected()){
            dropid = 3;
            drop_loc =  "dist3";
            drop = "Isengard";
        }
        else if(loc_d_drop.isSelected()){
            dropid = 4;
            drop_loc =  "dist4";
            drop = "Rohan";
        }
        else if(loc_e_drop.isSelected()){
            dropid = 5;
            drop_loc =  "dist5";
            drop = "Helms Deep";
        }
        else if(loc_f_drop.isSelected()){
            dropid = 6;
            drop_loc =  "dist6";
            drop = "The Shire";
        }
        else if(loc_g_drop.isSelected()){
            dropid = 7;
            drop_loc =  "dist7";
            drop = "Mordor";
        }
        else if(loc_h_drop.isSelected()){
            dropid = 8;
            drop_loc =  "dist8";
            drop = "Moria";
        }
                
        int cartype = 0;
        if(car_sedan.isSelected()){
            cartype = 1;
        }
        else if(car_suv.isSelected()){
            cartype = 2;
        }
        
        //checking for exception cases
        if(pickupid == 0)
        {
        //displaying error if no pick-up is selected
            JOptionPane.showMessageDialog (null,"Please select a pick-up location");
        }
        
        else if(dropid == 0)
        {
        //displaying error if no drop is selected
            JOptionPane.showMessageDialog (null,"Please select a drop location");
        }
        
        else if(cartype == 0)
        {
        //displaying error if no car is selected
            JOptionPane.showMessageDialog (null,"Please select a car type");
        }
        
        else
        {
            
            
            //retrieve values from locations database
            try{
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/locations","root","root");
                Statement myStmt = myConn.createStatement();
                ResultSet myRs = myStmt.executeQuery("select * from distances");
                while(myRs.next())
                {
                    if(Integer.parseInt(myRs.getString("sNo")) == pickupid){
                        fare = 20 * Integer.parseInt(myRs.getString(drop_loc));
                        pickup = myRs.getString("name");
                    }
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            //retrieve values from drivers database
            String temp_driver_name = "";
            float temp_rating = 0;
            try{
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/drivers","root","root");
                Statement myStmt = myConn.createStatement();
                ResultSet myRs = myStmt.executeQuery("select * from driver");
//                ResultSet myRs = myStmt.executeQuery("select max(rating) from driver where ");
                int flag = 0, flag1 = 0;
                while(myRs.next())
                {
                    if(Integer.parseInt(myRs.getString("cur_pos")) == pickupid){
                        flag = 1;
                        if(Integer.parseInt(myRs.getString("car_type")) == cartype){
                            float r = (Float.parseFloat(myRs.getString("rating")));
//                            System.out.println(r);
                            if(Float.parseFloat(myRs.getString("rating")) > temp_rating){
                                driver_name = myRs.getString("driver_name");
                                driver_rating = r;
                            }
                            flag1 = 1;
                        }
                    }
                    
                }
                if(flag == 0){
                    JOptionPane.showMessageDialog(null, "Sorry, no cars available in your area.");
                }
                else if(flag1 == 0){
                    if(cartype == 1)
                        JOptionPane.showMessageDialog(null, "Sorry, no sedans available in your area.");
                    else
                        JOptionPane.showMessageDialog(null, "Sorry, no SUVs available in your area.");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
//            System.out.println(pickup + " " + drop + " " + driver_name + " " + driver_rating + " " + fare);
            dispose();
            DriverPage dp = new DriverPage(pickup, drop, fare, driver_name, driver_rating);
            dp.setVisible(true);
        } 
        
        //send  to DriverPage
    }//GEN-LAST:event_book_buttonActionPerformed

    private void loc_b_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_b_pickActionPerformed
        // TODO add your handling code here:
        loc_a_drop.setEnabled(true);
        loc_c_drop.setEnabled(true);
        loc_d_drop.setEnabled(true);
        loc_e_drop.setEnabled(true);
        loc_f_drop.setEnabled(true);
        loc_g_drop.setEnabled(true);
        loc_h_drop.setEnabled(true);
        loc_b_drop.setEnabled(false);
        loc_b_drop.setSelected(false);
    }//GEN-LAST:event_loc_b_pickActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void loc_e_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_e_pickActionPerformed
        // TODO add your handling code here:
        loc_b_drop.setEnabled(true);
        loc_c_drop.setEnabled(true);
        loc_d_drop.setEnabled(true);
        loc_a_drop.setEnabled(true);
        loc_f_drop.setEnabled(true);
        loc_e_drop.setSelected(false);
        loc_e_drop.setEnabled(false);
        loc_g_drop.setEnabled(true);
        loc_h_drop.setEnabled(true);        
    }//GEN-LAST:event_loc_e_pickActionPerformed

    private void loc_g_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_g_pickActionPerformed
        // TODO add your handling code here:
        loc_b_drop.setEnabled(true);
        loc_c_drop.setEnabled(true);
        loc_d_drop.setEnabled(true);
        loc_e_drop.setEnabled(true);
        loc_f_drop.setEnabled(true);
        loc_g_drop.setEnabled(false);
        loc_g_drop.setSelected(false);
        loc_a_drop.setEnabled(true);
        loc_h_drop.setEnabled(true);
    }//GEN-LAST:event_loc_g_pickActionPerformed

    private void loc_h_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_h_pickActionPerformed
        // TODO add your handling code here:
        loc_a_drop.setEnabled(true);
        loc_b_drop.setEnabled(true);
        loc_c_drop.setEnabled(true);
        loc_d_drop.setEnabled(true);
        loc_e_drop.setEnabled(true);
        loc_f_drop.setEnabled(true);
        loc_g_drop.setEnabled(true);
        loc_h_drop.setEnabled(false);
        loc_h_drop.setSelected(false);
    }//GEN-LAST:event_loc_h_pickActionPerformed

    private void loc_a_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_a_pickActionPerformed
        // TODO add your handling code here:
        loc_a_drop.setEnabled(false);
        loc_a_drop.setSelected(false);
        loc_b_drop.setEnabled(true);
        loc_c_drop.setEnabled(true);
        loc_d_drop.setEnabled(true);
        loc_e_drop.setEnabled(true);
        loc_f_drop.setEnabled(true);
        loc_g_drop.setEnabled(true);
        loc_h_drop.setEnabled(true);
        
        
    }//GEN-LAST:event_loc_a_pickActionPerformed

    private void loc_c_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_c_pickActionPerformed
        // TODO add your handling code here:
        loc_b_drop.setEnabled(true);
        loc_a_drop.setEnabled(true);
        loc_c_drop.setEnabled(false);
        loc_c_drop.setSelected(false);
        loc_d_drop.setEnabled(true);
        loc_e_drop.setEnabled(true);
        loc_f_drop.setEnabled(true);
        loc_g_drop.setEnabled(true);
        loc_h_drop.setEnabled(true);
    }//GEN-LAST:event_loc_c_pickActionPerformed

    private void loc_d_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_d_pickActionPerformed
        // TODO add your handling code here:
        loc_b_drop.setEnabled(true);
        loc_c_drop.setEnabled(true);
        loc_a_drop.setEnabled(true);
        loc_d_drop.setSelected(false);
        loc_d_drop.setEnabled(false);
        loc_e_drop.setEnabled(true);
        loc_f_drop.setEnabled(true);
        loc_g_drop.setEnabled(true);
        loc_h_drop.setEnabled(true);
    }//GEN-LAST:event_loc_d_pickActionPerformed

    private void loc_f_pickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_f_pickActionPerformed
        // TODO add your handling code here:
        loc_b_drop.setEnabled(true);
        loc_c_drop.setEnabled(true);
        loc_d_drop.setEnabled(true);
        loc_e_drop.setEnabled(true);
        loc_f_drop.setEnabled(false);
        loc_f_drop.setSelected(false);
        loc_a_drop.setEnabled(true);
        loc_g_drop.setEnabled(true);
        loc_h_drop.setEnabled(true);
    }//GEN-LAST:event_loc_f_pickActionPerformed

    private void car_sedanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_sedanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car_sedanActionPerformed

    private void loc_a_dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_a_dropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loc_a_dropActionPerformed

    private void loc_d_dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_d_dropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loc_d_dropActionPerformed

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
    private javax.swing.JRadioButton car_sedan;
    private javax.swing.JRadioButton car_suv;
    private javax.swing.ButtonGroup car_type_group;
    private javax.swing.ButtonGroup dest_butt_group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton12;
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
    private javax.swing.JRadioButton loc_g_drop;
    private javax.swing.JRadioButton loc_g_pick;
    private javax.swing.JRadioButton loc_h_drop;
    private javax.swing.JRadioButton loc_h_pick;
    // End of variables declaration//GEN-END:variables
}
