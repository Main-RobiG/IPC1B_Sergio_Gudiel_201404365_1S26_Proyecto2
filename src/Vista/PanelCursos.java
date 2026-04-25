package vista;

import javax.swing.JOptionPane;
import controlador.ControladorCurso;

public class PanelCursos extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelCursos.class.getName());

    public PanelCursos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrearCurso = new javax.swing.JButton();
        btnInscribirEstudiante = new javax.swing.JButton();
        btnVerCursos = new javax.swing.JButton();
        btnVerExC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cursos");

        btnCrearCurso.setText("Crear Curso");
        btnCrearCurso.addActionListener(this::btnCrearCursoActionPerformed);

        btnInscribirEstudiante.setText("Inscribir Estudiante");
        btnInscribirEstudiante.addActionListener(this::btnInscribirEstudianteActionPerformed);

        btnVerCursos.setText("Ver Cursos");
        btnVerCursos.addActionListener(this::btnVerCursosActionPerformed);

        btnVerExC.setText("Ver Estudiantes Por Curso");
        btnVerExC.addActionListener(this::btnVerExCActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInscribirEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerExC, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInscribirEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerExC)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoActionPerformed
    
        new FormCursos().setVisible(true);
    }//GEN-LAST:event_btnCrearCursoActionPerformed

    private void btnInscribirEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirEstudianteActionPerformed

        String codCurso = JOptionPane.showInputDialog("Código del curso:");
        String codEst = JOptionPane.showInputDialog("Código del estudiante:");
        
        boolean ok = ControladorCurso.inscribirEstudiante(codCurso, codEst);
        
        if (ok) {
            JOptionPane.showMessageDialog(this, "Inscripción exitosa");
        } else {
            JOptionPane.showMessageDialog(this, "Error: curso lleno, estudiante no existe o ya inscrito");
        }
    }//GEN-LAST:event_btnInscribirEstudianteActionPerformed

    private void btnVerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosActionPerformed

        String lista = ControladorCurso.obtenerCursos();
        JOptionPane.showMessageDialog(this, lista);
  
    }//GEN-LAST:event_btnVerCursosActionPerformed
    
    private void btnVerExCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerExCActionPerformed

        String codCurso = JOptionPane.showInputDialog("Código del curso:");
        String lista = ControladorCurso.verEstudiantesCurso(codCurso);

        JOptionPane.showMessageDialog(this, lista);
    }//GEN-LAST:event_btnVerExCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCurso;
    private javax.swing.JButton btnInscribirEstudiante;
    private javax.swing.JButton btnVerCursos;
    private javax.swing.JButton btnVerExC;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
