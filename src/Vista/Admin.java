
package vista;

import modelo.Datos;
import modelo.Estudiante;
import modelo.Instructor;
import controlador.ControladorCurso;
import controlador.ControladorUsuario;
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
        btnCursos = new javax.swing.JButton();
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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearEstudiante.setText("Crear Estudiante");
        btnCrearEstudiante.addActionListener(this::btnCrearEstudianteActionPerformed);

        btnVerEstudiantes.setText("Ver Estudiantes");
        btnVerEstudiantes.addActionListener(this::btnVerEstudiantesActionPerformed);

        btnCrearInstructor.setText("Crear Catedratico");
        btnCrearInstructor.addActionListener(this::btnCrearInstructorActionPerformed);

        btnCursos.setText("Cursos");
        btnCursos.addActionListener(this::btnCursosActionPerformed);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVerInstructores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarInstructor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEditarInstructor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCrearInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCrearCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearInstructor)
                    .addComponent(btnCrearEstudiante)
                    .addComponent(btnCrearCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarInstructor)
                    .addComponent(btnEditarEstudiante)
                    .addComponent(btnVerCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarInstructor)
                    .addComponent(btnEliminarEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerInstructores)
                    .addComponent(btnVerEstudiantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCursos)
                    .addComponent(btnCerrarSesion))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCursosActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearEstudiante;
    private javax.swing.JButton btnCrearInstructor;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnEditarEstudiante;
    private javax.swing.JButton btnEditarInstructor;
    private javax.swing.JButton btnEliminarEstudiante;
    private javax.swing.JButton btnEliminarInstructor;
    private javax.swing.JButton btnVerEstudiantes;
    private javax.swing.JButton btnVerInstructores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
