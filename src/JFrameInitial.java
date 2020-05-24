
import static java.lang.Thread.sleep;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class JFrameInitial extends javax.swing.JFrame {

    //Modelos para los spineer del Temporizador
    SpinnerNumberModel numeros = new SpinnerNumberModel(0, 0, 60, 1);
    SpinnerNumberModel numeros2 = new SpinnerNumberModel(0, 0, 60, 1);
    SpinnerNumberModel numeros3 = new SpinnerNumberModel(0, 0, 60, 1);

    //Variables para el temporizadro
    int hor, minutos, segundos;
    Timer tiempo;
    boolean bandera = true;
    boolean pararlo = false;

    //Variables para el cronometro
    static int milisegundos = 0;
    static int seg = 0;
    static int min = 0;
    static int horas = 0;
    static boolean state = true;

    public JFrameInitial() {
        initComponents();
        setSize(452, 288);
        setLocationRelativeTo(null);
        setResizable(false);
        jSpinnerHORAS.setModel(numeros);
        jSpinnerMINUTOS.setModel(numeros2);
        jSpinnerSEGUNDOS.setModel(numeros3);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelHoras = new javax.swing.JLabel();
        jLabelMili = new javax.swing.JLabel();
        jLabelMinutos = new javax.swing.JLabel();
        jPanelBotonesç = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelSegundos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerHORAS = new javax.swing.JSpinner();
        jSpinnerMINUTOS = new javax.swing.JSpinner();
        jSpinnerSEGUNDOS = new javax.swing.JSpinner();
        jLabelHORAS2 = new javax.swing.JLabel();
        jLabelSEGUNDOS2 = new javax.swing.JLabel();
        jLabelMINUTOS2 = new javax.swing.JLabel();
        jButtonINICIAR2 = new javax.swing.JButton();
        jButtonREINI = new javax.swing.JButton();
        jButtonPARAR = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("HORAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 43, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("MINUTOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 43, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("SEGUNDOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 43, -1, -1));

        jLabelHoras.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 14)); // NOI18N
        jLabelHoras.setForeground(new java.awt.Color(0, 0, 0));
        jLabelHoras.setText("00:");
        jPanel1.add(jLabelHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 77, 51, 24));

        jLabelMili.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 14)); // NOI18N
        jLabelMili.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMili.setText("00");
        jPanel1.add(jLabelMili, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 77, 51, 24));

        jLabelMinutos.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 14)); // NOI18N
        jLabelMinutos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMinutos.setText("00:");
        jPanel1.add(jLabelMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 77, 51, 24));

        jPanelBotonesç.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PAUSAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("REINICIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesçLayout = new javax.swing.GroupLayout(jPanelBotonesç);
        jPanelBotonesç.setLayout(jPanelBotonesçLayout);
        jPanelBotonesçLayout.setHorizontalGroup(
            jPanelBotonesçLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesçLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(31, 31, 31))
        );
        jPanelBotonesçLayout.setVerticalGroup(
            jPanelBotonesçLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesçLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelBotonesçLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelBotonesç, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 113, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("MILISEGUNDOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 43, -1, -1));

        jLabelSegundos.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 14)); // NOI18N
        jLabelSegundos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSegundos.setText("00:");
        jPanel1.add(jLabelSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 77, 51, 24));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tiempo.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 250));

        jTabbedPane1.addTab("CRONÓMETRO", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("HORAS:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 33, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("MINUTOS:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 77, -1, -1));

        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("SEGUNDOS:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 121, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("HORAS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 160, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("MINUTOS");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 160, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("SEGUNDOS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 160, -1, -1));
        jPanel2.add(jSpinnerHORAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 28, 53, -1));
        jPanel2.add(jSpinnerMINUTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 72, 53, -1));
        jPanel2.add(jSpinnerSEGUNDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 116, 53, -1));

        jLabelHORAS2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelHORAS2.setText("00:");
        jPanel2.add(jLabelHORAS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 188, 53, 30));

        jLabelSEGUNDOS2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSEGUNDOS2.setText("00");
        jPanel2.add(jLabelSEGUNDOS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 188, 53, 30));

        jLabelMINUTOS2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMINUTOS2.setText("00:");
        jPanel2.add(jLabelMINUTOS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 188, 53, 30));

        jButtonINICIAR2.setText("INICIAR");
        jButtonINICIAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINICIAR2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonINICIAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 12, -1, -1));

        jButtonREINI.setText("REINICIAR");
        jButtonREINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREINIActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonREINI, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 112, -1, -1));

        jButtonPARAR.setText("PARAR");
        jButtonPARAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPARARActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPARAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 62, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tiempo.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 250));

        jTabbedPane1.addTab("TEMPORIZADOR", jPanel2);

        getContentPane().add(jTabbedPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        state = true;
        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1);
                            if (milisegundos > 1000) {
                                milisegundos = 0;
                                seg++;
                            }
                            if (seg > 60) {
                                milisegundos = 0;
                                seg = 0;
                                min++;
                            }
                            if (min > 60) {
                                milisegundos = 0;
                                seg = 0;
                                min = 0;
                                horas++;
                            }

                            jLabelMili.setText("" + milisegundos);
                            milisegundos++;

                            jLabelSegundos.setText(" : " + seg);
                            jLabelMinutos.setText(" : " + min);
                            jLabelHoras.setText(" : " + horas);

                        } catch (Exception e) {
                        }
                    } else {
                        break;
                    }
                }
            }

        };

        t.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        state = false;


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        state = false;

        horas = 0;
        min = 0;
        seg = 0;
        milisegundos = 0;

        jLabelHoras.setText("00:");
        jLabelMinutos.setText("00:");
        jLabelSegundos.setText("00:");
        jLabelMili.setText("00");


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonINICIAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINICIAR2ActionPerformed

        hor = (int) jSpinnerHORAS.getValue(); //1
        minutos = (int) jSpinnerMINUTOS.getValue(); //1
        segundos = (int) jSpinnerSEGUNDOS.getValue(); //15

        tiempo = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (segundos > 0) {
                    segundos--;

                } else {
                    segundos = 59;

                    if (minutos > 0) {
                        minutos--;

                    } else {
                        minutos = 59;
                        if (hor > 0) {
                            hor--;

                        }
                    }

                }
                jLabelHORAS2.setText(hor + " : ");
                jLabelMINUTOS2.setText(minutos + " : ");
                jLabelSEGUNDOS2.setText(""+segundos);
                System.out.println("");
                if (segundos == 0 && minutos == 0 && hor == 0) {
                    tiempo.stop();
                    JOptionPane.showMessageDialog(null, "TIEMPOOO...");
                }

            }
        });

        tiempo.start();
    }//GEN-LAST:event_jButtonINICIAR2ActionPerformed

    private void jButtonPARARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPARARActionPerformed

        pararlo = true;
        tiempo.stop();
    }//GEN-LAST:event_jButtonPARARActionPerformed

    private void jButtonREINIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREINIActionPerformed
        pararlo = true;
        tiempo.stop();
        jLabelHORAS2.setText("00:");
        jLabelMINUTOS2.setText("00:");
        jLabelSEGUNDOS2.setText("00");
    }//GEN-LAST:event_jButtonREINIActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameInitial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInitial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInitial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInitial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JFrameInitial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(JFrameInitial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(JFrameInitial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(JFrameInitial.class.getName()).log(Level.SEVERE, null, ex);
                }
                new JFrameInitial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonINICIAR2;
    private javax.swing.JButton jButtonPARAR;
    private javax.swing.JButton jButtonREINI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHORAS2;
    private javax.swing.JLabel jLabelHoras;
    private javax.swing.JLabel jLabelMINUTOS2;
    private javax.swing.JLabel jLabelMili;
    private javax.swing.JLabel jLabelMinutos;
    private javax.swing.JLabel jLabelSEGUNDOS2;
    private javax.swing.JLabel jLabelSegundos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBotonesç;
    private javax.swing.JSpinner jSpinnerHORAS;
    private javax.swing.JSpinner jSpinnerMINUTOS;
    private javax.swing.JSpinner jSpinnerSEGUNDOS;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private ActionListener ActionListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
