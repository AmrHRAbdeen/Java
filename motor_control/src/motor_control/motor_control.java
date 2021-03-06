package nafady_motor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import arduino.*;


/**

/**
 *
 * @author mahmoud-
 */
public class motor_control extends javax.swing.JFrame {

   private boolean myFlag=false;
    private boolean switchFlag=false;
    /**
     *
     * Creates new form motor_control
     */
    
    Arduino myArduino = new Arduino();
    public motor_control() {
        initComponents();
        myArduino.setPortDescription("COM6");
         boolean myRes=myArduino.openConnection();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MotorON = new javax.swing.JButton();
        colckWise = new javax.swing.JRadioButton();
        counterClockWise = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MotorON.setText("ON/OFF");
        MotorON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotorONActionPerformed(evt);
            }
        });

        buttonGroup1.add(colckWise);
        colckWise.setText("ClockWise");
        colckWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colckWiseActionPerformed(evt);
            }
        });

        buttonGroup1.add(counterClockWise);
        counterClockWise.setText("Counter CLockWise");
        counterClockWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counterClockWiseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colckWise)
                    .addComponent(counterClockWise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(MotorON, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colckWise)
                        .addGap(43, 43, 43)
                        .addComponent(counterClockWise))
                    .addComponent(MotorON, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MotorONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotorONActionPerformed
        // TODO add your handling code he 
        if(!myFlag){
            myArduino.serialWrite("O");    
            myFlag=true;
        }else{
             myArduino.serialWrite("F");
             myFlag=!myFlag;
        }
       
          
    }//GEN-LAST:event_MotorONActionPerformed

    private void colckWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colckWiseActionPerformed
        // TODO add your handling code here:
        
        if(!switchFlag){
         myArduino.serialWrite("c");   
         switchFlag=!switchFlag;
        }
         
    }//GEN-LAST:event_colckWiseActionPerformed

    private void counterClockWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counterClockWiseActionPerformed
        // TODO add your handling code here:
        if(switchFlag){
          myArduino.serialWrite("A");  
          switchFlag=!switchFlag;
        }
         
    }//GEN-LAST:event_counterClockWiseActionPerformed

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
            java.util.logging.Logger.getLogger(motor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(motor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(motor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(motor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new motor_control().setVisible(true);
                   //me7tag thread lelkalam dah w GUI.????!!!!
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MotorON;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton colckWise;
    private javax.swing.JRadioButton counterClockWise;
    // End of variables declaration//GEN-END:variables
}
