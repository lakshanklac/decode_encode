package cryptography;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ENCODE extends javax.swing.JFrame {
    
    public ENCODE() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ENCODE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("MESSAGE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ENCODED:");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setText("RESULT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "KEY", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double aa = Double.valueOf(jTextField1.getText());
        double bb = Double.valueOf(jTextField2.getText());
        double cc = Double.valueOf(jTextField3.getText());
        double dd = Double.valueOf(jTextField4.getText());
        double ee = Double.valueOf(jTextField5.getText());
        double ff = Double.valueOf(jTextField6.getText());
        double gg = Double.valueOf(jTextField7.getText());
        double hh = Double.valueOf(jTextField8.getText());
        double ii = Double.valueOf(jTextField9.getText());
      
        try {
           
        double invert=(((aa*ii)-(cc*gg))/((aa*hh)-(bb*gg)))-(((aa*ff)-(dd*cc))/((aa*ee)-(dd*bb)));
        if(invert!=0)
        {
        jLabel8.setText("");
        String str1=jTextField10.getText();
        String str=str1.toUpperCase();
        int size=str.length();
        //jLabel5.setText(str);
        char[] message = str.toCharArray();
        int[] value=new int[size];
        
        int j;
        for (j = 0; j < size; j++)
        {
            char msg = message[j];
            
            switch (msg) 
            {
                case ' ':
                    value[j]=0;
                    break;
                case 'A':
                    value[j]=1;
                    break;
                case 'B':
                    value[j]=2;
                    break;
                case 'C':
                    value[j]=3;
                    break;
                case 'D':
                    value[j]=4;
                    break;
                case 'E':
                    value[j]=5;
                    break;
                case 'F':
                    value[j]=6;
                    break;
                case 'G':
                    value[j]=7;
                    break;
                case 'H':
                    value[j]=8;
                    break;
                case 'I':
                    value[j]=9;
                    break;
                case 'J':
                    value[j]=10;
                    break;
                case 'K':
                    value[j]=11;
                    break;
                case 'L':
                    value[j]=12;
                    break;
                case 'M':
                    value[j]=13;
                    break;
                case 'N':
                    value[j]=14;
                    break;
                case 'O':
                    value[j]=15;
                    break;
                case 'P':
                    value[j]=16;
                    break;
                case 'Q':
                    value[j]=17;
                    break;
                case 'R':
                    value[j]=18;
                    break;
                case 'S':
                    value[j]=19;
                    break;
                case 'T':
                    value[j]=20;
                    break;
                case 'U':
                    value[j]=21;
                    break;
                case 'V':
                    value[j]=22;
                    break;
                case 'W':
                    value[j]=23;
                    break;
                case 'X':
                    value[j]=24;
                    break;
                case 'Y':
                    value[j]=25;
                    break;
                case 'Z':
                    value[j]=26;
                    break;
                case '.':
                    value[j]=27;
                    break;
                default:
                    jLabel6.setText("ILLEGAL CHARACTER");
                    break;
            } 
        }
    
        //jLabel4.setText(Arrays.toString(value));
        
        if(size%3==0)
        {
            double[] enval=new double[size];
            
            for(int x=0;x<size;x=x+3)
            {
                enval[x]=value[x]*aa+value[x+1]*bb+value[x+2]*cc; 
                enval[x+1]=value[x]*dd+value[x+1]*ee+value[x+2]*ff;
                enval[x+2]=value[x]*gg+value[x+1]*hh+value[x+2]*ii;
            }
                jLabel6.setText(Arrays.toString(enval));
                jTextField11.setText(Arrays.toString(enval));
        
        }if(size%3==2)
        {
            int newval=0;
            int currentsize=size;
            int newsize=currentsize+1;
            int[] temparr=new int[newsize];
            
            for(int i=0;i<currentsize;i++){
                temparr[i]=value[i];
            }
            
            temparr[newsize-1]=newval;
            value=temparr;
            
            for(int el=0;el<newsize;el++){
               //  jLabel7.setText(Arrays.toString(value));
            }
            
            double[] nenval=new double[newsize];
            for(int x=0;x<newsize;x=x+3)
            {
                nenval[x]=value[x]*aa+value[x+1]*bb+value[x+2]*cc; 
                nenval[x+1]=value[x]*dd+value[x+1]*ee+value[x+2]*ff;
                nenval[x+2]=value[x]*gg+value[x+1]*hh+value[x+2]*ii;
            }
                jLabel6.setText(Arrays.toString(nenval));
                jTextField11.setText(Arrays.toString(nenval));
                
        }if(size%3==1)
        {
            int newval1=0;
            int newval2=0;
            int currentsize=size;
            int newsize=currentsize+2;
            int[] temparr=new int[newsize];
            
            for(int i=0;i<currentsize;i++){
                temparr[i]=value[i];
            }
            
            temparr[newsize-1]=newval1;
            temparr[newsize-2]=newval2;
            value=temparr;
            
            for(int el=0;el<newsize;el++){
               // jLabel7.setText(Arrays.toString(value));
            }
            
            double[] nenval=new double[newsize];
            for(int x=0;x<newsize;x=x+3)
            {
                nenval[x]=value[x]*aa+value[x+1]*bb+value[x+2]*cc; 
                nenval[x+1]=value[x]*dd+value[x+1]*ee+value[x+2]*ff;
                nenval[x+2]=value[x]*gg+value[x+1]*hh+value[x+2]*ii;
            }
                jLabel6 .setText(Arrays.toString(nenval));
                jTextField11.setText(Arrays.toString(nenval));
        }
        }if(invert==0)
                {
                 jLabel8.setText("KEY IS NOT INVERTIBLE");
                }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"SOMETHING IS WRONG");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jLabel6.setText("");
        jTextField11.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

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
            java.util.logging.Logger.getLogger(ENCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ENCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ENCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ENCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ENCODE().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
