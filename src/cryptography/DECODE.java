package cryptography;

import java.util.Arrays;

public class DECODE extends javax.swing.JFrame {

    public DECODE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DECODE");

        jButton1.setText("RESULT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "KEY", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("MESSAGE:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("DECODED:");

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double aa=Double.valueOf(jTextField5.getText());
        double bb=Double.valueOf(jTextField6.getText());
        double cc=Double.valueOf(jTextField7.getText());
        double dd=Double.valueOf(jTextField8.getText());
        double ee=Double.valueOf(jTextField13.getText());
        double ff=Double.valueOf(jTextField14.getText());
        double gg=Double.valueOf(jTextField15.getText());
        double hh=Double.valueOf(jTextField16.getText());
        double ii=Double.valueOf(jTextField17.getText());
        
        double y=((aa*hh)-(bb*gg));
        double z=((aa*ee)-(dd*bb));
        double p=((aa*ii)-(cc*gg));
        double q=((aa*ff)-(dd*cc));
        double invert=((q*z)-(p*y));
      
        if(invert==0)
        {
            jLabel10.setText("KEY IS NOT INVERTIBLE");
        }else if(invert!=0)
        { 
            int a=(int)aa;
            int b=(int)dd;
            int c=(int)gg;
            int d=(int)bb;
            int e=(int)ee;
            int f=(int)hh;
            int g=(int)cc;
            int h=(int)ff;
            int i=(int)ii;
            
            String str=jTextField18.getText();
            String[] msg=str.split(" ");
            int size=msg.length;
            
            int[] intarr = Arrays.stream(msg).mapToInt(Integer::parseInt).toArray(); //converting string array to int array
        
            int[] deval=new int[size];
              
               for(int x=0;x<size;x=x+3){
                   deval[x]=intarr[x]*a+intarr[x+1]*b+intarr[x+2]*c;
                   deval[x+1]=intarr[x]*d+intarr[x+1]*e+intarr[x+2]*f;
                   deval[x+2]=intarr[x]*g+intarr[x+1]*h+intarr[x+2]*i;
                }
            
          
            char[] ch=new char[size];
            for(int j=0;j<msg.length;j++){
                int val=deval[j];
            
            switch(val)
            {
                case 0:
                    ch[j]='_';
                    break;
                case 1:
                    ch[j]='A';
                    break;
                case 2:
                    ch[j]='B';
                    break;
                case 3:
                    ch[j]='C';
                    break;
                case 4:
                    ch[j]='D';
                    break;
                case 5:
                    ch[j]='E';
                    break;
                case 6:
                    ch[j]='F';
                    break;
                case 7:
                    ch[j]='G';
                    break;
                case 8:
                    ch[j]='H';
                    break;
                case 9:
                    ch[j]='I';
                    break;
                case 10:
                    ch[j]='J';
                    break;
                case 11:
                    ch[j]='K';
                    break;
                case 12:
                    ch[j]='L';
                    break;
                case 13:
                    ch[j]='M';
                    break;
                case 14:
                    ch[j]='N';
                    break;
                case 15:
                    ch[j]='O';
                    break;
                case 16:
                    ch[j]='P';
                    break;
                case 17:
                    ch[j]='Q';
                    break;    
                case 18:
                    ch[j]='R';
                    break;
                case 19:
                    ch[j]='S';
                    break;
                case 20:
                    ch[j]='T';
                    break;
                case 21:
                    ch[j]='U';
                    break;
                case 22:
                    ch[j]='V';
                    break;
                case 23:
                    ch[j]='W';
                    break;
                case 24:
                    ch[j]='X';
                    break;
                case 25:
                    ch[j]='Y';
                    break;
                case 26:
                    ch[j]='Z';
                    break;
                case 27:
                    ch[j]='.';
                    break;
                default:
                    jLabel14.setText("INVALID");
                    break;
                
            }
            jLabel14.setText(Arrays.toString(ch));
        }
            
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextField5.setText("");
       jTextField6.setText("");
       jTextField7.setText("");
       jTextField8.setText("");
       jTextField13.setText("");
       jTextField14.setText("");
       jTextField15.setText("");
       jTextField16.setText("");
       jTextField17.setText("");
       jTextField18.setText("");
       jLabel14.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DECODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DECODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DECODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DECODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DECODE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
