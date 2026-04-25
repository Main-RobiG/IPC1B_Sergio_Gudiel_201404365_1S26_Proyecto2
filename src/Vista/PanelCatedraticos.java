package vista;

import javax.swing.JOptionPane;
import controlador.ControladorUsuario;
import modelo.Instructor;

public class PanelCatedraticos extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelCatedraticos.class.getName());

    /**
     * Creates new form PanelCatedraticos
     */
    public PanelCatedraticos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrearInstructor = new javax.swing.JButton();
        btnEditarInstructor = new javax.swing.JButton();
        btnEliminarInstructor = new javax.swing.JButton();
        btnVerInstructor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Catedraticos");

        btnCrearInstructor.setText("Crear Catedratico");
        btnCrearInstructor.addActionListener(this::btnCrearInstructorActionPerformed);

        btnEditarInstructor.setText("Editar Catedratico");
        btnEditarInstructor.addActionListener(this::btnEditarInstructorActionPerformed);

        btnEliminarInstructor.setText("Eliminar Catedratico");
        btnEliminarInstructor.addActionListener(this::btnEliminarInstructorActionPerformed);

        btnVerInstructor.setText("Ver Catedraticos");
        btnVerInstructor.setToolTipText("");
        btnVerInstructor.addActionListener(this::btnVerInstructorActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearInstructor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarInstructor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarInstructor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerInstructor)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearInstructorActionPerformed

        new FormInstructor().setVisible(true);
    }//GEN-LAST:event_btnCrearInstructorActionPerformed

    private void btnEditarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInstructorActionPerformed

        String codigo = JOptionPane.showInputDialog("Codigo del Catedratico:");

        Instructor i = ControladorUsuario.obtenerInstructor(codigo);

        if (i != null) {
            new FormEstudiante(
                    i.getCodigo(),
                    i.getNombre(),
                    i.getPassword()
            ).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existe");
        }
    }//GEN-LAST:event_btnEditarInstructorActionPerformed

    private void btnEliminarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInstructorActionPerformed
    
        String codigo = JOptionPane.showInputDialog("Código del instructor:");
        boolean ok = ControladorUsuario.eliminarInstructor(codigo);
        
        if (ok) {
            JOptionPane.showMessageDialog(this, "Eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "No existe");
        }
    }//GEN-LAST:event_btnEliminarInstructorActionPerformed

    private void btnVerInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInstructorActionPerformed
    
        String lista = ControladorUsuario.obtenerInstructores();
        JOptionPane.showMessageDialog(this, lista);
    }//GEN-LAST:event_btnVerInstructorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearInstructor;
    private javax.swing.JButton btnEditarInstructor;
    private javax.swing.JButton btnEliminarInstructor;
    private javax.swing.JButton btnVerInstructor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
