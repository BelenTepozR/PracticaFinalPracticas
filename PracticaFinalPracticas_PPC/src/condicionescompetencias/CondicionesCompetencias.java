package condicionescompetencias;

import javax.swing.JOptionPane;

public class CondicionesCompetencias extends javax.swing.JFrame {

        public CondicionesCompetencias() {
                initComponents();
                rc = new RCompartido();
                btCorrer.setEnabled(false);
                
        }
     @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btCorrer = new javax.swing.JButton();
                btPausa = new javax.swing.JButton();
                btTerminar = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                Area1 = new javax.swing.JTextArea();
                jScrollPane2 = new javax.swing.JScrollPane();
                Area2 = new javax.swing.JTextArea();
                jScrollPane3 = new javax.swing.JScrollPane();
                Area3 = new javax.swing.JTextArea();
                jScrollPane4 = new javax.swing.JScrollPane();
                Area4 = new javax.swing.JTextArea();
                lbHilo1 = new javax.swing.JLabel();
                lbHilo2 = new javax.swing.JLabel();
                lbHilo3 = new javax.swing.JLabel();
                lbHilo4 = new javax.swing.JLabel();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                jMenu2 = new javax.swing.JMenu();
                JMCondicionesCompetencias = new javax.swing.JRadioButtonMenuItem();
                JMDesactivacionI = new javax.swing.JRadioButtonMenuItem();
                JMVariableC = new javax.swing.JRadioButtonMenuItem();
                JMMutex = new javax.swing.JRadioButtonMenuItem();
                JMDekker = new javax.swing.JRadioButtonMenuItem();
                JMDijkstra = new javax.swing.JRadioButtonMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(204, 51, 255));

                btCorrer.setText("Correr");
                btCorrer.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btCorrerActionPerformed(evt);
                        }
                });

                btPausa.setText("Kill - 9");
                btPausa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btPausaActionPerformed(evt);
                        }
                });

                btTerminar.setText("Terminar");
                btTerminar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btTerminarActionPerformed(evt);
                        }
                });

                Area1.setColumns(20);
                Area1.setRows(5);
                jScrollPane1.setViewportView(Area1);

                Area2.setColumns(20);
                Area2.setRows(5);
                jScrollPane2.setViewportView(Area2);

                Area3.setColumns(20);
                Area3.setRows(5);
                jScrollPane3.setViewportView(Area3);

                Area4.setColumns(20);
                Area4.setRows(5);
                jScrollPane4.setViewportView(Area4);

                lbHilo1.setText("Plato 1");
                lbHilo1.setEnabled(false);

                lbHilo2.setText("Plato 2");

                lbHilo3.setText("Plato 3");

                lbHilo4.setText("Plato 4");

                jMenu1.setText("File");
                jMenuBar1.add(jMenu1);

                jMenu2.setText("Algoritmos");

                JMCondicionesCompetencias.setSelected(true);
                JMCondicionesCompetencias.setText("Condiciones Competencias");
                JMCondicionesCompetencias.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                JMCondicionesCompetenciasActionPerformed(evt);
                        }
                });
                jMenu2.add(JMCondicionesCompetencias);

                JMDesactivacionI.setSelected(true);
                JMDesactivacionI.setText("Desactivación de Interrupciones");
                JMDesactivacionI.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                JMDesactivacionIActionPerformed(evt);
                        }
                });
                jMenu2.add(JMDesactivacionI);

                JMVariableC.setSelected(true);
                JMVariableC.setText("Variable Cerradura");
                JMVariableC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                JMVariableCActionPerformed(evt);
                        }
                });
                jMenu2.add(JMVariableC);

                JMMutex.setSelected(true);
                JMMutex.setText("Mutex");
                JMMutex.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                JMMutexActionPerformed(evt);
                        }
                });
                jMenu2.add(JMMutex);

                JMDekker.setSelected(true);
                JMDekker.setText("Dekker");
                JMDekker.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                JMDekkerActionPerformed(evt);
                        }
                });
                jMenu2.add(JMDekker);

                JMDijkstra.setSelected(true);
                JMDijkstra.setText("Dijkstra");
                JMDijkstra.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                JMDijkstraActionPerformed(evt);
                        }
                });
                jMenu2.add(JMDijkstra);

                jMenuBar1.add(jMenu2);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(lbHilo1)
                                .addGap(174, 174, 174)
                                .addComponent(lbHilo2)
                                .addGap(155, 155, 155)
                                .addComponent(lbHilo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbHilo4)
                                .addGap(134, 134, 134))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btTerminar)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btPausa)
                                                        .addComponent(btCorrer))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbHilo1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lbHilo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lbHilo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(lbHilo2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2)
                                                        .addComponent(jScrollPane3)
                                                        .addComponent(jScrollPane4)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(btCorrer)
                                                .addGap(18, 18, 18)
                                                .addComponent(btPausa)
                                                .addGap(18, 18, 18)
                                                .addComponent(btTerminar)))
                                .addContainerGap(87, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorrerActionPerformed
                h1.start();
                h2.start();
                h3.start();
                h4.start();
        }//GEN-LAST:event_btCorrerActionPerformed

        private void btPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausaActionPerformed
  int HiloRand = (int) (Math.random()*4) +1 ;
       System.out.println(HiloRand);
       switch(HiloRand){
               case 1:
                       try{ 
                               h1.setDead(true);
                       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                       break;
               case 2:
                         try{ 
                               h2.setDead(true);
                       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                       break;
               case 3:
                         try{ 
                               h3.setDead(true);
                       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                       break;
               case 4:
                        try{ 
                               h4.setDead(true);
                       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}                      
                        break;
               
       }
             
        }//GEN-LAST:event_btPausaActionPerformed

        private void btTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTerminarActionPerformed
                h1.parar();Area1.setText("");
                h2.parar();Area2.setText("");
                h3.parar();Area3.setText("");
                h4.parar();Area4.setText("");
                btCorrer.setEnabled(false);

        }//GEN-LAST:event_btTerminarActionPerformed

        private void JMCondicionesCompetenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMCondicionesCompetenciasActionPerformed
                btCorrer.setEnabled(true);
                h1 = new Hilo(Area1,rc, 1,0);
                h2 = new Hilo(Area2, rc, 2,0);
                h3 = new Hilo(Area3, rc, 3,0);
                h4 = new Hilo(Area4, rc, 4,0);
        }//GEN-LAST:event_JMCondicionesCompetenciasActionPerformed

        private void JMDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMDijkstraActionPerformed
                Dijkstra d = new Dijkstra();
                btCorrer.setEnabled(true); rc.setDi(d); int c=5;
                h1 = new Hilo(Area1, rc, 1, c);
                h2 = new Hilo(Area2, rc, 2, c);
                h3 = new Hilo(Area3, rc, 3, c);
                h4 = new Hilo(Area4, rc, 4, c);
        }//GEN-LAST:event_JMDijkstraActionPerformed

        private void JMDesactivacionIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMDesactivacionIActionPerformed
         btCorrer.setEnabled(true);
               
       Interrupcion []inter = new Interrupcion[4];
       
        inter[0] = new Interrupcion();
        inter[1] = new Interrupcion();
        inter[2] = new Interrupcion();
        inter[3] = new Interrupcion(); 
        rc.crearArray(inter);
        h1 = new Hilo(Area1, rc, 1,1); h1.setInter(inter);
        h2 = new Hilo(Area2, rc, 2,1);h2.setInter(inter);
        h3 = new Hilo(Area3, rc, 3,1);h3.setInter(inter);
        h4 = new Hilo(Area4, rc, 4,1);h4.setInter(inter);
        }//GEN-LAST:event_JMDesactivacionIActionPerformed

        private void JMVariableCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMVariableCActionPerformed
                btCorrer.setEnabled(true);
                Cerradura  ce = new Cerradura();
                rc.setC(ce);
                int c=2;
                h1 = new Hilo(Area1, rc, 1, c);
                h2 = new Hilo(Area2, rc, 2, c);
                h3 = new Hilo(Area3, rc, 3, c);
                h4 = new Hilo(Area4, rc, 4, c);
        }//GEN-LAST:event_JMVariableCActionPerformed

        private void JMMutexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMMutexActionPerformed
                btCorrer.setEnabled(true);
                Mutex m1 = new Mutex();
                rc.setM(m1);
                int m =3;
                h1 = new Hilo(Area1, rc, 1, m);
                h2 = new Hilo(Area2, rc, 2, m);
                h3 = new Hilo(Area3, rc, 3, m);
                h4 = new Hilo(Area4, rc, 4, m);
        }//GEN-LAST:event_JMMutexActionPerformed

        private void JMDekkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMDekkerActionPerformed
                btCorrer.setEnabled(true);
                Dekker d= new Dekker();
                Dekker d12 = new Dekker();
                Dekker d34 = new Dekker();
               rc.setD(d);
               rc.setD12(d12);
               rc.setD34(d34);
                h1 = new Hilo(Area1, rc, 1, d12,d,4);
                h2 = new Hilo(Area2, rc, 2, d12,d,4);
                h3 = new Hilo(Area3, rc, 3, d34,d,4);
                h4 = new Hilo(Area4, rc, 4, d34, d,4);
        }//GEN-LAST:event_JMDekkerActionPerformed

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
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new CondicionesCompetencias().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextArea Area1;
        private javax.swing.JTextArea Area2;
        private javax.swing.JTextArea Area3;
        private javax.swing.JTextArea Area4;
        private javax.swing.JRadioButtonMenuItem JMCondicionesCompetencias;
        private javax.swing.JRadioButtonMenuItem JMDekker;
        private javax.swing.JRadioButtonMenuItem JMDesactivacionI;
        private javax.swing.JRadioButtonMenuItem JMDijkstra;
        private javax.swing.JRadioButtonMenuItem JMMutex;
        private javax.swing.JRadioButtonMenuItem JMVariableC;
        private javax.swing.JButton btCorrer;
        private javax.swing.JButton btPausa;
        private javax.swing.JButton btTerminar;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JLabel lbHilo1;
        private javax.swing.JLabel lbHilo2;
        private javax.swing.JLabel lbHilo3;
        private javax.swing.JLabel lbHilo4;
        // End of variables declaration//GEN-END:variables
        private Hilo h1,h2, h3,h4;
        private RCompartido rc;
        
}
