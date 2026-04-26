package vista;

import javax.swing.JOptionPane;
import controlador.ControladorUsuario;
import controlador.ControladorCurso;
import controlador.ControladorSerializador;
import controlador.ControladorCSV;

public class Admin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Admin.class.getName());

    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExportarDatos = new javax.swing.JButton();
        btnGuardarDatos = new javax.swing.JButton();
        btnGestionarEstudiantes = new javax.swing.JButton();
        btnGestionarInstructores = new javax.swing.JButton();
        btnGestionarCursos = new javax.swing.JButton();
        btnGestionarNotas = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCerrarSesion.setText("Cerrar Sesion");

        jLabel2.setText("Administrador");

        btnExportarDatos.setText("Exportar Notas");
        btnExportarDatos.addActionListener(this::btnExportarDatosActionPerformed);

        btnGuardarDatos.setText("Guardar Datos");
        btnGuardarDatos.addActionListener(this::btnGuardarDatosActionPerformed);

        btnGestionarEstudiantes.setText("Gestionar Estudiantes");
        btnGestionarEstudiantes.addActionListener(this::btnGestionarEstudiantesActionPerformed);

        btnGestionarInstructores.setText("Gestionar Instructores");
        btnGestionarInstructores.addActionListener(this::btnGestionarInstructoresActionPerformed);

        btnGestionarCursos.setText("Gestionar Cursos");
        btnGestionarCursos.addActionListener(this::btnGestionarCursosActionPerformed);

        btnGestionarNotas.setText("Reportes / Notas");
        btnGestionarNotas.addActionListener(this::btnGestionarNotasActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestionarInstructores)
                    .addComponent(btnGestionarCursos)
                    .addComponent(btnGestionarEstudiantes))
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarDatos))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGestionarNotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExportarDatos)
                    .addComponent(btnGestionarEstudiantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardarDatos)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGestionarInstructores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGestionarCursos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGestionarNotas)
                            .addComponent(btnCerrarSesion))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarDatosActionPerformed

        String codCurso = JOptionPane.showInputDialog("Codigo del curso:");
        String ruta = "notas_" + codCurso + ".csv";

        ControladorCSV.exportarNotasCurso(codCurso, ruta);
        JOptionPane.showMessageDialog(this, "CSV generado en el proyecto");
    }//GEN-LAST:event_btnExportarDatosActionPerformed

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed

        ControladorSerializador.guardarDatos("datos.ser");
        JOptionPane.showMessageDialog(this, "Datos guardados");
    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    private void btnGestionarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEstudiantesActionPerformed
        new PanelEstudiantes().setVisible(true);
    }//GEN-LAST:event_btnGestionarEstudiantesActionPerformed

    private void btnGestionarInstructoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarInstructoresActionPerformed
        new PanelCatedraticos().setVisible(true);
    }//GEN-LAST:event_btnGestionarInstructoresActionPerformed

    private void btnGestionarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarCursosActionPerformed
        new PanelCursos().setVisible(true);
    }//GEN-LAST:event_btnGestionarCursosActionPerformed

    private void btnGestionarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarNotasActionPerformed
        new PanelNotas().setVisible(true);
    }//GEN-LAST:event_btnGestionarNotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnExportarDatos;
    private javax.swing.JButton btnGestionarCursos;
    private javax.swing.JButton btnGestionarEstudiantes;
    private javax.swing.JButton btnGestionarInstructores;
    private javax.swing.JButton btnGestionarNotas;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
