package vista;

import controlador.ControladorCurso;
import controlador.ControladorCSV;
import javax.swing.JOptionPane;

public class PanelNotas extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelNotas.class.getName());

    public PanelNotas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAsignarNota = new javax.swing.JButton();
        btnVerNota = new javax.swing.JButton();
        btnExpCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Notas");

        btnAsignarNota.setText("Asignar Nota");
        btnAsignarNota.addActionListener(this::btnAsignarNotaActionPerformed);

        btnVerNota.setText("Ver Notas");
        btnVerNota.addActionListener(this::btnVerNotaActionPerformed);

        btnExpCSV.setText("Exportar");
        btnExpCSV.addActionListener(this::btnExpCSVActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsignarNota)
                            .addComponent(btnVerNota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExpCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsignarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExpCSV)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExpCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpCSVActionPerformed

        String curso = JOptionPane.showInputDialog("Código del curso:");
        
        if (curso == null || curso.isEmpty()) return;
        ControladorCSV.exportarNotasCurso(curso, "notas.csv");
        JOptionPane.showMessageDialog(this, "CSV exportado");
    }//GEN-LAST:event_btnExpCSVActionPerformed

    private void btnAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarNotaActionPerformed

        new FormNotas("", "").setVisible(true);
    }//GEN-LAST:event_btnAsignarNotaActionPerformed

    private void btnVerNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerNotaActionPerformed

        String curso = JOptionPane.showInputDialog("Código del curso:");
        if (curso == null || curso.isEmpty()) return;
        String notas = ControladorCurso.verNotasCurso(curso);
        JOptionPane.showMessageDialog(this, notas.isEmpty() ? "Sin notas" : notas);
    }//GEN-LAST:event_btnVerNotaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarNota;
    private javax.swing.JButton btnExpCSV;
    private javax.swing.JButton btnVerNota;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
