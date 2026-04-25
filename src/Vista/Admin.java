
package vista;

import modelo.Datos;
import modelo.Estudiante;
import modelo.Instructor;
import controlador.ControladorCurso;
import controlador.ControladorUsuario;
import controlador.ControladorSerializador;
import controlador.ControladorCSV;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Admin.class.getName());

    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrearEstudiante = new javax.swing.JButton();
        btnVerEstudiantes = new javax.swing.JButton();
        btnCrearInstructor = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEditarEstudiante = new javax.swing.JButton();
        btnEliminarEstudiante = new javax.swing.JButton();
        btnEditarInstructor = new javax.swing.JButton();
        btnEliminarInstructor = new javax.swing.JButton();
        btnVerInstructores = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JButton btnCrearCurso = new javax.swing.JButton();
        javax.swing.JButton btnVerCurso = new javax.swing.JButton();
        btnAsignarNota = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnVerNota = new javax.swing.JButton();
        btnExportarDatos = new javax.swing.JButton();
        btnGuardarDatos = new javax.swing.JButton();
        javax.swing.JButton btnAsignerCurso = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearEstudiante.setText("Crear Estudiante");
        btnCrearEstudiante.addActionListener(this::btnCrearEstudianteActionPerformed);

        btnVerEstudiantes.setText("Ver Estudiantes");
        btnVerEstudiantes.addActionListener(this::btnVerEstudiantesActionPerformed);

        btnCrearInstructor.setText("Crear Catedratico");
        btnCrearInstructor.addActionListener(this::btnCrearInstructorActionPerformed);

        btnCerrarSesion.setText("Cerrar Sesion");

        jLabel2.setText("Administrador");

        btnEditarEstudiante.setText("Editar Estudiante");
        btnEditarEstudiante.addActionListener(this::btnEditarEstudianteActionPerformed);

        btnEliminarEstudiante.setText("Eliminar Estudiante");
        btnEliminarEstudiante.addActionListener(this::btnEliminarEstudianteActionPerformed);

        btnEditarInstructor.setText("Editar Catedratico");
        btnEditarInstructor.addActionListener(this::btnEditarInstructorActionPerformed);

        btnEliminarInstructor.setText("Eliminar Catedratico");
        btnEliminarInstructor.addActionListener(this::btnEliminarInstructorActionPerformed);

        btnVerInstructores.setText("Ver Catedratico");
        btnVerInstructores.addActionListener(this::btnVerInstructoresActionPerformed);

        jLabel3.setText("Catedratico");

        jLabel4.setText("Estudiante");

        jLabel5.setText("Cursos");

        btnCrearCurso.setText("Crear Curso");
        btnCrearCurso.addActionListener(this::btnCrearCursoActionPerformed);

        btnVerCurso.setText("Ver Curso");
        btnVerCurso.addActionListener(this::btnVerCursoActionPerformed);

        btnAsignarNota.setText("Asignar Notas");
        btnAsignarNota.addActionListener(this::btnAsignarNotaActionPerformed);

        jLabel6.setText("Notas");

        btnVerNota.setText("Ver Notas");
        btnVerNota.addActionListener(this::btnVerNotaActionPerformed);

        btnExportarDatos.setText("Exportar Notas");
        btnExportarDatos.addActionListener(this::btnExportarDatosActionPerformed);

        btnGuardarDatos.setText("Guardar Datos");
        btnGuardarDatos.addActionListener(this::btnGuardarDatosActionPerformed);

        btnAsignerCurso.setText("Asignar a Curso");
        btnAsignerCurso.addActionListener(this::btnAsignerCursoActionPerformed);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAsignarNota)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarEstudiante)
                            .addComponent(btnVerEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarInstructor)
                                    .addComponent(btnVerInstructores, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAsignerCurso))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerNota, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarDatos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearInstructor)
                    .addComponent(btnCrearEstudiante)
                    .addComponent(btnCrearCurso)
                    .addComponent(btnAsignarNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerCurso)
                    .addComponent(btnEditarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarInstructor)
                    .addComponent(btnVerNota))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarInstructor)
                            .addComponent(btnEliminarEstudiante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerInstructores)
                            .addComponent(btnVerEstudiantes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnAsignerCurso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnExportarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardarDatos)
                        .addGap(64, 64, 64))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEstudianteActionPerformed
        
        String codigo = javax.swing.JOptionPane.showInputDialog("Codigo:");
        String nombre = javax.swing.JOptionPane.showInputDialog("Nombre:");
        String password = javax.swing.JOptionPane.showInputDialog("Password:");
        
        if(!Datos.existeUsuario(codigo)){
            Estudiante e = new Estudiante(codigo, nombre, password);
            Datos.agregarUsuario(e);
            javax.swing.JOptionPane.showMessageDialog(this, "Estudiante Creado");
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Codigo ya existe");
        }                
    }//GEN-LAST:event_btnCrearEstudianteActionPerformed

    private void btnVerEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstudiantesActionPerformed

        String lista = ControladorUsuario.obtenerEstudiantes();
        javax.swing.JOptionPane.showMessageDialog(this, lista);
      
    }//GEN-LAST:event_btnVerEstudiantesActionPerformed

    private void btnEditarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstudianteActionPerformed
        
        String codigo = JOptionPane.showInputDialog("Ingrese codigo del estudiante:");
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
        String nuevaPass = JOptionPane.showInputDialog("Nueva contraseña:");
        boolean resultado = ControladorUsuario.editarEstudiante(codigo, nuevoNombre, nuevaPass);
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Estudiante actualizado");
        } else {
            JOptionPane.showMessageDialog(this, "No existe o no es estudiante");
        }
    }//GEN-LAST:event_btnEditarEstudianteActionPerformed

    private void btnEliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstudianteActionPerformed
       
        String codigo = JOptionPane.showInputDialog("Ingrese codigo del estudiante a eliminar:");
        boolean resultado = ControladorUsuario.eliminarEstudiante(codigo);
        
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Estudiante eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "No existe o no es estudiante");
        }
    }//GEN-LAST:event_btnEliminarEstudianteActionPerformed

    private void btnEditarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInstructorActionPerformed

        String codigo = JOptionPane.showInputDialog("Ingrese codigo del Catedratico:");
        String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
        String nuevaPass = JOptionPane.showInputDialog("Nueva contraseña:");
        boolean resultado = ControladorUsuario.editarInstructor(codigo, nuevoNombre, nuevaPass);
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Catedratico actualizado");
        } else {
            JOptionPane.showMessageDialog(this, "No existe o no es Catedratico");
        }
    }//GEN-LAST:event_btnEditarInstructorActionPerformed

    private void btnEliminarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInstructorActionPerformed
      
        String codigo = JOptionPane.showInputDialog("Ingrese codigo del Catedratico a eliminar:");
        boolean resultado = ControladorUsuario.eliminarInstructor(codigo);
        
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Instructor eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "No existe o no es Instructor");
        }
    }//GEN-LAST:event_btnEliminarInstructorActionPerformed

    private void btnVerInstructoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInstructoresActionPerformed

        String lista = ControladorUsuario.obtenerInstructores();
        JOptionPane.showMessageDialog(this, lista);
    }//GEN-LAST:event_btnVerInstructoresActionPerformed

    private void btnCrearInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearInstructorActionPerformed
        
        String codigo = javax.swing.JOptionPane.showInputDialog("Codigo:");
        String nombre = javax.swing.JOptionPane.showInputDialog("Nombre:");
        String password = javax.swing.JOptionPane.showInputDialog("Password:");
        
        if(!Datos.existeUsuario(codigo)){
            Instructor i = new Instructor(codigo, nombre, password);
            Datos.agregarUsuario(i);
            javax.swing.JOptionPane.showMessageDialog(this, "Estudiante Creado");
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Codigo ya existe");
        }
    }//GEN-LAST:event_btnCrearInstructorActionPerformed

    private void btnCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoActionPerformed

        String codigo = JOptionPane.showInputDialog("Codigo del curso:");
        String nombre = JOptionPane.showInputDialog("Nombre del curso:");
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Capacidad:"));
        String codInstructor = JOptionPane.showInputDialog("Codigo del instructor:");
        
        boolean ok = ControladorCurso.crearCurso(codigo, nombre, capacidad, codInstructor);
        
        if (ok) {
            JOptionPane.showMessageDialog(this, "Curso creado");
        } else {
            JOptionPane.showMessageDialog(this, "Error: curso repetido o instructor no existe");
        }
    }//GEN-LAST:event_btnCrearCursoActionPerformed

    private void btnVerCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursoActionPerformed

        String lista = ControladorCurso.obtenerCursos();
        JOptionPane.showMessageDialog(this, lista);
        
    }//GEN-LAST:event_btnVerCursoActionPerformed

    private void btnAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarNotaActionPerformed

        String codCurso = JOptionPane.showInputDialog("Codigo curso:");
        String codEst = JOptionPane.showInputDialog("Codigo estudiante:");
        String input = JOptionPane.showInputDialog("Nota:");
        double nota;
        
        try {
            nota = Double.parseDouble(input);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nota invalida");
            return;
        }
        
        boolean ok = ControladorCurso.asignarNota(codCurso, codEst, nota);
        
        if (ok) {
            JOptionPane.showMessageDialog(this, "Nota asignada");
        } else {
            JOptionPane.showMessageDialog(this, "Error inesperado, tomar en cuenta");
        }
    }//GEN-LAST:event_btnAsignarNotaActionPerformed

    private void btnVerNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerNotaActionPerformed

        String codCurso = JOptionPane.showInputDialog("Codigo curso:");
        String lista = ControladorCurso.verNotasCurso(codCurso);
        JOptionPane.showMessageDialog(this, lista);
    }//GEN-LAST:event_btnVerNotaActionPerformed

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

    private void btnAsignerCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignerCursoActionPerformed

        String codCurso = JOptionPane.showInputDialog("Codigo del curso:");
        String codEst = JOptionPane.showInputDialog("Codigo del estudiante:");
        
        boolean ok = ControladorCurso.inscribirEstudiante(codCurso, codEst);
        
        if (ok) {
            JOptionPane.showMessageDialog(this, "Inscripción exitosa");
        } else {
            JOptionPane.showMessageDialog(this, "Error: curso lleno, estudiante no existe o ya inscrito");
        }
    }//GEN-LAST:event_btnAsignerCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarNota;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearEstudiante;
    private javax.swing.JButton btnCrearInstructor;
    private javax.swing.JButton btnEditarEstudiante;
    private javax.swing.JButton btnEditarInstructor;
    private javax.swing.JButton btnEliminarEstudiante;
    private javax.swing.JButton btnEliminarInstructor;
    private javax.swing.JButton btnExportarDatos;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JButton btnVerEstudiantes;
    private javax.swing.JButton btnVerInstructores;
    private javax.swing.JButton btnVerNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
