/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Model.Cars;
import Model.CarsCatalog;

/**
 *
 * @author rao.mah
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createJPanel
     */
    CarsCatalog catalog;
    public CreateJPanel(CarsCatalog catalog) {
        initComponents();
        this.catalog=catalog;
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblManufacturedBy = new javax.swing.JLabel();
        txtManufacturedBy = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        lblManufacturedYear = new javax.swing.JLabel();
        txtManufacturedYear = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        lblGeoLocation = new javax.swing.JLabel();
        txtGeoLocation = new javax.swing.JTextField();
        lblIsAvailable = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblModelNumber = new javax.swing.JLabel();
        lblMaintananceCertificate = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        chkMaintainanceCertificate = new javax.swing.JCheckBox();
        chkIsAvailable = new javax.swing.JCheckBox();
        errName = new javax.swing.JLabel();
        errManufacturedBy = new javax.swing.JLabel();
        errManufacturedDate = new javax.swing.JLabel();
        errSerialNumber = new javax.swing.JLabel();
        errSeats = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 223, 245));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD NEW CAR DETAILS");

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        lblManufacturedBy.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblManufacturedBy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManufacturedBy.setText("Manufactured by:");

        txtManufacturedBy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtManufacturedByKeyReleased(evt);
            }
        });

        txtSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSeatsKeyReleased(evt);
            }
        });

        lblManufacturedYear.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblManufacturedYear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManufacturedYear.setText("Manufactured Year:");

        txtManufacturedYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtManufacturedYearKeyReleased(evt);
            }
        });

        lblSeats.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblSeats.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSeats.setText("Number of Seats:");

        lblGeoLocation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblGeoLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGeoLocation.setText("Location:");

        txtGeoLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeoLocationActionPerformed(evt);
            }
        });

        lblIsAvailable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblIsAvailable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIsAvailable.setText("Availability");

        lblSerialNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSerialNumber.setText("Serial Number:");

        txtSerialNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerialNumberKeyReleased(evt);
            }
        });

        lblModelNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModelNumber.setText("Model Number:");

        lblMaintananceCertificate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblMaintananceCertificate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaintananceCertificate.setText("Maintanance Certificate Expired:");

        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        chkMaintainanceCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMaintainanceCertificateActionPerformed(evt);
            }
        });

        chkIsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIsAvailableActionPerformed(evt);
            }
        });

        errName.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        errName.setForeground(new java.awt.Color(255, 51, 51));

        errManufacturedBy.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        errManufacturedBy.setForeground(new java.awt.Color(255, 51, 51));

        errManufacturedDate.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        errManufacturedDate.setForeground(new java.awt.Color(255, 51, 51));

        errSerialNumber.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        errSerialNumber.setForeground(new java.awt.Color(255, 51, 51));

        errSeats.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        errSeats.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblManufacturedYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblModelNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblManufacturedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                            .addComponent(txtSeats, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtManufacturedYear, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtManufacturedBy, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtModelNumber)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblGeoLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(4, 4, 4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblIsAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblMaintananceCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(chkMaintainanceCertificate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                            .addComponent(chkIsAvailable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtGeoLocation))))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(errName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errManufacturedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errManufacturedDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 102, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnSubmit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(errName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblManufacturedBy)
                                    .addComponent(txtManufacturedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(errManufacturedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblManufacturedYear)
                                .addComponent(txtManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errManufacturedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeats))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSerialNumber, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(errSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGeoLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeoLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkIsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblIsAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintananceCertificate)
                    .addComponent(chkMaintainanceCertificate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnSubmit)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeoLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeoLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeoLocationActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here: 
       String name=txtName.getText();
       String manuBy=txtManufacturedBy.getText();
       String manuYear=txtManufacturedYear.getText();
       String seats=txtSeats.getText();
       String serial=txtSerialNumber.getText() ;
       String model=txtModelNumber.getText();
       String geo=txtGeoLocation.getText();
if(name.length()==0 ||manuBy.length()==0 ||manuYear.length()==0 ||seats.length()==0 ||serial.length()==0 ||model.length()==0 ||geo.length()==0 ){
           JOptionPane.showMessageDialog(this, "Please Fill all the Details to Proceed");

}else{
        Cars car=catalog.addNewCar();

       car.setName(txtName.getText());
       car.setManufactured_by(txtManufacturedBy.getText());
       car.setManufactured_year(Integer.parseInt(txtManufacturedYear.getText()));
       car.setlocation(txtGeoLocation.getText());
       car.setSeats(Byte.parseByte(txtSeats.getText()));
       car.setSerial_number(txtSerialNumber.getText() );
       car.setModel_number(txtModelNumber.getText());
       car.setAvailable(chkIsAvailable.isSelected());
       car.setmaintanance_certificate(chkMaintainanceCertificate.isSelected());
       JOptionPane.showMessageDialog(this, "New Entry Added Successfully");
       txtName.setText("");
       txtManufacturedBy.setText("");
       txtManufacturedYear.setText("");
       txtGeoLocation.setText("");
       txtSeats.setText("");
       txtSerialNumber.setText("");
       txtModelNumber.setText("");
       chkIsAvailable.setSelected(false);
       chkMaintainanceCertificate.setSelected(false);
                 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    catalog.setLast_Updated(date);
}
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void chkIsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIsAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIsAvailableActionPerformed

    private void chkMaintainanceCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMaintainanceCertificateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMaintainanceCertificateActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
         String PATTERN ="^[a-zA-Z].*[\\s\\.]*$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtName.getText());
        if(!match.matches()){
            errName.setText( "Invalid Entry!");
        }
        else{
            errName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtManufacturedByKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManufacturedByKeyReleased
        // TODO add your handling code here:
         String PATTERN ="^[a-zA-Z].*[\\s\\.]*$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtManufacturedBy.getText());
        if(!match.matches()){
            errManufacturedBy.setText( "Invalid Entry!");
        }
        else{
            errManufacturedBy.setText(null);
        }
    }//GEN-LAST:event_txtManufacturedByKeyReleased

    private void txtManufacturedYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManufacturedYearKeyReleased
        // TODO add your handling code here:
        String PATTERN ="^[0-9]{0,4}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtManufacturedYear.getText());
        if(!match.matches()){
            errManufacturedDate.setText( "Invalid Entry!");
        }
        else{
            errManufacturedDate.setText(null);
        }
    }//GEN-LAST:event_txtManufacturedYearKeyReleased

    private void txtSeatsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatsKeyReleased
        // TODO add your handling code here
        String PATTERN ="^[0-9]{0,1}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtSeats.getText());
        if(!match.matches()){
            errSeats.setText( "Invalid Entry!");
        }
        else{
            errSeats.setText(null);
        }
    }//GEN-LAST:event_txtSeatsKeyReleased

    private void txtSerialNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNumberKeyReleased
        // TODO add your handling code here:
         String PATTERN ="^[a-zA-Z0-9_]*$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtSerialNumber.getText());
        if(!match.matches()){
            errSerialNumber.setText( "Invalid Entry!");
        }
        else{
            errSerialNumber.setText(null);
        }
    }//GEN-LAST:event_txtSerialNumberKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkIsAvailable;
    private javax.swing.JCheckBox chkMaintainanceCertificate;
    private javax.swing.JLabel errManufacturedBy;
    private javax.swing.JLabel errManufacturedDate;
    private javax.swing.JLabel errName;
    private javax.swing.JLabel errSeats;
    private javax.swing.JLabel errSerialNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGeoLocation;
    private javax.swing.JLabel lblIsAvailable;
    private javax.swing.JLabel lblMaintananceCertificate;
    private javax.swing.JLabel lblManufacturedBy;
    private javax.swing.JLabel lblManufacturedYear;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTextField txtGeoLocation;
    private javax.swing.JTextField txtManufacturedBy;
    private javax.swing.JTextField txtManufacturedYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
