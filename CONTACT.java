/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproject;

/**
 *
 * @author Dhanushree
 */
public class CONTACT extends javax.swing.JFrame {

    /**
     * Creates new form CONTACT
     */
    public CONTACT() {
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

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        textArea2 = new java.awt.TextArea();
        label3 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("CONTACT US");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 260, 50));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/full.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 360));

        label2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(204, 204, 204));
        label2.setText("infinityexcavators@gmail.com");
        jPanel3.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 110, 210, 40));

        textArea2.setEditable(false);
        textArea2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        textArea2.setText("CONTACT US\n\n TO MAKE AN ORDER OR GET MORE  INFORMATION ABOUT ANY EXCAVATORS YOU ARE INTRESTED IN.  \n\nOUR OPERATORS WILL PROVIDE YOU WITH ALL THE INFORMATION ABOUT YOUR INTREST.");
        jPanel3.add(textArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 1010, 110));

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(204, 204, 204));
        label3.setText(" FIND US ON ");
        jPanel3.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/11.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, -1, 50));

        label4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(204, 204, 204));
        label4.setText("infinity_excavators");
        jPanel3.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, 140, -1));

        label5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(204, 204, 204));
        label5.setText("95353120235");
        jPanel3.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 180, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/2r.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 170, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1250, 500));

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button1.setLabel("HOME");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
 HOME H=new HOME();
       H.setVisible(true);
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONTACT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONTACT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
