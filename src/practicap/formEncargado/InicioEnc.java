/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicap.formEncargado;

import practicap.formEmpleado.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author Chaka
 */
public class InicioEnc extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public InicioEnc() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu7.setText("jMenu7");

        jMenu11.setText("jMenu11");

        jMenuItem12.setText("jMenuItem12");

        jMenuItem13.setText("jMenuItem13");

        jMenu8.setText("jMenu8");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1334, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicap/imagenes/logo64.png"))); // NOI18N
        jLabel1.setText("Bruno Leandro Cosimano Abadie");

        jToggleButton1.setText("Salir");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1009, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(106, 70));

        jMenu10.setBackground(new java.awt.Color(102, 102, 102));
        jMenu10.setForeground(new java.awt.Color(0, 0, 0));
        jMenu10.setText("Gestionar Comp Seguros");
        jMenu10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem16.setText("Agregar");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem17.setText("Modificar");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem18.setText("Eliminar");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem18);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem3.setText("Buscar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem3);

        jMenuBar1.add(jMenu10);

        jMenu12.setBackground(new java.awt.Color(102, 102, 102));
        jMenu12.setForeground(new java.awt.Color(0, 0, 0));
        jMenu12.setText("Gestionar Medicos");
        jMenu12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem19.setText("Agregar");
        jMenu12.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem20.setText("Modificar");
        jMenu12.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem21.setText("Eliminar");
        jMenu12.add(jMenuItem21);

        jMenuBar1.add(jMenu12);

        jMenu13.setBackground(new java.awt.Color(102, 102, 102));
        jMenu13.setForeground(new java.awt.Color(0, 0, 0));
        jMenu13.setText("Gestionar Catalogo Tarifas");
        jMenu13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem22.setText("Agregar");
        jMenu13.add(jMenuItem22);

        jMenuItem23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem23.setText("Modificar");
        jMenu13.add(jMenuItem23);

        jMenuItem24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem24.setText("Eliminar");
        jMenu13.add(jMenuItem24);

        jMenuBar1.add(jMenu13);

        jMenu14.setBackground(new java.awt.Color(102, 102, 102));
        jMenu14.setForeground(new java.awt.Color(0, 0, 0));
        jMenu14.setText("Gestionar Empleados");
        jMenu14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem25.setText("Agregar");
        jMenu14.add(jMenuItem25);

        jMenuItem26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem26.setText("Modificar");
        jMenu14.add(jMenuItem26);

        jMenuItem27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem27.setText("Eliminar");
        jMenu14.add(jMenuItem27);

        jMenuBar1.add(jMenu14);

        jMenu15.setBackground(new java.awt.Color(102, 102, 102));
        jMenu15.setForeground(new java.awt.Color(0, 0, 0));
        jMenu15.setText("Generar Reporte");
        jMenu15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuItem2.setText("Grafico Pareto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem2);

        jMenuBar1.add(jMenu15);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // Salir
        setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Generar grafica
        this.contenedor.removeAll();
        this.contenedor.repaint();
        graficaP grafico = new graficaP();
        this.contenedor.add(grafico);
        grafico.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // Agregar compañia de seguro
        this.contenedor.removeAll();
        this.contenedor.repaint();
        aComp nuevaC = new aComp();
        this.contenedor.add(nuevaC);
        nuevaC.show();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // Modificar compañia e seguro
        this.contenedor.removeAll();
        this.contenedor.repaint();
        mComp modificarC = new mComp();
        this.contenedor.add(modificarC);
        modificarC.show();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // Eliminar Compañia de seguro
        this.contenedor.removeAll();
        this.contenedor.repaint();
        eComp eliminarC = new eComp();
        this.contenedor.add(eliminarC);
        eliminarC.show();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Buscar Compañia de Seguros
        this.contenedor.removeAll();
        this.contenedor.repaint();
        bComp buscarC = new bComp();
        this.contenedor.add(buscarC);
        buscarC.show();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioEnc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioEnc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioEnc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioEnc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioEnc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
