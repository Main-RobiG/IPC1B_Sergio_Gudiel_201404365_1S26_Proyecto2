
package vista;

import modelo.Datos;
import modelo.Estudiante;
import modelo.Instructor;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditarInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVerEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditarEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(btnCrearInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnVerInstructores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEliminarInstructor, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearInstructor)
                    .addComponent(btnCrearEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarInstructor)
                    .addComponent(btnEditarEstudiante))
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
    // End of variables declaration//GEN-END:variables
}
