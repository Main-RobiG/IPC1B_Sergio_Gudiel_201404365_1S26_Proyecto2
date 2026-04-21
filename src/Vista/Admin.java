
package Vista;

import modelo.Datos;
import modelo.Estudiante;
import controlador.ControladorUsuario;

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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearEstudiante.setText("Crear Estudiante");
        btnCrearEstudiante.addActionListener(this::btnCrearEstudianteActionPerformed);

        btnVerEstudiantes.setText("Ver Estudiantes");
        btnVerEstudiantes.addActionListener(this::btnVerEstudiantesActionPerformed);

        btnCrearInstructor.setText("Crear Catedratico");

        btnCursos.setText("Cursos");
        btnCursos.addActionListener(this::btnCursosActionPerformed);

        btnCerrarSesion.setText("Cerrar Sesion");

        jLabel2.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnCrearEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerEstudiantes)
                .addGap(8, 8, 8)
                .addComponent(btnCrearInstructor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap(39, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearEstudiante;
    private javax.swing.JButton btnCrearInstructor;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnVerEstudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
