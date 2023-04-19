/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package listbox;

import javax.swing.DefaultListModel;

/**
 *
 * @author collinshook
 */
public class ListBoxFrame1 extends javax.swing.JFrame
{


    DefaultListModel myListModel = new DefaultListModel();
    DefaultListModel myListModel2 = new DefaultListModel();
    String[] comedians = {"Fluffy", "Amy Puller", "Jeff Foxworthy"};
    String[] cities = {"Billings", "Bozeman", "Helena", "Missoula",
        "Kalispell", "Hamilton", "Whitefish", "Columbia Falls",
    "Butte", "Great Falls", "Havre", "Glendive"};
    /**
     * Creates new form ListBoxFrame1
     */
    public ListBoxFrame1()
    {
        initComponents();
        
        // add items to list box model
        
        myListModel.addElement("Larry");
        myListModel.addElement("Curly");
        myListModel.addElement("Moe");
        myListModel.addElement("Shemp");
        
        
        // add names via array
        for (String comedian : comedians)
        {
            myListModel.addElement(comedian);
        }
        
        for (String city : cities)
        {
            myListModel2.addElement(city);
        }
        
        // attach model to listbox
        jList1.setModel(myListModel);
        jList2.setModel(myListModel2);
        
        
        // pre select
        jList1.setSelectedIndex(0);
        jList2.setSelectedIndex(0);
        
        
        // add title to frame
        
        this.setTitle("List Box Demo");
        
        
        jLblSelected.setText(jList1.getSelectedValue());
        jLblMultiple.setText(jList2.getSelectedValue());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLblSelected = new javax.swing.JLabel();
        jBttnRemove = new javax.swing.JButton();
        jtxtAdd = new javax.swing.JTextField();
        jBttnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLblMultiple = new javax.swing.JLabel();
        jBttnMultiple = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setBackground(new java.awt.Color(27, 27, 27));
        jList1.setForeground(new java.awt.Color(225, 225, 225));
        jList1.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener()
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt)
            {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLblSelected.setForeground(new java.awt.Color(204, 204, 0));
        jLblSelected.setText("jLabel1");

        jBttnRemove.setBackground(new java.awt.Color(20, 20, 20));
        jBttnRemove.setForeground(new java.awt.Color(225, 225, 225));
        jBttnRemove.setText("Remove");
        jBttnRemove.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBttnRemoveActionPerformed(evt);
            }
        });

        jtxtAdd.setBackground(new java.awt.Color(20, 20, 20));
        jtxtAdd.setForeground(new java.awt.Color(225, 225, 225));
        jtxtAdd.setCaretColor(new java.awt.Color(225, 225, 225));

        jBttnAdd.setBackground(new java.awt.Color(20, 20, 20));
        jBttnAdd.setForeground(new java.awt.Color(225, 225, 225));
        jBttnAdd.setText("Add");
        jBttnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBttnAddActionPerformed(evt);
            }
        });

        jList2.setBackground(new java.awt.Color(27, 27, 27));
        jList2.setForeground(new java.awt.Color(225, 225, 225));
        jList2.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener()
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt)
            {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jLblMultiple.setForeground(new java.awt.Color(204, 0, 0));
        jLblMultiple.setText("jLabel1");

        jBttnMultiple.setBackground(new java.awt.Color(20, 20, 20));
        jBttnMultiple.setForeground(new java.awt.Color(225, 225, 225));
        jBttnMultiple.setText("Show Multiple Selecton");
        jBttnMultiple.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBttnMultipleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBttnMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLblMultiple)
                    .addComponent(jLblSelected)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBttnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtAdd)
                            .addComponent(jBttnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLblSelected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBttnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jBttnAdd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblMultiple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnMultiple))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_jList1ValueChanged
    {//GEN-HEADEREND:event_jList1ValueChanged
        jLblSelected.setText(jList1.getSelectedValue());
    }//GEN-LAST:event_jList1ValueChanged

    private void jBttnRemoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBttnRemoveActionPerformed
    {//GEN-HEADEREND:event_jBttnRemoveActionPerformed
        try
        {
            myListModel.removeElementAt(jList1.getSelectedIndex());   
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jBttnRemoveActionPerformed

    private void jBttnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBttnAddActionPerformed
    {//GEN-HEADEREND:event_jBttnAddActionPerformed
        if(!jtxtAdd.getText().equals(""))
        {
            myListModel.addElement(jtxtAdd.getText());
            jtxtAdd.setText("");
        }
    }//GEN-LAST:event_jBttnAddActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_jList2ValueChanged
    {//GEN-HEADEREND:event_jList2ValueChanged
        jLblMultiple.setText(jList2.getSelectedValue());
    }//GEN-LAST:event_jList2ValueChanged

    private void jBttnMultipleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBttnMultipleActionPerformed
    {//GEN-HEADEREND:event_jBttnMultipleActionPerformed
        String selectedCities = "";
        
        var myList = jList2.getSelectedValuesList();
        
        for(String city : myList)
        {
            selectedCities += city + " ";
        }
        
        jLblMultiple.setText(selectedCities);
    }//GEN-LAST:event_jBttnMultipleActionPerformed

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
            java.util.logging.Logger.getLogger(ListBoxFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ListBoxFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ListBoxFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ListBoxFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new ListBoxFrame1().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnAdd;
    private javax.swing.JButton jBttnMultiple;
    private javax.swing.JButton jBttnRemove;
    private javax.swing.JLabel jLblMultiple;
    private javax.swing.JLabel jLblSelected;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxtAdd;
    // End of variables declaration//GEN-END:variables
}
