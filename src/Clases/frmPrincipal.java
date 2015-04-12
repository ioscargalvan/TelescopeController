/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import jssc.SerialPort;

/**
 *
 * @author Oscar
 */
public class frmPrincipal extends javax.swing.JFrame {



    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        btnShowVertical.setEnabled(false);
        btnShowHorizontal.setEnabled(false);
        errorHorizontalAngle.setVisible(false);
        errorVerticalAngle.setVisible(false);
        correctHorizontalAngle.setVisible(false);
        correctVerticalAngle.setVisible(false);

    }

    public void runInt() {
        try {
            isOpen = serialPort.openPort();
            boolean setParams = serialPort.setParams(9600, 8, 1, 0);
            JOptionPane.showMessageDialog(rootPane, "Port open.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "There was an error opening the port of the pc.");
        }

    }

    public void closeIt() {
        try {
            boolean isClosed = serialPort.closePort();
            JOptionPane.showMessageDialog(rootPane, "Port closed.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "The port is already closed.");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFldHorizontalAngle = new javax.swing.JTextField();
        correctHorizontalAngle = new javax.swing.JLabel();
        errorHorizontalAngle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFldVerticalAngle = new javax.swing.JTextField();
        correctVerticalAngle = new javax.swing.JLabel();
        errorVerticalAngle = new javax.swing.JLabel();
        btnShowVertical = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnShowHorizontal = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Telescope Controller");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Enter the values of the angles to adjust the telescope. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Horizontal");

        jLabel3.setText("Angle:");

        txtFldHorizontalAngle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldHorizontalAngleActionPerformed(evt);
            }
        });
        txtFldHorizontalAngle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFldHorizontalAngleFocusLost(evt);
            }
        });
        txtFldHorizontalAngle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFldHorizontalAngleKeyTyped(evt);
            }
        });

        correctHorizontalAngle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/correcto.png"))); // NOI18N

        errorHorizontalAngle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldHorizontalAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(correctHorizontalAngle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorHorizontalAngle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFldHorizontalAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctHorizontalAngle))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorHorizontalAngle)
                        .addGap(31, 31, 31))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 0));

        jLabel4.setText("Vertical");

        jLabel5.setText("Angle:");

        txtFldVerticalAngle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFldVerticalAngleFocusLost(evt);
            }
        });
        txtFldVerticalAngle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFldVerticalAngleKeyTyped(evt);
            }
        });

        correctVerticalAngle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/correcto.png"))); // NOI18N

        errorVerticalAngle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldVerticalAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(correctVerticalAngle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorVerticalAngle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFldVerticalAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctVerticalAngle))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(errorVerticalAngle)
                        .addGap(32, 32, 32))))
        );

        btnShowVertical.setText("Show");
        btnShowVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowVerticalActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Open Port");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Close Port");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnShowHorizontal.setText("Show");
        btnShowHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowHorizontalActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShowHorizontal)))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowVertical)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowVertical)
                    .addComponent(jButton2)
                    .addComponent(btnShowHorizontal)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    boolean validate(String value) {
        CharSequence st = value.trim();

        String reCadena = "[\\d]{1,3}";

        Pattern pattern = Pattern.compile(reCadena);

        Matcher matcher = pattern.matcher(st);

        if (matcher.matches()) {
            int valueInt = Integer.parseInt(value);
            if (valueInt >= 0 && valueInt <= 180) {
                return true;
            } else {
                JOptionPane.showMessageDialog(rootPane, "The value of the angle has to be greater or equal than 0 and smaller or "
                        + "equal than 180.");
            }
        }
        return false;

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
        txtFldVerticalAngle.setText("");
        okVertical = false;
        errorVerticalAngle.setVisible(false);
        correctVerticalAngle.setVisible(false);
        btnShowVertical.setEnabled(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnShowVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowVerticalActionPerformed

        String cadenaFinal = "2" + "=" + txtFldVerticalAngle.getText() + "@";
        
        if (isOpen) {
            JOptionPane.showMessageDialog(rootPane, "Data sent to telescope.");
            try {
               
                serialPort.writeString(cadenaFinal);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "The port isn't open.");
        }


    }//GEN-LAST:event_btnShowVerticalActionPerformed

    private void txtFldHorizontalAngleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFldHorizontalAngleKeyTyped

    }//GEN-LAST:event_txtFldHorizontalAngleKeyTyped

    private void txtFldVerticalAngleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFldVerticalAngleKeyTyped

    }//GEN-LAST:event_txtFldVerticalAngleKeyTyped

    private void txtFldHorizontalAngleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldHorizontalAngleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldHorizontalAngleActionPerformed

    private void txtFldHorizontalAngleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldHorizontalAngleFocusLost
        // TODO add your handling code here:
        if (validate(txtFldHorizontalAngle.getText())) {
            correctHorizontalAngle.setVisible(true);
            errorHorizontalAngle.setVisible(false);
            okHorizontal = true;
        } else {
            correctHorizontalAngle.setVisible(false);
            errorHorizontalAngle.setVisible(true);
            okHorizontal = false;
        }

        if (okHorizontal) {
            btnShowHorizontal.setEnabled(true);
        } else {
            btnShowHorizontal.setEnabled(false);
        }
    }//GEN-LAST:event_txtFldHorizontalAngleFocusLost

    private void txtFldVerticalAngleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldVerticalAngleFocusLost
        // TODO add your handling code here:
        if (validate(txtFldVerticalAngle.getText())) {
            correctVerticalAngle.setVisible(true);
            errorVerticalAngle.setVisible(false);
            okVertical = true;
        } else {
            correctVerticalAngle.setVisible(false);
            errorVerticalAngle.setVisible(true);
        }
        if (okVertical) {
            btnShowVertical.setEnabled(true);
        } else {
            btnShowVertical.setEnabled(false);
        }
    }//GEN-LAST:event_txtFldVerticalAngleFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        runInt();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        closeIt();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnShowHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowHorizontalActionPerformed
        // TODO add your handling code here:
        
        
        String cadenaFinal = "1" + "=" + txtFldHorizontalAngle.getText() + "@";
        if (isOpen) {
            JOptionPane.showMessageDialog(rootPane, "Data sent to telescope.");
            try {
                serialPort.writeString(cadenaFinal);
            } catch (Exception e) {
            }
        } else { 
            JOptionPane.showMessageDialog(rootPane, "The port isn't open.");
        }
    }//GEN-LAST:event_btnShowHorizontalActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtFldHorizontalAngle.setText("");
        okHorizontal = false;
        errorHorizontalAngle.setVisible(false);
        correctHorizontalAngle.setVisible(false);
        btnShowHorizontal.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
                SplashScreen ss = new SplashScreen();
                ss.setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowHorizontal;
    private javax.swing.JButton btnShowVertical;
    private javax.swing.JLabel correctHorizontalAngle;
    private javax.swing.JLabel correctVerticalAngle;
    private javax.swing.JLabel errorHorizontalAngle;
    private javax.swing.JLabel errorVerticalAngle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtFldHorizontalAngle;
    private javax.swing.JTextField txtFldVerticalAngle;
    // End of variables declaration//GEN-END:variables
    boolean okVertical = false;
    boolean okHorizontal = false;
    // Watchout here.
      SerialPort serialPort = new SerialPort("COM3");
    boolean isOpen = false;

}
