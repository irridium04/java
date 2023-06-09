/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package first.form;


import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import javax.swing.ButtonGroup;



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
    
    // set form properties
    
    this.setLocationRelativeTo(null);
    this.setTitle("First Form");
    
    // set label properties
    
    lbl_Num1.setText("Number 1");
    lbl_Num2.setText("Number 2");
    
    TxtNum1.setText("0");
    TxtNum2.setText("0");
    
    // button group
    
    ButtonGroup rbgroup = new ButtonGroup();
    
    rbgroup.add(jrbAdd);
    rbgroup.add(jrbSubtract);
    rbgroup.add(jrbMultiply);
    rbgroup.add(jrbDivide);
    
    jrbAdd.setSelected(true);
    
    
    
    // set traversal policy
//    
//    this.setFocusTraversalPolicy(oftp);


lbl_companyName.setVisible(false);
   
}

// formulas


private void Add2()
{
    double num1 = 0.0;
    double num2 = 0.0;
    double ans = 0.0;
    
    try
    {
        
    
    num1 = Double.parseDouble(TxtNum1.getText());
    num2 = Double.parseDouble(TxtNum2.getText());
    ans = num1 + num2;
    
    lblAns.setText(String.valueOf(ans));
    }
    catch (Exception e)
    {
        lblAns.setText(e.getLocalizedMessage());
    }
}
private void Subtract2()
{
    double num1 = 0.0;
    double num2 = 0.0;
    double ans = 0.0;
    
    try
    {
        
    
    num1 = Double.parseDouble(TxtNum1.getText());
    num2 = Double.parseDouble(TxtNum2.getText());
    ans = num1 +- num2;
    
    lblAns.setText(String.valueOf(ans));
    }
    catch (Exception e)
    {
        lblAns.setText(e.getLocalizedMessage());
    }
}
private void Multiply2()
{
    double num1 = 0.0;
    double num2 = 0.0;
    double ans = 0.0;
    
    try
    {
        
    
    num1 = Double.parseDouble(TxtNum1.getText());
    num2 = Double.parseDouble(TxtNum2.getText());
    ans = num1 * num2;
    
    lblAns.setText(String.valueOf(ans));
    }
    catch (Exception e)
    {
        lblAns.setText(e.getLocalizedMessage());
    }
}
private void Divide2()
{
    double num1 = 0.0;
    double num2 = 0.0;
    double ans = 0.0;
    
    try
    {
        
    
        num1 = Double.parseDouble(TxtNum1.getText());
        num2 = Double.parseDouble(TxtNum2.getText());
        if (num2 != 0)
        {
            ans = num1 / num2;
            lblAns.setText(String.valueOf(ans));
        }
        else
        {
            lblAns.setText("Error: Divide by zero");
        }
    }
    catch (Exception e)
    {
        lblAns.setText(e.getLocalizedMessage());
    }
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

        TxtNum1 = new javax.swing.JTextField();
        TxtNum2 = new javax.swing.JTextField();
        jrbAdd = new javax.swing.JRadioButton();
        jrbSubtract = new javax.swing.JRadioButton();
        jrbMultiply = new javax.swing.JRadioButton();
        jrbDivide = new javax.swing.JRadioButton();
        bttnCalc = new javax.swing.JButton();
        calculatorLabel = new javax.swing.JLabel();
        lbl_Num1 = new javax.swing.JLabel();
        lbl_Num2 = new javax.swing.JLabel();
        lblAns = new javax.swing.JLabel();
        lbl_company = new javax.swing.JLabel();
        lbl_companyName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtNum1.setText("jTextField1");

        TxtNum2.setText("jTextField1");
        TxtNum2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TxtNum2ActionPerformed(evt);
            }
        });

        jrbAdd.setText("Add");
        jrbAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jrbAddActionPerformed(evt);
            }
        });

        jrbSubtract.setText("Subtract");

        jrbMultiply.setText("Multiply");

        jrbDivide.setText("Divide");
        jrbDivide.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jrbDivideActionPerformed(evt);
            }
        });

        bttnCalc.setText("Calculate");
        bttnCalc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bttnCalcActionPerformed(evt);
            }
        });

        calculatorLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        calculatorLabel.setForeground(new java.awt.Color(0, 0, 255));
        calculatorLabel.setText("Calculator");

        lbl_Num1.setText("jLabel2");

        lbl_Num2.setText("jLabel2");

        lblAns.setText("Answer");

        lbl_company.setText("Software Company");
        lbl_company.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_companyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_companyMouseExited(evt);
            }
        });

        lbl_companyName.setText("Software by BubbaCorp");

        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_company)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_companyName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Num1)
                                .addGap(18, 18, 18)
                                .addComponent(TxtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAns)
                            .addComponent(calculatorLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Num2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bttnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(TxtNum2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbAdd)
                            .addComponent(jrbSubtract)
                            .addComponent(jrbMultiply)
                            .addComponent(jrbDivide))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(calculatorLabel)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_Num1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbAdd)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_Num2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbSubtract)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbMultiply)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbDivide))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblAns)))
                .addGap(18, 18, 18)
                .addComponent(bttnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_company)
                    .addComponent(lbl_companyName))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbDivideActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jrbDivideActionPerformed
    {//GEN-HEADEREND:event_jrbDivideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbDivideActionPerformed

    private void jrbAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jrbAddActionPerformed
    {//GEN-HEADEREND:event_jrbAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAddActionPerformed

    private void TxtNum2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TxtNum2ActionPerformed
    {//GEN-HEADEREND:event_TxtNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bttnCalcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bttnCalcActionPerformed
    {//GEN-HEADEREND:event_bttnCalcActionPerformed
        if (jrbAdd.isSelected())
        {
            Add2();
        }
        else if (jrbSubtract.isSelected())  
        {
            Subtract2();
        }
        else if (jrbMultiply.isSelected())  
        {
            Multiply2();
        }
        else if (jrbDivide.isSelected())  
        {
            Divide2();
        }
        
    }//GEN-LAST:event_bttnCalcActionPerformed

    private void lbl_companyMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_companyMouseEntered
    {//GEN-HEADEREND:event_lbl_companyMouseEntered
        lbl_companyName.setVisible(true);
    }//GEN-LAST:event_lbl_companyMouseEntered

    private void lbl_companyMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_companyMouseExited
    {//GEN-HEADEREND:event_lbl_companyMouseExited
        lbl_companyName.setVisible(false);
    }//GEN-LAST:event_lbl_companyMouseExited

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
    private javax.swing.JTextField TxtNum1;
    private javax.swing.JTextField TxtNum2;
    private javax.swing.JButton bttnCalc;
    private javax.swing.JLabel calculatorLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jrbAdd;
    private javax.swing.JRadioButton jrbDivide;
    private javax.swing.JRadioButton jrbMultiply;
    private javax.swing.JRadioButton jrbSubtract;
    private javax.swing.JLabel lblAns;
    private javax.swing.JLabel lbl_Num1;
    private javax.swing.JLabel lbl_Num2;
    private javax.swing.JLabel lbl_company;
    private javax.swing.JLabel lbl_companyName;
    // End of variables declaration//GEN-END:variables
}
