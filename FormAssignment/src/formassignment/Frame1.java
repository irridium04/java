/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formassignment;

/**
 *
 * @author collinshook
 */
public class Frame1 extends javax.swing.JFrame
{

/**
 * Creates new form Frame1
 */
public Frame1()
{
    initComponents();
}

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jrbCelsiusFarenheit = new javax.swing.JRadioButton();
        jrbTriangle = new javax.swing.JRadioButton();
        jrbTrapezoid = new javax.swing.JRadioButton();
        jTxtFarenheit = new javax.swing.JTextField();
        jLblFarenheit = new javax.swing.JLabel();
        jTxtCelsius = new javax.swing.JTextField();
        jLblCelsius = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtFarenheit1 = new javax.swing.JTextField();
        jLblFarenheit1 = new javax.swing.JLabel();
        jLblFarenheit2 = new javax.swing.JLabel();
        jTxtFarenheit2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jrbCelsiusFarenheit.setBackground(new java.awt.Color(18, 18, 18));
        jrbCelsiusFarenheit.setForeground(new java.awt.Color(255, 255, 255));
        jrbCelsiusFarenheit.setText("Celsius - Farenheit");
        jrbCelsiusFarenheit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jrbCelsiusFarenheitActionPerformed(evt);
            }
        });

        jrbTriangle.setBackground(new java.awt.Color(18, 18, 18));
        jrbTriangle.setForeground(new java.awt.Color(255, 255, 255));
        jrbTriangle.setText("Triangle");

        jrbTrapezoid.setBackground(new java.awt.Color(18, 18, 18));
        jrbTrapezoid.setForeground(new java.awt.Color(255, 255, 255));
        jrbTrapezoid.setText("Trapezoid");
        jrbTrapezoid.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jrbTrapezoidActionPerformed(evt);
            }
        });

        jTxtFarenheit.setBackground(new java.awt.Color(18, 18, 18));
        jTxtFarenheit.setForeground(new java.awt.Color(255, 255, 255));
        jTxtFarenheit.setText("032");
        jTxtFarenheit.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtFarenheit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTxtFarenheitActionPerformed(evt);
            }
        });

        jLblFarenheit.setForeground(new java.awt.Color(255, 255, 255));
        jLblFarenheit.setText("°F");

        jTxtCelsius.setBackground(new java.awt.Color(18, 18, 18));
        jTxtCelsius.setForeground(new java.awt.Color(255, 255, 255));
        jTxtCelsius.setText("000");
        jTxtCelsius.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtCelsius.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTxtCelsiusActionPerformed(evt);
            }
        });

        jLblCelsius.setForeground(new java.awt.Color(255, 255, 255));
        jLblCelsius.setText("°C");

        jLabel1.setText("=");

        jTxtFarenheit1.setBackground(new java.awt.Color(18, 18, 18));
        jTxtFarenheit1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtFarenheit1.setText(" ");
        jTxtFarenheit1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtFarenheit1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTxtFarenheit1ActionPerformed(evt);
            }
        });

        jLblFarenheit1.setForeground(new java.awt.Color(255, 255, 255));
        jLblFarenheit1.setText("Height");

        jLblFarenheit2.setForeground(new java.awt.Color(255, 255, 255));
        jLblFarenheit2.setText("Base");

        jTxtFarenheit2.setBackground(new java.awt.Color(18, 18, 18));
        jTxtFarenheit2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtFarenheit2.setText(" ");
        jTxtFarenheit2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtFarenheit2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTxtFarenheit2ActionPerformed(evt);
            }
        });

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblFarenheit2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtFarenheit2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLblFarenheit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLblFarenheit1)
                                            .addComponent(jTxtFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTxtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLblCelsius))))
                                            .addComponent(jTxtFarenheit1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(32, 32, 32)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbCelsiusFarenheit)
                                    .addComponent(jrbTriangle, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbTrapezoid, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jrbCelsiusFarenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbTriangle)
                            .addComponent(jTxtFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbTrapezoid)
                            .addComponent(jLblCelsius)
                            .addComponent(jLblFarenheit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFarenheit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblFarenheit2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFarenheit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblFarenheit1))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbCelsiusFarenheitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jrbCelsiusFarenheitActionPerformed
    {//GEN-HEADEREND:event_jrbCelsiusFarenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbCelsiusFarenheitActionPerformed

    private void jrbTrapezoidActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jrbTrapezoidActionPerformed
    {//GEN-HEADEREND:event_jrbTrapezoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbTrapezoidActionPerformed

    private void jTxtFarenheitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTxtFarenheitActionPerformed
    {//GEN-HEADEREND:event_jTxtFarenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFarenheitActionPerformed

    private void jTxtCelsiusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTxtCelsiusActionPerformed
    {//GEN-HEADEREND:event_jTxtCelsiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCelsiusActionPerformed

    private void jTxtFarenheit1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTxtFarenheit1ActionPerformed
    {//GEN-HEADEREND:event_jTxtFarenheit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFarenheit1ActionPerformed

    private void jTxtFarenheit2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTxtFarenheit2ActionPerformed
    {//GEN-HEADEREND:event_jTxtFarenheit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFarenheit2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[])
{
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
        {
            if ("Nimbus".equals(info.getName()))
            {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    }
    catch (ClassNotFoundException ex)
    {
        java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
        java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
        java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
        java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
    public void run()
    {
        new Frame1().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCelsius;
    private javax.swing.JLabel jLblFarenheit;
    private javax.swing.JLabel jLblFarenheit1;
    private javax.swing.JLabel jLblFarenheit2;
    private javax.swing.JTextField jTxtCelsius;
    private javax.swing.JTextField jTxtFarenheit;
    private javax.swing.JTextField jTxtFarenheit1;
    private javax.swing.JTextField jTxtFarenheit2;
    private javax.swing.JRadioButton jrbCelsiusFarenheit;
    private javax.swing.JRadioButton jrbTrapezoid;
    private javax.swing.JRadioButton jrbTriangle;
    // End of variables declaration//GEN-END:variables
}
